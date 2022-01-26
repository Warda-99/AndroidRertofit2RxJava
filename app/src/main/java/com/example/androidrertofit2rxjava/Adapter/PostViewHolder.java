package com.example.androidrertofit2rxjava.Adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidrertofit2rxjava.R;

public class PostViewHolder extends RecyclerView.ViewHolder {

    TextView txt_title, txt_content, txt_author;

    public PostViewHolder(@NonNull View itemView) {
        super(itemView);

        txt_author = (TextView)itemView.findViewById(R.id.txt_author);
        txt_content = (TextView)itemView.findViewById(R.id.txt_content);
        txt_title = (TextView)itemView.findViewById(R.id.txt_title);
    }
}
