import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO
        boolean inchidere = true;
        while (inchidere) {
            String letter = scanner.nextLine();
            switch (letter.toLowerCase()) {
                case "a":
                    System.out.println("Aprilie");
                    System.out.println("August");
                    break;
                case "i":
                    System.out.println("Ianuarie");
                    System.out.println("Iunie");
                    System.out.println("Iulie");
                    break;
                case "f":
                    System.out.println("Februarie");
                    break;
                case "m":
                    System.out.println("Martie");
                    System.out.println("Mai");
                    break;
                case "s":
                    System.out.println("Septembrie");
                    break;
                case "o":
                    System.out.println("Octombrie");
                    break;
                case "n":
                    System.out.println("Noiembrie");
                    break;
                case "d":
                    System.out.println("Decembrie");
                    break;
                case "x":
                    System.out.println("Programul se inchide...");
                    inchidere = false;
                    break;
                default:
                    System.out.println("Nicio luna nu incepe cu litera '" + letter + "'.");
                    break;
            }
        }
        scanner.close();
    }
}