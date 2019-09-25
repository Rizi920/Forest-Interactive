package android.rb.test.interviewtest.viewmodels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.rb.test.interviewtest.repositories.FetchAllBreedsRepository;
import android.rb.test.interviewtest.repositories.FetchBreedDetailRepository;
import android.rb.test.interviewtest.services.models.AllCatBreedsResponseModel;
import android.rb.test.interviewtest.services.models.CatBreedDetailResponseModel;
import android.support.annotation.NonNull;

import java.util.List;

public class FetchBreedDetailsViewModel extends AndroidViewModel {

    public FetchBreedDetailsViewModel(@NonNull Application application) {
        super(application);
    }

    //Exposing LiveData Object for UI to observer
    public LiveData<List<CatBreedDetailResponseModel>> fetchAllCatBreeds (String breedId){
        return FetchBreedDetailRepository.getInstance().fetchCatBreedDetailsRequest(breedId);
    }
}
