package archandpattern.shedule.domain;

public class Client {
    private Long id;
    private String name;
    private String password;
    private String phone;

    public Client(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

     public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }
}