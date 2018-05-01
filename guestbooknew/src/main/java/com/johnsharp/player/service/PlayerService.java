package com.johnsharp.player.service;

import com.johnsharp.player.domain.PlayerEntry;
import com.johnsharp.player.domain.PlayerEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlayerService {

    @Autowired
    private PlayerEntryRepository playerEntryRepository;

    public List<PlayerEntry> findAllEntries () {
        return this.playerEntryRepository.findAll();
    }

    public PlayerEntry findGuestBookEntryById (Integer id) {
        return this.playerEntryRepository.findPlayerEntriesById(id);
    }
    public List <PlayerEntry> findGuestBookEntryByUser (String user) {
        return this.playerEntryRepository.findPlayerEntryByUser(user);
    }
    public void deletePlayerEntryById (Integer id) {
        this.playerEntryRepository.deleteById(id);
    }
    public void save (PlayerEntry newEntry) {
        this.playerEntryRepository.save(newEntry);
    }

    public PlayerEntry findOne (Integer id) {
        return this.playerEntryRepository.findOneById (id);
    }

}
