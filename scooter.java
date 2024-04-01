abstract class vehicle{
	 int tyrname;
	 abstract void start();
	 void display(){
		System.out.println("this is the vehicle part");
	 }
}


class car extends vehicle{

	void start(){
		System.out.println(tyrname);
	}
}

class scooter extends vehicle{
	void start(){
		System.out.println("scooter start with kick");
	}

	public static void main(String[] args) {
		scooter s= new scooter();
		s.start();
		car c=new car();
		c.start();
		c.display();
	}
}
