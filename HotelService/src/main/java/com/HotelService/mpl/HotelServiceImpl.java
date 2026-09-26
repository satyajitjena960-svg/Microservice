package com.HotelService.mpl;

import com.HotelService.entity.Hotel;
import com.HotelService.repository.HotelRepo;
import com.HotelService.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelRepo hr;
    @Override
    public List<Hotel> getAllHotel() {
        return hr.findAll();
    }

    @Override
    public Hotel getOneHotel(String id) {
        return hr.findById(id).get();
    }

    @Override
    public Hotel createHotel(Hotel h1) {
        return hr.save(h1);
    }
}
