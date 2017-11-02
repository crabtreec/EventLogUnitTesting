package com.theironyard;

public class Main {

    public static void main(String[] args) {

        Event event1 = new Event("Call Sami","PhoneCall");
         Event event2 = new Event("Chase Dog", "Uh Oh");
        Event event3 = new Event("Text Cassy", "TextMessaging");

        EventLog.addEvent(event1);
         //EventLog.addEvent(event2); //This throws the exception.
        EventLog.addEvent(event3);

        System.out.println("There are " + EventLog.getNumEvents() + " in the list.");
    }

}


