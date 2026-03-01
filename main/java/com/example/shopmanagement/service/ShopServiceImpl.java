package com.example.shopmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shopmanagement.entity.Shop;
import com.example.shopmanagement.entity.ShopOwner;
import com.example.shopmanagement.repository.IShopRepository;
import com.example.shopmanagement.repository.IShopOwnerRepository;

import java.util.List;

@Service
public class ShopServiceImpl implements IShopService {

    @Autowired
    private IShopRepository shopRepository;

    @Autowired
    private IShopOwnerRepository ownerRepository;

    @Override
    public Shop addShop(Shop shop) {
        return shopRepository.save(shop);
    }

    @Override
    public Shop updateShop(Shop shop) {
        return shopRepository.save(shop);
    }

    @Override
    public Shop searchShopById(Long id) {
        return shopRepository.findById(id).orElse(null);
    }

    @Override
    public boolean deleteShop(Long id) {
        shopRepository.deleteById(id);
        return true;
    }

    @Override
    public ShopOwner addShopOwner(ShopOwner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public ShopOwner updateShopOwner(ShopOwner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public ShopOwner searchShopOwner(Long id) {
        return ownerRepository.findById(id).orElse(null);
    }

    @Override
    public boolean deleteShopOwner(Long id) {
        ownerRepository.deleteById(id);
        return true;
    }

    @Override
    public List<Shop> getAllShops() {
        return shopRepository.findAll();
    }
}