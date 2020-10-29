package co.unicauca.tallerfacade.domain;

import co.unicauca.tallerfacade.services.IOrderRepository;
import co.unicauca.tallerfacade.services.IOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
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
    
    public void createOrder(Customer customer){
        this.order=new Order(customer);
    }
    
    public void addDish(Dish dish, int amount){
        this.order.addDish(dish, amount);
    }
    
    public void changeState(State state){
        this.order.setState(state);
    }
    
    public void cancelOrder(){
        this.order.setState(State.CANCELLED);
    }
    
    public int calculateTotal(){
        return this.order.calculateTotal();
    }
    
    public int totalDishes(){
        int totalDishes =this.order.getDetails().size();
        
        return totalDishes;
    }
    
    @Override
    public void save(IOrderRepository repo) {
        Logger logger= LoggerFactory.getLogger(OrderFacade.class);
        repo.createOrder(this.getOrder());
        
        //se hace el log
        String message = "Pedido guardado en la base de datos";
        logger.info(message);
    }

}
