public class CoffeePotModel {
    private int currentVolume;
    private int maxCapacity;

    public CoffeePotModel(int currentVolume, int maxCapacity){
        this.currentVolume = currentVolume;
        this.maxCapacity = maxCapacity;
    }
    public int getCurrentVolume(){
        return currentVolume;
    }
    public void brew(int amount){
        currentVolume = currentVolume + amount;
        if (amount <= 0){
            throw new IllegalArgumentException("Enter an amount that is not a negative number.");
        }else if(currentVolume > maxCapacity){
            throw new IllegalStateException("Amount exceeds maximum capacity.");
        }
        System.out.println("Brewed " + currentVolume + " ounces of coffee.");
    }

    public void pour(int amount){
        currentVolume = currentVolume - amount;
        //ArgumentException if negative amount passed

        if(amount <= 0){
            throw new IllegalArgumentException("Enter an amount that is not a negative number.");
        }else if(currentVolume < 0){
            //StateException if pour results in negative volume
            throw new IllegalStateException("Amount exceeds current volume. Enter smaller amount.");
        }
        System.out.println("Poured " + amount + " ounces of coffee.");
    }
}
