package com.jekoyu.restosmk.retrofit;

import com.jekoyu.restosmk.EmployeeModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiEndpoint {
    @GET("api/tb_employee")
    Call<ArrayList<EmployeeModel>> getEmployee();
}
