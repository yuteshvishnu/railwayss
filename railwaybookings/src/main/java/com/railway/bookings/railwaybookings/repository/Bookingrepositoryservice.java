package com.railway.bookings.railwaybookings.repository;

import java.util.List;

import com.railway.bookings.railwaybookings.model.Booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Service("Bookingrepository")
public class Bookingrepositoryservice implements Bookingrepository{

    @Autowired
    MongoTemplate mongoTemplate;

    final String collection = "bookings";

    public void create(Booking booking){
        mongoTemplate.insert(booking);
    }

    public void update(Booking booking){
        mongoTemplate.save(booking);
    }

    public void delete(Booking booking){
        mongoTemplate.remove(booking);
    }

    public void deleteall(){
        mongoTemplate.remove(new Query(),collection);
    }

    public List<Booking> find(int user_id){
        Query q=new Query(Criteria.where("user_id").is(user_id));
        return mongoTemplate.find(q, Booking.class,collection);
    }

    public List<Booking> find(String name){
        Query q=new Query(Criteria.where("username").is(name));
        return mongoTemplate.find(q, Booking.class,collection);
    }

    public List<Booking> findall(){
        return (List<Booking>) mongoTemplate.findAll(Booking.class);
    }

    // public List<Domestic> find(String source,String dest){
    //     Query q=new Query(Criteria.where("source").is(source).and("dest").is(dest));
    //     return mongoTemplate.find(q, Domestic.class,collection2)
    // }
}