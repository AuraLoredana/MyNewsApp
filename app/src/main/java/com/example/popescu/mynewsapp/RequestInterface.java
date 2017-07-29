package com.example.popescu.mynewsapp;

/**
 * Created by POPESCU on 7/24/2017.
 */

import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {

    @GET("android/jsonandroid")
    Call<JSONResponse> getJSON();
}