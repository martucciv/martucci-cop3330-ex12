package ex12;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Veronica Martucci
 */
import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        Main app = new Main();
        double principal = app.inputPrincipal();
        double interest = app.inputRate();
        int years = app.inputYears();
        double amount = app.calculation(principal, interest, years);
        app.printOutput(years, interest, amount);
    }

    public double inputPrincipal(){
        System.out.print("Enter the principal: ");
        String string1 = input.next();
        return Double.parseDouble(string1);
    }

    public double inputRate(){
        System.out.print("Enter the rate of interest: ");
        String string2 = input.next();
        return Double.parseDouble(string2);
    }

    public int inputYears(){
        System.out.print("Enter the number of years: ");
        String string3 = input.next();
        return Integer.parseInt(string3);
    }

    public double calculation(double principal, double interest, int years){
        double rate = interest / 100;
        return principal * (1 + rate * years);
    }

   public void printOutput(int years,double interest, double amount){
       System.out.printf("After %d years at %.2f%%, the investment will be worth $%.2f.", years, interest, amount);

   }
}