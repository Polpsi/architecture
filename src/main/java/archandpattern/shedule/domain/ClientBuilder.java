package archandpattern.shedule.domain;

public class ClientBuilder {

    private final Client client;

    public ClientBuilder(String name) {
        client = new Client(name);
    }

    public ClientBuilder password(String pass) {
        client.setPassword(pass);
        return this;
    }

    public ClientBuilder phone(String phone) {
        client.setPhone(phone);
        return this;
    }

    public Client build() {
        return client;
    }
}

/*
Где-то в коде приложения:

Client client = (new ClientBuilder("Artemon"))
    .password("12345")
    .phone("1234567")
    .build();
 */