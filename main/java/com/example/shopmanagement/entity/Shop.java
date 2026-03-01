package com.example.shopmanagement.entity;

import jakarta.persistence.*;

@Entity
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    private int shopId;
    private String shopCategory;
    private String shopName;
    private String customers;
    private String shopStatus;
    private String leaseStatus;

    public Shop() {}

    public Shop(int shopId, String shopCategory, String shopName,
                String customers, String shopStatus, String leaseStatus) {
        this.shopId = shopId;
        this.shopCategory = shopCategory;
        this.shopName = shopName;
        this.customers = customers;
        this.shopStatus = shopStatus;
        this.leaseStatus = leaseStatus;
    }

    // Getters and Setters
    public Long getId() { return id; }

    public int getShopId() { return shopId; }
    public void setShopId(int shopId) { this.shopId = shopId; }

    public String getShopCategory() { return shopCategory; }
    public void setShopCategory(String shopCategory) { this.shopCategory = shopCategory; }

    public String getShopName() { return shopName; }
    public void setShopName(String shopName) { this.shopName = shopName; }

    public String getCustomers() { return customers; }
    public void setCustomers(String customers) { this.customers = customers; }

    public String getShopStatus() { return shopStatus; }
    public void setShopStatus(String shopStatus) { this.shopStatus = shopStatus; }

    public String getLeaseStatus() { return leaseStatus; }
    public void setLeaseStatus(String leaseStatus) { this.leaseStatus = leaseStatus; }
    
    public void setId(Long id) {
        this.id = id;
    }
}