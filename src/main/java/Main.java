import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Input input = new Input();
        input.main();
        Calculation calc = new Calculation();
        calc.main(input.principal, input.interest, input.years);

        //add a % after the first float
        System.out.printf("After %d years at %.2f%%, the investment will be worth $%.2f.", input.years, input.interest, calc.amount);
    }
}

class Input{

    double principal;
    double interest;
    int years;

    public void main(){
        System.out.print("Enter the principal: ");
        Scanner input1 = new Scanner(System.in);
        String string1 = input1.next();
        this.principal = Double.parseDouble(string1);

        System.out.print("Enter the rate of interest: ");
        Scanner input2 = new Scanner(System.in);
        String string2 = input2.next();
       this.interest = Double.parseDouble(string2);

        System.out.print("Enter the number of years: ");
        Scanner input3 = new Scanner(System.in);
        String string3 = input3.next();
        this.years = Integer.parseInt(string3);
    }
}

class Calculation{

    double amount;

    public void main(double principal, double interest, int years){
        double rate = interest / 100;
        this.amount = principal * (1 + rate * years);
    }
}