/**
 * 
 */
package quint.cabs.utils;

/**
 * @author LENOVO
 *
 */
/**
 * @author LENOVO
 *
 */
public enum CabStatus {
	AVAILABLE("AVAILABLE"), RIDING("RIDING"), NOT_AVAILABLE("NOT_AVAILABLE");
	
	CabStatus(String status){
		this.cabStatus = status;
	}

	private String cabStatus;

	/**
	 * @return the cabStatus
	 */
	public String getCabStatus() {
		return cabStatus;
	}

}
