package com.driver;

import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
@Data
@Repository
public class OrderRepository {

    HashMap<String, Order> orderHashMap = new HashMap<>();
    HashMap<String, DeliveryPartner> deliveryPartnerHashMap = new HashMap<>();

    public void addOrder(Order order){
        orderHashMap.put(order.getId(), order);
    }

    public Order getOrderById(String id){
        return orderHashMap.get(id);
    }
}
