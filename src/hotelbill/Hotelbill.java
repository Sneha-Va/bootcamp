package hotelbill;

import java.util.ArrayList;
import java.util.Scanner;

public class Hotelbill {

            public static void main(String args[])
            {
                int choice,mode,qty;
                ArrayList<String> itemName= new ArrayList<>();
                ArrayList<Integer> price= new ArrayList<>();
                ArrayList<Integer> quandity= new ArrayList<>();

                Fooditems foodItems=new Fooditems(10,50,70,120,30);
                Fooditems takeaway= new Fooditems(12,60,75,140,35);
                Scanner in = new Scanner(System.in);
                        System.out.println("select mode");
                        System.out.println("1.dinein");
                        System.out.println("2.Takeaway");
                        System.out.println("3.exit");
                        mode = in.nextInt();
                        switch (mode) {
                            case 1:
                                while (true) {
                                    System.out.println("select the option");
                                    System.out.println("1.tea:" + foodItems.getTea());
                                    System.out.println("2.Snacks:" + foodItems.getSnacks());
                                    System.out.println("3.Juice:" + foodItems.getJuice());
                                    System.out.println("4.biriyani:" + foodItems.getBiriyani());
                                    System.out.println("5.icecream:" + foodItems.getIcecream());
                                    System.out.println("6.bill");
                                    System.out.println("7. exit ");
                                    choice = in.nextInt();
                                    switch (choice) {
                                        case 1:
                                            System.out.println("enter the qty");
                                            qty = in.nextInt();
                                            itemName.add("tea");
                                            quandity.add(qty);
                                            price.add(qty * foodItems.getTea());
                                            break;
                                        case 2:
                                            System.out.println("enter the qty");
                                            qty = in.nextInt();
                                            itemName.add("snacks");
                                            quandity.add(qty);
                                            price.add(qty * foodItems.getSnacks());
                                            break;
                                        case 3:
                                            System.out.println("enter the qty");
                                            qty = in.nextInt();
                                            itemName.add("juice");
                                            quandity.add(qty);
                                            price.add(qty * foodItems.getJuice());
                                            break;
                                        case 4:
                                            System.out.println("enter the qty");
                                            qty = in.nextInt();
                                            itemName.add("biriyani");
                                            quandity.add(qty);
                                            price.add(qty * foodItems.getBiriyani());
                                            break;
                                        case 5:
                                            System.out.println("enter the qty");
                                            qty = in.nextInt();
                                            itemName.add("icecream");
                                            quandity.add(qty);
                                            price.add(qty * foodItems.getIcecream());
                                            break;
                                        case 6:
                                            System.out.println("***********************");
                                            System.out.println("item qty price");
                                            int sum = 0;
                                            for (int i = 0; i <= itemName.size() - 1; i++)
                                            {
                                                System.out.println(itemName.get(i) + "" + quandity.get(i) + "" + price.get(i));
                                                sum += price.get(i);
                                            }
                                            System.out.println("total is" + sum);
                                            sum = 0;
                                            System.exit(0);
                                        case 7:
                                            System.exit(0);
                                            break;
                                        default:
                                            System.out.println("invalid choice");
                                            break;
                                    }
                                }
                            case 2:
                                while (true) {
                                    System.out.println("select the option");
                                    System.out.println("1.tea:" + takeaway.getTea());
                                    System.out.println("2.Snacks:" + takeaway.getSnacks());
                                    System.out.println("3.Juice:" + takeaway.getJuice());
                                    System.out.println("4.biriyani:" + takeaway.getBiriyani());
                                    System.out.println("5.icecream:" + takeaway.getIcecream());
                                    System.out.println("6.bill");
                                    System.out.println("7. exit ");
                                    choice = in.nextInt();
                                    switch (choice) {
                                        case 1:
                                            System.out.println("enter the qty");
                                            qty = in.nextInt();
                                            itemName.add("tea");
                                            quandity.add(qty);
                                            price.add(qty * takeaway.getTea());
                                            break;
                                        case 2:
                                            System.out.println("enter the qty");
                                            qty = in.nextInt();
                                            itemName.add("snacks");
                                            quandity.add(qty);
                                            price.add(qty * takeaway.getSnacks());
                                            break;
                                        case 3:
                                            System.out.println("enter the qty");
                                            qty = in.nextInt();
                                            itemName.add("juice");
                                            quandity.add(qty);
                                            price.add(qty * takeaway.getJuice());
                                        case 4:
                                            System.out.println("enter the qty");
                                            qty = in.nextInt();
                                            itemName.add("biriyani");
                                            quandity.add(qty);
                                            price.add(qty * takeaway.getBiriyani());
                                            break;
                                        case 5:
                                            System.out.println("enter the qty");
                                            qty = in.nextInt();
                                            itemName.add("icecream");
                                            quandity.add(qty);
                                            price.add(qty * takeaway.getIcecream());
                                            break;
                                        case 6:
                                            System.out.println("***********************");
                                            System.out.println("item qty price");
                                            int sum = 0;
                                            for (int i = 0; i <= itemName.size() - 1; i++) {
                                                System.out.println(itemName.get(i) + "" + quandity.get(i) + "" + price.get(i));
                                                sum += price.get(i);
                                            }
                                            System.out.println("total is" + sum);
                                            sum = 0;
                                            System.exit(0);
                                        case 8:
                                            System.exit(0);
                                            break;
                                        default:
                                            System.out.println("invalid choice");
                                            break;
                                    }
                                }
                            case 3:
                                System.exit(0);
                        }


                                }
                        }
