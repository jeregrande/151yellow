# 151yellow
TODO:  
-->Load & save database functionality  
-->Manager view page controllers  
-->Guest make reservations  
-->Guest view reservations  

Notes:  
-->The StartupView has been refractored to HotelSystemDriver  
-->After we finish, we'll have to delete the main method from ALL view classes (besides HotelSystemDriver)  

Known Issues:  
-->Signup does not account for blank fields  
-->Make reservations does not account for blank dates  
-->During make reservation, room select does not account for out-of-bounds rooms (>20 or <1)  
-->During make reservation, select room is available whether or not guest has inputted a date  
