import Model.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String  name, age, address, phone,bikeName;

        Scanner first = new Scanner(System.in);

        System.out.println("---------- Welcome to Honda Nepal--------------");

        System.out.println(" ");
        System.out.println("Enter 'A' to continue : ");
        String aa = first.next();

        System.out.println("Enter Name : ");
        name = first.nextLine();

        System.out.println("Enter Age : ");
        age = first.next();

        System.out.println("Enter Address : ");
        address = first.next();

        System.out.println("Enter Phone Number : ");
        phone = first.next();

        User details = new User(name, age, address, phone);

        details.info();

        System.out.println(" ");
        System.out.println("Enter any number to continue : ");
        int num = first.nextInt();


        place dis = new place();

        System.out.println("District : ");

        dis.district();

        System.out.println("Please choose the district : ");
        String lock = first.next();

        if (lock.equalsIgnoreCase("kathmandu")){
            dis.location1();
        } else if (lock.equalsIgnoreCase("bhaktapur")) {
            dis.location2();
        }else if (lock.equalsIgnoreCase("lalitpur")) {
            dis.location3();

        }else if (lock.equalsIgnoreCase("Pokhara")) {
            dis.location4();
        }else if (lock.equalsIgnoreCase("chitwan")) {
            dis.location5();
        }else if (lock.equalsIgnoreCase("itahari")) {
            dis.location6();
        }else if (lock.equalsIgnoreCase("lumbini")) {
            dis.location7();
        }else if (lock.equalsIgnoreCase("jhapa")) {
            dis.location2();
        }else {

        }
        System.out.println(" ");
        System.out.println("Book a ride (1)  |    Service Centre (2)");
        String ans = first.next();

        ArrayList<BikeCat> mod = new ArrayList<>();
        BikeCat bike1 = new BikeCat("CB unicorn","200000");
        BikeCat bike2 = new BikeCat("Honda CRF300L","175000");
        BikeCat bike3 = new BikeCat("Honda CB Horne","350000");
        BikeCat bike4 = new BikeCat("Honda XBlade","300000");
        BikeCat bike5 = new BikeCat("Honda Shine SP","173000");
        BikeCat bike6 = new BikeCat("Honda CD 110","200000");

        if (ans.equalsIgnoreCase("1")){
            System.out.println("Enter 1 number to get the bike details.");
            String bikee = first.next();

            System.out.println("Bike Details : ");
            System.out.println("Bike : CB unicorn, Price :  200000");
            System.out.println("Bike : Honda CRF300L, Price :  175000");
            System.out.println("Bike : Honda CB Hornet, Price :  350000");
            System.out.println("Bike : Honda XBlade, Price :  300000");
            System.out.println("Bike : CB unicorn, Price :  1730000");
            System.out.println("Bike : Honda Shine SP, Price :  205000");
            System.out.println("Bike : Honda CD 110, Price :  2000000");


            System.out.println(" ");
            System.out.println("Enter the bike name : ");
            bikeName = first.next();
            System.out.println(" ");
            details.info();
            System.out.println("Your ride has been fixed of bike " + bikeName);



        } else if (ans.equalsIgnoreCase("2")) {

            details.info();

            System.out.println("Time of service : ");
            int time = first.nextInt();

            System.out.println("Your service time have been fixed for " + time);

        }else {

        }
    }
}