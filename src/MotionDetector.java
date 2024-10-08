import java.util.Random;

class MotionDetector extends Sensor {
    public MotionDetector(String name) {
        super(name);
    }

    @Override
    public String detect() {
        Random random = new Random();
        if (random.nextBoolean()) {
        return "Rörelsedetektion aktiverad i " + name;
    }
     return"Ingen rörelse detekterad i " +name;
}
}


