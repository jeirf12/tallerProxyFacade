/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.tallerfacade.services;

import co.unicauca.tallerfacade.domain.Order;

/**
 *
 * @author fallen
 */
public class OrderRepository implements IOrderRepository{
    /**
     * Crea la orden que va utilizar el proxy para acceder a la orden fachada
     * @param order 
     */
    @Override
    public void createOrder(Order order) {
        
    }
    
}
