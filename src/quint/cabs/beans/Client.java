/**
 * 
 */
package quint.cabs.beans;

/**
 * @author LENOVO
 *
 */
public class Client {

	/** clientId */
	private int clientId;

	/** x */
	private double x;

	/** y */
	private double y;

	/** destinationX */
	private double destinationX;

	/** destinationY */
	private double destinationY;

	/** cabType */
	private String cabType;

	/**
	 * @return the clientId
	 */
	public int getClientId() {
		return clientId;
	}

	/**
	 * @param clientId
	 *            the clientId to set
	 */
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}

	/**
	 * @param x
	 *            the x to set
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public double getY() {
		return y;
	}

	/**
	 * @param y
	 *            the y to set
	 */
	public void setY(double y) {
		this.y = y;
	}

	/**
	 * @return the destinationX
	 */
	public double getDestinationX() {
		return destinationX;
	}

	/**
	 * @param destinationX
	 *            the destinationX to set
	 */
	public void setDestinationX(double destinationX) {
		this.destinationX = destinationX;
	}

	/**
	 * @return the destinationY
	 */
	public double getDestinationY() {
		return destinationY;
	}

	/**
	 * @param destinationY
	 *            the destinationY to set
	 */
	public void setDestinationY(double destinationY) {
		this.destinationY = destinationY;
	}

	/**
	 * @return the cabType
	 */
	public String getCabType() {
		return cabType;
	}

	/**
	 * @param cabType
	 *            the cabType to set
	 */
	public void setCabType(String cabType) {
		this.cabType = cabType;
	}

}
