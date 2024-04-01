public class pro1{
     String emp;
     int emid;
     static String depart="cdac";
 
    void getdata(String emp,int emid){
         this.emp=emp;
         this.emid=emid;
    }
    pro1(int i){
    	System.out.println("this is construcor");
    }
    

	void display(){
		System.out.println("empname is "+emp+" \n"+"and the emp id is"+" "+emid+"\n"+"and the department name is"+depart);
	}

	static void getinfo(){
		System.out.println("This is the cdac ");
	}



	public static void main(String[] args) {

		pro1 p=new pro1(1);
		p.getdata("karan", 1);
		p.display();
		pro1.getinfo();
		
	}
}