package android.rb.test.interviewtest.repositories;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.rb.test.interviewtest.services.models.AllCatBreedsResponseModel;
import android.rb.test.interviewtest.services.remote.APIService;
import android.rb.test.interviewtest.services.remote.ApiUtils;
import android.util.Log;

import org.json.JSONObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FetchAllBreedsRepository {

    private APIService apiService;

    private static FetchAllBreedsRepository fetchAllBreedsRepository;

    public synchronized static FetchAllBreedsRepository getInstance(){
        if(fetchAllBreedsRepository == null){
            if(fetchAllBreedsRepository == null) {
                fetchAllBreedsRepository = new FetchAllBreedsRepository();
            }
        }
        return fetchAllBreedsRepository;
    }

    //Call Api

    public LiveData<List<AllCatBreedsResponseModel>> fetchAllCatBreedsRequest(){

        final MutableLiveData<List<AllCatBreedsResponseModel>> fetchAllCatBreedsData = new MutableLiveData<>();
        apiService = ApiUtils.getAPIService();
        Log.d("Response", "getAPIService: Api Call Started ");
        apiService.fetchAllCatBreeds().enqueue(new Callback<List<AllCatBreedsResponseModel>>() {
            @Override
            public void onResponse(Call<List<AllCatBreedsResponseModel>> call, Response<List<AllCatBreedsResponseModel>> response) {
                Log.d("Response", "getAPIService: Api call Response " + response);
                if(response.isSuccessful()){
                    fetchAllCatBreedsData.setValue(response.body());
                    Log.d("Response", "onResponse: " + response.message());
                    Log.d("Response", "onResponse: " + response.code());
                }
                else {
                    try {
                        JSONObject jObjError = new JSONObject(response.errorBody().string());
                        Log.d("Response", "onResponse: " + jObjError.getString("message"));
                        fetchAllCatBreedsData.setValue(response.body());
                    }catch (Exception e) {
                        Log.d("Response", "onResponse: " + e.getMessage());
                    }

                }
            }

            @Override
            public void onFailure(Call<List<AllCatBreedsResponseModel>> call, Throwable t) {

            }
        });

        return fetchAllCatBreedsData;

    }
}
