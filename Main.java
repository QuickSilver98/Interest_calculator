import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Interest interestObject = new Interest();
        int calc;

        System.out.println("Interest calculator");
        System.out.println("--------------------");

       System.out.println("1.Simple interest\n2.Compound interest");
       System.out.println("Enter the calculator you want to use(1 or 2)");
       calc = input.nextInt();

       if(calc == 1){
           interestObject.simpleInterest();
       }
       if(calc == 2){
           interestObject.compoundInterest();
       }
    }
}
