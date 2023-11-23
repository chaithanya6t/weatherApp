package com.muhsanapps.weatherapp.Utilities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/muhsanapps/weatherapp/Utilities/ApiUtilities;", "", "()V", "BASE_URL", "", "getBASE_URL", "()Ljava/lang/String;", "setBASE_URL", "(Ljava/lang/String;)V", "retrofit", "Lretrofit2/Retrofit;", "getApiInterface", "Lcom/muhsanapps/weatherapp/Utilities/ApiInterface;", "app_debug"})
public final class ApiUtilities {
    @org.jetbrains.annotations.NotNull
    public static final com.muhsanapps.weatherapp.Utilities.ApiUtilities INSTANCE = null;
    private static retrofit2.Retrofit retrofit;
    @org.jetbrains.annotations.NotNull
    private static java.lang.String BASE_URL = "https://api.openweathermap.org/data/2.5/";
    
    private ApiUtilities() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBASE_URL() {
        return null;
    }
    
    public final void setBASE_URL(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.muhsanapps.weatherapp.Utilities.ApiInterface getApiInterface() {
        return null;
    }
}