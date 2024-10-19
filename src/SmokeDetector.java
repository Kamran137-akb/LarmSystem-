import java.util.Random;

public class SmokeDetector extends Sensor {

    public SmokeDetector(String name) {
        super(name);
        this.active = true;

    }

    @Override
    public String detect() {
        Random random = new Random();
        if (random.nextBoolean()){
            hasTriggered = true;
            return "Rökdetektion aktiverad i " + name;
        }
        return "ingen rök detekterad i " + name;
    }
}




