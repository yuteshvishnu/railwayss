package com.railway.bookings.railwaybookings.model;


import java.util.concurrent.ThreadLocalRandom;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString


@Document(collection = "bookings")
public class Booking {
    
    @Id
    private int booking_id=ThreadLocalRandom.current().nextInt(1000, 2000);
    private String user_name;
    private int train_number;
    private String train_name;
    private int pnr=ThreadLocalRandom.current().nextInt(100000000,150000000);
    private String passenger_name;
    private int age;
    private long phone_number;
    private int fare;
}