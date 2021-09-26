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

   public ArrayList<Music> getSongs(){
      return musics;
   }

   public String name(){
      return name;
   }

   @Override
   public String toString() {
      String stringToReturn = "";
      for (Music song: musics){
         stringToReturn= stringToReturn + song + "\n";
      }
      return name + "\n" + stringToReturn;
   }


}
