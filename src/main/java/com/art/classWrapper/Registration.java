package com.art.classWrapper;

/**
 * Created by Artem on 25.02.2017.
 */
public class Registration {
    private String login;
    private String password;
    private String email;
    private String className;

    public Registration(String login, String password, String email, String className) {

        this.login = login;
        this.password = password;
        this.email = email;
        this.className = className;
    }

    public Registration() {

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
