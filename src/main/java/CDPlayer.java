public class CDPlayer extends Component{

    private int numOfCDsCanHold;

    public CDPlayer(String make, String model, int numOfCDsCanHold){
        super(make, model);
        this.numOfCDsCanHold = numOfCDsCanHold;
    }

    public int getNumOfCDsCanHold() {
        return this.numOfCDsCanHold;
    }

}
