package com.codeup.adlister.models;

import org.mindrot.jbcrypt.BCrypt;

public class User {
    private long id;
    private String username;
    private String email;
    private String password;

    public User() {}

    //Create
    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.setPassword(password);
    }

    //Read
    public User(long id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = BCrypt.hashpw(password, BCrypt.gensalt());;
    }
}
