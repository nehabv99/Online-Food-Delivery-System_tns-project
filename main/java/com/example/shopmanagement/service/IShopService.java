package com.example.shopmanagement.service;

import com.example.shopmanagement.entity.Shop;
import com.example.shopmanagement.entity.ShopOwner;
import java.util.List;

public interface IShopService {

    Shop addShop(Shop shop);
    Shop updateShop(Shop shop);
    Shop searchShopById(Long id);
    boolean deleteShop(Long id);

    ShopOwner addShopOwner(ShopOwner owner);
    ShopOwner updateShopOwner(ShopOwner owner);
    ShopOwner searchShopOwner(Long id);
    boolean deleteShopOwner(Long id);

    List<Shop> getAllShops();
}