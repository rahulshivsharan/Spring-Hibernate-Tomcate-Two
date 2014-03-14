/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.dao.CustomerDao;
import com.entity.Customer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;



@Service("customerService")
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    @Qualifier("customerDao")
    private CustomerDao dao;
    
    @Override   
    public List<Customer> getCustomers() throws Exception {               
        return this.dao.getCustomers();
    }

    @Override    
    public List<Customer> saveCustomer(Customer customer) throws Exception {
        this.dao.saveCustomer(customer);        
        return this.dao.getCustomers();
    }

    @Override
    
    public List<Customer> updateCustomer(Customer customer) throws Exception {
        this.dao.updateCustomer(customer);
        return this.dao.getCustomers();
    }

    @Override    
    public Customer getCustomer(Integer customerId) throws Exception {
        return this.dao.getCustomer(customerId);
    }

    /**
     * @return the dao
     */
    public CustomerDao getDao() {
        return dao;
    }

    /**
     * @param dao the dao to set
     */
    public void setDao(CustomerDao dao) {
        this.dao = dao;
    }
    
}
