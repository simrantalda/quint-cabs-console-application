/**
 * 
 */
package quint.cabs.utils;

/**
 * @author LENOVO
 *
 */
public enum RideType {
	PINK("PINK"), NORMAL("NORMAL");
	
	RideType(String type){
		this.rideType = type;
	}
	
	 private String rideType;

	/**
	 * @return the rideType
	 */
	public String getRideType() {
		return rideType;
	}
	
}
