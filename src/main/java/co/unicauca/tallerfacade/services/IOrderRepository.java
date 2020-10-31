package co.unicauca.tallerfacade.services;

import co.unicauca.tallerfacade.domain.Order;


/**
 *
 * @author Jhonfer
 * @author Jhonny
 */
public interface IOrderRepository {
    /**
     * Crea la orden que va utilizar el proxy para acceder a la orden fachada
     *
     * @param order
     */
    public void createOrder(Order order);

}
