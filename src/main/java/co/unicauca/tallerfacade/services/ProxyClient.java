package co.unicauca.tallerfacade.services;

/**
 *
 * @author Jhonfer
 * @author Jhonny
 */
public class ProxyClient{
    public IOrderService orderService;

    public ProxyClient(IOrderService orderService) {
        this.orderService = orderService;
    }

    public IOrderService getOrderService() {
        return orderService;
    }

    public void setOrderService(IOrderService orderService) {
        this.orderService = orderService;
    }
    
    public void createOrder(){
        IOrderRepository repo = Factory.getInstance().getRepositorio("default");
        orderService.save(repo);
    }

}
