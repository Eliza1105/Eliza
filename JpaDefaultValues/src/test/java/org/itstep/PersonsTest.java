package org.itstep;

import itstep.Customer;
import itstep.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
@Transactional
public class PersonsTest {
    @Autowired
    private CustomerRepository customerRepository;
    @Test
    public void createCustomer(){
        Customer customer = new Customer();
        System.out.println(customer.toString());
        customer = customerRepository.save(customer);
        System.out.println(customer.toString());
        assertEquals(customer.getFirstName(),"John");
        assertFalse(customer.getPhoneNumber()!=null);
    }
}
