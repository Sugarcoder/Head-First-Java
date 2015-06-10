package chap16;

import java.util.*;
import java.io.*;

public class Jukebox6
{
    ArrayList<SongBad> songList = new ArrayList<SongBad>();
    
    public static void main(String[] args) {
        new Jukebox6().go();
    }
    
    public void go() {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
        

        // Here, we create a new HashSet parameterized to hold Songs.

        HashSet<SongBad> songSet = new HashSet<SongBad>();
        
        // HashSet has a simple addAll() method that can take another collection and use it to populate the HashSet.
        // It's even easier than adding one song at a time.

        songSet.addAll(songList);
        System.out.println(songSet);
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
        SongBad nextSong = new SongBad(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);
    }
}


class Song implements Comparable <Song>
{
    String title;
    String artist;
    String rating;
    String bpm;


    public boolean equals(Object aSong) {      // Object aSong = The HashSet sends it another song
        SongBad s = (SongBad) aSong;
        return getTitle().equals(s.getTitle());      // All we have to do is ask one title if it's equal to the other song's title.
    }
    

    // HasCode will get rid of the duplicates.
    // The String class has an overriden hashCode() method, so you can just return the result of calling hashCode() on the title. 

    public int hashCode() {
        return title.hashCode();
    }
    
    

    public int compareTo(SongBad s)
    {
        return title.compareTo(s.getTitle());
    }



    Song(String t, String a, String r, String b) {
        title = t;
        artist = a;
        rating = r;
        bpm = b;
    }


    public String getTitle() {
        return title;
    }


    public String getArtist()
    {
        return artist;
    }


    public String getRating()
    {
        return rating;
    }


    public String getBpm()
    {
        return bpm;
    }

    
    public String toString() {
        return title;
    }

}