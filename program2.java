import java.util.*;
public class program2 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.err.println("Enter the first name");
        int a=s.nextInt();
        System.err.println("Enter the seconde name");
        int b=s.nextInt();
        System.err.println("Enter the third name");
        int c=s.nextInt();

        if(a>b && a>c){
            System.err.println("first number is biggest, that is "+a);
        }
        else if(b>a && b>c){
            System.err.println("Seconde number is biggest, that is "+b);
        }
        else{
            System.err.println("third number is biggest"+c);
        }

    }
    
}
