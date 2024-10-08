abstract class Sensor {
    protected String name;
    protected boolean active;

    public Sensor (String name) {
        this.name = name;
        this.active = false;

    }

    public void activate() {
        this.active = true;

    }

    public void deactivate () {
        this.active = false;

    }

    public abstract String detect ();

    }

