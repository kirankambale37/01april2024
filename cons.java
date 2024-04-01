public class cons {
    int empid;
    String empname;
    static String departname="cdac";

 
    cons(int empid,String empname){
       this.empid=empid;
        this.empname=empname;

    }

    void display(){
        System.out.println("Emplyee name is"+empname+"\n"+"and Employee id is"+empid+"\n"+"and department is "+departname);
    }



    public static void main(String[] args) {
        
        cons c=new cons(2,"karan");
        c.display();
        cons c1=new cons(3, "vikram");
        c1.display();
        cons c2=new cons(4, "vishal");
        c2.display();

    }
    
}
