public class Main {
    public static void main(String[] args) {
        CoffeePotModel coffeePot = new CoffeePotModel(15,20);
        coffeePot.brew(5);
        //coffeePot.brew(-5);
        coffeePot.pour(10);
        //coffeePot.pour(-5);
        System.out.println("Coffee pot volume: " + coffeePot.getCurrentVolume());
    }
}
