package lineitemapp;

/**
 * Created by bryanshintani on 2/6/17.
 */
public class Customer extends Person{

    private String phone;

    public Customer(String firstName, String lastName, String phone) {
        super(firstName, lastName);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
