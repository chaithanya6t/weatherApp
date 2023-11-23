package com.muhsanapps.weatherapp.Models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\nH\u00c6\u0003J\t\u0010 \u001a\u00020\fH\u00c6\u0003J\t\u0010!\u001a\u00020\u000eH\u00c6\u0003JK\u0010\"\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u00c6\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\fH\u00d6\u0001J\t\u0010\'\u001a\u00020\u000eH\u00d6\u0001R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006("}, d2 = {"Lcom/muhsanapps/weatherapp/Models/ModelClass;", "", "weather", "", "Lcom/muhsanapps/weatherapp/Models/Weather;", "main", "Lcom/muhsanapps/weatherapp/Models/Main;", "wind", "Lcom/muhsanapps/weatherapp/Models/Wind;", "sys", "Lcom/muhsanapps/weatherapp/Models/Sys;", "id", "", "name", "", "(Ljava/util/List;Lcom/muhsanapps/weatherapp/Models/Main;Lcom/muhsanapps/weatherapp/Models/Wind;Lcom/muhsanapps/weatherapp/Models/Sys;ILjava/lang/String;)V", "getId", "()I", "getMain", "()Lcom/muhsanapps/weatherapp/Models/Main;", "getName", "()Ljava/lang/String;", "getSys", "()Lcom/muhsanapps/weatherapp/Models/Sys;", "getWeather", "()Ljava/util/List;", "getWind", "()Lcom/muhsanapps/weatherapp/Models/Wind;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class ModelClass {
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "weather")
    private final java.util.List<com.muhsanapps.weatherapp.Models.Weather> weather = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "main")
    private final com.muhsanapps.weatherapp.Models.Main main = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "wind")
    private final com.muhsanapps.weatherapp.Models.Wind wind = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "sys")
    private final com.muhsanapps.weatherapp.Models.Sys sys = null;
    @com.google.gson.annotations.SerializedName(value = "id")
    private final int id = 0;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "name")
    private final java.lang.String name = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.muhsanapps.weatherapp.Models.ModelClass copy(@org.jetbrains.annotations.NotNull
    java.util.List<com.muhsanapps.weatherapp.Models.Weather> weather, @org.jetbrains.annotations.NotNull
    com.muhsanapps.weatherapp.Models.Main main, @org.jetbrains.annotations.NotNull
    com.muhsanapps.weatherapp.Models.Wind wind, @org.jetbrains.annotations.NotNull
    com.muhsanapps.weatherapp.Models.Sys sys, int id, @org.jetbrains.annotations.NotNull
    java.lang.String name) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public ModelClass(@org.jetbrains.annotations.NotNull
    java.util.List<com.muhsanapps.weatherapp.Models.Weather> weather, @org.jetbrains.annotations.NotNull
    com.muhsanapps.weatherapp.Models.Main main, @org.jetbrains.annotations.NotNull
    com.muhsanapps.weatherapp.Models.Wind wind, @org.jetbrains.annotations.NotNull
    com.muhsanapps.weatherapp.Models.Sys sys, int id, @org.jetbrains.annotations.NotNull
    java.lang.String name) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.muhsanapps.weatherapp.Models.Weather> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.muhsanapps.weatherapp.Models.Weather> getWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.muhsanapps.weatherapp.Models.Main component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.muhsanapps.weatherapp.Models.Main getMain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.muhsanapps.weatherapp.Models.Wind component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.muhsanapps.weatherapp.Models.Wind getWind() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.muhsanapps.weatherapp.Models.Sys component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.muhsanapps.weatherapp.Models.Sys getSys() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
}