package com.springboot.meetings.service;

import com.springboot.meetings.entity.Meeting;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MeetingService {
    private static Map<Integer, Meeting> meetings = new HashMap<>();
    private static Integer index = 3;

    static {
        Meeting meeting1 = new Meeting(1, "JAVA", "Jonas", "Jono JAVA meetas", new String[]{"Hub"},
                new String[]{"InPerson"},"2022-03-07", "2022-03-07");
        Meeting meeting2 = new Meeting(2, "PHP", "Karolis", "PHP Live meetas", new String[]{"TeamBuilding"},
                new String[]{"Live"},"2022-03-10", "2022-03-10");
        Meeting meeting3 = new Meeting(3, ".NET", "Kristina", ".NET meeting", new String[]{"Short"},
                new String[]{"InPerson"},"2022-04-07", "2022-04-07");
        meetings.put(1, meeting1);
        meetings.put(2, meeting2);
        meetings.put(3, meeting3);
    }

    public static List<Meeting> getAllMeetings() {
        return new ArrayList<>(meetings.values());
    }

    public static Meeting createMeeting(Meeting meeting) {
        index += 1;
        meeting.setId(index);
        meetings.put(index, meeting);
        return meeting;
    }

        public static Meeting deleteMeeting(int meetingId){
        return meetings.remove(meetingId);
    }


}
