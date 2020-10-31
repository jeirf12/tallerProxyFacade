package co.unicauca.tallerfacade.services;

import co.unicauca.tallerfacade.domain.OrderFacade;

/**
 *
 * @author Jhonfer
 * @author Jhonny
 */
public class Factory {
    private static Factory instance;
    
    private Factory(){
        
    }
    /**
     *  devuelve la instancia de la clase factory
     * @return 
     */
    public static Factory getInstance(){
        if(instance == null){
            instance = new Factory();
        }
        return instance;
    }
    /**
     * obtiene un objeto de la orden fachada
     * @param type
     * @return 
     */
    public IOrderRepository getRepositorio(String type){
        IOrderRepository result = null;
        switch (type){
            case "default":
                result = new OrderRepository();
                break;
        }
        return result;
    }
}

