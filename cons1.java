public class cons1 {
    cons1(){
        
        System.out.println("this is the no agrs constuctor");
    }
    
    cons1(int i){
        this();
        System.out.println("this is the parameterice construcor");
    }

    cons1(int y, String name){
        
        System.out.println("this is no of agrgu consttructor");
    }

    public static void main(String[] args) {
        cons1 c=new cons1(2, "karn");
    }
}
