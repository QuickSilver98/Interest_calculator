import java.util.Scanner;
public class Interest {

    Scanner input = new Scanner(System.in);
    double principal;
    double rate;
    double time;
    int number;

    int choice;

    public void compoundInterest(){

        do {
            System.out.println("Enter principal");
            principal = input.nextInt();

            System.out.println("Enter rate");
            rate = input.nextInt();

            System.out.println("Enter time in years");
            time = input.nextInt();

            System.out.println("Enter number of times value is compounded");
            number = input.nextInt();


            double value1 = (rate / 100);
            double value2 = (value1 / number);
            double value3 = (1 + value2);
            double value4 = (number * time);
            double value5 = (Math.pow(value3, value4));
            double value6 = (principal * value5);
            double answer = (value6 - principal);

            System.out.printf("The compound interest is %.3f", answer);
            System.out.println();
            System.out.printf("The total amount is %.3f", value6);

            System.out.println();
            System.out.println("Enter 1 to calculate again");
            choice = input.nextInt();
        }while (choice == 1);
    }

    public void simpleInterest(){

        do {
            System.out.println("Enter principal");
            principal = input.nextInt();

            System.out.println("Enter rate");
            rate = input.nextInt();

            System.out.println("Enter time");
            time = input.nextInt();

            double value1 = (rate / 100);
            double value2 = (principal * value1 * time);
            double amount = (principal + value2);

            System.out.printf("The simple interest is %.3f", value2);
            System.out.println();
            System.out.printf("The total amount is %.3f", amount);

            System.out.println();
            System.out.println("Enter 1 to calculate again");
            choice = input.nextInt();
        }while(choice==1);
    }
}
