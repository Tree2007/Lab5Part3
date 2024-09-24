import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Variables
        String userParty;

        //data collection
        System.out.println("Please type your party affiliation" + "\n\n D = Democratic \n\n R = Republican \n\n I = Independent");
        userParty = scan.nextLine();
        if (userParty.equalsIgnoreCase("I")) {
            System.out.println("You get an Independent person");
        }
        else if (userParty.equalsIgnoreCase("D")){
            System.out.println("You get a Democratic donkey");
        }
        else if (userParty.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant");
        }
        else {
            System.out.println("You have entered in invalid value");
            System.exit(0);
        }

    }
}