package codegym.model;

public class Employee {
    private  String id;
    private  String name;
    private  String contactnumber;

    public Employee() {

    }
    public Employee(String id, String name, String contactnumber) {
        this.id = id;
        this.name = name;
        this.contactnumber = contactnumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }
}
