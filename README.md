# ConcertOrdering
Capstone Project for AP Computer Science A

Fourth Quarter Project Ria Nayar P6 AP Comp Sci A 

Problem Statement 
Customers must be able to see what events are coming up at the Amalie Arena for an event, 
search through different events, and order different types of tickets. 

Client or User 
People who are ordering tickets for events at the Amalie Arena 

Requirements 
The client/user needs to find concerts, be able to order tickets of the same type and quantity per 
order, and order different types of tickets (Platinum, VIP, Standard). They also need sufficient 
detail (like name, date, performers, etc.) about the concert to make sure it is the correct event that 
they want to attend. 

Application Architecture 
Find Event Class: This class will show concerts and events at the Amalie Arena based on date 
ranges, keyword, and/or maximum ticket price. The decided concert will affect the prices in the 
other classes when ordering. This will have only static methods to search, confirm ticket order, 
and order the tickets. 
Events Class: Event objects will be created for when a new event is occurring at the Amalie 
Arena. The order will be based on the quantity, event, and type of ticket (standard, platinum, 
premium, VIP). 
SearchGUI: This is where the customer will search for classes by interacting with a JFrame. 
OrderGUI: This is where the customer will order tickets by interacting with a JFrame. 
 
