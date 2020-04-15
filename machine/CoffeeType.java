package machine;

public enum CoffeeType {
    Espresso {
        @Override
        public Coffee makeCoffee() {
            return new Espresso();
        }
    },
    Latte {
        @Override
        public Coffee makeCoffee() {
            return new Latte();
        }
    },
    Cappuccino {
        @Override
        public Coffee makeCoffee() {
            return new Cappuccino();
        }
    };

    private final int value;

    CoffeeType() {
        this.value = ordinal();
    }

    public abstract Coffee makeCoffee();
}
