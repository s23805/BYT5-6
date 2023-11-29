package StatePattern;

public class TrafficLight {
    private TrafficLightState state;

    public TrafficLight() {
        this.state = new RedState();
    }

    public void requestStateChange() {
        state.handleRequest(this);
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }
}
