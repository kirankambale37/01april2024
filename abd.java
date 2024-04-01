class abd extends abs{
	void display(){
		System.out.println("this is the abstract class");
	}

	void getinp(){
		System.out.println("this is contract methode");
	}

	public static void main(String[] args) {
		abd a=new abd();
		a.display();
		a.getinp();
	}
}