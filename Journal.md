# Journal
Terminal Coffee Pot Simulation
Phase 0
The coffee pot will need to track the maximum volume and current volume stored in it. The user should be able to
use "brew" and "pour" commands, and choose the volume in ounces they want to pour. The controller will have to 
check the current volume of the pot to see if there is enough to pour the requested cup when validating a pour.

I'm unsure how the Controller interacts with the Model to make sure that it doesn't pour an invalid amount.

Phase 1
I made the Model class that keeps track of the current volume and maximum capacity, and uses a brew and pour
method. The Model class holds the logic and state of the program in the MVC pattern. It has to validate it's own
state so it can remain independent of a Controller and View, and send notification of it's changed state to the 
Controller.
