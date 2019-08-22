package com.example.jpa_one_to_one_relationship.OneToOne.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "free_pages")
public class FreePage implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(max = 100)
    @Column(unique = true)
    private String projectName;
    
    @NotNull
    @Column(unique = true)
    private String url;
    
    @OneToOne(
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(name = "user_id", nullable = false)
    @JsonIgnore
    private User user;
    
    // CONSTRUCTORS

    public FreePage() { }

    public FreePage(String projectName, String url) {
        this.projectName = projectName;
        this.url = url;
    }
    
    // GETTERS AND SETTERS

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getProjectName() {return projectName;}
    public void setProjectName(String projectName) {this.projectName = projectName;}

    public String getUrl() {return url;}
    public void setUrl(String url) {this.url = url;}

    public User getUser() {return user;}
    public void setUser(User user) {this.user = user;}
    
}
