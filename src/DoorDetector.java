import java.util.Random;

class DoorDetector extends Sensor{
    public DoorDetector(String name) {
        super(name);

    }

    @Override
    public String detect() {
        if (active) {
            Random random = new Random();
            if (random.nextBoolean()) {
                hasTriggered = true;
                return "Dörröppning detekterad i " + name;
            }
            return "Ingen dörröppning detekterad i " + name;
        }
        return name + "är inaktiv.";

    }
}

