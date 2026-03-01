package com.example.shopmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.shopmanagement.entity.ShopOwner;

public interface IShopOwnerRepository extends JpaRepository<ShopOwner, Long> {

}