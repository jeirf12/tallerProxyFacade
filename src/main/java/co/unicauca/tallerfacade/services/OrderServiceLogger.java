package co.unicauca.tallerfacade.services;

import co.unicauca.tallerfacade.domain.OrderFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Jhonfer
 * @author Jhonny
 */
public class OrderServiceLogger implements IOrderService{
    private OrderFacade orderFacade;

    public OrderServiceLogger(OrderFacade orderFacade) {
        this.orderFacade = orderFacade;
    }

    public OrderFacade getOrderFacade() {
        return orderFacade;
    }

    public void setOrderFacade(OrderFacade orderFacade) {
        this.orderFacade = orderFacade;
    }
    
    @Override
    public void save(IOrderRepository repo) {
        Logger logger= LoggerFactory.getLogger(OrderServiceLogger.class);
        
        //se hace el log
        String message = "Pedido guardado en la base de datos";
        logger.info(message);
    }
}
