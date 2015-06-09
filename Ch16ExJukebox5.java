package chap16;

import java.util.*;
import java.io.*;

public class Jukebox5
{
    ArrayList<Song> songList = new ArrayList<Song>();
    
    public static void main(String[] args) {
        new Jukebox5().go();
    }


    // Create a new inner class that implements Comparator

    class ArtistCompare implements Comparator<Song> {
        public int compare(Song one, Song two) {
            return one.getArtist().compareTo(two.getArtist());    // We're letting the String variables do the actual comparison
        }
    }
    

    public void go() {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
        
        ArtistCompare artistCompare = new ArtistCompare();    // Make an instance of the Comparator inner class
        Collections.sort(songList, artistCompare);     // Invoke sort(), passing it the list and a reference to the new custom Comparator object
        
        System.out.println(songList);
    }
    

    void getSongs() {
        try {
            File file = new File("SongListMore.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch (Exception ex) { ex.printStackTrace(); }
    }
    

    void addSong(String lineToParse) {
        String[]tokens = lineToParse.split("/");
        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);
    }
}
