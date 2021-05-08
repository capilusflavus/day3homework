package com.company;

public class User {
    int userId;
    String name;
    String surname;
    String mail;
    String password;
    boolean isMailAccept;
    boolean isPrivacyPolicy;

    public User() {
    }

    public User(int userId, String name, String surname, String mail, String password, boolean isMailAccept, boolean isPrivacyPolicy) {
        this.userId = userId;
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.password = password;
        this.isMailAccept = isMailAccept;
        this.isPrivacyPolicy = isPrivacyPolicy;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isMailAccept() {
        return isMailAccept;
    }

    public void setMailAccept(boolean mailAccept) {
        isMailAccept = mailAccept;
    }

    public boolean isPrivacyPolicy() {
        return isPrivacyPolicy;
    }

    public void setPrivacyPolicy(boolean privacyPolicy) {
        isPrivacyPolicy = privacyPolicy;
    }

}
