package StatePattern;

import java.util.Timer;
import java.util.TimerTask;

public class RedState implements TrafficLightState {
    @Override
    public void handleRequest(TrafficLight trafficLight) {
        System.out.println("Red Light - Stop for pedestrians");
        scheduleNextState(trafficLight, new GreenState(), 3000);
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
