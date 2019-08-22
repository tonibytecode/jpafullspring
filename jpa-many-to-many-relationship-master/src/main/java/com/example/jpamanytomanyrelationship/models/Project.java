package com.example.jpamanytomanyrelationship.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "projects")
public class Project implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(max = 100)
    @Column(unique = true)
    private String name;
    
    @NotNull
    @Column(unique = true)
    private String url;
    
    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE}
    )
    @JoinTable(
            name = "developer_projects",
            joinColumns = { @JoinColumn(name = "project_id") },
            inverseJoinColumns = { @JoinColumn(name = "developer_id") }
    )
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Set<Developer> developers = new HashSet<>();
    
    // CONSTRUCTORS

    public Project() { }

    public Project(String name, String url) {
        this.name = name;
        this.url = url;
    }
    
    // GETTERS AND SETTERS

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getUrl() {return url;}
    public void setUrl(String url) {this.url = url;}

    public Set<Developer> getDevelopers() {return developers;}
    public void setDevelopers(Set<Developer> developers) {this.developers = developers;}
    
}
