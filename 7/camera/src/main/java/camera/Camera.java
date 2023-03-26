package camera;

import java.util.ArrayList;
import java.util.List;

public class Camera {

    private ArrayList<Record> records;

    public Camera() {
        this.records = new ArrayList<Record>();
    }

    public void addRecords(Record record) {
        this.records.add(record);
    }

    public List<Record> getRecords() {
        return records;
    }
}
