public class Stereo {

    String name;
    Radio stereoradio;
    cdPlayer stereocdplayer;
    tapePlayer stereotapeplayer;
    MP3Player stereomp3player;



    public Stereo(String name ){
        this.name = name;


    public void tuneRadio(Radio radio, String channel){
        radio.tuning(channel);
    }

    public void playCD(cdPlayer player, String cd){
        player.changeCD(cd);
    }

    public String volumeUp(){
        return "Bangin Tunes Man!";
    }



}
