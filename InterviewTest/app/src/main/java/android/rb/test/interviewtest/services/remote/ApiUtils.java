package android.rb.test.interviewtest.services.remote;

import android.util.Log;

public class ApiUtils {

    private ApiUtils() {
    }

    public static final String BASE_URL = "https://api.thecatapi.com";

    public static APIService getAPIService() {
        return RetrofitClient.getClient(BASE_URL).create(APIService.class);

    }
}