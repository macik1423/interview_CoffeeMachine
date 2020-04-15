package machine;

import java.util.Scanner;

public class Machine {
    private final static Scanner sc = new Scanner(System.in);

    int water;
    int milk;
    int coffeeBeans;
    int disposableCups;
    int money;

    public Machine(int water, int milk, int coffeeBeans, int disposableCups, int money) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.disposableCups = disposableCups;
        this.money = money;
    }

    void canMakeCoffee(Coffee coffee) {
        if (coffee.water <= this.water && coffee.milk <= this.milk && coffee.coffeeBeans < this.coffeeBeans && this.disposableCups != 0) {
            System.out.println("I have enough resources, making you a coffee!");
            this.water -= coffee.water;
            this.milk -= coffee.milk;
            this.coffeeBeans -= coffee.coffeeBeans;
            this.disposableCups -= 1;
            this.money += coffee.costs;
        } else {
            if (this.water < coffee.water) {
                System.out.println("Sorry, not enough water");
            } else if (this.milk < coffee.milk) {
                System.out.println("Sorry, not enough milk");
            } else if (this.coffeeBeans < coffeeBeans) {
                System.out.println("Sorry, not enough coffee beans");
            } else {
                System.out.println("Sorry, not enough disposable cups");
            }
        }
    }

    public void fill() {
        System.out.println("Write how many ml of water do you want to add:");
        this.water += sc.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        this.milk += sc.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        this.coffeeBeans += sc.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        this.disposableCups += sc.nextInt();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("The coffee machine has:\n");
        sb.append(this.water + " of water\n");
        sb.append(this.milk + " of milk\n");
        sb.append(this.coffeeBeans + " of coffee beans\n");
        sb.append(this.disposableCups + " of disposable cups\n");
        sb.append("$" + this.money + " of money\n");
        return sb.toString();
    }

    public void giveAllMoney() {
        System.out.println("I gave you $" + this.money);
        this.money = 0;
    }
}
