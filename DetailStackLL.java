public class DetailStackLL{
	CarNode top;
	int size;

	public DetailStackLL(){
		this.top = null;
		size = 0;
	}

	public void push(Details car){

		CarNode  newNode = new CarNode(car);

		newNode.next = top;
		top = newNode;
		size++;
	}

	public void clear(){
		top=null;
		size=0;
	}

	public void display(){
		CarNode current =top;
		while (current!=null) {
            System.out.println("Ticket Number : " + current.car.getTicket() +"\nNumber Plate : " + current.car.getNumberPlate() + "\tCar Company : " + current.car.getCarCompany() + "\tCar Model : " + current.car.getCarModel() + "\tOwners Name : " + current.car.getName() + "\tPhone Number : " + current.car.getPhoneNumber() + "\tId Number : " + current.car.getIdNumber() + "\n---------------------------------------------------------------------------------------------------------------------------------------------------------------");	
			current = current.next;
		}
	}
}