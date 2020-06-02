public class CDPlayer {

    private String make;
    private String model;
    private int numOfCDsCanHold;

    public CDPlayer(String make, String model, int numOfCDsCanHold){
        this.make = make;
        this.model = model;
        this.numOfCDsCanHold = numOfCDsCanHold;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getNumOfCDsCanHold() {
        return this.numOfCDsCanHold;
    }

}
