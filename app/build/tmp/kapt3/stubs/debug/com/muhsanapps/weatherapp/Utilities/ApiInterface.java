package com.muhsanapps.weatherapp.Utilities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'\u00a8\u0006\u000b"}, d2 = {"Lcom/muhsanapps/weatherapp/Utilities/ApiInterface;", "", "getCityWeatherData", "Lretrofit2/Call;", "Lcom/muhsanapps/weatherapp/Models/ModelClass;", "cityName", "", "api_Key", "getCurrentWeatherData", "latitude", "longitude", "app_debug"})
public abstract interface ApiInterface {
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "weather")
    public abstract retrofit2.Call<com.muhsanapps.weatherapp.Models.ModelClass> getCurrentWeatherData(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "lat")
    java.lang.String latitude, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "lon")
    java.lang.String longitude, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "AppId")
    java.lang.String api_Key);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "weather")
    public abstract retrofit2.Call<com.muhsanapps.weatherapp.Models.ModelClass> getCityWeatherData(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "q")
    java.lang.String cityName, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "AppId")
    java.lang.String api_Key);
}