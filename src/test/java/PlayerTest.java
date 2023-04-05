import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
class PlayerTest {
    @Test
    public void testPlayerWithParameters() {
        System.out.println("Creating Player With 3 Parameters");
        Team teamOne = new Team("Blue", new ArrayList<Unit>());
        Team teamTwo = new Team("Red", new ArrayList<Unit>());
        Player newPlayer = new Player(1, true, teamOne);
        System.out.println("-- Testing Get Player Number");
        assertEquals(1, newPlayer.getPlayerNumber());
        System.out.println("-- Testing Set Player Number");
        newPlayer.setPlayerNumber(2);
        assertEquals(2, newPlayer.getPlayerNumber());
        System.out.println("-- Testing Get Turn");
        assertTrue(newPlayer.isTurn());
        System.out.println("-- Testing Set Turn");
        newPlayer.setTurn(false);
        assertFalse(newPlayer.isTurn());
        System.out.println("-- Testing Get Unit");
        assertSame(teamOne, newPlayer.getPlayersTeam());
        System.out.println("-- Testing Set Unit");
        newPlayer.setPlayersTeam(teamTwo);
        assertSame(teamTwo, newPlayer.getPlayersTeam());
    }
    @Test
    public void testPlayerWithNumberAndUnit() {
        System.out.println("Creating Player With 2 Parameters");
        Team teamOne = new Team("Blue", new ArrayList<Unit>());
        Team teamTwo = new Team("Red", new ArrayList<Unit>());
        Player newPlayer = new Player(4, teamTwo);
        System.out.println("-- Testing Get Player Number");
        assertEquals(4, newPlayer.getPlayerNumber());
        System.out.println("-- Testing Set Player Number");
        newPlayer.setPlayerNumber(3);
        assertEquals(3, newPlayer.getPlayerNumber());
        System.out.println("-- Testing Get Turn");
        assertFalse(newPlayer.isTurn());
        System.out.println("-- Testing Set Turn");
        newPlayer.setTurn(true);
        assertTrue(newPlayer.isTurn());
        System.out.println("-- Testing Get Unit");
        assertSame(teamTwo, newPlayer.getPlayersTeam());
        System.out.println("-- Testing Set Unit");
        newPlayer.setPlayersTeam(teamOne);
        assertSame(teamOne, newPlayer.getPlayersTeam());
    }
    @Test
    public void testPlayerNoParameters() {
        System.out.println("Creating Player With No Parameters");
        Player newPlayer = new Player();
        Team teamOne = new Team("White", new ArrayList<Unit>());
        System.out.println("-- Testing Get Player Number");
        assertEquals(0, newPlayer.getPlayerNumber());
        System.out.println("-- Testing Set Player Number");
        newPlayer.setPlayerNumber(6);
        assertEquals(6, newPlayer.getPlayerNumber());
        System.out.println("-- Testing Get Turn");
        assertFalse(newPlayer.isTurn());
        System.out.println("-- Testing Set Turn");
        newPlayer.setTurn(false);
        assertFalse(newPlayer.isTurn());
        System.out.println("-- Testing Set Unit");
        newPlayer.setPlayersTeam(teamOne);
        assertSame(teamOne, newPlayer.getPlayersTeam());
    }
}