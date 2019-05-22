package com.example.aidongprover2;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionActivity extends AppCompatActivity {

    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;
    static int killFlag = 0;
    public static ArrayList<News> newsList = new ArrayList<>();
    public static ArrayList<Forum> forumList = new ArrayList<>();
    public static List<ShopItemKind> shopItemKindList = new ArrayList<>();
    public static List<ShopItem> shopItemList = new ArrayList<>();

    public static ListView shop_item_list;
    public static ListView shop_item_kind_list;

    static NewsAdapter adapter;
    static ForumAdapter forumAdapter;
    static LoadListView news_list;
    static ListView talk_list;
    LinearLayout news_layout;
    FrameLayout talk_layout;
    LinearLayout study_layout;
    LinearLayout shop_layout;

    Button news_op;
    Button study_op;
    Button forum_op;
    Button shop_op;
    Button study_basic_know;
    Button study_advanced_know;
    Button study_warm_know;

    View list_foot;

    private DrawerLayout mDrawerLayout;

    private TextView header_user_name;

    private NavigationView mNavView;

    public static SwipeRefreshLayout news_swipere;
    public static SwipeRefreshLayout talk_swipere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_function);
        Log.d("Func","dachung");
        Toolbar funcToolbar = (Toolbar) findViewById(R.id.funcToolbar);
        setSupportActionBar(funcToolbar);

        news_op = (Button) findViewById(R.id.news_op);
        study_op = (Button) findViewById(R.id.study_op);
        forum_op = (Button) findViewById(R.id.forum_op);
        shop_op = (Button) findViewById(R.id.shop_op);

        news_layout = (LinearLayout) findViewById(R.id.news_layout);
        talk_layout = (FrameLayout) findViewById(R.id.talk_layout);
        study_layout = (LinearLayout) findViewById(R.id.study_layout);
        shop_layout = (LinearLayout) findViewById(R.id.shop_layout);

        news_swipere = (SwipeRefreshLayout) findViewById(R.id.news_swipere) ;
        talk_swipere = (SwipeRefreshLayout) findViewById(R.id.talk_swipere);

        news_swipere.setColorSchemeResources(R.color.colorPrimary);
        news_swipere.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                ActivityData.setReflash(1);
                NetWorkRequest.a = 0;
                NetWorkRequest.getNews(a);
            }
        });

        talk_swipere.setColorSchemeResources(R.color.colorPrimary);
        talk_swipere.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                ActivityData.setReflash(1);
                NetWorkRequest.getForum();
            }
        });

        study_warm_know = (Button) findViewById(R.id.study_warm_know);
        study_basic_know = (Button) findViewById(R.id.study_basic_know);
        study_advanced_know = (Button) findViewById(R.id.study_advanced_know);
        FloatingActionButton post_forum = (FloatingActionButton) findViewById(R.id.post_forum);

        shop_item_list = (ListView) findViewById(R.id.shop_item_list);
        shop_item_kind_list = (ListView) findViewById(R.id.shop_item_kind_list);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.func_drawer_layout);
        mNavView = (NavigationView) findViewById(R.id.func_nav_view);
        View headerView = mNavView.getHeaderView(0);
        header_user_name = (TextView)headerView.findViewById(R.id.username);
        header_user_name.setText(User.getUserName());


        ActionBar actionBar = getSupportActionBar();
        TitleSet.setNav(actionBar,mNavView,mDrawerLayout);

        final Intent intent = getIntent();

        news_list = (LoadListView) findViewById(R.id.news_list);
        talk_list = (ListView) findViewById(R.id.talk_list);

        talk_layout.setVisibility(View.GONE);
        study_layout.setVisibility(View.GONE);
        shop_layout.setVisibility(View.GONE);

        getSupportActionBar().setTitle(KnownHobby.getHobby());
        TitleSet.setTitleCenter(funcToolbar,KnownHobby.getHobby());
        list_foot = LayoutInflater.from(MyApplication.getContext()).inflate(R.layout.news_list_foot,null);

        orderIn();

        //点击资讯按钮后
        news_op.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (d != 1){
                    d = 1;
                    news_op.setActivated(true);
                    study_op.setActivated(false);
                    forum_op.setActivated(false);
                    shop_op.setActivated(false);

                    news_layout.setVisibility(View.GONE);
                    talk_layout.setVisibility(View.GONE);
                    study_layout.setVisibility(View.GONE);
                    shop_layout.setVisibility(View.GONE);

                    news_layout.setVisibility(View.VISIBLE);
                }
            }
        });

        //点击学习按钮后
        study_op.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (d != 2){
                    d = 2;
                    news_op.setActivated(false);
                    study_op.setActivated(true);
                    forum_op.setActivated(false);
                    shop_op.setActivated(false);

                    news_layout.setVisibility(View.GONE);
                    talk_layout.setVisibility(View.GONE);
                    study_layout.setVisibility(View.GONE);
                    shop_layout.setVisibility(View.GONE);

                    study_layout.setVisibility(View.VISIBLE);
                }
            }
        });

        //学习之运动前后篇
        study_warm_know.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intentStudy = new Intent(MyApplication.getContext(),ShowStudy.class);
               intentStudy.putExtra(ShowStudy.studyFunc,"studyWarm");
               startActivity(intentStudy);
            }
        });

        //学习初级篇
        study_basic_know.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentStudy = new Intent(MyApplication.getContext(),ShowStudy.class);
                intentStudy.putExtra(ShowStudy.studyFunc,"studyBasic");
                startActivity(intentStudy);
            }
        });

        //点击论坛按钮后
        forum_op.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (d != 3){
                    d = 3;
                    setView(talk_list,list_foot);

                    news_op.setActivated(false);
                    study_op.setActivated(false);
                    forum_op.setActivated(true);
                    shop_op.setActivated(false);

                    news_layout.setVisibility(View.GONE);
                    talk_layout.setVisibility(View.GONE);
                    study_layout.setVisibility(View.GONE);
                    shop_layout.setVisibility(View.GONE);

                    talk_layout.setVisibility(View.VISIBLE);
                    if (b == 0) {
                        forumThread();
                        b = b + 1;
                    }
                }
            }
        });

        //点击购物按钮后
        shop_op.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (d != 4){
                    d = 4;
                    news_op.setActivated(false);
                    study_op.setActivated(false);
                    forum_op.setActivated(false);
                    shop_op.setActivated(true);

                    news_layout.setVisibility(View.GONE);
                    talk_layout.setVisibility(View.GONE);
                    study_layout.setVisibility(View.GONE);
                    shop_layout.setVisibility(View.GONE);

                    shop_layout.setVisibility(View.VISIBLE);
                    if (c == 0){
                        shopThread();
                        c = c + 1;
                    }
                }
            }
        });

        //点击漂浮按钮后
        post_forum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyApplication.getContext(),NewForum.class);
                startActivity(intent);
            }
        });

        TitleSet.setNavBtn(mNavView,mDrawerLayout);

    }

    //顺序进入
    private void orderIn(){
        d = 1;
        news_layout.setVisibility(View.VISIBLE);
        talk_layout.setVisibility(View.GONE);
        study_layout.setVisibility(View.GONE);
        shop_layout.setVisibility(View.GONE);

        //加载news
        newsThread();
        NetWorkRequest.newsOnClick();
        news_op.setActivated(true);
    }

    private void setView(ListView listView,View view){
        if (listView.getFooterViewsCount()==0){
            listView.addFooterView(view);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.toolbar,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.register_mainAc:
                Intent intent = new Intent(MyApplication.getContext(),LoginUsers.class);
                ActivityData.setLoOrRe(0);
                MyApplication.getContext().startActivity(intent);
                break;
            case R.id.login_mainAc:
                Intent intent1 = new Intent(MyApplication.getContext(),LoginUsers.class);
                ActivityData.setLoOrRe(1);
                MyApplication.getContext().startActivity(intent1);
                break;
            case R.id.aboutUs:
                Intent intent2 = new Intent(MyApplication.getContext(),AboutUsActivity.class);
                startActivity(intent2);
                break;
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                break;
            default:
        }
        return true;
    }

    @Override
    public void onResume(){
        if (forum_op.isActivated()&&ActivityData.getActivityData()==2){
            ActivityData.setReflash(1);
            NetWorkRequest.getForum();
            ActivityData.setActivityData(1);
        }
        else ;
        header_user_name.setText(User.getUserName());
        ActivityData.setActivityId(2);
        super.onResume();
    }

    @Override
    public void onStop(){
        if (killFlag == 1){
        shopItemKindList.clear();
        newsList.clear();
        shopItemList.clear();
        forumList.clear();
        killFlag = 0;
        }
        super.onStop();
    }

    private void newsThread(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                NetWorkRequest.getNews(a);
            }
        }).start();
    }

    private void forumThread(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                NetWorkRequest.getForum();
            }
        }).start();
    }

    private void shopThread(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                NetWorkRequest.getShopKind();
            }
        }).start();
    }

    @Override
    public void onBackPressed(){
        killFlag = 1;
        super.onBackPressed();
    }
}
