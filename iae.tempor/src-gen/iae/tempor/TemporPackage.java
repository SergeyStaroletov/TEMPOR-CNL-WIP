/**
 * generated by Xtext 2.26.0
 */
package iae.tempor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see iae.tempor.TemporFactory
 * @model kind="package"
 * @generated
 */
public interface TemporPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "tempor";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.Tempor.iae";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "tempor";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TemporPackage eINSTANCE = iae.tempor.impl.TemporPackageImpl.init();

  /**
   * The meta object id for the '{@link iae.tempor.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see iae.tempor.impl.ModelImpl
   * @see iae.tempor.impl.TemporPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Req</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__REQ = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link iae.tempor.impl.RequirementImpl <em>Requirement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see iae.tempor.impl.RequirementImpl
   * @see iae.tempor.impl.TemporPackageImpl#getRequirement()
   * @generated
   */
  int REQUIREMENT = 1;

  /**
   * The feature id for the '<em><b>Trig</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__TRIG = 0;

  /**
   * The feature id for the '<em><b>Inv</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__INV = 1;

  /**
   * The feature id for the '<em><b>Rea</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__REA = 2;

  /**
   * The feature id for the '<em><b>Rel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__REL = 3;

  /**
   * The feature id for the '<em><b>Inv2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__INV2 = 4;

  /**
   * The feature id for the '<em><b>Notdel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__NOTDEL = 5;

  /**
   * The feature id for the '<em><b>Fin</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__FIN = 6;

  /**
   * The feature id for the '<em><b>Notfin</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__NOTFIN = 7;

  /**
   * The feature id for the '<em><b>Fin2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__FIN2 = 8;

  /**
   * The feature id for the '<em><b>Inv3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__INV3 = 9;

  /**
   * The feature id for the '<em><b>Rel2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__REL2 = 10;

  /**
   * The feature id for the '<em><b>E1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__E1 = 11;

  /**
   * The feature id for the '<em><b>E2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__E2 = 12;

  /**
   * The feature id for the '<em><b>E3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__E3 = 13;

  /**
   * The feature id for the '<em><b>Rea2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__REA2 = 14;

  /**
   * The number of structural features of the '<em>Requirement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_FEATURE_COUNT = 15;

  /**
   * The meta object id for the '{@link iae.tempor.impl.ExprImpl <em>Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see iae.tempor.impl.ExprImpl
   * @see iae.tempor.impl.TemporPackageImpl#getExpr()
   * @generated
   */
  int EXPR = 2;

  /**
   * The feature id for the '<em><b>Obj</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__OBJ = 0;

  /**
   * The feature id for the '<em><b>Prop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__PROP = 1;

  /**
   * The number of structural features of the '<em>Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link iae.tempor.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see iae.tempor.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link iae.tempor.Model#getReq <em>Req</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Req</em>'.
   * @see iae.tempor.Model#getReq()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Req();

  /**
   * Returns the meta object for class '{@link iae.tempor.Requirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Requirement</em>'.
   * @see iae.tempor.Requirement
   * @generated
   */
  EClass getRequirement();

  /**
   * Returns the meta object for the containment reference '{@link iae.tempor.Requirement#getTrig <em>Trig</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trig</em>'.
   * @see iae.tempor.Requirement#getTrig()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_Trig();

  /**
   * Returns the meta object for the containment reference '{@link iae.tempor.Requirement#getInv <em>Inv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inv</em>'.
   * @see iae.tempor.Requirement#getInv()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_Inv();

  /**
   * Returns the meta object for the containment reference '{@link iae.tempor.Requirement#getRea <em>Rea</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rea</em>'.
   * @see iae.tempor.Requirement#getRea()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_Rea();

  /**
   * Returns the meta object for the containment reference '{@link iae.tempor.Requirement#getRel <em>Rel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rel</em>'.
   * @see iae.tempor.Requirement#getRel()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_Rel();

  /**
   * Returns the meta object for the containment reference '{@link iae.tempor.Requirement#getInv2 <em>Inv2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inv2</em>'.
   * @see iae.tempor.Requirement#getInv2()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_Inv2();

  /**
   * Returns the meta object for the containment reference '{@link iae.tempor.Requirement#getNotdel <em>Notdel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Notdel</em>'.
   * @see iae.tempor.Requirement#getNotdel()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_Notdel();

  /**
   * Returns the meta object for the containment reference '{@link iae.tempor.Requirement#getFin <em>Fin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fin</em>'.
   * @see iae.tempor.Requirement#getFin()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_Fin();

  /**
   * Returns the meta object for the containment reference '{@link iae.tempor.Requirement#getNotfin <em>Notfin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Notfin</em>'.
   * @see iae.tempor.Requirement#getNotfin()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_Notfin();

  /**
   * Returns the meta object for the containment reference '{@link iae.tempor.Requirement#getFin2 <em>Fin2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fin2</em>'.
   * @see iae.tempor.Requirement#getFin2()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_Fin2();

  /**
   * Returns the meta object for the containment reference '{@link iae.tempor.Requirement#getInv3 <em>Inv3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inv3</em>'.
   * @see iae.tempor.Requirement#getInv3()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_Inv3();

  /**
   * Returns the meta object for the containment reference '{@link iae.tempor.Requirement#getRel2 <em>Rel2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rel2</em>'.
   * @see iae.tempor.Requirement#getRel2()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_Rel2();

  /**
   * Returns the meta object for the containment reference '{@link iae.tempor.Requirement#getE1 <em>E1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E1</em>'.
   * @see iae.tempor.Requirement#getE1()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_E1();

  /**
   * Returns the meta object for the containment reference '{@link iae.tempor.Requirement#getE2 <em>E2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E2</em>'.
   * @see iae.tempor.Requirement#getE2()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_E2();

  /**
   * Returns the meta object for the containment reference '{@link iae.tempor.Requirement#getE3 <em>E3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E3</em>'.
   * @see iae.tempor.Requirement#getE3()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_E3();

  /**
   * Returns the meta object for the containment reference '{@link iae.tempor.Requirement#getRea2 <em>Rea2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rea2</em>'.
   * @see iae.tempor.Requirement#getRea2()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_Rea2();

  /**
   * Returns the meta object for class '{@link iae.tempor.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr</em>'.
   * @see iae.tempor.Expr
   * @generated
   */
  EClass getExpr();

  /**
   * Returns the meta object for the attribute '{@link iae.tempor.Expr#getObj <em>Obj</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Obj</em>'.
   * @see iae.tempor.Expr#getObj()
   * @see #getExpr()
   * @generated
   */
  EAttribute getExpr_Obj();

  /**
   * Returns the meta object for the attribute '{@link iae.tempor.Expr#getProp <em>Prop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prop</em>'.
   * @see iae.tempor.Expr#getProp()
   * @see #getExpr()
   * @generated
   */
  EAttribute getExpr_Prop();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TemporFactory getTemporFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link iae.tempor.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see iae.tempor.impl.ModelImpl
     * @see iae.tempor.impl.TemporPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Req</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__REQ = eINSTANCE.getModel_Req();

    /**
     * The meta object literal for the '{@link iae.tempor.impl.RequirementImpl <em>Requirement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see iae.tempor.impl.RequirementImpl
     * @see iae.tempor.impl.TemporPackageImpl#getRequirement()
     * @generated
     */
    EClass REQUIREMENT = eINSTANCE.getRequirement();

    /**
     * The meta object literal for the '<em><b>Trig</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__TRIG = eINSTANCE.getRequirement_Trig();

    /**
     * The meta object literal for the '<em><b>Inv</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__INV = eINSTANCE.getRequirement_Inv();

    /**
     * The meta object literal for the '<em><b>Rea</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__REA = eINSTANCE.getRequirement_Rea();

    /**
     * The meta object literal for the '<em><b>Rel</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__REL = eINSTANCE.getRequirement_Rel();

    /**
     * The meta object literal for the '<em><b>Inv2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__INV2 = eINSTANCE.getRequirement_Inv2();

    /**
     * The meta object literal for the '<em><b>Notdel</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__NOTDEL = eINSTANCE.getRequirement_Notdel();

    /**
     * The meta object literal for the '<em><b>Fin</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__FIN = eINSTANCE.getRequirement_Fin();

    /**
     * The meta object literal for the '<em><b>Notfin</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__NOTFIN = eINSTANCE.getRequirement_Notfin();

    /**
     * The meta object literal for the '<em><b>Fin2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__FIN2 = eINSTANCE.getRequirement_Fin2();

    /**
     * The meta object literal for the '<em><b>Inv3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__INV3 = eINSTANCE.getRequirement_Inv3();

    /**
     * The meta object literal for the '<em><b>Rel2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__REL2 = eINSTANCE.getRequirement_Rel2();

    /**
     * The meta object literal for the '<em><b>E1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__E1 = eINSTANCE.getRequirement_E1();

    /**
     * The meta object literal for the '<em><b>E2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__E2 = eINSTANCE.getRequirement_E2();

    /**
     * The meta object literal for the '<em><b>E3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__E3 = eINSTANCE.getRequirement_E3();

    /**
     * The meta object literal for the '<em><b>Rea2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__REA2 = eINSTANCE.getRequirement_Rea2();

    /**
     * The meta object literal for the '{@link iae.tempor.impl.ExprImpl <em>Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see iae.tempor.impl.ExprImpl
     * @see iae.tempor.impl.TemporPackageImpl#getExpr()
     * @generated
     */
    EClass EXPR = eINSTANCE.getExpr();

    /**
     * The meta object literal for the '<em><b>Obj</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR__OBJ = eINSTANCE.getExpr_Obj();

    /**
     * The meta object literal for the '<em><b>Prop</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR__PROP = eINSTANCE.getExpr_Prop();

  }

} //TemporPackage