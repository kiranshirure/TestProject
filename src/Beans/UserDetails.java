package Beans;

import Utils.propertiesReader;

/**
 * Created by user on 14/06/17.
 */
public class UserDetails {


    private String Country2;
    private String firstName;
    private String lastName ;
    private String email ;
    private String password;
    private String mobileNo ;
    private String Country;
    private String Address1;
    private String Address2;




    private static UserDetails UserDetails= null;

    private UserDetails(){

        firstName = propertiesReader.getProperty("UserInfo", "firstName");
        lastName = propertiesReader.getProperty("UserInfo", "lastName");
        email = propertiesReader.getProperty("UserInfo", "email");
        mobileNo = propertiesReader.getProperty("UserInfo", "mobileNo");
        password =propertiesReader.getProperty("UserInfo", "password");
        Country = propertiesReader.getProperty("UserInfo", "country");
        Country2 = propertiesReader.getProperty("UserInfo", "country2");
        Address1 = propertiesReader.getProperty("UserInfo", "Address1");
        Address2 = propertiesReader.getProperty("UserInfo", "Address2");
    }


    public String getCountry() {
        return Country;
    }
    public void setCountry(String firstName) {
        this.Country = Country;
    }

    public String getCountry2() {
        return Country2;
    }
    public void setCountry2(String firstName) {
        this.Country = Country2;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName() {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress1() {
        return Address1;
    }
    public void setAddress1(String password) {
        this.Address1 = password;
    }

    public String getAddress2() {
        return Address2;
    }
    public void setAddress2(String Address2) {
        this.Address2 = Address2;
    }

    public static UserDetails getUserDetails() {
        if(UserDetails == null) {
            UserDetails = new UserDetails();
        }
        return UserDetails;
    }


}

