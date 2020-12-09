package archandpattern.shedule.domain;

public class Client {
    private Long id;
    private String name;
    private String password;
    private String phone;
    private String typeOfClient; //Human or Animal

    public Client(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setTypeOfClient(String typeOfClient) {
        this.typeOfClient = typeOfClient;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTypeOfClient() { return typeOfClient; }

    public String getPhone() {
        return phone;
    }

    public String getPassword() { return password; }
}