package android.rb.test.interviewtest.repositories;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.rb.test.interviewtest.services.models.AllCatBreedsResponseModel;
import android.rb.test.interviewtest.services.models.CatBreedDetailResponseModel;
import android.rb.test.interviewtest.services.remote.APIService;
import android.rb.test.interviewtest.services.remote.ApiUtils;
import android.util.Log;

import org.json.JSONObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FetchBreedDetailRepository {

    private APIService apiService;

    private static FetchBreedDetailRepository fetchBreedDetailRepository;

    public synchronized static FetchBreedDetailRepository getInstance(){
        if(fetchBreedDetailRepository == null){
            if(fetchBreedDetailRepository == null) {
                fetchBreedDetailRepository = new FetchBreedDetailRepository();
            }
        }
        return fetchBreedDetailRepository;
    }

    public LiveData<List<CatBreedDetailResponseModel>> fetchCatBreedDetailsRequest(String breedId){

        final MutableLiveData<List<CatBreedDetailResponseModel>> fetchAllCatBreedsData = new MutableLiveData<>();
        apiService = ApiUtils.getAPIService();
        Log.d("Response", "getAPIService: Api Call Started ");
        apiService.fetchBreedDetails(breedId).enqueue(new Callback<List<CatBreedDetailResponseModel>>() {
            @Override
            public void onResponse(Call<List<CatBreedDetailResponseModel>> call, Response<List<CatBreedDetailResponseModel>> response) {
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
            public void onFailure(Call<List<CatBreedDetailResponseModel>> call, Throwable t) {

            }
        });

        return fetchAllCatBreedsData;

    }
}
