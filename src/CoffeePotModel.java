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
        if(currentVolume > maxCapacity){
            throw new IllegalStateException("Amount exceeds maximum capacity.");
        }
        System.out.println("Coffee pot is filled to " + currentVolume + " ounces.");
    }

    public void pour(int amount){
        currentVolume = currentVolume - amount;
        //ArgumentException if negative amount passed
        //StateException if pour results in negative volume
        if(amount <= 0){
            throw new IllegalArgumentException("Enter an amount that is not a negative number.");
        }else if(currentVolume < 0){
            throw new IllegalStateException("Enter smaller amount.");
        }
        System.out.println("Pours coffee of " + amount + " ounces.");
    }
}
