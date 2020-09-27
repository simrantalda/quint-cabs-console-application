/**
 * 
 */
package quint.cabs.beans;

/**
 * @author Simran Talda
 *
 */
public class RideDetails {

	/** cabId */
	private int cabId;

	/** clientId */
	private int clientId;

	/** distance */
	private double distance;

	/** timeTaken */
	private double timeTaken;

	/** carType */
	private String carType;

	/** cost */
	private double cost;

	/**
	 * @return the cabId
	 */
	public int getCabId() {
		return cabId;
	}

	/**
	 * @param cabId
	 *            the cabId to set
	 */
	public void setCabId(int cabId) {
		this.cabId = cabId;
	}

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
	 * @return the distance
	 */
	public double getDistance() {
		return distance;
	}

	/**
	 * @param distance
	 *            the distance to set
	 */
	public void setDistance(double distance) {
		this.distance = distance;
	}

	/**
	 * @return the timeTaken
	 */
	public double getTimeTaken() {
		return timeTaken;
	}

	/**
	 * @param timeTaken
	 *            the timeTaken to set
	 */
	public void setTimeTaken(double timeTaken) {
		this.timeTaken = timeTaken;
	}

	/**
	 * @return the carType
	 */
	public String getCarType() {
		return carType;
	}

	/**
	 * @param carType
	 *            the carType to set
	 */
	public void setCarType(String carType) {
		this.carType = carType;
	}

	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * @param cost
	 *            the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}

}
