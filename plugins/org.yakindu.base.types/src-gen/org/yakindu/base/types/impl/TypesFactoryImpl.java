/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.yakindu.base.types.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.yakindu.base.types.AnnotatableElement;
import org.yakindu.base.types.Annotation;
import org.yakindu.base.types.AnnotationType;
import org.yakindu.base.types.ArrayTypeSpecifier;
import org.yakindu.base.types.ComplexType;
import org.yakindu.base.types.Constructor;
import org.yakindu.base.types.Declaration;
import org.yakindu.base.types.Direction;
import org.yakindu.base.types.Domain;
import org.yakindu.base.types.EnumerationType;
import org.yakindu.base.types.Enumerator;
import org.yakindu.base.types.Event;
import org.yakindu.base.types.GenericElement;
import org.yakindu.base.types.MetaComposite;
import org.yakindu.base.types.Operation;
import org.yakindu.base.types.Parameter;
import org.yakindu.base.types.PrimitiveType;
import org.yakindu.base.types.Property;
import org.yakindu.base.types.Type;
import org.yakindu.base.types.TypeAlias;
import org.yakindu.base.types.TypeParameter;
import org.yakindu.base.types.TypeSpecifier;
import org.yakindu.base.types.TypedDeclaration;
import org.yakindu.base.types.TypesFactory;
import org.yakindu.base.types.TypesPackage;
import org.yakindu.base.types.Visibility;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypesFactoryImpl extends EFactoryImpl implements TypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypesFactory init() {
		try {
			TypesFactory theTypesFactory = (TypesFactory)EPackage.Registry.INSTANCE.getEFactory(TypesPackage.eNS_URI);
			if (theTypesFactory != null) {
				return theTypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TypesPackage.PACKAGE: return createPackage();
			case TypesPackage.TYPE: return createType();
			case TypesPackage.DECLARATION: return createDeclaration();
			case TypesPackage.OPERATION: return createOperation();
			case TypesPackage.PROPERTY: return createProperty();
			case TypesPackage.PARAMETER: return createParameter();
			case TypesPackage.TYPE_SPECIFIER: return createTypeSpecifier();
			case TypesPackage.EVENT: return createEvent();
			case TypesPackage.ENUMERATION_TYPE: return createEnumerationType();
			case TypesPackage.PRIMITIVE_TYPE: return createPrimitiveType();
			case TypesPackage.COMPLEX_TYPE: return createComplexType();
			case TypesPackage.ENUMERATOR: return createEnumerator();
			case TypesPackage.TYPE_PARAMETER: return createTypeParameter();
			case TypesPackage.GENERIC_ELEMENT: return createGenericElement();
			case TypesPackage.DOMAIN: return createDomain();
			case TypesPackage.TYPE_ALIAS: return createTypeAlias();
			case TypesPackage.ANNOTATION: return createAnnotation();
			case TypesPackage.ANNOTATABLE_ELEMENT: return createAnnotatableElement();
			case TypesPackage.ARRAY_TYPE_SPECIFIER: return createArrayTypeSpecifier();
			case TypesPackage.ANNOTATION_TYPE: return createAnnotationType();
			case TypesPackage.TYPED_DECLARATION: return createTypedDeclaration();
			case TypesPackage.META_COMPOSITE: return createMetaComposite();
			case TypesPackage.CONSTRUCTOR: return createConstructor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TypesPackage.DIRECTION:
				return createDirectionFromString(eDataType, initialValue);
			case TypesPackage.VISIBILITY:
				return createVisibilityFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TypesPackage.DIRECTION:
				return convertDirectionToString(eDataType, instanceValue);
			case TypesPackage.VISIBILITY:
				return convertVisibilityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.yakindu.base.types.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Declaration createDeclaration() {
		DeclarationImpl declaration = new DeclarationImpl();
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		operation.setAnnotationInfo(createDeclaration());
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		property.setAnnotationInfo(createDeclaration());
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		parameter.setAnnotationInfo(createDeclaration());
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeSpecifier createTypeSpecifier() {
		TypeSpecifierImpl typeSpecifier = new TypeSpecifierImpl();
		return typeSpecifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Event createEvent() {
		EventImpl event = new EventImpl();
		event.setAnnotationInfo(createDeclaration());
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EnumerationType createEnumerationType() {
		EnumerationTypeImpl enumerationType = new EnumerationTypeImpl();
		enumerationType.setAnnotationInfo(createDeclaration());
		return enumerationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public ComplexType createComplexType() {
		ComplexTypeImpl complexType = new ComplexTypeImpl();
		complexType.setAnnotationInfo(createDeclaration());
		return complexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumerator createEnumerator() {
		EnumeratorImpl enumerator = new EnumeratorImpl();
		return enumerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeParameter createTypeParameter() {
		TypeParameterImpl typeParameter = new TypeParameterImpl();
		return typeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericElement createGenericElement() {
		GenericElementImpl genericElement = new GenericElementImpl();
		return genericElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Domain createDomain() {
		DomainImpl domain = new DomainImpl();
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public TypeAlias createTypeAlias() {
		TypeAliasImpl typeAlias = new TypeAliasImpl();
		typeAlias.setAnnotationInfo(createDeclaration());
		return typeAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotatableElement createAnnotatableElement() {
		AnnotatableElementImpl annotatableElement = new AnnotatableElementImpl();
		return annotatableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayTypeSpecifier createArrayTypeSpecifier() {
		ArrayTypeSpecifierImpl arrayTypeSpecifier = new ArrayTypeSpecifierImpl();
		return arrayTypeSpecifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public AnnotationType createAnnotationType() {
		AnnotationTypeImpl annotationType = new AnnotationTypeImpl();
		annotationType.setAnnotationInfo(createDeclaration());
		return annotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypedDeclaration createTypedDeclaration() {
		TypedDeclarationImpl typedDeclaration = new TypedDeclarationImpl();
		return typedDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetaComposite createMetaComposite() {
		MetaCompositeImpl metaComposite = new MetaCompositeImpl();
		return metaComposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Constructor createConstructor() {
		ConstructorImpl constructor = new ConstructorImpl();
		constructor.setAnnotationInfo(createDeclaration());
		return constructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction createDirectionFromString(EDataType eDataType, String initialValue) {
		Direction result = Direction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility createVisibilityFromString(EDataType eDataType, String initialValue) {
		Visibility result = Visibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypesPackage getTypesPackage() {
		return (TypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TypesPackage getPackage() {
		return TypesPackage.eINSTANCE;
	}

} //TypesFactoryImpl
