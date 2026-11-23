public class Main {
    public static void main(String[] args) {
        CoffeePotModel theModel = new CoffeePotModel(15,20);
        //coffeePot.brew(5);
        //coffeePot.brew(-5);
        //coffeePot.pour(10);
        //coffeePot.pour(-5);
        CoffeePotView theView = new CoffeePotView();

        CoffeePotControl coffeePot = new CoffeePotControl(theModel, theView);

        coffeePot.start();


    }
}
