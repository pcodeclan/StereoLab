public class RecordDeck {

    private String make;
    private String model;
    private int playSpeed;

    public RecordDeck(String make, String model){
        this.make = make;
        this.model = model;
        this.playSpeed = 0;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getPlaySpeed() {
        return playSpeed;
    }

    public void setPlaySpeed(int playSpeed) {
        this.playSpeed = playSpeed;
    }
}
