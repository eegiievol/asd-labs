package camera;

import java.util.ArrayList;

public class RegisteredHandler extends Handler{
    private ArrayList<String> recordedCars = new ArrayList<>();

    public RegisteredHandler(Handler nextHandler) {
        super(nextHandler);
    }

    public void setRecordedCars(ArrayList<String> recordedCars) {
        this.recordedCars = recordedCars;
    }

    @Override
    public void handleRecord(Record record) {
        if (! isRegistered(record.getPlate())){
            System.out.println("stolen Car is not registered");
        }
        else{
            super.nextHandler.handleRecord(record);
        }
    }
    private boolean isRegistered(String plate){
        for(String car : recordedCars){
            if (car.equals(plate)){
                return true;
            }
        }
        return false;
    }

}
