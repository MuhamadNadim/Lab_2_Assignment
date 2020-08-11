package Lab_2_Final;

import jdk.internal.org.objectweb.asm.tree.InsnList;

import java.util.*;

public class Lab2Y3G25_AmirulAzri_Laptop {
    private static String brand;
    private static String model;
    private static String year;
    private static int  ans;
    private static double price;
    private static double disc_rate;
    private static Scanner ipt = new Scanner(System.in);


    public Lab2Y3G25_AmirulAzri_Laptop(String brand, String model, String year, double price){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public static void add(){
        System.out.println("STORE: Enter the details of the laptop to get stored.");
        System.out.println("Brand Name:");
        brand = ipt.next();
        System.out.println("Model title:");
        model = ipt.next();
        System.out.println("Year Manufactured:");
        year = ipt.next();
        System.out.println("Price: RM");
        price = ipt.nextDouble();
    }

    public static void search(){
        System.out.println("SEARCH");
        System.out.println("Enter your choice to search laptop data by:" +
                "\n1.Brand\t2.Model\t3.Manufacturing date\t4.Price");
        ans=ipt.nextInt();
        if(ans == 1)
        {
            System.out.println("Enter the name of Brand to be searched:");
            brand = ipt.next();

        }
    }

    public static void edit(){
        System.out.println("EDIT");
        System.out.println("Enter the model number for which you want edit the details");

    }

    public static void display(){
        System.out.println("DISPLAY");

    }

}
