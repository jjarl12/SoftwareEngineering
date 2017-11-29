package main;

import java.util.Observable;

/**
 * List abstract class
 * 
 * @author Jonathan Jarl
 *
 */
public abstract class List extends Observable{

	/**
	 * ClearList method
	 */
	public abstract void ClearList();

	/**
	 * GetListNumber method
	 * 
	 * @return
	 */
	public abstract String GetListName();

	/**
	 * GetItemInList method
	 * 
	 * @return
	 */
	public abstract int GetItemInList();

	/**
	 * PrintList method
	 * 
	 * @return
	 */
	public abstract String PrintList();
}
