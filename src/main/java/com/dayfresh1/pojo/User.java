package com.dayfresh1.pojo;

public class User {
    private Integer id;

    private String username;

    private String password;

    private String email;

    private String address;

    private Integer receiveid;

    private String telephone;

    private Integer roleid;

    private String isclock;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getReceiveid() {
        return receiveid;
    }

    public void setReceiveid(Integer receiveid) {
        this.receiveid = receiveid;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getIsclock() {
        return isclock;
    }

    public void setIsclock(String isclock) {
        this.isclock = isclock == null ? null : isclock.trim();
    }

    public User(String username, String password, String email, String address, Integer receiveid, String telephone, Integer roleid, String isclock) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.address = address;
        this.receiveid = receiveid;
        this.telephone = telephone;
        this.roleid = roleid;
        this.isclock = isclock;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", receiveid=" + receiveid +
                ", telephone='" + telephone + '\'' +
                ", roleid=" + roleid +
                ", isclock='" + isclock + '\'' +
                '}';
    }
}