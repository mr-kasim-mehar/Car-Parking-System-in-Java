import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
public class CarParkingManagementSystem {

    private int parkinLotSize;

    public void start() {
        TicketGenerator t = new TicketGenerator();
        CarList list = new CarList();
        DetailStackLL stack = new DetailStackLL();
        ArrayList <Integer> ticketsIn = new ArrayList<>();
        System.out.println("++++++++++++++++++++ WELCOME TO CAR PARKING MANAGEMENT SYSTEM ++++++++++++++++++++");
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter the Size of Parking Lot : ");
        parkinLotSize = enter.nextInt();
        while(parkinLotSize == 0) {
            System.out.println("The Parking lot size is zero!!\nNo Cars can be Parked.");
            System.out.print("Re-Enter the Size of Parking Lot : ");
            parkinLotSize = enter.nextInt();
        }
        while (true) {
                Calendar c = Calendar.getInstance();
                System.out.println("\nChoose an Option : ");
                System.out.println("1. Park a Car");
                System.out.println("2. Retrieve a Car");
                System.out.println("3. Display Current Parking lot status");
                System.out.println("4. Check All time Parking lot Details");
                System.out.println("5. Display Customers Parking Data");
                System.out.println("6. Exit");
                System.out.print("\nEnter Choice : ");
                int choose = enter.nextInt();
                enter.nextLine();
                System.out.println();
                switch (choose) {
                    case 1:
                        if (list.getSize() == parkinLotSize) {
                            System.out.println("The Parking lot is Full!!\nNo more cars can be parked");     
                            break;  
                        }
                        else if (list.getSize() < parkinLotSize) {
                            System.out.print("Enter Number plate : ");
                            String plate = enter.nextLine();
                            System.out.print("Car Company : ");
                            String company = enter.nextLine();
                            System.out.print("Car Model : ");
                            String model = enter.nextLine();
                            while (model.length() > 4 || model.length() < 4) {
                                System.out.print("Re-Enter Car Model : ");
                                model = enter.nextLine();
                            }
                            System.out.print("Owners Name : ");
                            String name = enter.nextLine();
                            System.out.print("Owners Phone Number : ");
                            String number = enter.nextLine();
                            while (number.length() > 11 || number.length() < 11) {
                                System.out.print("Re-Enter phone number : ");
                                number = enter.nextLine();
                            }
                            System.out.print("Enter Owners Id : ");
                            String id = enter.nextLine();
                            while (id.length() > 13 || id.length() < 13) {
                                System.out.print("Re-Enter Id number : ");
                                id = enter.nextLine();
                            }
                            int ticket = t.getTicket();
                            System.out.println("++++++++++ Ticket Number ++++++++++");
                            System.out.println(ticket);
                            System.out.println("Parking Time : " + c.getTime());    
                            // adding the ticket in array list for record
                            ticketsIn.add(ticket);
                           //Storing details as an argument
                            Details d = new Details(plate , company , model , name , number , id , ticket);
                            list.insert(d);
                            stack.push(d);
                            break;
                        }
                
                    case 2:

                        System.out.println("Tickets Present in Parking lot : ");
                        System.out.println();
                        for(int i = 0; i < ticketsIn.size() ; i++){
                            System.out.print(ticketsIn.get(i) + "  ");
                        }
                        System.out.println("\n");
                        System.out.print("Enter the Ticket For Retrival the Car : ");
                        String UserTicket = enter.nextLine();
                        while (UserTicket.length() > 4 || UserTicket.length() < 4) {
                            System.out.print("Re-Enter the Ticket : ");
                            UserTicket = enter.nextLine();
                        }
                        // matching the System generated Ticket with user Enterend Ticket
                        int userTic = Integer.parseInt(UserTicket);
                        boolean bool = false;
                        for ( int i = 0; i < ticketsIn.size(); i++) {
                            if (userTic == ticketsIn.get(i)) {
                                list.remove(i);
                                bool =  true;
                                ticketsIn.remove(i);
                            }
                        }
                        if(bool == true){
                            System.out.println("Car Found! Your Car is Out of Parking");
                            System.out.println("Retrieving Time : " + c.getTime());
                        }
                        else {
                            System.out.print("The Car doesn't exist!.\n");
                        }
                        break;
                
                    case 3:
                
                        list.display();
                        break;
                
                    case 4:
                    
                        stack.display();
                        break;
        
                    case 5:
                    
                        System.out.println("Tickets Present in Parking lot : ");
                        System.out.println();
                        for(int i = 0; i < ticketsIn.size() ; i++){
                            System.out.print(ticketsIn.get(i) + "  ");
                        }
                        System.out.println("\n");
                        System.out.print("Enter the Ticket for checking if the Car is Parked : ");
                        String usersTicket = enter.nextLine();
                        while (usersTicket.length() > 4 || usersTicket.length() < 4) {
                            System.out.print("Re-Enter the Ticket : ");
                            usersTicket = enter.nextLine();
                        }
                        int usersTic = Integer.parseInt(usersTicket);
                        boolean boool = false;
                        for ( int i = 0; i < ticketsIn.size(); i++) {
                            if (usersTic == ticketsIn.get(i)) {
                                list.get(i);
                                boool = true;
                            }
                        }
                        if (boool == true) {
                            System.out.print("Car is Parked in the Parking lot.\n");
                        }
                        else {
                            System.out.println("The Car doesn't exist!.");
                        }
                        break;
                
                    case 6:
            
                        System.out.println("---------- EXITING ----------");
                        return;

                    default:
                
                        System.out.println("Invalid Input!!!!");
                        break;
                    }
        }
    }
}//class