package com.kodilla.hibernate.invoice;

import org.jetbrains.annotations.NotNull;
import javax.persistence.*;

@Entity
@Table(name = "PRODUCT")
public final class Product {
    private int id;
    private String name;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
