package com.example.CrudExample.Entily;



import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table(name="Raj")
public class Prasanna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private int salary;
     @Email(message = "Email cannot this format")


    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Prasanna(int id, String name, int salary,String email) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.email=email;
    }

    public Prasanna() {
    }
}
