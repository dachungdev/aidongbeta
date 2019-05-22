package com.example.aidongprover2;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class LoginUsers extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private TextView header_user_name;
    private NavigationView mNavView;

    private SharedPreferences pref;

    private SharedPreferences.Editor editor;

    static Button login;
    static Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_users);
        Toolbar loginUsersToo = (Toolbar) findViewById(R.id.loginUserToolbar);
        TextView login_user_name_out = (TextView) findViewById(R.id.login_user_name_out);
        TextView login_user_password_out = (TextView) findViewById(R.id.login_user_password_out);
        final EditText login_user_name_in = (EditText) findViewById(R.id.login_user_name_in);
        final EditText login_user_password_in = (EditText) findViewById(R.id.login_user_password_in);
        login = (Button) findViewById(R.id.login);
        register = (Button) findViewById(R.id.register);
        Button tourist_login = (Button) findViewById(R.id.tourist_login);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.loginUsers_drawer);
        mNavView = (NavigationView) findViewById(R.id.loginUsers_nav_view);

        setSupportActionBar(loginUsersToo);
        View headerView = mNavView.getHeaderView(0);
        header_user_name = (TextView)headerView.findViewById(R.id.username);
        ActionBar actionBar = getSupportActionBar();
        TitleSet.setNav(actionBar,mNavView,mDrawerLayout);

        if (ActivityData.getLoOrRe()==0){
            login.setVisibility(View.GONE);
        }
        if (ActivityData.getLoOrRe()==1){
            register.setVisibility(View.GONE);
        }

        getSupportActionBar().setTitle("身份确定");

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String UserName = login_user_name_in.getText().toString();
                String UserPassword = login_user_password_in.getText().toString();

                if (UserName.isEmpty()||UserPassword.isEmpty()){
                    Toast.makeText(MyApplication.getContext(),"不能为空哦",Toast.LENGTH_SHORT).show();
                }
                else { Login.LoginRequest(UserName,UserPassword); }
            }
        });

        tourist_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMddHHmm");
                Date dataTime = new Date(System.currentTimeMillis());
                String resTime = simpleDateFormat.format(dataTime);
                String tourist = "游客" + resTime;

                User.setUserName(tourist);

                ActivityData.setActivityData(2);
                NetWorkRequest.aTourist(tourist,resTime);
                finish();
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aNewUser = login_user_name_in.getText().toString();
                String aNewPass = login_user_password_in.getText().toString();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date dataTime = new Date(System.currentTimeMillis());
                String resTime = simpleDateFormat.format(dataTime);

                if (aNewUser.isEmpty()||aNewPass.isEmpty()){
                    Toast.makeText(MyApplication.getContext(),"不能为空哦",Toast.LENGTH_SHORT).show();
                }
                else {
                    int length = TitleSet.getWordCount(aNewUser);
                    if (length>16){
                        Toast.makeText(MyApplication.getContext(),"用户名不能超过8个汉字的长度哦",Toast.LENGTH_SHORT);
                    }
                    else {
                        Register.ResRequest(aNewUser, aNewPass, resTime);
                    }
                }
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.toolbar,menu);
        return true;
    }

    @Override
    public void onResume(){
        header_user_name.setText(User.getUserName());
        super.onResume();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.register_mainAc:
                login.setVisibility(View.GONE);
                register.setVisibility(View.VISIBLE);
                break;
            case R.id.login_mainAc:
                login.setVisibility(View.VISIBLE);
                register.setVisibility(View.GONE);
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
    public void onStop(){
        finish();
        super.onStop();
    }

}
