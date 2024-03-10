public class Details {
    private String numberPlate;
    private String carCompany;
    private String carModel;
    private String name;
    private String phoneNumber;
    private String idNumber;
    private int  ticket;

    Details() {

    }//default
    Details(String numberPlate , String carCompany , String carModel , String name , String phoneNumber , String idNumber , int  ticket) {
        this.numberPlate = numberPlate;
        this.carCompany = carCompany;
        this.carModel = carModel;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.idNumber = idNumber;
        this.ticket = ticket;
    }//overloaded

    //setters
    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }
    public void setCarCompany(String carCompany) {
        this.carCompany = carCompany;
    }
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    //getters
    public String getNumberPlate() {
        return numberPlate;
    }
    public String getCarCompany() {
        return carCompany;
    }
    public String getCarModel() {
        return carModel;
    }
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getIdNumber() {
        return idNumber;
    }
    public int getTicket() {
        return ticket;
    }

    // //display
    // public void display() {
    //     System.out.println("++++++++++++++++++++ Details ++++++++++++++++++++");
    //     System.out.println("Number Plate : " + getNumberPlate() + "\nCar Company : " + getCarCompany() + "\nCar Model : " + getCarModel() + "\nPerson's Name : " + getName() + "\nPerson's Phone Number : " + getPhoneNumber() + "\nPerson's Id : " + getIdNumber() + "\nTicket Number : " + getTicket());
    // }
}