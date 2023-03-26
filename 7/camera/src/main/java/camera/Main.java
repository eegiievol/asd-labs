package camera;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Camera camera = new Camera();
        Record r1 = new Record("IO451", 50, camera);
        Record r2 = new Record("IO411", 55, camera);
        Record r3 = new Record("AA314", 60, camera);
        Record r4 = new Record("OQ5AB", 66, camera);

        camera.addRecords(r1);
        camera.addRecords(r2);
        camera.addRecords(r3);
        camera.addRecords(r4);

        //unpaid tickets
        UnpaidTicketHandler unpaidTicketHandler = new UnpaidTicketHandler(null);
        ArrayList<String> unpaidTickets = new ArrayList<String>();
        unpaidTickets.add(r1.getPlate());
        unpaidTicketHandler.setTickets(unpaidTickets);

        //unregistered car plate
        RegisteredHandler registeredHandler = new RegisteredHandler(unpaidTicketHandler);
        ArrayList<String> registeredCars = new ArrayList<String>();
        registeredCars.add(r1.getPlate());
        registeredCars.add(r2.getPlate());
        registeredCars.add(r3.getPlate());
        registeredHandler.setRecordedCars(registeredCars);

        //speeding ticket
        SpeedingHandler speedingHandler = new SpeedingHandler(registeredHandler);

        //stolen cars
        StolenHandler stolenHandler = new StolenHandler(speedingHandler);
        ArrayList<String> stolenCars = new ArrayList<>();
        stolenCars.add(r4.getPlate());
        stolenHandler.setStolenCars(stolenCars);

        //start handling records from camera
        RecordHandler recordHandler = new RecordHandler();
        recordHandler.setChainOfHandlers(stolenHandler);
        recordHandler.handleRecord(camera);

    }
}