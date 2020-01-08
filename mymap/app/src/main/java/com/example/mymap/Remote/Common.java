package com.example.mymap.Remote;

public class Common {
    public static final String baseURL = "https://maps.googleapis.com/";
    public static IGoogleApi getGoogleApi(){
        return RetrofitClient.getClient(baseURL).create(IGoogleApi.class);
    }
}
