package com.rianayar.project;

import java.util.ArrayList;

public class Events {
    private String name;
    private String date;
    private String time;
    private String eventType;
    private String eventDescription;
    private final double ticketPrice; // standard price, will increase based on ticket type
    private final int eventID;
    public static ArrayList<Events> eventsList = new ArrayList<Events>();

    public Events(String theName, String theDate, String theTime, String theType, String
            theDescription, double thePrice, int theID) {
        name = theName;
        date = theDate;
        time = theTime;
        eventType = theType;
        eventDescription = theDescription;
        ticketPrice = thePrice;
        eventID = theID;
        eventsList.add(this);
    }

    /**
     * Allows user to update the event object with the correct name
     * Precondition: Event object declared and initialized
     * Post-condition: updates Event object with new name
     *
     * @param theName new name to update object with
     */
    public void setName(String theName) {
        name = theName; // updating event object with name
    }

    /**
     * Allows user to access the event object's name
     * Precondition: Event object declared and initialized
     * Post-condition: Returns name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Allows user to update the event object with the correct date
     * Precondition: Event object declared and initialized
     * Post-condition: updates Event object with new date
     *
     * @param theDate new date to update object with
     */
    public void setDate(String theDate) {
        date = theDate; // updating event object with date
    }

    /**
     * Allows user to access the event object's date
     * Precondition: Event object declared and initialized
     * Post-condition: Returns date
     *
     * @return date
     */
    public String getDate() {
        return date;
    }

    /**
     * Allows user to update the event object with the correct time
     * Precondition: Event object declared and initialized
     * Postcondition: updates Event object with new time
     *
     * @param theTime new time to update object with
     */
    public void setTime(String theTime) {
        time = theTime; // updating event object with time
    }

    /**
     * Allows user to access the event object's time
     * Precondition: Event object declared and initialized
     * Post-condition: Returns time
     *
     * @return time
     */
    public String getTime() {
        return time;
    }

    /**
     * Allows user to update the event object with the correct description
     * Precondition: Event object declared and initialized
     * Postcondition: updates Event object with new description
     *
     * @param theDescription new description to update object with
     */
    public void setDescription(String theDescription) {
        eventDescription = theDescription; // updating event object with description
    }

    /**
     * Allows user to update the event object with the correct event type
     * Precondition: Event object declared and initialized
     * Postcondition: updates Event object with new type
     *
     * @param theType new event type to update object with
     */
    public void setType(String theType) {
        eventType = theType; // updating event description with event type
    }

    /**
     * Allows user to access the event object's standard ticket price
     * Precondition: Event object declared and initialized
     * Post-condition: Returns ticketPrice
     *
     * @return ticketPrice
     */
    public double getCost() {
        return ticketPrice;
    }

    /**
     * Allows user to access the event object's ID
     * Precondition: Event object declared and initialized
     * Post-condition: Returns eventID
     *
     * @return eventID
     */
    public int getID() {
        return eventID;
    }

    /**
     * Allows user to access the event object's type
     * Precondition: Event object declared and initialized
     * Post-condition: Returns eventType
     *
     * @return eventType
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Allows user to print out object with all the necessary details
     * Precondition: Event object declared and initialized
     * Postcondition: prints out all relevant information about the event using its instance variables
     *
     * @return String containing the event’s title, name, performers, date, time, type, etc.
     */
    public String toString() {
        return "Event Name: " + name + "\nDate: " + date + "\nTime: " + time + "\nType: " + eventType + "\nDescription: " + eventDescription + "\nStandard Ticket Price: $" + ticketPrice + "\nEvent ID: " + eventID;
    }

}