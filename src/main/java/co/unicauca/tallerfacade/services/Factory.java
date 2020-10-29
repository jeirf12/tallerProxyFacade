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
    public static Factory getInstance(){
        if(instance == null){
            instance = new Factory();
        }
        return instance;
    }
    
    public IOrderRepository getRepositorio(String type){
        IOrderRepository result = null;
        switch (type){
            case "default":
                result =(IOrderRepository)new OrderFacade();
                break;
        }
        return (IOrderRepository) result;
    }
}

