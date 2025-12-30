 #Project Overview:-


The Cab Booking System is a Java-based console application that simulates a real-world cab booking platform.
It allows users to register, log in, book cabs, calculate fares, track live cab locations, make payments, and also provides admin-level control for monitoring bookings.

This project demonstrates Object-Oriented Programming (OOP) concepts, use of Java Collections, modular design, and real-life workflow simulation.

 #Objectives of the Project:-


.Simulate an online cab booking system

.Apply OOP principles like encapsulation, abstraction, and modularity

.Provide user and admin roles

.Implement booking, payment, and live tracking features

.Build a clean and extensible Java project

 Technologies Used:-

.Programming Language: Java

.Concepts: OOP, Collections, Exception Handling

.Interface: Console (CLI)

.IDE: Eclipse / IntelliJ IDEA / VS Code

 Project Structure & File Description
1. Main.java
Purpose:
Entry point of the application.

Functionality:

Displays main menu

Starts program execution

Connects all modules

Example:
When the program starts, Main.java shows options like:

1. Register
2. Login
3. Admin Login
4. Exit

2. CabService.java
Purpose:
Core service class handling all business logic.

Functionality:

User registration & login

Cab booking

Distance & fare calculation

Managing bookings and users

Example:
If user selects Gandhi Maidan → Airport, distance is calculated using predefined values and fare is generated automatically.

3. User.java
Purpose:
Represents a user of the system.

Functionality:

Stores username and password

Used during registration and login

Example:

Username: anurag
Password: 1234
4. AdminService.java
Purpose:
Handles admin-level operations.

Functionality:

.Admin authentication

.View all bookings

.Monitor system activity

Example Output:

Admin Login Successful
Booking ID: 101 | User: anurag | Fare: ₹240 | Status: Completed
5. Cab.java
Purpose:
Represents cab details.

Functionality:

Used to assign cabs to bookings

Can be extended for driver info and availability

6 Booking.java
Purpose:
Stores booking information.

Functionality:

.Booking ID

.User details

.Pickup & drop locations

.Distance and fare

.Booking status

Example:

Pickup: Gandhi Maidan
Drop: Airport
Distance: 12 km
Fare: ₹240
7. Payment.java
Purpose:
Handles payment processing.

Functionality:

.Displays fare

.Confirms payment

.Completes booking

Example Output:

Total Fare: ₹240
Payment Method: Cash
Payment Successful!
8. LiveLocation.java
Purpose:
Simulates live cab tracking.

Functionality:

Displays current cab location

Simulates movement towards destination

Example Output:

Cab is at Kankarbagh
Cab is moving towards Patna Junction
Cab has arrived at destination
## Complete Working Example (End-to-End Flow)
Scenario:
A user books a cab from Gandhi Maidan to Airport.

Step-by-Step Execution:
User Registration Successful
Login Successful
Cab Booked
Distance Calculated: 12 km
Fare Generated: ₹240
Live Tracking Started
Payment Successful
Ride Completed
# This flow shows how all modules work together.

# Admin Example
Admin Login Successful
Total Bookings: 3
User: anurag | Fare: ₹240 | Status: Completed
 Features Implemented
User Registration & Login

Admin Login & Monitoring

Cab Booking System

Fare Calculation

Live Location Tracking

Payment Processing

Modular & Clean Code

# Future Enhancements
GUI using JavaFX or Swing

Database integration (MySQL)

Real GPS-based tracking

Driver assignment system

Online payment gateway

## Conclusion
The Cab Booking System is a well-structured Java application that demonstrates real-world problem solving using OOP concepts.
It is suitable for academic submission, viva, and project evaluation, showing clear logic, modular design, and innovative features like live tracking.


