package com.openclassrooms.entrevoisins.ui.neighbour_list;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.openclassrooms.entrevoisins.R;
import com.openclassrooms.entrevoisins.model.Neighbour;
import com.openclassrooms.entrevoisins.service.NeighbourApiService;
import com.openclassrooms.entrevoisins.di.DI;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ShowNeighbourActivity extends AppCompatActivity {

    private NeighbourApiService mApiService;

    @BindView(R.id.show_neighbour_activity_picture)
    ImageView picture;
    @BindView(R.id.show_neighbour_activity_name)
    TextView name;
    @BindView(R.id.show_neighbour_activity_adress)
    TextView address;
    @BindView(R.id.show_neighbour_activity_phone)
    TextView phone;
    @BindView(R.id.show_neighbour_activity_website)
    TextView website;
    @BindView(R.id.show_neighbour_activity_description)
    TextView description;
    @BindView(R.id.show_neighbour_activity_favorite)
    FloatingActionButton favoriteBtn;
    @BindView(R.id.show_neighbour_activity_toolbar)
    Toolbar mToolbar;
    @BindView(R.id.collapsing_toolbar)
    CollapsingToolbarLayout mCollapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_neighbour);
        ButterKnife.bind(this);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mApiService = DI.getNeighbourApiService();
        init();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home : {
                finish();
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }


    private void init() {
        Neighbour neighbour = (Neighbour) getIntent().getSerializableExtra("neighbour");
        name.setText(neighbour.getName());
        mCollapsingToolbarLayout.setTitle(neighbour.getName());
        address.setText(neighbour.getAddress());
        phone.setText(neighbour.getPhoneNumber());
        website.setText(neighbour.getWebsite());
        description.setText(neighbour.getAboutMe());
        Glide.with(this).load(neighbour.getAvatarUrl()).centerCrop().into(picture);
        boolean isFavorite = neighbour.getIsFavorite();

        if (isFavorite) {
            favoriteBtn.setImageResource(R.drawable.ic_star_white_24dp);
        } else {
            favoriteBtn.setImageResource(R.drawable.ic_star_border_white_24dp);
        }

        favoriteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!neighbour.getIsFavorite()) {
                    neighbour.setIsFavorite(true);
                    mApiService.setFavorite(neighbour);
                    favoriteBtn.setImageResource(R.drawable.ic_star_white_24dp);

                } else {
                    neighbour.setIsFavorite(false);
                    mApiService.setFavorite(neighbour);
                    favoriteBtn.setImageResource(R.drawable.ic_star_border_white_24dp);
                }
            }
        });
    }
}