package com.johnsharp.player.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlayerEntryRepository extends CrudRepository <PlayerEntry, Integer> {

    @Override
    List <PlayerEntry> findAll ();

    PlayerEntry findPlayerEntriesById (Integer id);

    List<PlayerEntry> findPlayerEntryByUser (String user);

    PlayerEntry findOneById(Integer id);
}