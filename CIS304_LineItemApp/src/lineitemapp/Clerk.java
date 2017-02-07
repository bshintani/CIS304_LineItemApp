package lineitemapp;

/**
 * Created by bryanshintani on 2/6/17.
 */
public class Clerk extends Person{

    private String clerkID;

    public Clerk(String firstName, String lastName, String clerkID) {
        super(firstName, lastName);
        this.clerkID = clerkID;
    }

    public String getClerkID() {
        return clerkID;
    }

    public void setClerkID(String clerkID) {
        this.clerkID = clerkID;
    }
}
