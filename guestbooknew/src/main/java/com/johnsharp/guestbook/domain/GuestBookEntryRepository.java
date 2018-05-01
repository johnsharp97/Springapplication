package com.johnsharp.guestbook.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GuestBookEntryRepository extends CrudRepository <GuestBookEntry, Integer> {

    @Override
    List <GuestBookEntry> findAll ();

    GuestBookEntry findGuestBookEntriesById (Integer id);

    List<GuestBookEntry> findGuestBookEntryByUser (String user);

    GuestBookEntry findOneById(Integer id);
}