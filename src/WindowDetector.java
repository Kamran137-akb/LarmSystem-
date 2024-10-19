import java.util.Random;

class WindowDetector extends Sensor {
    public WindowDetector(String name) {
        super(name);
    }

    @Override
    public String detect() {
        if (active) {
            Random random = new Random();
            if (random.nextBoolean()) {
                hasTriggered = true;
                return "Fönsteröppning detekterad i" + name;
            }
            return "Ingen fönsteröppning detekterad i" + name;
        }
        return name + "är inaktiv.";
    }
}

