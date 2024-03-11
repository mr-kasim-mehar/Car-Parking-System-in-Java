# Data Structures and Algorithms
Dr. Syed Qamar Askari Shah

### Group Members
- Usman Qadeer (Roll Number: 221370030)
- Muhammad Qasim (Roll Number: 221370003)
- Danish Gill (Roll Number: 221370005)
- Muhammad Moiz (Roll Number: 221370020)
### Code Contributers
- Muhammad Qasim (Roll Number: 221370003)
- Muhammad Moiz (Roll Number: 221370020)

## Car Parking Management System Report

### Introduction
The Car Parking Management System is designed to efficiently manage parking lot operations including parking, retrieving, and tracking car details. This report provides an overview of the system's functionality, structure, Data Structure used, and usage.

### Functionality
- **Parking a Car**: Users input information such as number plate, company, model, owner's name, owner’s CNIC number, and phone number to park a car. A unique ticket number is generated for each parked car.
  
- **Retrieving a Car**: Users input the customer's ticket number. The system then retrieves the car by deleting it from the parking lot (implemented as a LinkedList).

- **Displaying Current Parking Lot Status**: Users can view the current status of the parking lot including parked cars.

- **Checking All-Time Parking Lot Details**: Users can view all-time parking lot details including past parked cars (implemented using a Stack LinkedList).

- **Displaying Customer's Parking Data**: This feature allows displaying a specific customer's parking data by providing the ticket number.

- **Exit**: Users can exit the system when done.

### System Components
The system consists of the following components:
- **CarList**: Manages the list of parked cars.
- **DetailStackLL**: Implements a stack data structure to store all-time parking details.
- **Details**: Represents the details of a parked car.
- **ticketGenerator()**: Generates a unique ticket number for each parked car.
- **start()**: Main function to start the system and handle user interactions.

### Data Structures Used
The data structures used to implement the system are:
- **Stack using LinkedList**
- **Singly LinkedList**

### Usage
Upon starting the system, users are presented with a menu to choose from various options. Users can select an option by entering the corresponding number. Depending on the chosen option, users can input car details, view parking lot status, view all-time parking details, or exit the system. Car details inputted by users are stored in the system. All-time parking details are stored using a stack data structure. The system allows for easy management and tracking of parked cars.

### Conclusion
The Car Parking Management System provides an efficient solution for managing parking lot operations. With features for parking, retrieving, and tracking car details, it offers convenience to both parking lot administrators and customers. Further improvements and enhancements can be made to make the system more robust and user-friendly.
