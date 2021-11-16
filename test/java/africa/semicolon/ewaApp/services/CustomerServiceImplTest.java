package africa.semicolon.ewaApp.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import africa.semicolon.ewaApp.requests.CustomerRegistrationRequest;
import africa.semicolon.ewaApp.response.CustomerRegistrationResponse;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceImplTest {
    CustomerService customerService;

    @BeforeEach
    void setUp() {
        customerService = new CustomerServiceImpl();
    }

    @Test
    void registerCustomer() {
        CustomerRegistrationRequest  customerRegistrationRequest = new CustomerRegistrationRequest();
        customerRegistrationRequest.setEmailAddress("mavic@gmail.com");
        customerRegistrationRequest.setFistName("Muqtar");
        customerRegistrationRequest.setLastName("Adetunji");
        customerRegistrationRequest.setPassword("Mav12325");

        CustomerRegistrationResponse response = customerService.registerCustomer(customerRegistrationRequest);

        assertEquals("M,uqtar", response.getFirstName());

    }

    @Test
    void logicCustomer() {
        CustomerRegistrationRequest  customerRegistrationRequest = new CustomerRegistrationRequest();
        customerRegistrationRequest.setEmailAddress("mavic@gmail.com");
        customerRegistrationRequest.setFistName("Muqtar");
        customerRegistrationRequest.setLastName("Adetunji");
        customerRegistrationRequest.setPassword("Mav12325");

        CustomerRegistrationResponse response = customerService.registerCustomer(customerRegistrationRequest);


    }
}