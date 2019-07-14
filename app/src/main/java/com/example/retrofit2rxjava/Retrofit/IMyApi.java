package com.example.retrofit2rxjava.Retrofit;


import com.example.retrofit2rxjava.Model.Post;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface IMyApi {

    @GET("posts")
    Observable<List<Post>> getPosts();
}
