package africa.semicolon.ewaApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import africa.semicolon.ewaApp.requests.CustomerRegistrationRequest;
import africa.semicolon.ewaApp.response.CustomerRegistrationResponse;
import africa.semicolon.ewaApp.services.CustomerService;
import africa.semicolon.ewaApp.services.CustomerServiceImpl;


@RestController
public class CustomerController {
    CustomerService customerService = new CustomerServiceImpl();

    @PostMapping("api/addCustomer")
    public CustomerRegistrationResponse registerCustomer(CustomerRegistrationRequest customerRegistrationRequest){
        return customerService.registerCustomer(customerRegistrationRequest);
    }

    @GetMapping("api/customerLogin")
    public CustomerRegistrationResponse loginCustomer (String email, String password){
        return customerService.logicCustomer(email, password);
    }


}

