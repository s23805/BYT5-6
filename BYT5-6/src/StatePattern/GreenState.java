package StatePattern;

import java.util.Timer;
import java.util.TimerTask;

public class GreenState implements TrafficLightState {
    @Override
    public void handleRequest(TrafficLight trafficLight) {
        System.out.println("Green Light - Safe for pedestrians to cross");
        scheduleNextState(trafficLight, new YellowState(), 3000);
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
