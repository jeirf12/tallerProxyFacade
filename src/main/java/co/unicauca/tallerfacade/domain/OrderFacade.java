package co.unicauca.tallerfacade.domain;

import co.unicauca.tallerfacade.services.IOrderRepository;
import co.unicauca.tallerfacade.services.IOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *  Un objeto de una orden fachada
 * @author Jhonfer
 * @author Jhonny
 */
public class OrderFacade implements IOrderService{
    private Order order;
    
    public OrderFacade(){
        this.order=new Order();
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    /**
     * Crear la orden a un usuario
     * @param customer 
     */
    public void createOrder(Customer customer){
        this.order=new Order(customer);
    }
     /**
     * Añade platos a la orden por medio de un objeto de la clase orden
     * @param dish
     * @param amount 
     */
    public void addDish(Dish dish, int amount){
        this.order.addDish(dish, amount);
    }
    /**
     * Cambia el estado del pedido
     * @param state 
     */
    public void changeState(State state){
        this.order.setState(state);
    }
    /**
     * cancela la orden del pedido
     */
    public void cancelOrder(){
        this.order.setState(State.CANCELLED);
    }
    /**
     * Calcula el total que vale la orden al llamar desde la clase orden
     * @return 
     */
    public int calculateTotal(){
        return this.order.calculateTotal();
    }
    /**
     * Cuenta el total de platos pedidos
     * @return 
     */
    public int totalDishes(){
        int totalDishes =this.order.getDetails().size();
        
        return totalDishes;
    }
    /**
     * aqui se guarda el pedido ya sea dentro de un repositorio local de una lista
     * o una base de datos 
     * @param repo
     */
    @Override
    public void save(IOrderRepository repo) {
        repo.createOrder(this.order);
    }
}
