import java.util.List;

class CentralUnit {
    private boolean sirenOn;
    private List<Room> rooms;
    private boolean alarmActivated;
    private boolean sprinklerON;

    public CentralUnit(List<Room> rooms) {
        this.rooms = rooms;
        this.alarmActivated = false;
        this.sirenOn = false;
        this.sprinklerON = false;

    }


    public void activateAlarm() {
        alarmActivated = true;
        System.out.println("Larmsystemet är aktiverad.");
        for (Room room : rooms) {
            room.toggleSensors(true);
        }
    }

    public void deactivateAlarm() {
        alarmActivated = false;
        System.out.println("Larmsystemet är avaktiverat.");
        for (Room room : rooms) {
            room.toggleSensors(false);
        }
    }


    public void triggerAlarm(String type) {
        if (alarmActivated) {
            System.out.println("Larm Typ; " + type);
            boolean anySensorTriggered = false;

            for (Room room : rooms) {
                room.checkSensors();
                if (room.hasAnySensorTriggered()) {
                    anySensorTriggered = true;
                }

            }

            if (anySensorTriggered) {
                System.out.println("Larmet har utlösts av en sensor.");
                if (type.equals("brand")) {
                    sprinklerON = true;
                    System.out.println("Sprinkelsystemet är aktiverat.");
                }
                sirenOn = true;
            } else {
                System.out.println("ingen sensor har triggat, falsklarm.");
            }

        } else {
            System.out.println("larmet är inte aktiverat.");

        }
    }

    public void reset() {
        System.out.println("återställer alla sensorer och larmet");
        for (Room room : rooms) {
            room.resetSensors();
        }
        sirenOn = false;
        sprinklerON = false;
        System.out.println("Larmet och sprinklersystemet har återställts.");
    }
}


