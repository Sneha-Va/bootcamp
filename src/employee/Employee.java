package employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        int choice;
        String empname;
        ArrayList<String> emplist=new ArrayList<String>();
        System.out.println("employees");
                while(true)
                {
                   System.out.println("1.add Employee");
                   System.out.println("2.viewEmployee");
                   System.out.println("3.Exit");
                    Scanner s= new Scanner(System.in);
                    choice=s.nextInt();
                    switch (choice)
                    {
                        case 1:
                            System.out.println("enter name of employee");
                            empname=s.next();
                            emplist.add(empname);
                            break;
                        case 2:
                            if(emplist.size()==0)
                            {
                                System.out.println("no employee added");
                            }
                            else {

                                System.out.println(emplist);
                            }
                            break;
                        case 3:
                            System.exit(0);
                    }
                }
    }
}
