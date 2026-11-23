import java.util.Scanner;

public class CoffeePotView {
    private final Scanner scanner;

    public CoffeePotView(){
        this.scanner = new Scanner(System.in);
    }

    public void showMenu(){
        System.out.println("=============== Coffee Maker ==============");
        System.out.println(" brew <amt>  - Brew amount in ounces of coffee");
        System.out.println(" pour <amt>  - Pour amount in ounces of coffee");
        System.out.println(" status      - Check current coffee pot level ");
        System.out.println(" x           - Exit the program.");
    }

    public String getUserInput(){
        System.out.println("Enter Command: ");
        if (scanner.hasNextLine()){
            return scanner.nextLine().trim();
        }
        return "";
    }

    public void displayMessage(String msg) {
        System.out.println(msg);
    }
}
