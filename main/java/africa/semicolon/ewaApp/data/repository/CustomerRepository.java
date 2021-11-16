package africa.semicolon.ewaApp.data.repository;

import africa.semicolon.ewaApp.data.models.Customer;

import java.util.List;


public interface CustomerRepository {


     Customer save (Customer customer);
     Customer findCustomerByEmail(String email);
     void delete (String email);
     void delete (Customer customer );

     List<Customer> findAllCustomer();
}
