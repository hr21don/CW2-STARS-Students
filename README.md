# CW2-STARS-Students
This project provides java code for the implementation of the STARS system. 

## Background
In a galaxy far away. the STAR organisation manages a number of resorts offering space travel and recreation facilities. These resorts always consist of a number of worlds offering different leisure facilities. Each world is connected by shuttles to some of the other worlds at the resort. A card must be used to take a shuttle to journey to another world. Credits can be bought for cards and these are used when making a shuttle journey. However, there are a number of conditions which need to be met before anyone (card) can use a card for a shuttle journey.  Recently, a number of incidents have occurred, which have convinced STAR that they need a better control system: someone who needed to be contacted urgently could not be located, a number of people were able to shuttle to worlds to which they were not entitled, and the Health & Safety Council is concerned about STAR’s ability to ensure  safety in the event of a major incident. This project will initially be implemented at the Wayward Asteroids Resort.

## System Requirement

People will be tracked using their cards
The following basic functional requirements have been established for the proposed system:
* Display details of the whole resort
* List all cards on all worlds of the resort
* List all cards currently on a specified world
* Find the current location of a card
* Authorise a shuttle journey,  if it meets the required conditions
* Top up a card’s credits
* Convert points to credits 
* Record an emergency move of a card (person)  back to the home world
* Record the evacuation of all cards (persons) to the home world.

The following data requirments have been established.

* Card – used for moving around the resort using shuttlesInformation stored about cards includes: a card ID number, name, a luxury rating, number of credits and the number of loyalty points. The Card class has a constructor which uses appropriate parameters to set field values and sets the number of loyalty points to zero. The luxury rating (1 to 10) determines the worlds which the person is allowed to visit e.g. a card with a rating of 3 is allowed to visit to all worlds rated 3 or below.  Each shuttle journey will deduct 3 credits and adds 2 loyalty point. People may top up their credits at any time. (Handling payments for tis is outside the scope of this project, just trust payment has been made). A person may convert their loyalty points to credits - 4 loyalty points = 1 credit. 
* World – a resort has a network of worldsEach world has a number, a name, a rating and a capacity (the maximum number of people (cards) that can be on the world at any one time). Each world should maintain a collection of cards currently on that world. These collections should be updated whenever a card enters or leaves a world, so that it is always possible to say who is currently on a world and to find the location of a person as specified by their card.
* Shuttle – connects two worlds at the resortEach shuttle has a journey code and connects a source world to a destination world. It represents a journey in one direction only. To make a shuttle journey, certain conditions must be met.  If these conditions are met, the system allows the person with the card onto the shuttle to travel to the destination world. It updates its records to show that a card has left the source world and has travelled to the destination world. It also updates the card's credits and other information, as appropriate. 

## Results
A request by a person with a card to make a shuttle journey will produce one of the following results: 
* Successful entry, because ALL of the above conditions are true
* the card's luxury rating is higher or equal to the rating of the destination world. 
* the card has enough credits for the journey
* the arrival of the card would NOT exceed the maximum capacity of the destination world.
* the card is listed in the source world of the shuttle 

These conditions can be handled by the shuttle, the card, or the worlds 
Refusal to enter the shuttle, because one or more of the above conditions are false.

* Resort - Each resort has a network of worlds joined by one-way shuttles. It also has a a collection of cards. A resort must always have a “Home” world which stores all. Its name MUST be "Home" and it MUST have a rating of 0 and a large maximum capacity. All cards registered at a resort are initially added to this “Home” world.

<img width="221" alt="Capture" src="https://user-images.githubusercontent.com/91548582/137923782-fd80db14-4719-4b38-ad20-ff1b5d3ae8d3.PNG">

## How to start this project?

![Picture1](https://user-images.githubusercontent.com/91548582/137952081-366ad990-4a87-415f-afc1-53a7296b5279.png)

The class Runner runs the main UI from the class ResortUI declared here. 

Your Options to start the project:

* Create one more more runner object to call individual methods. 

* Start the UI for the Stars the system by running 'void main(string[] args)'. 


------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

* PROJECT TITLE:
* PURPOSE OF PROJECT:
* VERSION or DATE:
* HOW TO START THIS PROJECT:
* AUTHORS:
* USER INSTRUCTIONS:
