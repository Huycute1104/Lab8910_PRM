package com.example.lab_8910.Lab10.API.Service;



import com.example.lab_8910.Lab10.API.Model.Trainee;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface TraineeService {
    String TRAINEE = "Trainee";
    @GET(TRAINEE)
    Call<List<Trainee>> getAllTrainees();

    @GET(TRAINEE + "/{id}")
    Call<Trainee> getTraineeById(@Path("id") Object id);

    @POST(TRAINEE)
    Call<Trainee> createTrainee(@Body Trainee trainee);

    @PUT(TRAINEE + "/{id}")
    Call<Trainee> updateTrainee(@Path("id") Object id, @Body Trainee trainee);

    @DELETE(TRAINEE + "/{id}")
    Call<Trainee> deleteTrainee(@Path("id") Object id);
}
