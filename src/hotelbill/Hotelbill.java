package hotelbill;

import java.util.ArrayList;
import java.util.Scanner;

public class Hotelbill {
    static int totalbill;
            public static void main(String args[])
            {
                int choice;
                System.out.println("hotelbill");
                Fooditems foodItems=new Fooditems(10,50,70,120,30);
                while(true)
                {
                    System.out.println("select the option");
                    System.out.println("1.Add tea "+"price=>"+foodItems.getTea());
                    System.out.println("2.Add snacks"+"price==>"+foodItems.getSnacks());
                    System.out.println("3.Add juice "+"price==>"+foodItems.getJuice());
                    System.out.println("4.biriyani "+"price==>"+foodItems.getBiriyani());
                    System.out.println("5. ice cream "+"price==>"+foodItems.getIcecream());
                    System.out.println("6. exit ");

                    Scanner s =new Scanner(System.in);
                    choice=s.nextInt();
                    switch (choice)
                    {
                        case 1:
                            System.out.println("enter quantity");
                            int a=s.nextInt();
                            totalbill=(20*a)+totalbill;
                            System.out.println("total bill RS."+totalbill);
                            break;
                        case 2:
                            System.out.println("enter quantity");
                            int b=s.nextInt();
                            totalbill=(50*b)+totalbill;
                            System.out.println("total bill RS." +totalbill);
                            break;
                        case 3:
                            System.out.println("enter quantity");
                            int c=s.nextInt();
                            totalbill=(70*c)+totalbill;
                            System.out.println("total bill RS." +totalbill);
                            break;
                        case 4:
                            System.out.println("enter quantity");
                            int d=s.nextInt();
                            totalbill=(120*d)+totalbill;
                            System.out.println("total bill RS." +totalbill);
                            break;
                        case 5:
                            System.out.println("enter quantity");
                            int e=s.nextInt();
                            totalbill=(30*e)+totalbill;
                            System.out.println("total bill RS" +totalbill);
                            break;
                        case 6:
                            System.exit(0);
                            break;

                    }
                }
            }
}
