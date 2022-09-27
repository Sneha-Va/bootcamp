package hotelbill;

import java.util.Scanner;

public class Hotelbill {
    static int totalbill;
            public static void main(String args[])
            {
                int choice;
                System.out.println("hotelbill");
                while(true)
                {
                    System.out.println("select the option");
                    System.out.println("1.tea RS.20");
                    System.out.println("2.snaks RS.50 ");
                    System.out.println("3.Juice RS.70 ");
                    System.out.println("4.biriyani RS.120 ");
                    System.out.println("5. ice cream RS.30 ");
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
