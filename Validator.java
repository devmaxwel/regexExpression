import java.util.Scanner;

class usernameValidator{

    public static String RegularExpression = "[a-zA-Z][a-zA-Z0-9_*£]{8,26}$";
                                              
}
public class Validator {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N: ");
        int n = Integer.parseInt(scanner.nextLine());

        while (n>0 && n<=100){

            System.out.println("Key In Username: ");
            String Username = scanner.nextLine().toString();

            if (Username.matches(usernameValidator.RegularExpression)) {
                System.out.println("Valid Username");
            }
            else {
                System.out.println("Invalid Username!!!!! ");
            }
            
           n--;
        }

        scanner.close();
    }

}