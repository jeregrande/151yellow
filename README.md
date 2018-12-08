# 151yellow
TODO:  
-->Load & save database functionality  
-->Manager view page controllers  
-->Guest make reservations  
----->Make sure guests can't select room before choosing a date  
----->Make sure guests can't select a room that isn't available on that date  
----->Create a reservation record upon making a reservation
-->Guest view reservations  

Notes:  
-->The StartupView has been refractored to HotelSystemDriver  
-->After we finish, we'll have to delete the main method from ALL view classes (besides HotelSystemDriver)  

Known Issues:  
-->Signup does not account for blank fields  
-->Make reservations does not account for blank dates  
-->During make reservation, room select does not account for out-of-bounds rooms (>20 or <1)  
-->During make reservation, select room is available whether or not guest has inputted a date  
