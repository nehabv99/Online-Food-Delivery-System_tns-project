package com.example.shopmanagement.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class ShopOwner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private LocalDate dob;
    private String address;

    @ManyToOne
    @JoinColumn(name = "shop_id")
    private Shop shop;

    public ShopOwner() {}

    public ShopOwner(String name, LocalDate dob, String address, Shop shop) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.shop = shop;
    }

    public Long getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public LocalDate getDob() { return dob; }
    public void setDob(LocalDate dob) { this.dob = dob; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public Shop getShop() { return shop; }
    public void setShop(Shop shop) { this.shop = shop; }
}