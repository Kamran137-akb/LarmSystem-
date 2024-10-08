import java.util.Random;

class DoorDetector extends Sensor{
    public DoorDetector(String name) {
        super(name);

    }

    @Override
    public String detect() {
        Random random = new Random();
        if (random.nextBoolean()) {
            return "Dörröppning detekterad i " + name;
        }
        return "Ingen dörröppning detekterad i " + name;

    }
}

