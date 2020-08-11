package Lab_2_Final;

import java.util.*;

public class Lab2Y3G25_AmirulAzri_Client {
    public static void main(String[] args){
        ArrayList<Lab2Y3G25_AmirulAzri_Laptop> laptop = new ArrayList<>();

        laptop.add(new Lab2Y3G25_AmirulAzri_Laptop("Apple","Macbook Pro Retina",2012,3500));
        laptop.add(new Lab2Y3G25_AmirulAzri_Laptop("HP","Pavilion 15",2016,1400));
        laptop.add(new Lab2Y3G25_AmirulAzri_Laptop("Apple","Macbook Air",2018,1800));
        laptop.add(new Lab2Y3G25_AmirulAzri_Laptop("Vaio","SX14",2020,2800));
        laptop.add(new Lab2Y3G25_AmirulAzri_Laptop("Microsoft","Surface Pro 7",2020,2800));
        laptop.add(new Lab2Y3G25_AmirulAzri_Laptop("Samsung","Notebook 9 Pro",2019,3800));
        laptop.add(new Lab2Y3G25_AmirulAzri_Laptop("Asus","Zenbook Pro Duo",2018,1800));
        laptop.add(new Lab2Y3G25_AmirulAzri_Laptop("Alienware","m15 R3",2020,3800));
        laptop.add(new Lab2Y3G25_AmirulAzri_Laptop("Razer","Razer Blade",2020,3800));
        laptop.add(new Lab2Y3G25_AmirulAzri_Laptop("MSI","GP65 Leopard",2020,2800));

        Scanner i = new Scanner(System.in);
        char ch = 'y';
        int choice;

        while(ch!='n'){
            System.out.println("Enter your choice for:\n1.Add laptop data\n2.Search laptop data" +
                    "\n3.Edit laptop data\n4.Display laptop data\n5.Exit");
            System.out.println("Press number 1 , 2 , 3, 4, or 5. Pressing other numbers or alphabets " +
                    "will result in error.");
            choice = i.nextInt();
            switch(choice)
            {
                case 1: Lab2Y3G25_AmirulAzri_Laptop.add();
                        break;

                case 2:
                       break;

                case 3:
                       break;

                case 4:
                       break;

                case 5: System.exit(1);
            }
            System.out.println("Do you want to continue ? (Press Y or N only)");
            ch=i.next().charAt(0);
        }
    }
}
