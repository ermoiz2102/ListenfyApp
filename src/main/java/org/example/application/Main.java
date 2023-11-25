package org.example.application;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello welcome ot listenfy world!");

        Album album= new Album("hardcore","apunich");
        album.addsongtoAlbum("laundpana",4.08);
        album.addsongtoAlbum("haseena",5.08);
        album.addsongtoAlbum("streetceleb",5.48);
        album.addsongtoAlbum("4din",5.80);

        List<Song> playList= new ArrayList<>();
        album.addSongtoplayList(1,playList);
        album.addSongtoplayList(4,playList);
        album.addSongtoplayList("streetceleb",playList);

        for(Song song:album.getSongsList()){
            System.out.println(song.toString());
        }
        for(Song song:playList){
            System.out.println(song.toString());
        }
    }
}