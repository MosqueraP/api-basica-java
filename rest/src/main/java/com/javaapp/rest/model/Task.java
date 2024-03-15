package com.javaapp.rest.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tasksCrud") // nombre para la tabla
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoincremental en uno 1,2,3,4,5
    private Long id;
    @Column
    private String title;
    @Column
    private String description;

    // constructor

    // getter
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    // setter
    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
