package com.skeenerok.remindme.server.service;

import com.skeenerok.remindme.server.entity.Remind;

import java.util.List;

public interface ReminderService {

    List<Remind> getAll();
    Remind getById(long id);
    Remind save(Remind remind);
    void remove(long id);
}
