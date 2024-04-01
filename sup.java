public class sup {

    int a=10;
    
}

class sub extends sup{
    int a=20;

    void display(int a){
        System.out.println(a);
        System.out.println(this.a);
        System.err.println(super.a);
    }

    public static void main(String[] args) {
        sub s=new sub();
        s.display(30);
        
    }
}
