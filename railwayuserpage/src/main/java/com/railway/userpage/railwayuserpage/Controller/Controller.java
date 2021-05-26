package com.railway.userpage.railwayuserpage.Controller;

import java.util.List;
import java.util.Optional;

import com.railway.userpage.railwayuserpage.model.Train;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.railway.userpage.railwayuserpage.TrainRepository.TrainRepository;
//import TrainRepository.TrainRepository;


@CrossOrigin(origins="http://localhost:3000")
@RestController
public class Controller {
    
    @Autowired
    private TrainRepository trainRepository;

    
    @PostMapping("/addTrain")
    public String savetrain (@RequestBody Train train){
        trainRepository.save(train);
        return "Train saved"+ train.getTrain_id();
    }


    @GetMapping("/findTrains")
    public List<Train> gettrains(){
        return trainRepository.findAll();
    }
 
    @GetMapping("/findTrains/{id}")
    public Optional<Train> gettrain(@PathVariable int id){
        return trainRepository.findById(id);
    }

    @DeleteMapping("/cancelTrain/{id}")
    public String canceltrain(@PathVariable int id){
        trainRepository.deleteById(id);
        return "train is cancelled";
    }

}