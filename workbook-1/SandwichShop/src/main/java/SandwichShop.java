import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        float price;
        Scanner scanText = new Scanner(System.in);

        System.out.println("Welcome to the SandwichShop!");
        System.out.println("Would you like a Regular or Large sandwich?");
        String option = scanText.nextLine();
        double Regular = 5.45;
        double Large = 8.45;

        System.out.println("And mind telling me your age?");
        int age = scanText.nextInt();

        if (option = Regular (age <= 17)){
            // ^not working bc this statement means "if the age is both 17 and regular". your age cant be both an integer and string{
            double total = Regular * .9;
            System.out.println("Your total will be $" + total);
        } else if (age >= 65){
            double total = Regular * .8;
            System.out.println("Your total will be $" + total);
        } else{
            double total = Regular;
            System.out.println("Your total will be $" + total);
        }

       /* if (option == "Regular" || option == "regular") {

        } else {option == "Large" || option == "large"){

        }


        double product = age * Regular

            if (age <= 17 && )
*/

    }
}


