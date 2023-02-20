import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Year : ");
        int year = sc.nextInt();
        sc.close();

        String leap = "It's a leap year!";
        String notLeap = "It's not a leap year!";
        
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println(leap);
                }
                else{
                    System.out.println(notLeap);
                }    
            }
            else{
                System.out.println(leap);
            }
        }
        else{
            System.out.println(notLeap);
        }
       
    }
}
