package bg.softuni.bikes_shop.model.entity;

import jakarta.persistence.*;


import java.util.Set;

@Entity
@Table(name="users")
public class UserEntity extends BaseEntity{
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="address")
    private String Address;
    @Column(name="password")
    private String password;
    @Column(name="eMail")
    private String eMail;
    @OneToMany(mappedBy = "buyer")
    private Set<OrderEntity> orders;
    @Column(name="is_logged")
   private Boolean isLogged;
    @ManyToMany
   private Set<UserRoleEntity>roles;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public Set<OrderEntity> getOrders() {
        return orders;
    }

    public void setOrders(Set<OrderEntity> orders) {
        this.orders = orders;
    }

    public Boolean getLoggedIn() {
        return isLogged;
    }

    public void setLoggedIn(Boolean loggedIn) {
        isLogged = loggedIn;
    }


}
