package com.example.shopmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.shopmanagement.entity.ShopOwner;
import com.example.shopmanagement.repository.IShopOwnerRepository;

@RestController
@RequestMapping("/shopowners")
public class ShopOwnerController {

    @Autowired
    private IShopOwnerRepository shopOwnerRepository;

    @PostMapping
    public ShopOwner addOwner(@RequestBody ShopOwner owner) {
        return shopOwnerRepository.save(owner);
    }

    @GetMapping
    public List<ShopOwner> getAllOwners() {
        return shopOwnerRepository.findAll();
    }
}