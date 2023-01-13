import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name password and balance to create account");
        String name=sc.next();
        String password=sc.next();
        double balance=sc.nextDouble();
        SBIUser user=new SBIUser(name,balance,password);
//        HDFCUser user1=new HDFCUser (name,balance,password);
        //adding money
        System.out.println(user.addMoney(100000));
        //withdrawing money
        System.out.println("enter the amount you want to withdraw:");
      int money=sc.nextInt();
        System.out.println("enter your password:");
        String enteredPassword=sc.next();
        System.out.println(user.withdrawMoney(money,enteredPassword));
        //calculate rateOfInterest;
        System.out.println(user.calculateInterest(10));

    }
}
