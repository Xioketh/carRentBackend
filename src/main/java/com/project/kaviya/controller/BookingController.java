package com.project.kaviya.controller;


import com.project.kaviya.Service.BookingService;
import com.project.kaviya.ServiceImpl.BookingServiceImpl;
import com.project.kaviya.model.Booking;
import com.project.kaviya.model.Vehical;
import com.project.kaviya.repositary.VehicalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class BookingController {

    @Autowired
    private BookingService bookingService;


    @PostMapping("/addBooking")
    public Booking addBooking(@RequestBody Booking booking) {
        return bookingService.addBooking(booking);
    }

}
