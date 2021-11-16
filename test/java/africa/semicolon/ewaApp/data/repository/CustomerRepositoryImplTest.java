package africa.semicolon.ewaApp.data.repository;

import africa.semicolon.ewaApp.data.models.Customer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerRepositoryImplTest {
    CustomerRepository customerRepository;


    @BeforeEach
    void setUp() {
        customerRepository = new CustomerRepositoryImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void save() {
        Customer customer = new Customer();
        customer.setEmailAddress("Mavic@gmail.com");
        customer.setFirstName("Muqtar");
        customer.setLastName("Adetunji");
        customer.setPassword("muqtar12345");
        Customer savedCustomer = customerRepository.save(customer);
        assertEquals(customer, savedCustomer);
    }


    private Customer savedCustomerHelper() {
        Customer customer = new Customer();
        customer.setEmailAddress("Mavic@gmail.com");
        customer.setFirstName("Muqtar");
        customer.setLastName("Adetunji");
        customer.setPassword("muqtar12345");
        Customer savedCustomer = customerRepository.save(customer);

        return customer;
    }






    @Test
    void delete() {
//        Customer customer1 = new Customer();
//        customer1.setEmailAddress("Mavic@gmail.com");
//        customer1.setFirstName("Muqtar");
//        customer1.setLastName("Adetunji");
//        customer1.setPassword("muqtar12345");
//        //Customer savedCustomer = customerRepository.save(customer1);
//        customerRepository.save(customer1);
//        customerRepository.delete(customer1);
//        assertEquals(0, customerRepository.findAll().size());
//
        Customer customer = savedCustomerHelper();
       // Customer savedCustomerHelper = new Customer();
        customerRepository.delete(customer);

        assertEquals(2, customerRepository.findAllCustomer().size());
    }




     @Test
    void testDelete() {
    }

    @Test
    void findAllCustomer() {
        Customer savedCustomer = new Customer();
        Customer newCustomer = new Customer();
        newCustomer.setFirstName("ahmed");
        newCustomer.setLastName("ajala");
        newCustomer.setEmailAddress("ahmed@gmail.com");
        newCustomer.setPassword("ajala12345");
        customerRepository.save(newCustomer);
        customerRepository.save(savedCustomer);

        assertEquals(2, customerRepository.findAllCustomer().size());
    }

    @Test
    void findCustomerByEmailTest(){

        Customer customer = savedCustomerHelper();
        Customer foundCustomer = customerRepository.findCustomerByEmail("Mavic@gmail.com");
        assertEquals(customer, foundCustomer);

    }
}