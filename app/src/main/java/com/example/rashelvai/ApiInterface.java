package com.example.rashelvai;


import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;

public interface ApiInterface {

    @Multipart
    @POST("predict")
    Call<Response> sendData(
            //@Header("Authorization") String authorization,
            @Part MultipartBody.Part file
    );



}









