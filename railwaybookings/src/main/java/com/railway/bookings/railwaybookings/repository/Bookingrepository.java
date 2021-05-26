package com.railway.bookings.railwaybookings.repository;

import java.util.List;

import com.railway.bookings.railwaybookings.model.Booking;

public interface Bookingrepository {
    
    public void create(Booking booking);

    public void delete(Booking booking);

    public void update(Booking booking);

    public List<Booking> find(int user_id);

    public List<Booking> find(String name);

    public void deleteall();

    public List<Booking> findall();


    
}