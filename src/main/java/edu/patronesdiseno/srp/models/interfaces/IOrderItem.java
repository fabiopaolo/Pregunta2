package edu.patronesdiseno.srp.models.interfaces;

import edu.patronesdiseno.srp.models.*;

public interface IOrderItem {
    //Descomente Order order parta el problema 2
    //Order order = null;


    //Product product = null;
    String idProduct = null;
    Integer quantity = null;
    Double price = null;


    //Prob 2 para ver lo de la orden
    public void executeAction();
    void next(Order order);
    void printStatus();
    //----------------
    
    public Double calculatePrice();

    public Order getOrder();

    public void setOrder(Order order);

    //public Product getProduct();

    public String getIdProduct();

    public Integer getQuantity();

    //public void setQuantity();

    public Double getPrice();

}