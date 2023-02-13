package morsetolk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Logic tolk = new Logic();
        System.out.println("skriv in engelsk text eller morse kod för att översätta");
        System.out.println(tolk.translate(scan.nextLine()));
    }
}
