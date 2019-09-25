package android.rb.test.interviewtest.services.remote;

import android.rb.test.interviewtest.services.models.AllCatBreedsResponseModel;
import android.rb.test.interviewtest.services.models.CatBreedDetailResponseModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface APIService {

@GET("/v1/breeds/")
Call<List<AllCatBreedsResponseModel>> fetchAllCatBreeds();

@GET("/v1/images/search")
Call<List<CatBreedDetailResponseModel>> fetchBreedDetails(@Query("breed_id") String breedId);

}

