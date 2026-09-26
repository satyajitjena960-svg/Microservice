package com.HotelService.service;

import com.HotelService.entity.Hotel;
import com.HotelService.repository.HotelRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HotelService {
    List<Hotel> getAllHotel();
    Hotel getOneHotel(String id);
    Hotel createHotel(Hotel h);
}
