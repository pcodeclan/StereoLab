public class Stereo {

    private Radio radio;
    private RecordDeck recordDeck;
    private CDPlayer cdPlayer;

    private String name;

    public Stereo(String name, Radio radio, RecordDeck recordDeck, CDPlayer cdPlayer){
        this.name = name;
        this.radio = radio;
        this.recordDeck = recordDeck;
        this.cdPlayer = cdPlayer;
    }

    public Radio getRadio(){
        return radio;
    }


}
