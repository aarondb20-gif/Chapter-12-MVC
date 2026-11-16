public class CoffeePotControl {
    CoffeePotModel coffeePotModel;
    CoffeePotView coffeePotView;
    public CoffeePotControl(CoffeePotModel coffeePotModel, CoffeePotView coffeePotView){
        this.coffeePotModel = coffeePotModel;
        this.coffeePotView = coffeePotView;
    }
    public void start(){
        boolean on = true;
        coffeePotView.showMenu();
        while(on){
            String input = coffeePotView.getUserInput();
            if(input.isEmpty()){
                continue;
            }
            String[] parts = input.split("\\s+");
            String command = parts[0].toLowerCase();

            switch (command){
                case "brew":

            }
        }
    }

}
