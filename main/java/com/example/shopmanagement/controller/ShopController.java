package com.example.shopmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.shopmanagement.entity.Shop;
import com.example.shopmanagement.service.IShopService;

import java.util.List;

@RestController
@RequestMapping("/shops")
public class ShopController {

    @Autowired
    private IShopService shopService;

    @PostMapping
    public Shop addShop(@RequestBody Shop shop) {
        return shopService.addShop(shop);
    }

    @GetMapping("/{id}")
    public Shop getShop(@PathVariable Long id) {
        return shopService.searchShopById(id);
    }

    @GetMapping
    public List<Shop> getAllShops() {
        return shopService.getAllShops();
    }
    @PutMapping("/{id}")
    public Shop updateShop(@PathVariable Long id, @RequestBody Shop shop) {
        shop.setId(id);
        return shopService.updateShop(shop);
    }
    @putMapping
    public List<Shop> putAllShops() {
        return shopService.getAllShops();
    }
    @DeleteMapping("/{id}")
    public String deleteShop(@PathVariable Long id) {
        shopService.deleteShop(id);
        return "Shop deleted successfully";
        
     
    }
}