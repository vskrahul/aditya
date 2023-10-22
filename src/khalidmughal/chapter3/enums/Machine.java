package khalidmughal.chapter3.enums;

public class Machine {
    private MachineState state;

    public Machine(MachineState state) {
        this.state = state;
    }
    public void setState(MachineState state) {
        this.state = state;
    }
    public MachineState getState() {
        return this.state;
    }
}
