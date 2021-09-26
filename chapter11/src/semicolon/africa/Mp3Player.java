package semicolon.africa;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Mp3Player {

    private boolean isOn;
    private boolean isPlaying;
    private Music currentSong;
    private final ArrayList<Playlist> playlists = new ArrayList<>();
    private int volume;

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
            isPlaying = true;
            currentSong=song;
    }

    public Music currentSong(){
        return currentSong;
    }

    public ArrayList<Playlist> getPlaylists() {
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

    public Playlist getPlaylist(String playlistName){
        for (Playlist playlist: playlists) {
            if (playlistName.equalsIgnoreCase(playlist.name())){
                return playlist;
            }
        }
       return null;
    }


    public void pause() {
        if(isPlaying){
            isPlaying = false;
        }
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void next() {
        Playlist playlist=getPlaylist("default playlist");
        ArrayList<Music> songs = playlist.getSongs();
        int indexOfCurrentSong=songs.indexOf(currentSong);
        Music nextTrack = songs.get(indexOfCurrentSong+1);
        play(nextTrack);
    }

    public void previous(){
        Playlist playlist = getPlaylist("default playlist");
        ArrayList<Music> songs = playlist.getSongs();
        int indexOfCurrentSong=songs.indexOf(currentSong);
        Music previousTrack = songs.get(indexOfCurrentSong-1);
        play(previousTrack);
    }

    public void shuffle() {
        Playlist playlist = getPlaylist("default playlist");
        ArrayList<Music> songs = playlist.getSongs();
        SecureRandom random = new SecureRandom();
        int randomIndex = random.nextInt(songs.size());
        Music track = songs.get(randomIndex);
        play(track);
    }


    public Playlist createPlaylist(String name) {
        Playlist playlist = new Playlist(name);
        playlists.add(playlist);
        return playlist;
    }
}
