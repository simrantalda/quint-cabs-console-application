package quint.cabs.beans;

public class Cab {

	/** cabId */
	private int cabId;

	/** x */
	private double x;

	/** y */
	private double y;

	/** status */
	private String status;

	/** pointsEarned */
	private double pointsEarned;

	/** cabType */
	private String cabType;

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
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the pointsEarned
	 */
	public double getPointsEarned() {
		return pointsEarned;
	}

	/**
	 * @param pointsEarned
	 *            the pointsEarned to set
	 */
	public void setPointsEarned(double pointsEarned) {
		this.pointsEarned = pointsEarned;
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

	/**
	 * @param cabId
	 * @param x
	 * @param y
	 * @param status
	 * @param pointsEarned
	 * @param cabType
	 */
	public Cab(int cabId, double x, double y, String status,
			double pointsEarned, String cabType) {
		super();
		this.cabId = cabId;
		this.x = x;
		this.y = y;
		this.status = status;
		this.pointsEarned = pointsEarned;
		this.cabType = cabType;
	}

	/**
	 * 
	 */
	public Cab() {
		super();
	}

}
