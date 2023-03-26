package camera;

public class Record {
    public Record(String plate, long speed, Camera camera) {
        this.plate = plate;
        this.speed = speed;
        this.camera = camera;
    }

    private String plate;
    private long speed;

    private Camera camera;

    public String getPlate() {
        return plate;
    }

    public long getSpeed() {
        return speed;
    }

    public Camera getCamera() {
        return camera;
    }
}
