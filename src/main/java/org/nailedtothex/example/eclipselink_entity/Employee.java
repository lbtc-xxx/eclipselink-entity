package org.nailedtothex.example.eclipselink_entity;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER) // default
    @JoinColumn(nullable = false)
    private Dept dept;
    private String firstName;
    private String lastName;
    @OneToOne(mappedBy = "employee", fetch = FetchType.LAZY) // overridden by LAZY
    private Phone phone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

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
}
