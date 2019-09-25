package android.rb.test.interviewtest.ui.breedDetailActivity;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.rb.test.interviewtest.R;
import android.rb.test.interviewtest.repositories.FetchBreedDetailRepository;
import android.rb.test.interviewtest.services.models.AllCatBreedsResponseModel;
import android.rb.test.interviewtest.services.models.CatBreedDetailResponseModel;
import android.rb.test.interviewtest.ui.displayAllCatBreeds.CatBreedsAdapter;
import android.rb.test.interviewtest.ui.displayAllCatBreeds.DisplayAllCatBreedsActivity;
import android.rb.test.interviewtest.viewmodels.FetchAllCatBreedsViewModel;
import android.rb.test.interviewtest.viewmodels.FetchBreedDetailsViewModel;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class BreedDetailActivity extends AppCompatActivity {

    private FetchBreedDetailsViewModel fetchBreedDetailsViewModel;

    private CircleImageView catImage;
    private TextView catName, catOrigin, catAdaptability, catAffection, catGrooming, catIntelligence, catShedding, catVocalisation, catExperimental, catNatural, catDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breed_detail);

        Intent intent = getIntent();

        String breedId = intent.getStringExtra("BreedId");

        //Binding the View
        catName = findViewById(R.id.cat_name);
        catOrigin = findViewById(R.id.cat_origin);
        catAdaptability = findViewById(R.id.cat_adaptability);
        catAffection = findViewById(R.id.cat_affection);
        catGrooming = findViewById(R.id.cat_grooming);
        catIntelligence = findViewById(R.id.cat_intelligence);
        catShedding = findViewById(R.id.cat_shedding);
        catVocalisation = findViewById(R.id.cat_vocalization);
        catExperimental = findViewById(R.id.cat_experimantal);
        catNatural = findViewById(R.id.cat_natural);
        catDescription = findViewById(R.id.cat_description);
        catImage = findViewById(R.id.cat_image);

        fetchBreedDetailsViewModel = ViewModelProviders.of(this).get(FetchBreedDetailsViewModel.class);

        observeFetchAllCatBreedDetails(fetchBreedDetailsViewModel.fetchAllCatBreeds(breedId));

    }

    private void observeFetchAllCatBreedDetails(LiveData<List<CatBreedDetailResponseModel>> allCatBreedsResponseModelLiveData){
        allCatBreedsResponseModelLiveData.observe(this, new Observer<List<CatBreedDetailResponseModel>>() {
            @Override
            public void onChanged(@Nullable List<CatBreedDetailResponseModel> allCatBreedDetailsResponseModel) {

                Log.d("Response", "Cat Details Data fetched "+ allCatBreedDetailsResponseModel);

                Glide.with(BreedDetailActivity.this).load(allCatBreedDetailsResponseModel.get(0).getUrl()).into(catImage);

                catName.setText(allCatBreedDetailsResponseModel.get(0).getBreeds().get(0).getName());
                catOrigin.setText(allCatBreedDetailsResponseModel.get(0).getBreeds().get(0).getOrigin());
                catAdaptability.setText(String.valueOf(allCatBreedDetailsResponseModel.get(0).getBreeds().get(0).getAdaptability()));
                catAffection.setText(String.valueOf(allCatBreedDetailsResponseModel.get(0).getBreeds().get(0).getAffectionLevel()));
                catGrooming.setText(String.valueOf(allCatBreedDetailsResponseModel.get(0).getBreeds().get(0).getGrooming()));
                catIntelligence.setText(String.valueOf(allCatBreedDetailsResponseModel.get(0).getBreeds().get(0).getIntelligence()));
                catShedding.setText(String.valueOf(allCatBreedDetailsResponseModel.get(0).getBreeds().get(0).getSheddingLevel()));
                catVocalisation.setText(String.valueOf(allCatBreedDetailsResponseModel.get(0).getBreeds().get(0).getVocalisation()));
                catExperimental.setText(String.valueOf(allCatBreedDetailsResponseModel.get(0).getBreeds().get(0).getExperimental()));
                catNatural.setText(String.valueOf(allCatBreedDetailsResponseModel.get(0).getBreeds().get(0).getNatural()));
                catDescription.setText(allCatBreedDetailsResponseModel.get(0).getBreeds().get(0).getDescription());




            }
        });
    }
}
