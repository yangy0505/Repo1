package com.yangying.por.pojo;

import com.yangying.por.pojo.enumConstant.UserType;

import javax.persistence.*;

@Entity
@Table(name = "t_p_user")
public class SysUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PWD")
    private String password;

    @Column(name = "ROLE")
    @Enumerated
    private UserType role;

    @Column(name = "LOCATION_BELONGING")
    private String locationBelonging;

    @Column(name = "LOCATION")
    private String location;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getRole() {
        return role;
    }

    public void setRole(UserType role) {
        this.role = role;
    }

    public String getLocationBelonging() {
        return locationBelonging;
    }

    public void setLocationBelonging(String locationBelonging) {
        this.locationBelonging = locationBelonging;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
