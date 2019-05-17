/** 
 * Copyright (c) 2015 committers of YAKINDU and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * Contributors:
 * committers of YAKINDU - initial API and implementation
 *
*/
package org.yakindu.sct.model.stext.stext.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.yakindu.base.expressions.expressions.ExpressionsFactory;
import org.yakindu.sct.model.sgraph.SGraphPackage;
import org.yakindu.sct.model.sgraph.provider.ScopeItemProvider;
import org.yakindu.sct.model.stext.stext.StextFactory;

/**
 * This is the item provider adapter for a {@link org.yakindu.sct.model.stext.stext.SimpleScope} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleScopeItemProvider extends ScopeItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SimpleScopeItemProvider(AdapterFactory adapterFactory)
  {
		super(adapterFactory);
	}

  /**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

  /**
	 * This returns SimpleScope.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SimpleScope"));
	}

  /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getText(Object object)
  {
		return getString("_UI_SimpleScope_type");
	}
  

  /**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void notifyChanged(Notification notification)
  {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

  /**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 StextFactory.eINSTANCE.createRoot()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 StextFactory.eINSTANCE.createDefRoot()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 StextFactory.eINSTANCE.createStatechartRoot()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 StextFactory.eINSTANCE.createStateRoot()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 StextFactory.eINSTANCE.createTransitionRoot()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 StextFactory.eINSTANCE.createStatechartSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 StextFactory.eINSTANCE.createStateSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 StextFactory.eINSTANCE.createTransitionSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 StextFactory.eINSTANCE.createStatechartScope()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 StextFactory.eINSTANCE.createInterfaceScope()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 StextFactory.eINSTANCE.createInternalScope()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 StextFactory.eINSTANCE.createImportScope()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 StextFactory.eINSTANCE.createLocalReaction()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 StextFactory.eINSTANCE.createTransitionReaction()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 StextFactory.eINSTANCE.createGuard()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 StextFactory.eINSTANCE.createEntryPointSpec()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 StextFactory.eINSTANCE.createExitPointSpec()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 StextFactory.eINSTANCE.createEventSpec()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 StextFactory.eINSTANCE.createRegularEventSpec()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 StextFactory.eINSTANCE.createTimeEventSpec()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 StextFactory.eINSTANCE.createBuiltinEventSpec()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 StextFactory.eINSTANCE.createEntryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 StextFactory.eINSTANCE.createExitEvent()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 StextFactory.eINSTANCE.createAlwaysEvent()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 StextFactory.eINSTANCE.createSimpleScope()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 StextFactory.eINSTANCE.createReactionTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 StextFactory.eINSTANCE.createDefaultTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 StextFactory.eINSTANCE.createReactionEffect()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 StextFactory.eINSTANCE.createActiveStateReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createBoolLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createIntLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createFloatLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createHexLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createBinaryLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createAssignmentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createConditionalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createLogicalOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createLogicalAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createLogicalNotExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createBitwiseXorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createBitwiseOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createBitwiseAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createLogicalRelationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createShiftExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createNumericalAddSubtractExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createNumericalMultiplyDivideExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createNumericalUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createPostFixUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createPrimitiveValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createMetaCall()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createElementReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createParenthesizedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createTypeCastExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createArgument()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createIfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createBlockExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createWhileExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createReturnExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createSwitchExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createSwitchCase()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createEventRaisingExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createEventValueReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createForExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createThrowExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 ExpressionsFactory.eINSTANCE.createEventClearingExpression()));
	}

  /**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == SGraphPackage.Literals.SCOPE__DECLARATIONS ||
			childFeature == SGraphPackage.Literals.SCOPE__MEMBERS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

		/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public ResourceLocator getResourceLocator()
  {
		return STextEditPlugin.INSTANCE;
	}

}
