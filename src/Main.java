import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        Room garage = new Room("Garage");
        garage.addSensor(new SmokeDetector("Rökdetektor i garage"));
        garage.addSensor(new DoorDetector("Dörr i Garage"));
        garage.addSensor(new WindowDetector("Fönster i Garage"));

        Room livingRoom = new Room("Vardagsrum");
        livingRoom.addSensor(new SmokeDetector("Rökdetektor i Vardagsrum"));
        livingRoom.addSensor(new MotionDetector("Rörelsedetektor i Vardagsrum"));
        livingRoom.addSensor(new WindowDetector("Fönster i Vardagsrum"));

        Room kitchen = new Room("Kök");
        kitchen.addSensor(new SmokeDetector("Rökdetektor i Kök"));
        kitchen.addSensor(new WindowDetector("Fönster i Kök"));


        Room room1 = new Room("Sovrum 1");
        room1.addSensor(new WindowDetector("Fönster i sovrum 1 "));
        room1.addSensor(new DoorDetector("Dörr i sovrum 1."));
        room1.addSensor(new SmokeDetector("Rökdetektor i sovrum 1"));

        Room room2 = new Room("Sovrum 2");
        room2.addSensor(new WindowDetector("Fönster i sovrum 2 "));
        room2.addSensor(new DoorDetector("Dörr i sovrum 2."));
        room2.addSensor(new SmokeDetector("Rökdetektor i sovrum 2"));

        Room room3 = new Room ("Sovrum 3");
        room3.addSensor(new WindowDetector("Fönster i sovrum 3 "));
        room3.addSensor(new DoorDetector("Dörr i sovrum 3."));
        room3.addSensor(new SmokeDetector("Rökdetektor i sovrum 3"));

        Room room4 = new Room ("Sovrum 4");
        room4.addSensor(new WindowDetector("Fönster i sovrum 4 "));
        room4.addSensor(new DoorDetector("Dörr i sovrum 4."));
        room4.addSensor(new SmokeDetector("Rökdetektor i sovrum 4"));

        Room room5 = new Room ("Sovrum 5");
        room5.addSensor(new WindowDetector("Fönster i sovrum 5 "));
        room5.addSensor(new DoorDetector("Dörr i sovrum 5."));
        room5.addSensor(new SmokeDetector("Rökdetektor i sovrum 5"));

        Room hallen = new Room("Hallen");
        hallen.addSensor(new WindowDetector("Fönster i hallen "));
        hallen.addSensor(new DoorDetector("Entredörr i hallen ."));
        hallen.addSensor(new SmokeDetector("Rökdetektor i hallen"));

        Room frontYard = new Room ("Framsidan (trädgården)");
        frontYard.addSensor(new MotionDetector("Rörelsedetektor vid uppfarten"));

        Room backYard = new Room ("Backsidan (Poolområdet)");
        backYard.addSensor(new MotionDetector("Rörelsedetektor vid poolområdet"));



        List<Room> rooms = new ArrayList<>();
        rooms.add (garage);
        rooms.add (livingRoom);
        rooms.add (kitchen);
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);
        rooms.add(room5);
        rooms.add(hallen);
        rooms.add(frontYard);
        rooms.add(backYard);


        CentralUnit centralUnit = new CentralUnit(rooms);

        while (true) {
            System.out.println("/n1. Aktivera larm");
            System.out.println("2. Avaktivera larm");
            System.out.println("3. Simulera brand");
            System.out.println("4. Simulera inbrott");
            System.out.println("5. Simulera rörelse i poolområdet");
            System.out.println("6. Simulera rörelser på framsidan (uppfarten)");
            System.out.println("7. Återställ larm");
            System.out.println("8. Avsluta");
            System.out.println("Välj ett alternativ: ");

            String val = scanner.nextLine();

            switch (val) {
                case "1":
                    centralUnit.activateAlarm();
                    break;
                case "2":
                    centralUnit.deactivateAlarm();
                    break;
                case "3":
                    centralUnit.triggerAlarm("brand");
                    for (Room room : rooms) {
                        room.checkSensors();
                    }
                    break;
                case "4":
                    centralUnit.triggerAlarm("inbrott");
                    for (Room room : rooms) {
                        room.checkSensors();
                    }
                    break;
                case "5":
                    System.out.println("Simulera rörelse i poolområdet.");
                    livingRoom.checkSensors();
                    break;
                case "6":
                    System.out.println("Simulera rörelser på framsidan (uppfarten.");
                    frontYard.checkSensors();
                    break;
                case "7":
                   centralUnit.reset();
                    break;
                case "8":
                    System.out.println("Avslutar programmet.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Felaktigt val, försök igen.");
            }
        }

            }
        }

