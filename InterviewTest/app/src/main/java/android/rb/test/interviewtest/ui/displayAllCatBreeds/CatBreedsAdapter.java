package android.rb.test.interviewtest.ui.displayAllCatBreeds;

import android.content.Context;
import android.content.Intent;
import android.rb.test.interviewtest.R;
import android.rb.test.interviewtest.services.models.AllCatBreedsResponseModel;
import android.rb.test.interviewtest.ui.breedDetailActivity.BreedDetailActivity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class CatBreedsAdapter extends RecyclerView.Adapter<CatBreedsAdapter.ListViewHolder> {

    private Context context;
    private List<AllCatBreedsResponseModel> allCatBreedsResponseModelList;
    //public  List<Integer> integerList = new ArrayList<>();



    public CatBreedsAdapter(Context context, List<AllCatBreedsResponseModel> allCatBreedsResponseModelList) {
        this.context = context;
        this.allCatBreedsResponseModelList = allCatBreedsResponseModelList;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.show_all_cat_breeds_layout, viewGroup, false);
//        LayoutInflater layoutInflater = LayoutInflater.from(context);
//        View view = layoutInflater.inflate(R.layout.show_all_cat_breeds_layout,null);

        return new CatBreedsAdapter.ListViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ListViewHolder listViewHolder, final int i) {
        listViewHolder.name.setText(allCatBreedsResponseModelList.get(i).getName());
        listViewHolder.origin.setText(allCatBreedsResponseModelList.get(i).getOrigin());
        listViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, BreedDetailActivity.class);
                intent.putExtra("BreedId", allCatBreedsResponseModelList.get(i).getId());
                context.startActivity(intent);
            }
        });

    }

//    public List<Integer> getFoodItemList(){
//        return integerList;
//    }


    @Override
    public int getItemCount() {
        return allCatBreedsResponseModelList.size();
    }

    //Inner view Class
    class ListViewHolder extends RecyclerView.ViewHolder{
        private TextView name, origin;


        public ListViewHolder(View itemView) {
            super(itemView);
            name            = itemView.findViewById(R.id.cat_name);
            origin         = itemView.findViewById(R.id.cat_origin);


        }
    }
}

