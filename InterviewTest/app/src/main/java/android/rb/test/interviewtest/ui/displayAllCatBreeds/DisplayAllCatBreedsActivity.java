package android.rb.test.interviewtest.ui.displayAllCatBreeds;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.rb.test.interviewtest.R;
import android.rb.test.interviewtest.services.models.AllCatBreedsResponseModel;
import android.rb.test.interviewtest.viewmodels.FetchAllCatBreedsViewModel;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;

public class DisplayAllCatBreedsActivity extends AppCompatActivity {

    private FetchAllCatBreedsViewModel fetchAllCatBreedsViewModel;

    private RecyclerView recyclerView;

    private CatBreedsAdapter catBreedsAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_cat_breeds);

        recyclerView = findViewById(R.id.cats_recycler_view);

        //Setting Up View Model
        fetchAllCatBreedsViewModel = ViewModelProviders.of(this).get(FetchAllCatBreedsViewModel.class);

        //Calling the Api on Here
        observeFetchAllCatBreeds(fetchAllCatBreedsViewModel.fetchAllCatBreeds());
    }

    private void observeFetchAllCatBreeds(LiveData<List<AllCatBreedsResponseModel>> allCatBreedsResponseModelLiveData){
        allCatBreedsResponseModelLiveData.observe(this, new Observer<List<AllCatBreedsResponseModel>>() {
            @Override
            public void onChanged(@Nullable List<AllCatBreedsResponseModel> allCatBreedsResponseModel) {

                Log.d("Response", "Cat Data fetched "+ allCatBreedsResponseModel);
                Log.d("Response","First Cat Name" + allCatBreedsResponseModel.get(0).getName());

                catBreedsAdapter = new CatBreedsAdapter(DisplayAllCatBreedsActivity.this,allCatBreedsResponseModel);
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(new LinearLayoutManager(DisplayAllCatBreedsActivity.this));
                recyclerView.setAdapter(catBreedsAdapter);


            }
        });
    }
}
