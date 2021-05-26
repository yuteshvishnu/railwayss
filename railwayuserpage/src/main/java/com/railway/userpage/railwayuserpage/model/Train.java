package com.railway.userpage.railwayuserpage.model;

import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection = "Train")
public class Train {
    
    @Id
    private int train_id=ThreadLocalRandom.current().nextInt(1000, 2000);
    private int train_number;
    private String train_name;
    private String source;
    private int arrival_time_hr;
    private int arrival_time_min;
    private Date start_date;
    private String destination;
    private int reaching_time_hr;
    private int reaching_time_min;
    private Date reach_date;
    private int fare;
}
