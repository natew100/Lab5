/**
 * <h1>BartSimpsonUnitTest</h1>
 * <h2>CISC 181-020L Spring 2023</h2>
 * <h3>University of Delaware</h3>
 *
 * @author Nathan Wolf
 */

/**
 * This program tests the methods from the BartSimpsonUnit file.
 **/

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;


public class BartSimpsonUnitTest {
    @org.junit.Test
    // Testing Method With for Spawn Method.
    public void test_spawn() {
        System.out.println("Testing spawn");
        // create a BartSimpsonUnit and call its spawn method
        BartSimpsonUnit bart = new BartSimpsonUnit();
        // bart should be able to spawn
        assertTrue(bart.canSpawn());
        // bart spawns
        BartSimpsonUnit lilBart = bart.spawn();
        // Number of times piece has spawned should be increased
        assertEquals(1, bart.getNumTimesSpawned());
        // Now that max time number of spawns reached - it
        // shouldn't be able to spawn anymore
        assertFalse(bart.canSpawn());

    }

    @org.junit.Test
    // Testing Method With No Parameters Set in Unit.
    public void testingBartSimpsonNoParameterConstructor() {
        System.out.println("Creating Bart Simpson with 0 parameter constructor");
        BartSimpsonUnit bs = new BartSimpsonUnit();
        System.out.println();
        System.out.println("-- Testing Getters");
        System.out.println();
        System.out.println("-- Testing Symbol");
        assertEquals('B', bs.getSymbol());
        System.out.println("-- Testing Name");
        assertEquals("Bart Simpson", bs.getName());
        System.out.println("-- Testing Health");
        assertEquals(100.0, bs.getHealth(), 0.0001);
        System.out.println("-- Testing Number Times Spawned");
        assertEquals(0, bs.getNumTimesSpawned());
        System.out.println("-- Testing Can Distract");
        assertEquals(true, bs.canDistract());
        System.out.println("-- Testing Can Recruit");
        assertEquals(true, bs.canRecruit());
    }

    @org.junit.Test
    // Testing Method With Parameters Set in Unit.
    public void testingBartSimpsonParameterConstructor() {
        System.out.println("Creating Bart Simpson with 14 parameter constructor");
        BartSimpsonUnit bs = new BartSimpsonUnit('S', "Simpson", 58.0, 7.0, 20.0, 5.0,
                0, 1, 1, 1, 1, 0, true, true,
                "New Team");
        System.out.println();
        System.out.println("-- Testing Getters");
        System.out.println();
        System.out.println("-- Testing Health Modifier");
        assertEquals(7.0, bs.getHealthModifier(), 0.0001);
        System.out.println("-- Testing Damage");
        assertEquals(20.0, bs.getDamage(), 0.0001);
        System.out.println("-- Testing Damage Modifier");
        assertEquals(5.0, bs.getDamageModifier(), 0.0001);
        System.out.println("-- Testing Luck");
        assertEquals(0, bs.getLuck());
        System.out.println("-- Testing xCor");
        assertEquals(1, bs.getxCor());
        System.out.println("-- Testing yCor");
        assertEquals(1, bs.getyCor());
        System.out.println("-- Testing Movement");
        assertEquals(1, bs.getMovement());
        System.out.println("-- Testing Movement Modifier");
        assertEquals(1, bs.getMovementModifier());
        System.out.println();
        System.out.println("-- Testing Setters");
        System.out.println();
        System.out.println("-- Testing Symbol");
        bs.setSymbol('A');
        assertEquals('A', bs.getSymbol());
        System.out.println("-- Testing Damage Modifier");
        bs.setDamageModifier(10.0);
        assertEquals(10.0, bs.getDamageModifier(), 0.0001);
        System.out.println("-- Testing Can Recruit");
        bs.setRecruit(false);
        assertFalse(bs.canRecruit());
        System.out.println("-- Testing Can Distract (True)");
        bs.setDistract(true);
        assertTrue(bs.canDistract());
        System.out.println("-- Testing Can Distract (False)");
        bs.setDistract(false);
        assertFalse(bs.canDistract());
        System.out.println();
    }
}