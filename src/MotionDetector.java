import java.util.Random;

class MotionDetector extends Sensor {
    public MotionDetector(String name) {
        super(name);
    }

    @Override
    public String detect() {
        if (active) {
            Random random = new Random();
            if (random.nextBoolean()) {
                hasTriggered = true;
                return "Rörelsedetektion aktiverad i " + name;
            }
            return "Ingen rörelse detekterad i " + name;
        }
        return name + "är inaktiv.";
}
}


