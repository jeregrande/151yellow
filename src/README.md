# 151yellow
TODO:  
-->Load & save database functionality  
-->Manager view page controllers     
  
Notes:  
-->The StartupView has been refractored to HotelSystemDriver  
-->After we finish, we'll have to delete the main method from ALL view classes (besides HotelSystemDriver)  
-->Check package statements (should be hotelReservationSystem)  
  
Known Issues:  
-->Signup does not account for blank fields  
-->Make reservations does not account for blank dates  
-->Sometime a reservation room will be -1 (EX: Making a reservation in room 10 saves as room 9)  
