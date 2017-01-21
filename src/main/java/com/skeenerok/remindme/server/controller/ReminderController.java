package com.skeenerok.remindme.server.controller;

import com.skeenerok.remindme.server.entity.Remind;
import com.skeenerok.remindme.server.service.ReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reminders")
public class ReminderController {

    @Autowired
    private ReminderService service;


    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Remind> getAllReminders() {
        List<Remind> r =  service.getAll();
        System.out.println(r.toString());
        return r;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Remind getReminder(@PathVariable("id") long remindID) {
/*        Remind r = new Remind();
        r.setId(2);
        r.setTitle("individual");
        r.setRemindDate(new Date());
        return r;*/
        return service.getById(remindID);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Remind saveReminder(@RequestBody Remind remind) {
        return service.save(remind);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    @ResponseBody
    public void deleteReminder(@PathVariable("id") long remindID) {
        service.remove(remindID);
    }
}
