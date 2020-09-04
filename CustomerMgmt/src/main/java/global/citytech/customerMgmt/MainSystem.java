package global.citytech.customerMgmt;

import java.util.Scanner;

public class MainSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int serviceKindInf;
        int serviceType;
        PremiumServiceCalc priceCalc = new PremiumServiceCalc();
        System.out.println("Enter Your Name:");
        while (scanner.hasNextInt()) {
            System.out.println("Please enter your correct name !!!");
            scanner.nextLine();
        }
        scanner.nextLine();
        System.out.println("WELCOME!!");
        System.out.println("Select The Type Of Service");
        System.out.println("1.Normal");
        System.out.println("2.Premium");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter correct selection!!!");
            scanner.nextLine();
        }
        serviceType = scanner.nextInt();
        while (serviceType > 2) {
            System.out.println("Please enter a correct selection!!!");
            serviceType = scanner.nextInt();
        }
        if (serviceType == 1) {
            System.out.println("You have selected our Normal Service!!! ");
        } else if (serviceType == 2) {
            System.out.println("You have selected our Premium Service!!! ");
        }
        switch (serviceType) {

            case 1:
                System.out.println("1.GYM  Rs:2000");
                System.out.println("2.Jumba  RS:1500");
                System.out.println("3.KickBoxing  RS:3000");
                while (!scanner.hasNextInt()) {
                    System.out.println("Please enter correct selection!!!");
                    scanner.nextLine();
                }
                serviceKindInf = scanner.nextInt();
                while (serviceKindInf > 3) {
                    System.out.println("Please enter a the given selection!!!");
                    serviceKindInf = scanner.nextInt();
                }
                if (serviceKindInf == 1) {

                    System.out.println("Your price for GYM with Normal service is" + "Rs" + priceCalc.gym);

                } else if (serviceKindInf == 2) {
                    System.out.println("Your price for Jumba with Normal is" + "RS" + priceCalc.jumba);
                } else if (serviceKindInf == 3) {
                    System.out.println("Your price for KickBoxing with Normal service is " + "Rs"
                            + priceCalc.kickBoxing);
                }

                break;

            case 2:

                System.out.println("1.GYM  Rs:2000");
                System.out.println("2.Jumba  RS:1500");
                System.out.println("3.KickBoxing  RS:3000");
                while (!scanner.hasNextInt()) {
                    System.out.println("Please enter correct selection!!!");
                    scanner.nextLine();
                }
                serviceKindInf = scanner.nextInt();
                while (serviceKindInf > 3) {
                    System.out.println("Please enter a the given selection!!!");
                    serviceKindInf = scanner.nextInt();
                }
                if (serviceKindInf == 1) {
                    System.out.println("Your price for GYM with Premium service discount is"
                            + "Rs" + priceCalc.gymDiscount());
                } else if (serviceKindInf == 2) {
                    System.out.println("Your price for Jumba with Premium service discount is"
                            + "RS" + priceCalc.jumbaDiscount());
                } else if (serviceKindInf == 3) {
                    System.out.println("Your price for KickBoxing with Premium service discount is "
                            + "Rs" + priceCalc.kickBoxingDiscount());
                    break;
                }

        }
    }
}



