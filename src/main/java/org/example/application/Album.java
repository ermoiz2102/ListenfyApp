package org.example.application;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String title;
    private String artist;
    private List<Song> songsList;

    public Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.songsList= new ArrayList<>();
    }

    public Album(String title, String artist, List<Song> songsList) {
        this.title = title;
        this.artist = artist;
        this.songsList = songsList;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public List<Song> getSongsList() {
        return songsList;
    }

    public boolean songpresent(String find, List<Song>listofsongs){
        for(Song song:listofsongs){
            if(song.getName().equals(find))
                return true;
        }
        return false;
    }
    public String addsongtoAlbum(String songtitle,double duration){
        if(songpresent(songtitle,songsList))
            return "song"+songtitle+"is already present in album";
        else {
            Song newsong=new Song(songtitle,duration);
            songsList.add(newsong);
            return "song"+songtitle+"has been added succesfully";
        }

    }
    public String addSongtoplayList(int idx,List<Song>playList){
        idx-=1;
        if(idx<0||idx>=songsList.size())
            return "enter correct song number";
        Song newso=songsList.get(idx);
        playList.add(newso);
        return "song added to playList";
    }
    public void addSongtoplayList(String title,List<Song>playList){
        for(Song song:songsList){
            if(song.getName().equals(title)){
                playList.add(song);
            }
        }
    }
}
