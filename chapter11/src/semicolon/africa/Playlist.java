package semicolon.africa;

import java.util.ArrayList;

public class Playlist {
   private String name;
   private ArrayList<Music> musics = new ArrayList<>();

   public Playlist(String name) {
      this.name = name;
   }

   public void addToPlaylist(Music music){
      musics.add(music);
   }
}
