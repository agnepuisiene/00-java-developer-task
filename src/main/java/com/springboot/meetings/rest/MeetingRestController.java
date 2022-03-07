package com.springboot.meetings.rest;

import com.springboot.meetings.entity.Meeting;
import com.springboot.meetings.service.MeetingService;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api")
public class MeetingRestController {

    @GetMapping("/meetings")
    public List<Meeting> getAllMeetings() {
        return MeetingService.getAllMeetings();
    }

    @PostMapping("/createMeeting")
    public Meeting createMeeting(@RequestBody Meeting meeting) {
        return MeetingService.createMeeting(meeting);
    }

    @DeleteMapping("/deleteMeeting/{meetingId}")
    public Meeting deleteMeeting(@PathVariable int meetingId) {
        return MeetingService.deleteMeeting(meetingId);
    }
}
