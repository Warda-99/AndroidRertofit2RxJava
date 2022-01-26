package com.example.androidrertofit2rxjava.Retrofit;

import io.reactivex.Observable;
import retrofit2.http.GET;


import com.example.androidrertofit2rxjava.Model.Post;

import java.util.List;

public interface IMyAPI {
    @GET("posts")
    Observable<List<Post>> getPosts();
}
