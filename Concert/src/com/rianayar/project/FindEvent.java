package com.rianayar.project;

public class FindEvent
{
    /* Pseudocode
        1. Use nested loops to narrow down list of Event objects from Event class using the maximum standard ticket cost as the filter.
        2. Find and store toString method of each Event object left.
        3. Return String containing all possible Events fitting within parameters given.
    */
    /**
     Find concert events given maximum cost parameter to filter tickets.
     Precondition: FindEvent object must be initialized.
     Post-condition: Returns list of event names fitting criteria with unique IDs
     @param cost cost near event cost
     @return list of events that fit the criteria and filters via unique ID
     @see Events Class
     */
    public static String generalSearch(double cost)
    {
        String output = "";
        // Find concert events given starting date for search, keyword for artist name or event name, and maximum ticket price
        // Returns list of concert names fitting criteria and each has unique ID
        if(cost == -1)
        {
            return "";
        }
        for(int i = 0; i < Events.eventsList.size(); i++)
        {
            if((Events.eventsList.get(i).getCost() <= cost))
            {
                output += Events.eventsList.get(i).toString() + "\n---------------\n";
            }
        }
        if(output.equals(""))
        {
            return "There are no options that fit your criteria.\n";
        }
        else
        {
            return "Here are some options that fit your criteria:\n\n" + output;
        }
    }

    /**
     Print out information regarding event and tickets so user can confirm information is accurate.
     Precondition: Events object must be initialized. eventsList ArrayList must not be empty.
     Post-condition: Prints out order summary with chosen event's instance variables and total ticket cost.
     @param eventID unique event id inputted by user
     @param quantity how many tickets the user wants
     @param type what type of tickets the user wants
     @return output string with order confirmation
     @see Events Class
     */
    public static String confirmTicket(int eventID, int quantity, String type)
    {
        double cost = 0;
        String output = "";
        for(int i = 0; i < Events.eventsList.size(); i++)
        {
            if(Events.eventsList.get(i).getID() == eventID)
            {
                output += "\n---------------\nOrder Summary:";
                output += "Name: " + Events.eventsList.get(i).getName() + "\n";
                output += "Date: " + Events.eventsList.get(i).getDate() + "\n";
                output += "Time: " + Events.eventsList.get(i).getTime() + "\n";
                output += "Ticket Type: " + type.toUpperCase() + "\n";
                if(type.equalsIgnoreCase("standard"))
                {
                    cost = Events.eventsList.get(i).getCost() * quantity;
                }
                else if(type.equalsIgnoreCase("premium"))
                {
                    cost = Events.eventsList.get(i).getCost() * 1.5 * quantity;
                }
                else if(type.equalsIgnoreCase("vip"))
                {
                    cost = Events.eventsList.get(i).getCost() * 2 * quantity;
                }
                output += "Total Cost: $" + cost;
                return output;
            }
        }
        return "Invalid information entered. Please try again.";
    }

    /**
     Provide user with order confirmation.
     Precondition: Events object must be initialized. eventsList ArrayList must not be empty.
     Post-condition: Prints out order confirmation with cost and card info.
     @param eventID unique event id inputted by user
     @param quantity how many tickets the user wants
     @param type what type of tickets the user wants
     @param cardNum user's card number that is paying for tickets
     @return output string with order summary
     @see Events Class
     */
    public static String orderTickets(int eventID, int quantity, String type, String cardNum)
    {
        double cost = 0;
        String output = "";
        for(int i = 0; i < Events.eventsList.size(); i++)
        {
            if(Events.eventsList.get(i).getID() == eventID)
            {
                if(type.equalsIgnoreCase("standard"))
                {
                    cost = Events.eventsList.get(i).getCost() * quantity;
                }
                else if(type.equalsIgnoreCase("premium"))
                {
                    cost = Events.eventsList.get(i).getCost() * 1.5 * quantity;
                }
                else if(type.equalsIgnoreCase("vip"))
                {
                    cost = Events.eventsList.get(i).getCost() * 2 * quantity;
                }
                output += "Your order including: \n" + quantity + " " + type + " tickets for the " + Events.eventsList.get(i).getName() + " " + Events.eventsList.get(i).getEventType() + "\ncosts $" + cost + " and has been ordered using the credit card ending in " + cardNum.substring(cardNum.length()-4);
                return output;
            }
        }
        return "Invalid information entered. Please try again.";

    }
}