/*This program is developed and programmed by Alireza Shirzad
for java beginners to help them practice on their skills with some interesting programs

 Good Luck!*/

package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    static int x , z ,i=1;
    static double xd , zd;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //making a main loop

            //introducing text
            System.out.println("Welcome to the ToolBox Program");
            main:
            while (true) {
                System.out.println("in here you can use three useful programs\n" +
                        "-Calculator\n" +
                        "-DailyPlanning\n" +
                        "-HashMap\n" +
                        "you use them by writing their names");

                //here we read the user input
                String choosePrgrm = scanner.next();

                //switch on user input
                switch (choosePrgrm) {

                    //showing again the main page if user input wrong
                    default:
                        continue main;

                        //Calculator case
                    case "Calculator":

                        //introduction for calculator
                        System.out.println("Welcome to the Calculator Program\n" +
                                "in here you can just calculate two types of number decimal and simple.\n" +
                                "By Writing *Simple* you will enter to the Simple part\n" +
                                "and by Writing *Decimal* you will enter to the Decimal number part");

                        numberTpCh:
                        while (true) {
                            String numberTypeChoosing = scanner.next();
                                switch (numberTypeChoosing) {

                                    default:
                                        System.out.println("By Writing *Simple* you will enter to the Simple part\n" +
                                                "and by Writing *Decimal* you will enter to the Decimal number part");
                                        continue numberTpCh;

                                    case "mainPage":
                                        continue main;

                                        //Simple Part
                                    case "Simple":

                                        System.out.println("Please input the first number");

                                        x = scanner.nextInt();

                                        System.out.println("PLease input the operator ");

                                        String oprt3 = scanner.next();

                                        System.out.println("Please input the second number");

                                        z = scanner.nextInt();

                                        switch (oprt3) {

                                            case "+":
                                                System.out.println(x + "+" + z + "=" + (x + z));

                                                break;

                                            case "-":
                                                System.out.println(x + "-" + z + "=" + (x - z));
                                                break;

                                            case "*":
                                                System.out.println(x + "*" + z + "=" + (x * z));
                                                break;

                                            case "/":
                                                System.out.println(x + "/" + z + "=" + (x / z));
                                                break;

                                        }
                                        System.out.println("=====================");
                                        System.out.println("By writing *mainPage* you will close the Calculator");
                                        System.out.println("=====================");
                                        continue numberTpCh;

                                        //Decimal Part
                                    case "Decimal":

                                        System.out.println("Please input the first number");

                                        xd = scanner.nextDouble();

                                        System.out.println("PLease input the operator ");

                                        String oprt = scanner.next();

                                        System.out.println("Please input the second number");

                                        zd = scanner.nextDouble();

                                        switch (oprt) {

                                            case "+":
                                                System.out.println(xd + "+" + zd + "=" + (xd + zd));
                                                break;

                                            case "-":
                                                System.out.println(xd + "-" + zd + "=" + (xd - zd));
                                                break;

                                            case "*":
                                                System.out.println(xd + "*" + zd + "=" + (xd * zd));
                                                break;

                                            case "/":
                                                System.out.println(xd + "/" + zd + "=" + (xd / zd));
                                                break;


                                        }
                                        System.out.println("=====================");
                                        System.out.println("By writing main page you will close the Calculator");
                                        System.out.println("=====================");
                                        continue numberTpCh;
                                }
                            }



                        //HashMap
                    case "HashMap":
                        HashMap<Integer, String> hashmap = new HashMap<>();

                        System.out.println("Welcome, HashMap is a tool to make some values with a key for each of them \n" +
                                "For example you value can be *Hello* and the key can be *1*");
                        System.out.println("======================");
                        System.out.println("Please input three number for the keys of your Values");

                        //Getting the Keys

                        int xKey = scanner.nextInt();
                        int zKey = scanner.nextInt();
                        int yKey = scanner.nextInt();

                        System.out.println("Now please input three text values");

                        //Getting the values

                        String xVal = scanner.next();
                        String zVal = scanner.next();
                        String yVal = scanner.next();

                        //Setting them in HashMap

                        hashmap.put(xKey, xVal);
                        hashmap.put(zKey, zVal);
                        hashmap.put(yKey, yVal);

                        //Making 2 lists one for the Keys and one for the Values
                        List<Integer> listKey = new ArrayList<>(hashmap.keySet());
                        List<String> listValue = new ArrayList<>(hashmap.values());

                        System.out.println("Your inputs are set , by writing *Show* you can see them");
                        showHash:
                        while (true) {
                            String shw = scanner.next();

                            //Showing them

                            switch (shw) {
                                default:
                                    System.out.println("Your inputs are set , by writing *Show* you can see them");
                                    continue showHash;


                                case "Exit":
                                    continue main;

                                case "Show":
                                    System.out.println("Your Keys are:");
                                    for (int allKey : listKey)
                                        System.out.println(allKey);
                                    System.out.println("======================");
                                    System.out.println("Your Values are:");
                                    for (String allVal : listValue)
                                        System.out.println(allVal);
                                    System.out.println("======================");

                                    System.out.println("for exiting the HashMap part input *Exit*");
                                    continue showHash;
                            }

                        }

                    case "DailyPlanning":

                        System.out.println("Welcome in this part you can make plan for your daily works \n" +
                                "for Start please input *Plan*");

                        startingplan:
                        while (true) {
                            String startplan = scanner.next();
                            switch (startplan) {

                                default:
                                    continue startingplan;

                                case"Plan":

                                    //Getting the plans

                                    List<String> planlist = new ArrayList<>();
                                    System.out.println("Please just write 5 work");
                                    String work1 = scanner.next();
                                    planlist.add(work1);
                                    String work2 = scanner.next();
                                    planlist.add(work2);
                                    String work3 = scanner.next();
                                    planlist.add(work3);
                                    String work4 = scanner.next();
                                    planlist.add(work4);
                                    String work5 = scanner.next();
                                    planlist.add(work5);

                                    //Showing the planning as a list

                                    for (String allsbj : planlist)
                                        System.out.println(i++ + "-" + allsbj);

                                    planhelp:
                                    while (true) {
                                        System.out.println("======================");
                                        System.out.println("Your works are still available till you stop this or make the accomplished\n" +
                                                "for more write *Help*");
                                        String helpstr = scanner.next();

                                        switch (helpstr) {
                                            default:
                                                continue planhelp;

                                            case "Help":

                                                help2:
                                                while (true) {
                                                    System.out.println("For Closing the Sorting Please input *Close*\n" +
                                                            "and for mark them as accomplished input *finished*");
                                                    String sbjend = scanner.next();
                                                    switch (sbjend) {
                                                        default:
                                                            continue help2;

                                                        case "Close":
                                                            continue main;

                                                            //Text for finishing

                                                        case "finished":
                                                            System.out.println("======================");
                                                            System.out.println("Congratulations all your tasks are finished");
                                                            System.out.println("======================");
                                                            continue main;
                                                    }
                                                }
                                        }

                                    }


                            }


                        }
                }
            }
    }
}



