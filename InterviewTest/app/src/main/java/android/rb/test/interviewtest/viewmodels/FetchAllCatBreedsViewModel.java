package android.rb.test.interviewtest.viewmodels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.rb.test.interviewtest.repositories.FetchAllBreedsRepository;
import android.rb.test.interviewtest.services.models.AllCatBreedsResponseModel;
import android.support.annotation.NonNull;

import java.util.List;

public class FetchAllCatBreedsViewModel extends AndroidViewModel {
    public FetchAllCatBreedsViewModel(@NonNull Application application) {
        super(application);
    }

    //Exposing LiveData Object for UI to observer
    public LiveData<List<AllCatBreedsResponseModel>> fetchAllCatBreeds (){
        return FetchAllBreedsRepository.getInstance().fetchAllCatBreedsRequest();
    }
}
