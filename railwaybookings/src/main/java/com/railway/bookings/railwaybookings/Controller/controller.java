package com.railway.bookings.railwaybookings.Controller;

import java.util.List;

import com.railway.bookings.railwaybookings.model.Booking;
import com.railway.bookings.railwaybookings.repository.Bookingrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @Autowired
    private Bookingrepository bookingRepository;

    @PostMapping("/trainbooking")
    public String savebooking(@RequestBody Booking booking){
        bookingRepository.update(booking);
        return "Booking Succesful "+ booking.getBooking_id();
    }

    @GetMapping("/bookings/{username}")
    public List<Booking> showbookings(@PathVariable String username){
        return bookingRepository.find(username);
    }

    @GetMapping("/allbookings")
    public List<Booking> showallbookings(){
        return bookingRepository.findall();
    }

    @GetMapping("/cancelbooking")
    // @PreAuthorize("#username == authentication.principal.username")
    public String cancelbooking(@RequestBody Booking booking){
        bookingRepository.delete(booking);
        return "Booking Cancelled ";
    }
}