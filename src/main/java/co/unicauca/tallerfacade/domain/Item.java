package co.unicauca.tallerfacade.domain;

/**
 *
 * @author Jhonfer
 * @author Jhonny
 */
public class Item {
    private Dish dish;
    private int amount;

    public Item(Dish dish, int amount) {
        this.dish = dish;
        this.amount = amount;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
