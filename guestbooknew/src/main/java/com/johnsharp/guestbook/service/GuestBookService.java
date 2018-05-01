package com.johnsharp.guestbook.service;

import com.johnsharp.guestbook.domain.GuestBookEntry;
import com.johnsharp.guestbook.domain.GuestBookEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GuestBookService {

    @Autowired
    private GuestBookEntryRepository guestBookEntryRepository;

    public List<GuestBookEntry> findAllEntries () {
        return this.guestBookEntryRepository.findAll();
    }

    public GuestBookEntry findGuestBookEntryById (Integer id) {
        return this.guestBookEntryRepository.findGuestBookEntriesById(id);
    }
    public List <GuestBookEntry> findGuestBookEntryByUser (String user) {
        return this.guestBookEntryRepository.findGuestBookEntryByUser(user);
    }
    public void deleteGuestBookEntryById (Integer id) {
        this.guestBookEntryRepository.deleteById(id);
    }
    public void save (GuestBookEntry newEntry) {
        this.guestBookEntryRepository.save(newEntry);
    }

    public GuestBookEntry findOne (Integer id) {
        return this.guestBookEntryRepository.findOneById (id);
    }

}
