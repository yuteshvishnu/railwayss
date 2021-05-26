package com.railway.userpage.railwayuserpage.TrainRepository;

import com.railway.userpage.railwayuserpage.model.Train;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrainRepository extends MongoRepository <Train,Integer>{
    
}