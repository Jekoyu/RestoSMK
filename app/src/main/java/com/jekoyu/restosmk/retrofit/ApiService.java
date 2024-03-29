package com.jekoyu.restosmk.retrofit;

import com.google.gson.Gson;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiService {
    private static final String BASE_URL ="https://restoapi-hb4.conveyor.cloud/";
    private static Retrofit retrofit;
    public static ApiEndpoint apiEndpoint(){
        retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        return retrofit.create(ApiEndpoint.class);
    }
}
