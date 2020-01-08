package com.example.mymap.Remote;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface IGoogleApi {
    @GET
    Call<String>getDatafromgoogleApi(@Url String url);
}
