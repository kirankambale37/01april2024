import java.util.*;
public class calcultor {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=s.nextInt();
        System.out.println("Enter the Seconde number");
        int b=s.nextInt();
        System.out.println("what do you want  "+"  " +"+,*,-,%");
        String cal=s.next();

        switch (cal) {
            case ("+"): float res=a+b;
                       System.err.println(res);
                       break;
            case ("-"): float sub=a-b;
                      System.err.println(sub);
                       break;
            case ("*"): float mul=a*b;
                       System.err.println(mul);
                        break;
            case ("%"): float fac=a%b;
                        System.err.println(fac);
                         break;
        
            default:
                  System.out.println("invild key");
                break;
        }
    }
    
}
