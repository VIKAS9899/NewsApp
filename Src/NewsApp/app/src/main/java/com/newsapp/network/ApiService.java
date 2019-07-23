package com.newsapp.network;

import com.newsapp.db.entities.Feed;

import java.util.List;

import io.reactivex.Flowable;
import retrofit2.http.GET;

public interface ApiService {

    @GET("/bins/bpnll")
    Flowable<List<Feed>> fetchFeedFromApi();
}
