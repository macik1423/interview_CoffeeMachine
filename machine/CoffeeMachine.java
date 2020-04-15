package machine;

import java.util.Scanner;

public class CoffeeMachine {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Machine machine = new Machine(400, 540, 120, 9, 550);
        boolean open = true;
        while(open) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String option = sc.next();
            switch (option) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String buyOption = sc.next();
                    if (buyOption.equals("back")) {
                        break;
                    }
                    int coffeeOrdinal = Integer.parseInt(buyOption) - 1;
                    CoffeeType coffeeType = CoffeeType.values()[coffeeOrdinal];
                    machine.canMakeCoffee(coffeeType.makeCoffee());
                    break;
                case "fill":
                    machine.fill();
                    break;
                case "take":
                    machine.giveAllMoney();
                    break;
                case "remaining":
                    System.out.println(machine.toString());
                    break;
                case "exit":
                    open = false;
                    break;
            }
        }
    }
}
