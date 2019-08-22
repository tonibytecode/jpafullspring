
package com.example.jpamanytoonerelationship.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "project_managers")
public class ProjectManager implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 2, max = 50)
    @Column(name = "first_name")
    private String firstName;
    
    @NotNull
    @Size(min = 2, max = 50)
    @Column(name = "last_name")
    private String lastName;
    
    // CONSTRUCTORS

    public ProjectManager() { }

    public ProjectManager(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    // GETTERS AND SETTERS

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    
}
