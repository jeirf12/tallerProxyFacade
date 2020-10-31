package co.unicauca.tallerfacade.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *  Un objeto de una orden 
 * @author Jhonfer
 * @author Jhonny
 */
public class Order {
    public int despatch;
    private Customer customer;
    private LocalDate date;
    private State state;
    private List<Item> details;
    
    public Order(Customer customer) {
        this.despatch = 1500;
        this.customer = customer;
        this.details = new ArrayList<>();
    }

    public Order() {
        this.despatch = 1500;
        this.customer = new Customer();
        this.details = new ArrayList<>();
    }

    public int getDespatch() {
        return despatch;
    }

    public void setDespatch(int despatch) {
        this.despatch = despatch;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public List<Item> getDetails() {
        return details;
    }

    public void setDetails(Item it) {
        this.details.add(it);
    }
    /**
     * Añade platos a la orden
     * @param dish
     * @param amount 
     */
    public void addDish(Dish dish, int amount){
        this.details.add(new Item(dish, amount));
    }
    /**
     * Calcula el total que vale la orden
     * @return 
     */
    public int calculateTotal(){
        int total = 0;
        for (Item details : this.details) {
            total += details.getDish().getPrice()*details.getAmount();
        }
        return total+despatch;
    }
}
