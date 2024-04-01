import java.util.*;
public class palindrom {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int no=s.nextInt();
        int temp=no;
        int rem,rev=0;

        while (temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            rem=temp/10;
        }
            System.err.println(rev);

            if(temp==rev){
                System.err.println("this is palindrom number");
            }
            else{
                System.err.println("this is not palindrom number");
            }
        }


        
    }
    

