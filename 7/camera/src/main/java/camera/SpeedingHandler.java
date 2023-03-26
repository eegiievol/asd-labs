package camera;

public class SpeedingHandler extends Handler{

    public SpeedingHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleRecord(Record record) {
        if (record.getSpeed()>60){
            System.out.println("speed ticket !!");
        }
        else{
            super.nextHandler.handleRecord(record);
        }
    }
}
