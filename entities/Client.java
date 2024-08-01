package entities;

import java.time.LocalDate;

public class Client {
    String name;
    String email;
    LocalDate birth;
    
    public Client(String name, String email, LocalDate birth) {
        this.name = name;
        this.email = email;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }


    public LocalDate getBirth() {
        return birth;
    }

    
}
