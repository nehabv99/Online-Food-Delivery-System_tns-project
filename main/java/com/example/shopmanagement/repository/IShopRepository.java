package com.example.shopmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.shopmanagement.entity.Shop;

public interface IShopRepository extends JpaRepository<Shop, Long> {

}