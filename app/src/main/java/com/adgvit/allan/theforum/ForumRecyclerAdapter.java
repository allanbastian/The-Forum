package com.adgvit.allan.theforum;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by Lenovo on 28-08-2017.
 */

public class ForumRecyclerAdapter extends RecyclerView.Adapter<ForumRecyclerAdapter.MyViewHolder> {

    LayoutInflater inflater;
    List<Item> data = Collections.emptyList();

    public ForumRecyclerAdapter(Context context, List<Item> data) {
        inflater = LayoutInflater.from(context);
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.row_layout, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Item current = data.get(position);
        holder.cardView.setVisibility(View.VISIBLE);
        holder.button.setBackground(Drawable.createFromPath("star"));
        holder.Ques.setText(current.question);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView Ques;
        CardView cardView;
        ImageButton button;

        public MyViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.cards);
            Ques = (TextView) itemView.findViewById(R.id.ques);
            button = (ImageButton) itemView.findViewById(R.id.upVote);
        }
    }
}
