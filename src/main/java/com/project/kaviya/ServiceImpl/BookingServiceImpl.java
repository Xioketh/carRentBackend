package com.project.kaviya.ServiceImpl;


import com.project.kaviya.Service.BookingService;
import com.project.kaviya.Service.VehicalService;
import com.project.kaviya.model.Booking;
import com.project.kaviya.repositary.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingRepository bookingRepository;

    @Override
    public Booking addBooking(Booking booking) {
        return  bookingRepository.save(booking);
    }
}


