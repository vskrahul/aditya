package khalidmughal.chapter3.enums;

public enum MachineState implements EnumInterface {
    BUSY,
    IDLE, // new MachineState("IDLE", 1)
    BLOCKED;

    @Override
    public boolean canEnumImplementsInterface() {
        return true;
    }
}

/*

public final class MachineState extends java.lang.Enum<MachineState> {
  private final String name;
  private final int ordinal;
  private MachineState(String name, int ordinal) {
    this.name = name;
    this.ordinal = ordinal;
  }
  public static final MachineState BUSY = new MachineState("BUSY", 0);
  public static final MachineState IDLE = new MachineState("IDLE", 1);
  public static final MachineState BLOCKED = new MachineState("BLOCKED", 2);
  public static MachineState[] values() {
    return [BUSY, IDLE, BLOCKED];
  }
  public static MachineState valueOf(String _enum) {

  }
}

* */