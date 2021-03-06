/** Generated by YAKINDU Statechart Tools code generator. */

package org.yakindu.sct.generator.java.test;

import org.junit.*;
import static org.junit.Assert.*;
import org.yakindu.scr.guard.GuardStatemachine;
import org.yakindu.scr.guard.GuardStatemachine.State;	
import org.yakindu.scr.VirtualTimer;
import org.yakindu.scr.VirtualTimer.VirtualTimeTask;
import org.yakindu.scr.VirtualTimer.CycleTimeEventTask;

/**
 * Unit TestCase for Guard
 */
@SuppressWarnings("all")
public class Guard {
	
	private GuardStatemachine statemachine;	
	private VirtualTimer timer;
	
	
	@Before
	public void guard_setUp() {
		statemachine = new GuardStatemachine();
		timer = new VirtualTimer(200);
		timer.schedulePeriodicalTask(new CycleTimeEventTask(statemachine), 200, 200);
		
		statemachine.init();
		
	}

	@After
	public void guard_tearDown() {
		statemachine = null;
		
		timer = null;
	}
	
	@Test
	public void guardTest() {
		statemachine.enter();
		assertTrue(statemachine.isStateActive(State.main_region_A));
		statemachine.raiseEvent1();
		timer.cycleLeap(1l);
		assertTrue(statemachine.isStateActive(State.main_region_A));
		statemachine.raiseEvent2();
		timer.cycleLeap(1l);
		assertTrue(statemachine.isStateActive(State.main_region_B));
		statemachine.raiseReturn();
		timer.cycleLeap(1l);
		assertTrue(statemachine.isStateActive(State.main_region_A));
		statemachine.raiseEvent1();
		timer.cycleLeap(1l);
		assertTrue(statemachine.isStateActive(State.main_region_B));
		statemachine.raiseReturn();
		timer.cycleLeap(1l);
		assertTrue(statemachine.isStateActive(State.main_region_A));
	}
}
