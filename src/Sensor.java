abstract class Sensor {
    protected String name;
    protected boolean active;
    protected boolean hasTriggered;

    public Sensor (String name) {
        this.name = name;
        this.active = false;
        this.hasTriggered = true;

    }

    public void activate() {
        this.active = true;

    }

    public void deactivate () {
        this.active = false;

    }

    public boolean hasTriggered() {
        return hasTriggered;
    }

    public abstract String detect ();

    public void reset() {
        hasTriggered = false;

    }

    }

