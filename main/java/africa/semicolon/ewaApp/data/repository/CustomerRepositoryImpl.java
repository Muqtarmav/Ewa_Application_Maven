package africa.semicolon.ewaApp.data.repository;

import africa.semicolon.ewaApp.data.models.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository{

  public static final List<Customer> customers = new ArrayList<>();
    @Override
    public Customer save(Customer customer) {
        customers.add(customer);
        return customer;
    }

  @Override
  public Customer findCustomerByEmail(String email) {
        for (Customer customer : customers){
            if ( customer.getEmailAddress() == email){
                return customer;
            }
        }
        return null;
  }

  @Override
    public void delete(String email) {
    Customer customer = findCustomerByEmail(email);
    delete(customer);

    }

    @Override
    public void delete(Customer customer) {
        customers.remove(customer);
    }

    @Override
    public List<Customer> findAllCustomer() {
        return customers;
    }
}
