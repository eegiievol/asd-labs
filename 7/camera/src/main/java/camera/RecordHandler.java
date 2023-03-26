package camera;

import java.util.ArrayList;

public class RecordHandler {
    private Handler chainOfHandlers;

    public void handleRecord(Camera camera){
        ArrayList<Record> records = (ArrayList<Record>) camera.getRecords();
        for (Record record : records){
            chainOfHandlers.handleRecord(record);
        }
    }

    public void setChainOfHandlers(Handler chainOfHandlers) {
        this.chainOfHandlers = chainOfHandlers;
    }




}
