package semicolon.africa;


import java.time.Duration;
import java.util.ArrayList;

public class Mp3Player {

    private boolean isOn;
    private Music currentSong;
    private final ArrayList<Playlist> playlists = new ArrayList<>();
    private int volume;
    private final Duration START_SONG_FROM = Duration.ZERO;

    public Mp3Player(){
        Playlist defaultPlaylist = new Playlist("default playlist");
        playlists.add(defaultPlaylist);
    }
    

    public void power() {
       isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public void play(Music song) {
        currentSong=song;
    }

    public Music currentSong(){
        return currentSong;
    }

    public ArrayList<Playlist> playlists() {
        return playlists;
    }


    public int volume() {
        return volume;
    }

    public void volumeUp() {
        if (volume < 100){
            volume+=5;
        }
    }

    public void volumeDown() {
        if(volume>0){
            volume -=5;
        }
    }

    public Playlist getPlaylist(Playlist givenPlaylist){
        for (Playlist playlist: playlists) {
            if (playlist.equals(givenPlaylist)){
                return playlist;
            }
        }
       return null;
    }


}
