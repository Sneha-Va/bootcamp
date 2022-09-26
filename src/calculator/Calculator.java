package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("calculator");
                while(true)
                {
                    System.out.println("select option");
                    System.out.println("1.Addition");
                    System.out.println("2.subtraction");
                    System.out.println("3.multiplication");
                    System.out.println("4.Division");
                    System.out.println("5.exit");
                    Scanner s = new Scanner(System.in);
                    int ch= s.nextInt();
                    int x= s.nextInt();
                    int y=s.nextInt();
                    switch (ch)
                    {
                        case 1:
                            System.out.println("Addition");
                            System.out.println(x+y);
                            break;
                        case 2:

                            System.out.println("subtraction");
                            System.out.println(x-y);
                            break;
                        case 3:

                            System.out.println("multiplication");
                            System.out.println(x*y);
                            break;
                        case 4:
                            System.out.println("division");
                            System.out.println(x/y);
                            break;
                        case 5:
                            System.exit(0);
                    }
                }

    }
}
