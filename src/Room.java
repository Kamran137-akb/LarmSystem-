import java.util.ArrayList;
import java.util.List;

class Room {
    private String name;
    private List<Sensor> sensors;


    public Room(String name) {
        this.name = name;
        this.sensors = new ArrayList<>();
    }

    public void addSensor(Sensor sensor) {
        sensors.add(sensor);
    }

    public boolean hasAnySensorTriggered() {
        for (Sensor sensor : sensors) {
            if (sensor.hasTriggered()) {
                return true;
            }
        }
        return false;
    }

        public void toggleSensors (boolean activate){
            for (Sensor sensor : sensors) {
                if (!(sensor instanceof SmokeDetector)) {
                    if (activate) {
                        sensor.activate();
                    } else {
                        sensor.deactivate();

                    }
                }
            }
        }


        public void checkSensors () {
            for (Sensor sensor : sensors) {
                System.out.println(sensor.detect());
                if (sensor.hasTriggered()) {
                    System.out.println(sensor.getClass().getSimpleName() + "har triggat i " + name);
                }

            }
        }


        public void resetSensors () {
            for (Sensor sensor : sensors) {
                sensor.reset();
            }
        }
        public String getName () {
            return name;
        }
    }

