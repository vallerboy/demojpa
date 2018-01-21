package pl.oskarpolak.demojpa.models;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserModel {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;
        private String login;
        private String password;
        //@Column(name = "name")
        private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
