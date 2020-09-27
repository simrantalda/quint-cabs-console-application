/**
 * 
 */
package quint.cabs.async;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import quint.cabs.beans.Cab;
import quint.cabs.utils.CabStatus;

/**
 * @author Simran Talda
 *
 */
public class RideExecutor {

	/**
	 * @param estimatedTime
	 * @param cab
	 * @param cost
	 */
	public void startRide(int estimatedTime, Cab cab, double cost) {
		final ScheduledExecutorService scheduler = Executors
				.newSingleThreadScheduledExecutor();
		final Runnable task = new Runnable() {
			public void run() {
				cab.setStatus(CabStatus.AVAILABLE.getCabStatus());
				cab.setPointsEarned(cab.getPointsEarned() + cost);

			}
		};
		scheduler.schedule(task, estimatedTime, TimeUnit.MICROSECONDS);
		scheduler.shutdown();
	}

}
