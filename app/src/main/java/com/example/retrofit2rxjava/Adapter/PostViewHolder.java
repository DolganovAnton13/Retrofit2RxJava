package com.example.retrofit2rxjava.Adapter;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit2rxjava.R;

public class PostViewHolder extends RecyclerView.ViewHolder{
    TextView txt_title, txt_content, txt_author;

    public PostViewHolder(View itemView) {
        super(itemView);


        txt_title = itemView.findViewById(R.id.txt_title);
        txt_author = itemView.findViewById(R.id.txt_author);
        txt_content = itemView.findViewById(R.id.txt_content);

    }


}