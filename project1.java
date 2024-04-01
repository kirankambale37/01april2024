public class project1 {

    int empid;
    String empname;
    String grad;
    String country;
    static String depart="cdac";


    project1(){
        System.out.println("this is default constructor");
    }

    project1(int empid, String empname, String grad){
        this();
        this.empid=empid;
        this.empname=empname;
        this.grad=grad;

    }

    project1(int empid,String empname, String grad, String country){
    
        this(empid,empname,grad);
        this.country=country;

    }

    void getdeta(){
        System.out.println(empid+"\n"+empname+"\n"+grad+"\n"+depart+"\n"+country);
    }

    public static void main(String[] args) {
        project1 p=new project1(1,"karan","A");
        p.getdeta();
        project1 p1=new project1(2,"bullet","B","india");
        p1.getdeta();
    }
    
}
