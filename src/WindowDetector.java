import java.util.Random;

class WindowDetector extends Sensor {
    public WindowDetector(String name) {
        super(name);
    }

    @Override
    public String detect() {
        Random random = new Random();
        if (random.nextBoolean()) {
            return "Fönsteröppning detekterad i" + name;
        }
        return "Ingen fönsteröppning detekterad i" + name;
    }
}

