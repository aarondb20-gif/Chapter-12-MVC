public class CoffeePotControl {
    private final CoffeePotModel model;
    private final CoffeePotView view;

    public CoffeePotControl(CoffeePotModel model, CoffeePotView view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        boolean on = true;

        while (on) {
            view.showMenu();
            String input = view.getUserInput();
            if (input.isEmpty()) {
                view.displayMessage("Error: Please enter a command");
                continue;
            }
            String[] parts = input.split("\\s+", 2);
            String command = parts[0].toLowerCase();

            switch (command) {
                case "brew":
                    handleBrew(parts);

                    break;
                case "pour":
                    handlePour(parts);
                    break;
                case "status":
                    view.displayMessage(model.getStatus());
                    view.displayMessage("-----------------------------------------------");
                    break;
                case "x":
                    view.displayMessage("Shutting down coffee pot.");
                    on = false;
                    break;
                default:
                    view.displayMessage("Error: Unknown command " + command + ".");
            }
        }
    }

    private void handleBrew(String[] parts) {
        Integer amount = parseAmount(parts, "brew");
        if (amount == null) {
            return;
        }

        try {
            model.brew(amount);
            view.displayMessage("Brewed " + amount + " oz of coffee.");
            view.displayMessage("------------------------------------");
        } catch (IllegalArgumentException | IllegalStateException e) {
            view.displayMessage("Cannot brew: " + e.getMessage());
        }
    }

    private void handlePour(String[] parts) {
        Integer amount = parseAmount(parts, "pour");
        if (amount == null) {
            return;
        }

        try {
            model.pour(amount);
            view.displayMessage("Poured " + amount + " oz of coffee.");
            view.displayMessage("------------------------------------");
        } catch (IllegalArgumentException | IllegalStateException e) {
            view.displayMessage("Cannot pour: " + e.getMessage());
        }
    }

    private Integer parseAmount(String[] parts, String commandName) {
        if (parts.length < 2) {
            view.displayMessage("Error: '" + commandName + "' requires an amount (e.g., " + commandName + " 8).");
            return null;
        }

        try {
            return Integer.parseInt(parts[1].trim());
        } catch (NumberFormatException e) {
            view.displayMessage("Error: '" + parts[1] + "' is not a valid whole number.");
            return null;
        }
    }


}
