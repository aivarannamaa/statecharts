/** Generated by YAKINDU Statechart Tools code generator. */

package org.yakindu.sct.generator.java.test;

import org.junit.*;
import static org.junit.Assert.*;
import org.yakindu.scr.localreactions.LocalReactionsStatemachine;
import org.yakindu.scr.localreactions.LocalReactionsStatemachine.State;	
import org.yakindu.scr.VirtualTimer;
import org.yakindu.scr.VirtualTimer.VirtualTimeTask;
import org.yakindu.scr.VirtualTimer.CycleTimeEventTask;

/**
 * Unit TestCase for LocalReactions
 */
@SuppressWarnings("all")
public class LocalReactions {
	
	private LocalReactionsStatemachine statemachine;	
	private VirtualTimer timer;
	
	
	@Before
	public void localReactions_setUp() {
		statemachine = new LocalReactionsStatemachine();
		timer = new VirtualTimer(200);
		timer.schedulePeriodicalTask(new CycleTimeEventTask(statemachine), 200, 200);
		
		statemachine.init();
		
	}

	@After
	public void localReactions_tearDown() {
		statemachine = null;
		
		timer = null;
	}
	
	@Test
	public void localReactionsTest() {
		statemachine.enter();
		assertTrue(statemachine.isStateActive(State.main_region_A));
		timer.cycleLeap(1);
		assertTrue(statemachine.getX() == 1l);
	}
	
	@Test
	public void statechartLocalReactionsTest() {
		statemachine.enter();
		assertTrue(statemachine.getEn_true() == 1l);
		assertTrue(statemachine.getEn_false() == 0l);
		assertTrue(statemachine.getEx_true() == 0l);
		assertTrue(statemachine.getEx_false() == 0l);
		statemachine.exit();
		assertTrue(statemachine.getEn_true() == 1l);
		assertTrue(statemachine.getEn_false() == 0l);
		assertTrue(statemachine.getEx_true() == 1l);
		assertTrue(statemachine.getEx_false() == 0l);
	}
}
