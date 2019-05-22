package com.example.aidongprover2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;


import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;

public class ShowNews extends AppCompatActivity {

    public static String NEWS_TITLE = "news_title";
    public static String NEWS_ARTICLE = "news_article";
    public static String NEWS_NEWSSOURCE = "news_newssource";
    public static String NEWS_DT = "news_dt";
    public static String NEWS_IMAGE = "news_image";
    public static String NEWS_EDITOR = "news_editor";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_news);
        Toolbar show_news_toolbar = (Toolbar) findViewById(R.id.show_news_toolbar);
        TextView newsTitle = (TextView) findViewById(R.id.show_news_title);
        TextView newsDt = (TextView) findViewById(R.id.show_news_dt);
        TextView newsSource = (TextView) findViewById(R.id.show_news_newssource);
        ImageView newsImage = (ImageView) findViewById(R.id.show_news_image);
        TextView newsArticle = (TextView) findViewById(R.id.show_news_article);
        TextView newsEditor = (TextView) findViewById(R.id.show_news_editor);

        setSupportActionBar(show_news_toolbar);
        getSupportActionBar().setTitle(KnownHobby.getHobby()+"·资讯");

        Intent intent = getIntent();

        //加载图片
        RequestQueue mQueue = Volley.newRequestQueue(MyApplication.getContext());
        ImageLoader imageLoader = new ImageLoader(mQueue, new BitmapCache());
        ImageLoader.ImageListener listener = ImageLoader.getImageListener(newsImage,R.mipmap.login,R.mipmap.register);
        imageLoader.get(intent.getStringExtra(NEWS_IMAGE),listener);

        newsTitle.setText(intent.getStringExtra(NEWS_TITLE));
        newsDt.setText(intent.getStringExtra(NEWS_DT));
        newsSource.setText(intent.getStringExtra(NEWS_NEWSSOURCE));
        newsArticle.setText(intent.getStringExtra(NEWS_ARTICLE));
        newsEditor.setText("编辑: "+intent.getStringExtra(NEWS_EDITOR));

    }
}
