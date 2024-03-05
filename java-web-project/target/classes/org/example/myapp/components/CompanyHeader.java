package org.example.myapp.components;

import org.apache.tapestry5.annotations.Parameter;

public class CompanyHeader {

    @Parameter(required = true, defaultPrefix = "literal")
    private String companyName;

    @Parameter(required = true, defaultPrefix = "literal")
    private String companyAddress;

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }
}
