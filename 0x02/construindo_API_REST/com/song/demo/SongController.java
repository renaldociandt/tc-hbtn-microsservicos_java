package com.song.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api-song")
public class SongController {

    @Autowired
    private SongRepository songRepository;

    @GetMapping("/welcome")
    public String mensagemBoasVindas() {

        return "Bem Vind@ Ao song Tunn";
    }

    //Done
    @GetMapping(path = "/allSongs")
    public List<Song> getAllSongs() {

        return songRepository.getAllSongs();


    }

    //Done
    @GetMapping(path = "/findSong/{id}")
    public Song findSongById(@PathVariable Integer id) {
        return songRepository.getSongById(id);

    }

    //Done
    @PostMapping(path = "/addSong", consumes = "application/json", produces = "application/json")
    // @PostMapping(path = "/addSong")
    public Song addSong(@RequestBody Song song) {
        songRepository.addSong(song);
        return song;

    }

    //Done
    @PutMapping(path = "/updateSong", consumes = "application/json", produces = "application/json")
    public Song updadeSong(@RequestBody Song song) {
        songRepository.updateSong(song);
        return song;

    }

    //Done
    @DeleteMapping(path = "/removeSong", consumes = "application/json", produces = "application/json")
    public void deleteSongById(@RequestBody Song song) {
        songRepository.removeSong(song);

    }
}
