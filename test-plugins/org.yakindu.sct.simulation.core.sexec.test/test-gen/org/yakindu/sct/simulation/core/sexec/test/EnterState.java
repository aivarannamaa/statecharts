/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.sct.simulation.core.sexec.test;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.yakindu.sct.model.sexec.ExecutionFlow;
import org.yakindu.sct.model.sexec.interpreter.test.util.AbstractExecutionFlowTest;
import org.yakindu.sct.model.sexec.interpreter.test.util.SExecInjectionProvider;
import org.yakindu.sct.test.models.SCTUnitTestModels;
import com.google.inject.Inject;
import static org.junit.Assert.*;

/**
 * Unit TestCase for EnterState
 */
@SuppressWarnings("all")
@RunWith(XtextRunner.class)
@InjectWith(SExecInjectionProvider.class)
public class EnterState extends AbstractExecutionFlowTest {
	
	@Before
	public void setup() throws Exception{
		ExecutionFlow flow = models.loadExecutionFlowFromResource("EnterState.sct");
		initInterpreter(flow);
	}
	@Test
	public void defaultEntry() throws Exception {
		interpreter.enter();
		assertTrue(isStateActive("A"));
		raiseEvent("e");
		timer.timeLeap(getCyclePeriod());
		assertTrue(isStateActive("E"));
	}
	@Test
	public void namedEntryThroughNamedTransition() throws Exception {
		interpreter.enter();
		assertTrue(isStateActive("A"));
		raiseEvent("f");
		timer.timeLeap(getCyclePeriod());
		assertTrue(isStateActive("F"));
	}
	@Test
	public void namedEntryThroughDefaultTransition() throws Exception {
		interpreter.enter();
		assertTrue(isStateActive("A"));
		raiseEvent("g");
		timer.timeLeap(getCyclePeriod());
		assertTrue(isStateActive("E"));
	}
}
