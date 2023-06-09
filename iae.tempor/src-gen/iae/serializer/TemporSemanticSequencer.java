/*
 * generated by Xtext 2.26.0
 */
package iae.serializer;

import com.google.inject.Inject;
import iae.services.TemporGrammarAccess;
import iae.tempor.Expr;
import iae.tempor.Model;
import iae.tempor.Requirement;
import iae.tempor.TemporPackage;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class TemporSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TemporGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == TemporPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TemporPackage.EXPR:
				sequence_Expr(context, (Expr) semanticObject); 
				return; 
			case TemporPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case TemporPackage.REQUIREMENT:
				sequence_Requirement(context, (Requirement) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expr returns Expr
	 *
	 * Constraint:
	 *     (obj=ID prop=ID)
	 * </pre>
	 */
	protected void sequence_Expr(ISerializationContext context, Expr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TemporPackage.Literals.EXPR__OBJ) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TemporPackage.Literals.EXPR__OBJ));
			if (transientValues.isValueTransient(semanticObject, TemporPackage.Literals.EXPR__PROP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TemporPackage.Literals.EXPR__PROP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExprAccess().getObjIDTerminalRuleCall_0_0(), semanticObject.getObj());
		feeder.accept(grammarAccess.getExprAccess().getPropIDTerminalRuleCall_2_0(), semanticObject.getProp());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     req+=Requirement
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Requirement returns Requirement
	 *
	 * Constraint:
	 *     (
	 *         (trig=Expr inv=Expr) | 
	 *         (trig=Expr rea=Expr) | 
	 *         (trig=Expr inv=Expr rea=Expr) | 
	 *         (trig=Expr rel=Expr rea=Expr) | 
	 *         (trig=Expr rel=Expr inv=Expr rea=Expr) | 
	 *         (trig=Expr inv=Expr) | 
	 *         (trig=Expr inv=Expr rel=Expr) | 
	 *         (trig=Expr inv=Expr rea=Expr inv2=Expr) | 
	 *         (trig=Expr inv=Expr rel=Expr rea=Expr inv2=Expr) | 
	 *         (trig=Expr notdel=Expr rel=Expr rea=Expr) | 
	 *         (trig=Expr fin=Expr rea=Expr) | 
	 *         (trig=Expr rel=Expr fin=Expr rea=Expr) | 
	 *         (trig=Expr fin=Expr notdel=Expr) | 
	 *         (trig=Expr fin=Expr notdel=Expr rea=Expr) | 
	 *         (trig=Expr inv=Expr notdel=Expr rea=Expr inv2=Expr) | 
	 *         (
	 *             trig=Expr 
	 *             inv=Expr 
	 *             notdel=Expr 
	 *             rel=Expr 
	 *             rea=Expr 
	 *             inv2=Expr
	 *         ) | 
	 *         (
	 *             trig=Expr 
	 *             inv=Expr 
	 *             notfin=Expr 
	 *             rel=Expr 
	 *             fin=Expr 
	 *             inv2=Expr
	 *         ) | 
	 *         (
	 *             trig=Expr 
	 *             inv=Expr 
	 *             notfin=Expr 
	 *             rel=Expr 
	 *             fin=Expr 
	 *             inv2=Expr 
	 *             rea=Expr
	 *         ) | 
	 *         (trig=Expr inv=Expr notfin=Expr fin=Expr inv2=Expr) | 
	 *         (
	 *             trig=Expr 
	 *             inv=Expr 
	 *             notfin=Expr 
	 *             fin=Expr 
	 *             inv2=Expr 
	 *             rea=Expr
	 *         ) | 
	 *         (
	 *             trig=Expr 
	 *             inv=Expr 
	 *             notfin=Expr 
	 *             fin=Expr 
	 *             inv2=Expr 
	 *             notdel=Expr
	 *         ) | 
	 *         (
	 *             trig=Expr 
	 *             inv=Expr 
	 *             notfin=Expr 
	 *             fin2=Expr 
	 *             inv2=Expr 
	 *             rea=Expr 
	 *             inv3=Expr
	 *         ) | 
	 *         (
	 *             trig=Expr 
	 *             inv=Expr 
	 *             notfin=Expr 
	 *             fin2=Expr 
	 *             inv2=Expr 
	 *             notdel=Expr 
	 *             rea=Expr 
	 *             inv3=Expr
	 *         ) | 
	 *         (trig=Expr rel=Expr fin=Expr notdel=Expr rel2=Expr) | 
	 *         (
	 *             trig=Expr 
	 *             rel=Expr 
	 *             fin=Expr 
	 *             notdel=Expr 
	 *             rel2=Expr 
	 *             rea=Expr
	 *         ) | 
	 *         (
	 *             trig=Expr 
	 *             rel=Expr 
	 *             inv=Expr 
	 *             notfin=Expr 
	 *             fin=Expr 
	 *             inv2=Expr 
	 *             rel2=Expr
	 *         ) | 
	 *         (
	 *             trig=Expr 
	 *             rel=Expr 
	 *             inv=Expr 
	 *             notfin=Expr 
	 *             fin=Expr 
	 *             inv2=Expr 
	 *             rel2=Expr 
	 *             rea=Expr 
	 *             inv3=Expr
	 *         ) | 
	 *         (
	 *             trig=Expr 
	 *             rel=Expr 
	 *             inv=Expr 
	 *             notfin=Expr 
	 *             fin=Expr 
	 *             inv2=Expr 
	 *             notdel=Expr 
	 *             rel2=Expr
	 *         ) | 
	 *         (
	 *             trig=Expr 
	 *             rel=Expr 
	 *             inv=Expr 
	 *             notfin=Expr 
	 *             fin=Expr 
	 *             inv2=Expr 
	 *             notdel=Expr 
	 *             rel2=Expr 
	 *             rea=Expr 
	 *             inv3=Expr
	 *         ) | 
	 *         inv=Expr | 
	 *         rea=Expr | 
	 *         (inv=Expr rea=Expr) | 
	 *         (rel=Expr rea=Expr) | 
	 *         (rel=Expr inv=Expr rea=Expr) | 
	 *         (inv=Expr rel=Expr) | 
	 *         (notdel=Expr rel=Expr rea=Expr) | 
	 *         (inv=Expr rea=Expr) | 
	 *         (e1=Expr e2=Expr e3=Expr) | 
	 *         (fin=Expr rea=Expr) | 
	 *         (fin=Expr rea=Expr rel=Expr) | 
	 *         (fin=Expr notdel=Expr) | 
	 *         (fin=Expr notdel=Expr rea=Expr) | 
	 *         (inv=Expr notdel=Expr rea=Expr) | 
	 *         (inv=Expr fin=Expr rel=Expr fin2=Expr inv2=Expr) | 
	 *         (inv=Expr fin=Expr rea=Expr) | 
	 *         (
	 *             inv=Expr 
	 *             fin=Expr 
	 *             rel=Expr 
	 *             fin2=Expr 
	 *             inv2=Expr 
	 *             rea=Expr
	 *         ) | 
	 *         (inv=Expr fin=Expr fin2=Expr inv2=Expr notdel=Expr) | 
	 *         (inv=Expr fin=Expr rea=Expr) | 
	 *         (inv=Expr fin=Expr notdel=Expr rea=Expr) | 
	 *         (rel=Expr fin=Expr notdel=Expr rel2=Expr) | 
	 *         (rel=Expr fin=Expr notdel=Expr rel2=Expr rea=Expr) | 
	 *         (
	 *             rel=Expr 
	 *             inv=Expr 
	 *             fin=Expr 
	 *             fin2=Expr 
	 *             inv2=Expr 
	 *             rel2=Expr
	 *         ) | 
	 *         (
	 *             rel=Expr 
	 *             inv=Expr 
	 *             fin=Expr 
	 *             fin2=Expr 
	 *             inv2=Expr 
	 *             rel2=Expr 
	 *             rea2=Expr 
	 *             inv3=Expr
	 *         ) | 
	 *         (
	 *             rel=Expr 
	 *             inv=Expr 
	 *             fin=Expr 
	 *             fin2=Expr 
	 *             inv2=Expr 
	 *             notdel=Expr 
	 *             rel2=Expr
	 *         ) | 
	 *         (
	 *             rel=Expr 
	 *             inv=Expr 
	 *             fin=Expr 
	 *             fin2=Expr 
	 *             inv2=Expr 
	 *             notdel=Expr 
	 *             rel2=Expr 
	 *             rea=Expr 
	 *             inv3=Expr
	 *         ) | 
	 *         (rel=Expr fin=Expr notdel=Expr rel2=Expr) | 
	 *         (rel=Expr fin=Expr notdel=Expr rel2=Expr rea=Expr) | 
	 *         (
	 *             rel=Expr 
	 *             inv=Expr 
	 *             fin=Expr 
	 *             fin2=Expr 
	 *             inv2=Expr 
	 *             rel2=Expr
	 *         ) | 
	 *         (
	 *             rel=Expr 
	 *             inv=Expr 
	 *             fin=Expr 
	 *             fin2=Expr 
	 *             inv2=Expr 
	 *             rel2=Expr 
	 *             rea=Expr 
	 *             inv3=Expr
	 *         ) | 
	 *         (
	 *             rel=Expr 
	 *             inv=Expr 
	 *             fin=Expr 
	 *             fin2=Expr 
	 *             inv2=Expr 
	 *             notdel=Expr 
	 *             rel2=Expr
	 *         ) | 
	 *         (
	 *             rel=Expr 
	 *             inv=Expr 
	 *             fin=Expr 
	 *             fin2=Expr 
	 *             inv2=Expr 
	 *             notdel=Expr 
	 *             rel2=Expr 
	 *             rea=Expr 
	 *             inv3=Expr
	 *         )
	 *     )
	 * </pre>
	 */
	protected void sequence_Requirement(ISerializationContext context, Requirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
