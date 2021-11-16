package africa.semicolon.ewaApp.services;

import africa.semicolon.ewaApp.requests.CustomerRegistrationRequest;
import africa.semicolon.ewaApp.response.CustomerRegistrationResponse;

public interface CustomerService {
    CustomerRegistrationResponse registerCustomer (CustomerRegistrationRequest customerRegisterRequest );
    CustomerRegistrationResponse logicCustomer (String emailAddress, String password);
;

}

