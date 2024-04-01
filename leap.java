import java.util.*;
public class leap {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.err.println("Enter the year");
        int year=s.nextInt();
  

    if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
        System.err.println("its is leap year");


    }
    else{
        System.err.println("its is not a leap year");
    }
       
}
}