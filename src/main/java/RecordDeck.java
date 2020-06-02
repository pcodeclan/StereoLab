public class RecordDeck extends Component{

    private int playSpeed;

    public RecordDeck(String make, String model){
        super(make, model);
        this.playSpeed = 0;
    }

    public int getPlaySpeed() {
        return playSpeed;
    }

    public void setPlaySpeed(int playSpeed) {
        this.playSpeed = playSpeed;
    }
}
