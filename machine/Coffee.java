package machine;

public abstract class Coffee {
    int water;
    int milk;
    int coffeeBeans;
    int costs;

    public Coffee(int water, int milk, int coffeeBeans, int costs) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.costs = costs;
    }

}
