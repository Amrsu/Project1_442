package edu.towson.cis.cosc442.project1.monopoly;

// TODO: Auto-generated Javadoc
/**
 * The Interface IOwnable.
 */
public interface IOwnable {

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	int getPrice();

	/**
	 * Gets the rent.
	 *
	 * @return the rent
	 */
	int getRent();

	/**
	 * Play action.
	 *
	 * @param msg the msg
	 * @return true, if successful
	 */
	boolean playAction(String msg);

}