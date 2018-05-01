package com.johnsharp.player.controller;

import com.johnsharp.player.domain.PlayerEntry;
import com.johnsharp.player.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@RequestMapping("/api")
@RestController
public class PlayerRestController {

@Autowired
private PlayerService playerService;

    @GetMapping ("/comments")
    public List<PlayerEntry> getAllComments(){

        return playerService.findAllEntries();
    }

    @GetMapping ("/comment/{id}")
    public PlayerEntry findGuestBookById (@PathVariable("id") Integer id) {
        return this.playerService.findGuestBookEntryById(id);
    }

    @GetMapping ("/user/{user}")
    public List <PlayerEntry> findGuestBookEntryByUser (@PathVariable ("user") String user) {
        return this.playerService.findGuestBookEntryByUser(user);
    }

    @DeleteMapping ("/comment/{id}")
    public void deletePlayerEntryById (@PathVariable ("id") Integer id) {
        this.playerService.deletePlayerEntryById(id);
    }

    @PostMapping ("/add")
    public void addComment (@RequestBody PlayerEntry playerEntry) {
        this.playerService.save(playerEntry);
    }

    @PostMapping ("/update")
    public void updateComment (@RequestBody PlayerEntry playerEntry) {
        this.playerService.save (playerEntry);
    }

}
