package com.example.aidongprover2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;

public class HobbyAdapter extends RecyclerView.Adapter<HobbyAdapter.ViewHolder> {

    private Context mContext;

    private List<Hobby> mHobbyList;


    static class ViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        ImageView hobbyImage;
        TextView hobbyName;

        public ViewHolder(View view){
            super(view);
            cardView = (CardView) view;
            hobbyImage = (ImageView) view.findViewById(R.id.hobby_image);
            hobbyName = (TextView) view.findViewById(R.id.hobby_name);
        }
    }

    public HobbyAdapter(List<Hobby> hobbyList){
        mHobbyList = hobbyList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        if (mContext == null){
            mContext = parent.getContext();
        }
        View view = LayoutInflater.from(mContext).inflate(R.layout.hobby,parent,false);
        final ViewHolder holder = new ViewHolder(view);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = holder.getAdapterPosition();
                if (position <= 1) {
                    Hobby hobby = mHobbyList.get(position);
                    Intent intent = new Intent(mContext, FunctionActivity.class);
                    //intent.putExtra(FunctionActivity.HOBBY_NAME,hobby.getHobbyId());
                    KnownHobby.sethobby(hobby.getHobbyId());
                    mContext.startActivity(intent);
                }
                else {Toast.makeText(MyApplication.getContext(),"敬请期待",Toast.LENGTH_SHORT).show();}
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder,int position){
        Hobby hobby = mHobbyList.get(position);
        holder.hobbyName.setText(hobby.getHobbyId());
        Glide.with(mContext).load(hobby.getImageId()).into(holder.hobbyImage);
    }
    @Override
    public int getItemCount(){
        return mHobbyList.size();
    }
}
