package com.pharmacy.customer.domain.entities;

import java.sql.Date;

public class Customer {
     private String id;
    private int idType;
    private String firstName;
    private String lastName;
    private short age;
    private Date birthDate;
    private Date registerDate;
    private int idCity;
    private String district;

    public Customer() {}
    public Customer(String id, int idType, String firstName, String lastName, short age, String birthDate) {}

    public final void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public final void setIdType(int idType) {
        this.idType = idType;
    }

    public int getIdType() {
        return this.idType;
    }

    public final void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public final void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public final void setAge(short age) {
        this.age = age;
    }

    public short getAge() {
        return this.age;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    public final void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public final Date getRegisterDate() {
        return this.registerDate;
    }

    public final void setIdCity(int idCity) {
        this.idCity = idCity;
    }

    public int getIdCity() {
        return this.idCity;
    }

    public final void setDistrict(String district) {
        this.district = district;
    }

    public String getDistrict() {
        return this.district;
    }
}
