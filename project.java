// Title: Final Project
// Author: Daniel Lee
// Period: 5A

import java.util.Scanner;

public class project {
  // THE RATE OF CHANGE FROM USD TO THE FOREIGN CURRENCY IS FROM 12.5.2023
  public static double getEuro(double usd) {
    double change = 0.9488;
    return usd * change;
}

public static double getPeso(double usd) {
    double change = 20.19;
    return usd * change;
}

public static double getWon(double usd) {
    double change = 1425.25;
    return usd * change;
}

public static double getPound(double usd) {
    double change = 0.78;
    return usd * change;
}

public static double getYen(double usd) {
    double change = 149.97;
    return usd * change;
}

public static double getRupee(double usd) {
    double change = 84.67;
    return usd * change;
}

public static double getCanadianDollar(double usd) {
    double change = 1.41;
    return usd * change;
}

public static double getBitcoin(double usd) {
    double change = 0.00001;
    return usd * change;
}

public static double getYuan(double usd) {
    double change = 7.26;
    return usd * change;
}

public static double getAustralianDollar(double usd) {
    double change = 1.55;
    return usd * change;
}

public static double getNewZealandDollar(double usd) {
    double change = 1.7;
    return usd * change;
}

public static double getAmericanDollar(double usd) {
    double change = 1;
    return usd;
}

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an amount of money in USD: ");
    double usd = input.nextDouble();
    System.out.print("Pick any currnency from the README file: ");
    String currency = input.nextLine();
    if (currency == "Euro") {
        double euro = getEuro(usd);
        System.out.println("The amount of Euros is " + euro);
    }
   else if (currency == "Mexican Peso") {
        double peso = getPeso(usd);
        System.out.println("The amount of Mexican Pesos is " + peso);
   }
   else if (currency == "Korean Won") {
        double won = getWon(usd);
        System.out.println("The amount of Korean Won is " + won);
   }
   else if (currency == "Pound") {
        double pound = getPound(usd);
        System.out.println("The amount of Pounds " + pound);
   }
   else if (currency == "Yen") {
        double yen = getYen(usd);
        System.out.println("The amount of Japanese Yen is " + yen);
   }
   else if (currency == "Rupee") {
        double rupee = getRupee(usd);
        System.out.println("The amount of Rupees is " + rupee);
   }
   else if (currency == "Candian Dollar") {
        double candianDollar = getCanadianDollar(usd);
        System.out.println("The amount of Canadian Dollars is " + candianDollar);
   }
   else if (currency == "Bitcoin") {
        double bitcoin = getBitcoin(usd);
        System.out.println("The amount of is " + bitcoin);
   }
   else if (currency == "Yuan") {
        double yuan = getYuan(usd);
        System.out.println("The amount of is " + yuan);
   }
   else if (currency == "Australian Dollar") {
        double austrailianDollar = getAustralianDollar(usd);
        System.out.println("The amount of is " + austrailianDollar);
   }
   else if (currency == "New Zealand Dollar") {
        double newZealandDollar = getNewZealandDollar(usd);
        System.out.println("The amount of is " + newZealandDollar);
   }    
}
}