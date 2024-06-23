package models;

public class DataModel {
   String name, email, password,first_name,last_name,company
           ,address,state ,city,zip,number, successful_process;

    public DataModel(String name, String email, String password,
                     String first_name, String last_name, String company,
                     String address, String state, String city,
                     String zip, String number, String successful_process) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.company = company;
        this.address = address;
        this.state = state;
        this.city = city;
        this.zip = zip;
        this.number = number;
        this.successful_process = successful_process;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    public String getNumber() {
        return number;
    }

    public String getSuccessful_process() {
        return successful_process;
    }
}
