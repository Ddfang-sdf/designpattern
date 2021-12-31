package com.sdf.mediator;

public class Application {
    public static void main(String[] args) {
        Madidator madidator = new Madidator();
        Customer customer = new Customer(madidator);
        Deliever deliever = new Deliever(madidator);
        Site site = new Site(madidator);
        madidator.setCustomer(customer);
        madidator.setDeliever(deliever);
        madidator.setSite(site);
        customer.requestOrder();
    }
}
