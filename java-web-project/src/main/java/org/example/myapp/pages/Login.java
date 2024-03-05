
package org.example.myapp.pages;



import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.corelib.components.TextField;
import org.apache.tapestry5.annotations.Property;

import org.apache.tapestry5.annotations.Component;



public class Login {

@InjectPage
private EmployeeDetails employeeDetails;

@Component
private Form form;

@Component(id = "username")
private TextField usernameField;

@Component(id = "password")
private TextField passwordField;

private static final String VALID_USERNAME = "admin";
private static final String VALID_PASSWORD = "password";

@Property
private String username;

@Property
private String password;


@Property
private String errorMessage;




@InjectPage
private EmployeeDetails employeedetails;

void onValidateFromForm() {
if (!isValidLogin(username, password)) {
    errorMessage = "Invalid username or password.";
    form.recordError("Invalid login.");
}
}

private boolean isValidLogin(String username, String password) {
return VALID_USERNAME.equals(username) && VALID_PASSWORD.equals(password);
}

Object onSuccess() {
return employeedetails;
}
}