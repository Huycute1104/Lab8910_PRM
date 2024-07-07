package com.example.lab_8910.Lab10.API.Repository;


import com.example.lab_8910.Lab10.API.Api.APIClient;
import com.example.lab_8910.Lab10.API.Service.TraineeService;

public class TraineeRepository {
    public static TraineeService getTraineeService() {
        return APIClient.getClient().create(TraineeService.class);
    }
}
