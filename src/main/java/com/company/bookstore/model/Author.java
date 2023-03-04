package com.company.bookstore.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="author")
public class Author {

    @Id
    @Column(name = "author_id")
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer author_id;

    @NotNull
    private String first_name;

    @NotNull
    private String last_name;

    @NotNull
    private String street;

    @NotNull
    private String city;

    @NotNull
    private String state;

    @NotNull
    private String postal_code;

    @NotNull
    private String phone;

    @NotNull
    private String email;

    public Author() {
    }

    public Author(Integer author_id, String first_name, String last_name, String street, String city, String state, String postal_code, String phone, String email) {
        this.author_id = author_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.postal_code = postal_code;
        this.phone = phone;
        this.email = email;
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return getAuthor_id().equals(author.getAuthor_id()) && getFirst_name().equals(author.getFirst_name()) && getLast_name().equals(author.getLast_name()) && getStreet().equals(author.getStreet()) && getCity().equals(author.getCity()) && getState().equals(author.getState()) && getPostal_code().equals(author.getPostal_code()) && getPhone().equals(author.getPhone()) && getEmail().equals(author.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAuthor_id(), getFirst_name(), getLast_name(), getStreet(), getCity(), getState(), getPostal_code(), getPhone(), getEmail());
    }
}

//    create table if not exists author (
//        author_id int not null auto_increment primary key,
//        first_name varchar(50) not null,
//        last_name varchar(50) not null,
//        street varchar(50) not null,
//        city varchar(50) not null,
//        state char(2) not null,
//        postal_code varchar(25) not null,
//        phone varchar(15) not null,
//        email varchar(60) not null
//        );