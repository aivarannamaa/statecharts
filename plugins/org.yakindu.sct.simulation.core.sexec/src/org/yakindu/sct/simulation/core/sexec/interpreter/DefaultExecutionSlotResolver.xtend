/**
 * Copyright (c) 2014 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of YAKINDU - initial API and implementation
 */
package org.yakindu.sct.simulation.core.sexec.interpreter

import com.google.inject.Inject
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.util.SimpleAttributeResolver
import org.yakindu.base.expressions.expressions.AssignmentExpression
import org.yakindu.base.expressions.expressions.ElementReferenceExpression
import org.yakindu.base.expressions.expressions.FeatureCall
import org.yakindu.base.types.Event
import org.yakindu.base.types.Operation
import org.yakindu.base.types.Property
import org.yakindu.sct.model.stext.stext.InterfaceScope
import org.yakindu.sct.model.stext.stext.VariableDefinition
import org.yakindu.sct.simulation.core.sruntime.CompositeSlot
import org.yakindu.sct.simulation.core.sruntime.ExecutionContext
import org.yakindu.sct.simulation.core.sruntime.ExecutionSlot
import org.yakindu.sct.simulation.core.sruntime.ExecutionVariable
import org.eclipse.xtext.EcoreUtil2

/**
 * Default implementation for resolving execution slots based on expressions.
 * 
 * @author Thomas Kutz
 */
class DefaultExecutionSlotResolver implements IExecutionSlotResolver {

	@Inject
	extension IQualifiedNameProvider nameProvider

	def dispatch ExecutionSlot resolve(ExecutionContext context, FeatureCall e) {
		if (e.feature instanceof VariableDefinition || e.feature instanceof Operation) {
			return context.getVariable(e.feature.fullyQualifiedName.toString)
		}
		if (e.feature instanceof Property || e.feature instanceof Event) {
			var current = e
			val List<EObject> calls = newArrayList
			calls.add(0, e.feature)
			while (!(current.owner instanceof ElementReferenceExpression)) {
				current = current.owner as FeatureCall
				calls.add(0, current.feature)
			}

			// first: get the root slot where to start the search
			val root = (current.owner as ElementReferenceExpression).reference
			var ExecutionSlot featureSlot = null
			
			if (root instanceof InterfaceScope) {
				featureSlot = context.getSlot(calls.get(0).fullyQualifiedName.toString)
				calls.remove(0)
			}
			else {
				featureSlot = packageNamespaceAwareResolve(context, root)
				if (featureSlot == null)
					return null // could not find starting slot for feature call
			}
			// go through all calls and traverse execution context hierarchy accordingly
			for (EObject feature : calls) {

				if (featureSlot instanceof CompositeSlot && (feature instanceof Property || feature instanceof Event)) {
					featureSlot = (featureSlot as CompositeSlot).slots.findFirst[slot|slot.name == feature.name]
				}
				if (featureSlot instanceof ExecutionVariable && feature instanceof Operation) {
					//					TODO (featureSlot as ExecutionVariable).value
				}
			}
			return featureSlot
		}
	}
	
	def dispatch ExecutionSlot resolve(ExecutionContext context, ElementReferenceExpression e) {
		packageNamespaceAwareResolve(context, e.reference)
	}
	
	def protected ExecutionSlot packageNamespaceAwareResolve(ExecutionContext context, EObject element) {
		val pkg = EcoreUtil2.getContainerOfType(element, org.yakindu.base.types.Package)
		if (pkg != null) {
			context.getSlot(pkg.name + "." + element.fullyQualifiedName.toString)
		}
		else {
			context.getSlot(element.fullyQualifiedName.toString)
		}
	}
	
	def dispatch ExecutionSlot resolve(ExecutionContext context, AssignmentExpression e) {
		return context.resolve(e.varRef)
	}

	def private name(EObject e) {
		return SimpleAttributeResolver::NAME_RESOLVER.apply(e)
	}
}
