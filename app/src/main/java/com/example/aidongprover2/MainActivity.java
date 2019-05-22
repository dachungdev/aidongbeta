package com.example.aidongprover2;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Hobby> hobbyList = new ArrayList<>();
    private HobbyAdapter adapter;
    private DrawerLayout mDrawerLayout;
    private TextView header_user_name;
    private NavigationView mNavView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mNavView = (NavigationView) findViewById(R.id.nav_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        View headerView = mNavView.getHeaderView(0);
        header_user_name = (TextView)headerView.findViewById(R.id.username);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("爱动");

        ActionBar actionBar = getSupportActionBar();
        TitleSet.setNav(actionBar,mNavView,mDrawerLayout);
        initHobbies();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        GridLayoutManager layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new HobbyAdapter(hobbyList);
        recyclerView.setAdapter(adapter);

        TitleSet.setTitleCenter(toolbar,"爱动");

        TitleSet.setNavBtn(mNavView,mDrawerLayout);

        ShowWelcome();
    }

    private void initHobbies(){
        hobbyList.clear();
        Hobby baskerball = new Hobby("篮球",R.mipmap.baketball);
        hobbyList.add(baskerball);
        Hobby football = new Hobby("足球",R.mipmap.fb);
        hobbyList.add(football);
        Hobby tennis = new Hobby("网球",R.mipmap.tb);
        hobbyList.add(tennis);
        Hobby dance = new Hobby("跳舞",R.mipmap.dance);
        hobbyList.add(dance);
        Hobby badminton = new Hobby("羽毛球",R.mipmap.tb2);
        hobbyList.add(badminton);
        Hobby baseball = new Hobby("棒球",R.mipmap.bbb);
        hobbyList.add(baseball);
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
    public void onRestart(){
        header_user_name.setText(User.getUserName());
        NetWorkRequest.a = 0;
        ActivityData.setActivityId(1);
        ActivityData.setShop(0);
        super.onRestart();
    }

    private void ShowWelcome(){
        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
        dialog.setTitle("必须要说的话：");
        dialog.setMessage("朋友您好，我是爱动的负责人。\n在您体验爱动之前有以下几点须知：1、资讯板块的新闻暂时转载自虎扑网站；\n2、学习板块中的资料是我们收集整理好的，希望能帮助到您；\n3、若您在使用爱动的过程中遇到bug，请及时将bug情况反馈给我们，点击右上角“关于我们”即可获取我们的联系方式；\n5、爱动目前处于测试阶段，希望您使用游客模式进行身份认证。\n\n最后，感谢您对爱动的支持，祝生活愉快^。");
        dialog.setCancelable(false);
        dialog.setNegativeButton("没问题", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        dialog.show();
    }
}
