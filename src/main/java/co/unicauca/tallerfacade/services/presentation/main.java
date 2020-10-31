package co.unicauca.tallerfacade.services.presentation;

import co.unicauca.tallerfacade.domain.Customer;
import co.unicauca.tallerfacade.domain.Dish;
import co.unicauca.tallerfacade.domain.OrderFacade;
import co.unicauca.tallerfacade.domain.State;
import co.unicauca.tallerfacade.services.IOrderService;
import co.unicauca.tallerfacade.services.OrderServiceLogger;
import co.unicauca.tallerfacade.services.ProxyClient;

/**
 *
 * @author Jhonfer
 * @author Jhonny
 */
public class main {

    public static void main(String[] args) {
        //El sujeto real.
        OrderFacade orderFacade = new OrderFacade();
        //El objeto proxy. Se le pasa el objeto real por el constructor
        IOrderService orderProxy = new OrderServiceLogger(orderFacade);
        //Se opera normal el sujeto real
        orderFacade.createOrder(new Customer(1, "Carlos Sanchez"
                ,"Calle 12 No. 12-12 Barrio Caldas", "3115677899", "Popayán"));
        orderFacade.addDish(new Dish(1, "Hamburguesa vegetariana", 5000), 2);
        orderFacade.addDish(new Dish(2, "Hamburguesa sencilla", 4000), 3);
        orderFacade.addDish(new Dish(3, "Jugo hit", 1000), 2);
        System.out.println("Pedido creado");
        orderFacade.changeState(State.CONFIRMED);
        System.out.println("Se cambio el estado a " + orderFacade.getOrder().getState());
        orderFacade.changeState(State.DISPACHED);
        System.out.println("Se cambio el estado a " + orderFacade.getOrder().getState());
        orderFacade.changeState(State.FINALIZED);
        System.out.println("Se cambio el estado a " + orderFacade.getOrder().getState());
        System.out.println("El valor total del pedido es: " + orderFacade.calculateTotal());
        System.out.println("Total de platos pedidos: " + orderFacade.totalDishes());
        //Ahora ejecutamos el cliente proxy, y le pasamos el sujeto que debe utilizar.
        ProxyClient client = new ProxyClient(orderProxy);
        client.createOrder();
    }
}
