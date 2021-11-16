package africa.semicolon.ewaApp.requests;

import lombok.Data;

@Data
public class CustomerRegistrationRequest {
    private String emailAddress;
    private String fistName;
    private String lastName;
    private String password;
}
