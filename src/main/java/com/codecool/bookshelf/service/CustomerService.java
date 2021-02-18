package com.codecool.bookshelf.service;

import com.codecool.bookshelf.dao.CustomerDAO;
import com.codecool.bookshelf.model.feedback.Opinion;
import com.codecool.bookshelf.model.user.Customer;

import java.util.Optional;


public class CustomerService {

    private CustomerDAO customerDAO;

    public CustomerService(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    };

    public void newCustomer(Customer customer) {
        customerDAO.addCustomer(customer);
    }

    public void addOpinionToCustomer(long customerId, long bookId, String opinion) {
        Customer customer = customerDAO.findById(customerId);
        Optional<Opinion> oldOpinion = customerDAO.findOpinionOfBook(customerId, bookId);
        if (oldOpinion.isPresent()){
            oldOpinion.get().setValue(opinion);
            customer.addOpinion(oldOpinion.get());
        } else {
            Opinion newOpinion = new Opinion(bookId, customerId, 1, opinion);
            customer.addOpinion(newOpinion);
        }
        customerDAO.updateCustomer(customer);
    }
}
