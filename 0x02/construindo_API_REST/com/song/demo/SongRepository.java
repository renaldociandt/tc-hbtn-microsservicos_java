package com.song.demo;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class SongRepository {
    private List<Song> list = new ArrayList<Song>();

    public List<Song> getAllSongs() {
        return list;
    }

    public Song getSongById(Integer id) {
        for (Song cont: list) {
            if (cont.getId() == id){
                return cont;
            }

        }
        return null;

        // TODO
    }

    public void addSong(Song s) {
        list.add(s);
        // TODO
    }

    public int buscar(Song s){
        int count =0;
        for (Song cont: list){
            if (s.getId() == cont.getId()){
                return count;
            }
            count++;
        }
        return -1;
    }

    public void updateSong(Song s) {
        if (buscar(s) != -1) {
            list.set(buscar(s), s);
        }
        // TODO
    }

    public void removeSong(Song s) {
        list.remove(s);
        // TODO
    }
}
