import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * A bare minimum of test cases so we can check to see if we're breaking
 * anything as we refactor
 * @author Nathan Gossett
 * @version 4/11/16
 *
 */
public class TestOfTicTacToeModel {
	/** The game we're testing */
	private TicTacToeModel game;
	
	/**
	 * Just in case we ever wanted to do more than reset the game between test cases
	 */
	@Before
	public void reset(){
		game = new TicTacToeModel(3);
	}
	
	/** Make sure you can't do two x or two o moves in a row */
	@Test
	public void testDoubleMove() {
		game.setValueAt("x", 1, 1);
		assertEquals('x', game.getValueAt(1, 1));
		assertNull(game.getValueAt(0, 1));
		game.setValueAt("x", 0, 1);
		assertNull("X was allowed to move twice in a row", game.getValueAt(0, 1));
		
		game.setValueAt("o", 0, 1);
		assertEquals('o', game.getValueAt(0,1));
		assertNull(game.getValueAt(1,0));
		game.setValueAt("o", 1, 0);
		assertNull("O was allowed to move twice in a row", game.getValueAt(1,0));
	}
	
	/** Make sure you can't overwrite a previous move */
	@Test
	public void testReplaceMove(){
		game.setValueAt("x", 1, 1);
		assertEquals('x', game.getValueAt(1,1));
		game.setValueAt("o", 1, 1);
		assertEquals("O replaced X", 'x', game.getValueAt(1, 1));
	}

	/** Make sure a horizontal x win is detected */
	@Test
	public void testHorizontalXWin(){
		game.setValueAt("x", 0, 0);
		game.setValueAt("o", 1, 0);
		game.setValueAt("x", 0, 1);
		game.setValueAt("o", 1, 1);
		assertEquals(TicTacToeModel.INPROGRESS, game.getGameState());
		game.setValueAt("x", 0, 2);
		assertEquals(TicTacToeModel.XWIN, game.getGameState());
	}
	
	/** Make sure a vertical x win is detected */
	@Test
	public void testVerticalXWin(){
		game.setValueAt("x", 0, 0);
		game.setValueAt("o", 0, 1);
		game.setValueAt("x", 1, 0);
		game.setValueAt("o", 1, 1);
		assertEquals(TicTacToeModel.INPROGRESS, game.getGameState());
		game.setValueAt("x", 2, 0);
		assertEquals(TicTacToeModel.XWIN, game.getGameState());
	}
	/** Make sure a diagonal x win is detected */
	@Test
	public void testDiagonalXWin(){
		game.setValueAt("x", 0, 0);
		game.setValueAt("o", 1, 0);
		game.setValueAt("x", 1, 1);
		game.setValueAt("o", 1, 2);
		assertEquals(TicTacToeModel.INPROGRESS, game.getGameState());
		game.setValueAt("x", 2, 2);
		assertEquals(TicTacToeModel.XWIN, game.getGameState());
	}
	/** Make sure a horizontal o win is detected */
	@Test
	public void testHorizontalOWin(){
		game.setValueAt("x", 0, 0);
		game.setValueAt("o", 2, 0);
		game.setValueAt("x", 0, 1);
		game.setValueAt("o", 2, 1);
		assertEquals(TicTacToeModel.INPROGRESS, game.getGameState());
		game.setValueAt("x", 1, 2);
		assertEquals(TicTacToeModel.INPROGRESS, game.getGameState());
		game.setValueAt("o", 2, 2);
		assertEquals(TicTacToeModel.OWIN, game.getGameState());
	}
	
	/** Make sure a vertical o win is detected */
	@Test
	public void testVerticalOWin(){
		game.setValueAt("x", 0, 0);
		game.setValueAt("o", 0, 2);
		game.setValueAt("x", 0, 1);
		game.setValueAt("o", 1, 2);
		assertEquals(TicTacToeModel.INPROGRESS, game.getGameState());
		game.setValueAt("x", 2, 1);
		assertEquals(TicTacToeModel.INPROGRESS, game.getGameState());
		game.setValueAt("o", 2, 2);
		assertEquals(TicTacToeModel.OWIN, game.getGameState());
	}
	
	/** Make sure a diagonal o win is detected (tests other diagonal compared to x)*/
	@Test
	public void testDiagonalOWin(){
		game.setValueAt("x", 0, 0);
		game.setValueAt("o", 2, 0);
		game.setValueAt("x", 0, 1);
		game.setValueAt("o", 1, 1);
		assertEquals(TicTacToeModel.INPROGRESS, game.getGameState());
		game.setValueAt("x", 1, 2);
		assertEquals(TicTacToeModel.INPROGRESS, game.getGameState());
		game.setValueAt("o", 0, 2);
		assertEquals(TicTacToeModel.OWIN, game.getGameState());
	}
	
	/** Make sure a tie game is detected */
	@Test
	public void testTieGame(){
		game.setValueAt("x", 0, 0);
		game.setValueAt("o", 0, 1);
		game.setValueAt("x", 0, 2);
		game.setValueAt("o", 1, 0);
		assertEquals(TicTacToeModel.INPROGRESS, game.getGameState());
		game.setValueAt("x", 1, 1);
		assertEquals(TicTacToeModel.INPROGRESS, game.getGameState());
		game.setValueAt("o", 2, 0);
		assertEquals(TicTacToeModel.INPROGRESS, game.getGameState());
		game.setValueAt("x", 1, 2);
		assertEquals(TicTacToeModel.INPROGRESS, game.getGameState());
		game.setValueAt("o", 2, 2);
		assertEquals(TicTacToeModel.INPROGRESS, game.getGameState());
		game.setValueAt("x", 2, 1);
		assertEquals(TicTacToeModel.TIEGAME, game.getGameState());
	}
	
	/** Make sure we can't keep making moves after the game is over */
	@Test
	public void testMoveAfterGameOver(){
		game.setValueAt("x", 0, 0);
		game.setValueAt("o", 1, 0);
		game.setValueAt("x", 0, 1);
		game.setValueAt("o", 1, 1);
		assertEquals(TicTacToeModel.INPROGRESS, game.getGameState());
		game.setValueAt("x", 0, 2);
		assertEquals(TicTacToeModel.XWIN, game.getGameState());
		game.setValueAt("o", 2, 2);
		assertNull(game.getValueAt(2, 2));
	}
	
	@Test
	public void testIllegalLetter() {
		game.setValueAt("r", 0, 0);
		assertNull(game.getValueAt(0, 0));
	}
}
