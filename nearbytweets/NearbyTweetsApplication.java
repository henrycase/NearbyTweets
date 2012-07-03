package nearbytweets;

import java.util.Map;
import com.buglabs.application.ServiceTrackerHelper.ManagedRunnable;
import com.buglabs.bug.module.gps.GPSActivator;
import com.buglabs.bug.module.gps.pub.IPositionProvider;

public class NearbyTweetsApplication implements ManagedRunnable {

	@Override
        public void run(Map<Object, Object> services) {
            System.out.println("NearbyTweetsActivator: start");
            NearbyTweetsApplication application = 
                new NearbyTweetsApplication();
            IPositionProvider position = (IPositionProvider) services.get(IPositionProvider)
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub

	}

}
