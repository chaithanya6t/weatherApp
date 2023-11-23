package com.muhsanapps.weatherapp.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 12\u00020\u0001:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0016J\u0006\u0010\u001a\u001a\u00020\u0014J\u0006\u0010\u001b\u001a\u00020\u0014J\u0006\u0010\u001c\u001a\u00020\u0012J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eJ\u0012\u0010 \u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J-\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%2\u000e\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\'2\u0006\u0010(\u001a\u00020)H\u0016\u00a2\u0006\u0002\u0010*J\u0006\u0010+\u001a\u00020\u0014J\u0010\u0010,\u001a\u00020\u00142\b\u0010-\u001a\u0004\u0018\u00010.J\u000e\u0010/\u001a\u00020\u00142\u0006\u00100\u001a\u00020%R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u00062"}, d2 = {"Lcom/muhsanapps/weatherapp/view/WeatherScreen;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/muhsanapps/weatherapp/databinding/ActivityWeatherScreenBinding;", "getBinding", "()Lcom/muhsanapps/weatherapp/databinding/ActivityWeatherScreenBinding;", "setBinding", "(Lcom/muhsanapps/weatherapp/databinding/ActivityWeatherScreenBinding;)V", "fusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "viewmodel", "Lcom/muhsanapps/weatherapp/viewmodel/WeatherScreenViewModel;", "getViewmodel", "()Lcom/muhsanapps/weatherapp/viewmodel/WeatherScreenViewModel;", "setViewmodel", "(Lcom/muhsanapps/weatherapp/viewmodel/WeatherScreenViewModel;)V", "checkPermission", "", "fetchCurrentLocationWeather", "", "latitude", "", "longitude", "getCityWeather", "cityName", "getCurrentLocation", "initObserbles", "isLocation", "kelvinToCelsius", "", "temp", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "requestPermission", "setData", "body", "Lcom/muhsanapps/weatherapp/Models/ModelClass;", "setImage", "id", "Companion", "app_debug"})
public final class WeatherScreen extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull
    public static final com.muhsanapps.weatherapp.view.WeatherScreen.Companion Companion = null;
    private static final int PERMISSION_REQUEST_ACCESS_LOCATION = 100;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String API_KEY = "4e2d2d137d34778b5b616949c2704a9b";
    @org.jetbrains.annotations.Nullable
    private com.muhsanapps.weatherapp.databinding.ActivityWeatherScreenBinding binding;
    @org.jetbrains.annotations.Nullable
    private com.muhsanapps.weatherapp.viewmodel.WeatherScreenViewModel viewmodel;
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient;
    
    public WeatherScreen() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.muhsanapps.weatherapp.databinding.ActivityWeatherScreenBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable
    com.muhsanapps.weatherapp.databinding.ActivityWeatherScreenBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.muhsanapps.weatherapp.viewmodel.WeatherScreenViewModel getViewmodel() {
        return null;
    }
    
    public final void setViewmodel(@org.jetbrains.annotations.Nullable
    com.muhsanapps.weatherapp.viewmodel.WeatherScreenViewModel p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public final void initObserbles() {
    }
    
    public final void getCurrentLocation() {
    }
    
    public final boolean checkPermission() {
        return false;
    }
    
    public final boolean isLocation() {
        return false;
    }
    
    public final void requestPermission() {
    }
    
    public final void fetchCurrentLocationWeather(@org.jetbrains.annotations.NotNull
    java.lang.String latitude, @org.jetbrains.annotations.NotNull
    java.lang.String longitude) {
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable
    com.muhsanapps.weatherapp.Models.ModelClass body) {
    }
    
    public final void setImage(int id) {
    }
    
    public final void getCityWeather(@org.jetbrains.annotations.NotNull
    java.lang.String cityName) {
    }
    
    public final double kelvinToCelsius(double temp) {
        return 0.0;
    }
    
    @java.lang.Override
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/muhsanapps/weatherapp/view/WeatherScreen$Companion;", "", "()V", "API_KEY", "", "PERMISSION_REQUEST_ACCESS_LOCATION", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}