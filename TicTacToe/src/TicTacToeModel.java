import java.awt.Color;

import javax.swing.event.TableModelEvent;
import javax.swing.table.AbstractTableModel;

/**
 * A stripped down TicTacToe model class.  It passes our tests, but
 * the code could use some clean up.  Let's explore the refactoring menu
 * together as we clean up the isWin() and setValueAt() methods
 * @author Nathan Gossett
 * @version 4/11/16
 *
 */
public class TicTacToeModel {
	/** The actual square storage */
	private Character[][] square;
	
	public static final int INPROGRESS = 0;
	public static final int XWIN = 1;
	public static final int OWIN = 2;
	public static final int TIEGAME = 3;
	
	/** Did x or o move last? */
	private char prevMove;
	
	/** Has the game been won? */
	private boolean won;
	
	/** Reset the game */
	public void clear(){
		for(int i=0; i<square.length; i++){
			for(int j=0; j<square.length; j++){
				square[i][j]=null;
			}
		}
		prevMove = 0;
		won = false;	
	}
	
	/**
	 * Change the size of the square and reset the game
	 * @param the new size of the square, must be > 0
	 */
	public void setSize(int size){
		if(size > 0){
			square = new Character[size][size];
			prevMove = 0;
			won = false;
		}	
	}
	
	/**
	 * Default constructor, game of size 3
	 */
	public TicTacToeModel(){
		this(3);
	}
	
	/**
	 * 
	 * @param size The initial size of the game board, must be > 0 or defaults to 3
	 */
	public TicTacToeModel(int size){
		if(size > 0){
			square = new Character[size][size];
		}else{
			square = new Character[3][3];
		}
		
		prevMove = 0;
		won = false;
	}
	
	
	/** @return nice string for testing purposes */
	public String toString(){
		String temp = "";
		for(int i=0; i<square.length; i++){
			for(int j=0; j<square.length; j++){
				temp += square[i][j] + " ";
			}
			temp += "\n";
		}
		return temp;
	}
	
	/**
	 * Check for wins.  
	 * 
	 * The method signature isn't really appropriate.  Why are we passing in
	 * square when it's already an instance variable?  We should really get rid
	 * of that.
	 * 
	 * This method is too long, and has duplicated code
	 * Let's do a decompose conditional refactoring on those if statements
	 * and then try to do an extra method to separate out the three major themes
	 * of rows, columns and diagonals.
	 * @param xOrO 'x' or 'o'
	 * @return true if the specified player has won
	 */
	public boolean isWin(char xOrO){
		//check the rows
		boolean win = false;
		for(int i=0; i<square.length; i++){
			win = true;
			for(int j=0; j<square.length; j++){
				
				
				//This is checking for all of the different ways
				//that [i][j] could be not a match. Really should refactor this
				//Let's try the "Extract method" refactoring which is really
				//the Decompose Conditional refactoring (page 238)
				if(square[i][j] == null || i < 0 || j < 0 
						|| i >= square.length || j >= square.length ||
					 square[i][j]!=xOrO){
					win = false;
					break;//this is not a winning row for x
				}
			}
			if(win) return true;
		}
		//now check columns
		for(int i=0; i<square.length; i++){
			win = true;
			for(int j=0; j<square.length; j++){
				//same issue as above, but now it's for spot [j][i] instead
				if(square[j][i] == null || j < 0 || i < 0 
						|| j >= square.length || i >= square.length ||
					 square[j][i]!=xOrO){
					win = false;
					break;//this is not a winning row for x
				}
			}
			if(win) return true;
		}
		//now check diagonals
		win = true;
		for(int i=0; i<square.length; i++){
			//same issue as above, but now it's for spot [i][i] instead
			if(square[i][i] == null || i < 0 || i < 0 
					|| i >= square.length || i >= square.length ||
				 square[i][i]!=xOrO){
				win = false;
				break;//this is not a winning row for x
			}
		}
		if(win) return true;
		
		win = true;
		for(int i=0; i<square.length; i++){
			//same issue as above, but now it's for spot [square.length-i-1][i] instead
			if(square[square.length-i-1][i] == null || square.length-i-1 < 0 || i < 0 
					|| square.length-i-1 >= square.length || i >= square.length ||
				 square[square.length-i-1][i]!=xOrO){
				win = false;
				break;
			}
		}
		return win;
	}
	
	
	
	/**
	 * @return value at row, col
	 */
	public Object getValueAt(int row, int col) {
		if(row >= 0 && col >= 0 && row < square.length && col < square.length){
			return square[row][col];
		}
		return null;
	}
	
	/**
	 * If arg0 is an 'x' or 'o', set the specified cell if it isn't already
	 * occupied
	 * This method could use some clean up as well.  We have some variable
	 * names that aren't very descriptive, and we have some duplicated code
	 * Let's try a few renames and an extract method
	 * @param piece 'x' or 'o'
	 * @param row
	 * @param col
	 */
	public void setValueAt(Object piece, int row, int col) {
		if(getGameState() == INPROGRESS)
		if(isLegalMove(piece, row, col)){
			Character curChar = ((String)piece).toLowerCase().charAt(0);
			if((curChar.charValue() == 'x' || curChar.charValue() == 'o')
					&& prevMove!=curChar.charValue()){
				square[row][col]=curChar;
				prevMove = curChar.charValue();
				if(isWin(curChar.charValue())){
					won = true;
				}
			}
		}
	}

	private boolean isLegalMove(Object piece, int row, int col) {
		return piece instanceof String && ((String)piece).length()==1
				&& row >= 0 && col >= 0 
				&& row < square.length && col < square[row].length
				&& getValueAt(row,col)==null;
	}
	
	
	
	/**
	 * @return XWIN for x win, OWIN for o win, INPROGRESS if game is still going
	 * TIEGAME if cat's eye
	 */
	public int getGameState(){
		if(isWin('x')){
			return XWIN;
		}else if(isWin('o')){
			return OWIN;
		}else if(isEmptySpaceRemaining()){
			return INPROGRESS;
		}
		return TIEGAME;
		
	}


	
	/**
	 * 
	 * @return true if there is an empty space, false otherwise
	 */
	public boolean isEmptySpaceRemaining(){
		for(int i = 0; i < square.length; i++){
			for(int j = 0; j < square.length; j++){
				if(square[i][j] == null)
					return true;
			}
		}
		return false;
	}
}
