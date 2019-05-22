package com.example.aidongprover2;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NewsAdapter extends BaseAdapter {

    private ArrayList<News> newsList;
    private Context context;
    private int resource;

    public NewsAdapter(Context context, ArrayList<News> newsList,int resource) {
        this.context = context;
        this.newsList = newsList;
        this.resource = resource;

    }

    @Override
    public int getCount() {
        return newsList.size();
    }

    @Override
    public Object getItem(int i) {
        return newsList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        News news = newsList.get(i);
        Util util = null;

        final int flag = i;
        if (view == null) {
            util = new Util();

            LayoutInflater inflater = LayoutInflater.from(context);
            view = inflater.inflate(resource,null);

            util.news_title = (TextView) view.findViewById(R.id.news_title);
            util.news_article = (TextView) view.findViewById(R.id.news_article);
            util.news_dt = (TextView) view.findViewById(R.id.news_dt);
            util.news_image = (ImageView) view.findViewById(R.id.news_image);
            view.setTag(util);
        } else {
            util = (Util) view.getTag();
        }

        String picId = news.getImageId();

        Glide.with(MyApplication.getContext()).load(picId).into(util.news_image);

        util.news_title.setText(news.getTitle());
        util.news_article.setText(news.getArticle());
        util.news_dt.setText(news.getDt());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NetWorkRequest.markType(User.getUserName(),"news",ActivityData.getSystemTime());
                News news = newsList.get(flag);
                Intent intent = new Intent(MyApplication.getContext(),ShowNews.class);
                intent.putExtra(ShowNews.NEWS_TITLE,news.getTitle());
                intent.putExtra(ShowNews.NEWS_ARTICLE,news.getArticle());
                intent.putExtra(ShowNews.NEWS_EDITOR,news.getEditor());
                intent.putExtra(ShowNews.NEWS_DT,news.getDt());
                intent.putExtra(ShowNews.NEWS_NEWSSOURCE,news.getNewsSource());
                intent.putExtra(ShowNews.NEWS_IMAGE,news.getImageId());
                MyApplication.getContext().startActivity(intent);
            }
        });

        return view;
    }
}

class Util{
    TextView news_title,news_article,news_dt;
    ImageView news_image;
}
