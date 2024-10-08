import java.util.Random;

class SmokeDetector extends Sensor {
    public SmokeDetector(String name) {
        super(name);
        this.active = true;

    }

    @Override
    public String detect() {
        if (active) {
            Random random = new Random();
            if (random.nextBoolean()) {
                return "Rökdetektion aktiverad i " + name;
            }
            return "Ingen rök detekterad i " + name;
        }
        return "Rökdetektorn är inaktiv. ";
    }

    @Override
    public void deactivate() {

    }
}




