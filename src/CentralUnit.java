import java.util.List;

class CentralUnit {
    private boolean activated;
    private boolean sirenOn;
    private boolean sprinklerOn;
    private List<Room> rooms;

    public CentralUnit(List<Room> rooms) {
        this.activated = false;
        this.sirenOn = false;
        this.sprinklerOn = false;
        this.rooms = rooms;
    }

    public void activateAlarm() {
        this.activated = true;
        System.out.println("Larmsystemet är aktiverad.");
        toggleRoomSensors(true);
    }

    public void deactivateAlarm () {
        this.activated = false;
        System.out.println("Larmsystemet är avaktiverat.");
        toggleRoomSensors(false);
    }

    private void toggleRoomSensors (boolean activate) {
        for (Room room : rooms) {
            room.toggleSensors(activate);
        }
    }

    public void triggerAlarm (String type) {
        this.sirenOn = true;
        System.out.println("Larm Typ; " + type);
        if (type.equals("brand")) {
            this.sprinklerOn = true;
            System.out.println("Sprinklersystem aktiverat.");
        }
    }

    public void reset () {
        this.sirenOn = false;
        this.sprinklerOn = false;
        System.out.println("Larmet har återställts.");

        }
    }
