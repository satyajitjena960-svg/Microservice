package com.HotelService.controller;

import com.HotelService.entity.Hotel;
import com.HotelService.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HotelController {
    @Autowired
    private HotelService hs;

    @GetMapping("/allHotels")
    public ResponseEntity<List<Hotel>> getAll(){
        List<Hotel> allHotel =hs.getAllHotel();
        return ResponseEntity.status(HttpStatus.OK).body(allHotel);
    }

    @GetMapping("/oneHotel/{id}")
    public ResponseEntity<Hotel> getOneHotel(@PathVariable String id){
        Hotel hotel=hs.getOneHotel(id);
        return ResponseEntity.status(HttpStatus.OK).body(hotel);
    }
    @PostMapping("/create")
    public ResponseEntity<Hotel> create(@RequestBody Hotel h){
        Hotel hotel=hs.createHotel(h);

        return ResponseEntity.status(HttpStatus.CREATED).body(hotel);
    }
}
