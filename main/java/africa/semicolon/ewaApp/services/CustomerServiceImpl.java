package africa.semicolon.ewaApp.services;

import africa.semicolon.ewaApp.data.models.Customer;
import africa.semicolon.ewaApp.data.repository.CustomerRepository;
import africa.semicolon.ewaApp.data.repository.CustomerRepositoryImpl;
import africa.semicolon.ewaApp.requests.CustomerRegistrationRequest;
import africa.semicolon.ewaApp.response.CustomerRegistrationResponse;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository = new CustomerRepositoryImpl();

    @Override
    public CustomerRegistrationResponse registerCustomer(CustomerRegistrationRequest customerRegisterRequest) {

        Customer customer = new Customer();
        customer.setFirstName(customerRegisterRequest.getFistName());
        customer.setLastName(customerRegisterRequest.getLastName());
        customer.setEmailAddress(customerRegisterRequest.getEmailAddress());
        customer.setPassword(customerRegisterRequest.getPassword());


        Customer savedCustomer = customerRepository.save(customer);

        CustomerRegistrationResponse response = new CustomerRegistrationResponse();
        response.setEmailAddress(savedCustomer.getEmailAddress());
        response.setFirstName(savedCustomer.getFirstName());
        response.setLastName(savedCustomer.getLastName());

        return response;

    }

    @Override
    public CustomerRegistrationResponse logicCustomer(String emailAddress, String password) {
        CustomerRegistrationResponse response = new CustomerRegistrationResponse();
        List<Customer> customers = customerRepository.findAllCustomer();

        for (Customer customer : customers) {
            if (customer.getPassword() == password && customer.getEmailAddress() == emailAddress) {
                response.setLastName(customer.getLastName());
                response.setFirstName(customer.getFirstName());
                response.setEmailAddress(customer.getEmailAddress());}
            return response;
        }


            return null;
}

        }

