public class CarList {
    private CarNode head;
    private int size;

    public CarList() {
        this.head = null;
        this.size = 1;
    }

    //inserting
    public void insert(Details car) {
        CarNode newNode = new CarNode(car);
        if (head == null) {
            head = newNode;
            return;
        }
        else {
            CarNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Removing a car from the list
    public void remove(int index) {
        if (head == null || index < 0) {
            return;
        }
        if (index == 0) {
            head = head.next;
            size--; // Decrease the size of the list after removing a car
            return;
        }
        CarNode prev = null;
        CarNode current = head;
        int count = 0;
        while (current != null && count != index) {
            prev = current;
            current = current.next;
            count++;
        }
        if (current == null) {
            System.out.println("No Car Found. Deletion failed.");
            return; 
        }
        prev.next = current.next;
        size--; // Decrease the size of the list after removing a car
    }

    //displaying specific data
    public void get(int index) {
        CarNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        System.out.println("Ticket Number : " + current.car.getTicket() + "\nNumber Plate : " + current.car.getNumberPlate() + "\tCar Company : " + current.car.getCarCompany() + "\tCar Model : " + current.car.getCarModel() + "\tOwners Name : " + current.car.getName() + "\tPhone Number : " + current.car.getPhoneNumber() + "\tId Number : " + current.car.getIdNumber() + "\n---------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }


    //display
    public void display() {
        CarNode current = head;
        if (head == null) {
            System.out.println("No cars added yet.");
            return;
        }
        else {
            System.out.println("List of Cars:");
            while (current != null) {
                System.out.println("Ticket Number : " + current.car.getTicket() + "\nNumber Plate : " + current.car.getNumberPlate() + "\tCar Company : " + current.car.getCarCompany() + "\tCar Model : " + current.car.getCarModel() + "\tOwners Name : " + current.car.getName() + "\tPhone Number : " + current.car.getPhoneNumber() + "\tId Number : " + current.car.getIdNumber() + "\n---------------------------------------------------------------------------------------------------------------------------------------------------------------");
                current = current.next;
            }
        }
    }

    //size of LL
    public int getSize() {
        return size;
    }
}//class