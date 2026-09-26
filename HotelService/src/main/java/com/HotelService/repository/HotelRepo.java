package com.HotelService.repository;

import com.HotelService.entity.Hotel;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepo extends JpaRepository<Hotel,String> {
}
