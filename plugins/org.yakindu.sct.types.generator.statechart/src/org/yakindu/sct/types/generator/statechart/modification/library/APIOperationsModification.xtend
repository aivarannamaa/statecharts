package org.yakindu.sct.types.generator.statechart.modification.library

import com.google.inject.Inject
import java.util.Collection
import org.yakindu.base.types.Operation
import org.yakindu.base.types.Package
import org.yakindu.sct.types.generator.statechart.annotation.SCTGeneratorAnnotationLibrary
import org.yakindu.sct.types.modification.IModification
import org.yakindu.sct.model.stext.stext.OperationDefinition
import org.yakindu.base.types.Visibility

class APIOperationsModification implements IModification {

	@Inject protected extension SCTGeneratorAnnotationLibrary

	val APIOperations = #[
		"init",
		"enter",
		"exit",
		"runCycle",
		"isActive",
		"isFinal",
		"isStateActive"
	]

	override modify(Collection<Package> packages) {
		packages.forEach[modify]
		packages
	}

	def modify(Package p) {
		val ops = p.eAllContents.filter(Operation).filter[!(it instanceof OperationDefinition)]
		ops.filter[APIOperations.contains(name)].forEach [annotateWith(APIAnnotation)]
		ops.filter[!APIOperations.contains(name)].forEach [
			static = true 
			visibility = Visibility.PROTECTED
		]
		return p
	}

}
