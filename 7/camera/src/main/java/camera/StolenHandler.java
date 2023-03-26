package camera;

import java.util.ArrayList;

public class StolenHandler extends Handler{

    private ArrayList<String> stolenCars = new ArrayList<>();

    public void setStolenCars(ArrayList<String> stolenCars) {
        this.stolenCars = stolenCars;
    }

    public StolenHandler(Handler nextHandler) {
        super(nextHandler);
    }

    private boolean isStolen(String plate){
        for(String car : stolenCars){
            if (car.equals(plate)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void handleRecord(Record record) {
        if (isStolen(record.getPlate())){
            System.out.println("stolen Car is detected");
        }
        else{
            super.nextHandler.handleRecord(record);
        }
    }
}
