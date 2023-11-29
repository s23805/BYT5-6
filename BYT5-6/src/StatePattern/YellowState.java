package StatePattern;

import java.util.Timer;
import java.util.TimerTask;

public class YellowState implements TrafficLightState {
    @Override
    public void handleRequest(TrafficLight trafficLight) {
        System.out.println("Yellow Light - Prepare to stop");
        scheduleNextState(trafficLight, new RedState(), 3000);
    }

    private void scheduleNextState(TrafficLight trafficLight, TrafficLightState nextState, long delay) {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                trafficLight.setState(nextState);
                trafficLight.requestStateChange();
            }
        }, delay);
    }
}
