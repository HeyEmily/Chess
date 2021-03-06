package assignment10.junit;

/***
 * @author Yuchen (Emily) Wu
 * CS242 Assignment 1.0
 */

public abstract class Piece {
	protected int x; //x coordinate of the piece
	protected int y; //y coordinate of the piece
	protected boolean color;  //false-white true-black
	protected boolean status; //false-die true-alive
	protected int id;
	
	/**
	 * @param x	coordinates
	 * @param y	coordinates
	 * @param color	of the piece
	 * @param status piece captured or not
	 * @param id type of the piece
	 */
	public void initial(int x, int y, boolean color, boolean status, int id)
	{
		this.x = x;
		this.y = y;
		this.color = color;
		this.status = status;
		this.id = id;
	}
	
	/*move the piece to (x,y)*/
	public void move(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	/*the piece is captured*/
	public void remove()
	{
		this.status = false;
	}
	
	public int[] position()
	{
		int position[] = {x,y};
		return position;
	}
	
	public int id()
	{
		return this.id;
	}
	
	public boolean status()
	{
		return status;
	}
	
	public boolean color()
	{
		return color;
	}
	
	/**
	 * @param x coordinates
	 * @param y coordinates
	 * @param size of the board
	 * @return true when it moves out of the board, false otherwise
	 */
	public boolean out_of_board(int x, int y, int size)
	{
		if(x>=size||y>=size||x<0||y<0)
			return true;
		return false;
	}

	/**
	 * @param x coordinates
	 * @param y coordinates
	 * @param turn who's turn
	 * @return true if the current player can move, false otherwise
	 */
	abstract public int can_move(int x, int y, boolean turn);
	
	
	/**
	 * @param x coordinates
	 * @param y coordinates
	 * @param p piece
	 * @return true if p is blocked, false otherwise
	 */
	abstract public boolean leap_over(int x, int y, Piece p);
	
	abstract public int type();
	abstract public void print();
	
	
	// TODO Auto-generated constructor stub
	

}
