package com.example.aidongprover2;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class NewForum extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private TextView header_user_name;
    private NavigationView mNavView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_forum);

        final InputMethodManager imm = (InputMethodManager) getSystemService(MyApplication.getContext().INPUT_METHOD_SERVICE);

        final Button postTheforum = (Button) findViewById(R.id.finish);
        Toolbar newForumToo = (Toolbar) findViewById(R.id.newForumToolbar);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.newForum_drawer);
        mNavView = (NavigationView) findViewById(R.id.newForum_nav_view);

        setSupportActionBar(newForumToo);
        View headerView = mNavView.getHeaderView(0);
        header_user_name = (TextView)headerView.findViewById(R.id.username);
        header_user_name.setText(User.getUserName());
        ActionBar actionBar = getSupportActionBar();
        TitleSet.setNav(actionBar,mNavView,mDrawerLayout);

        TextView topicTips = (TextView) findViewById(R.id.topicTips);
        TextView contentTips = (TextView) findViewById(R.id.contentTips);

        getSupportActionBar().setTitle("帖子信息");

        TitleSet.setTitleCenter(newForumToo,"帖子信息");

        final EditText urTopic = (EditText) findViewById(R.id.urTopic);
        final EditText urContent = (EditText) findViewById(R.id.urContent);

        postTheforum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String addUser = User.getUserName();
                String addTopic = urTopic.getText().toString();
                String addContent = urContent.getText().toString();

                imm.hideSoftInputFromWindow(postTheforum.getWindowToken(),0);

                if (User.getUserName().equals("未登录")) {
                    Snackbar.make(view,"发帖前需登录哦，或者使用",Snackbar.LENGTH_SHORT)
                            .setAction("游客模式", new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMddHHmm");
                                    Date dataTime = new Date(System.currentTimeMillis());
                                    String resTime = simpleDateFormat.format(dataTime);
                                    String tourist = "游客" + resTime;

                                    User.setUserName(tourist);

                                    NetWorkRequest.aTourist(tourist,resTime);
                                    header_user_name.setText(User.getUserName());
                                }
                            })
                    .show();
                }
                else {
                    for (int a = 0; a < FunctionActivity.forumList.size() ; a++){
                        Forum b = FunctionActivity.forumList.get(a);
                        if (addTopic.equals(b.getTopic())){
                            Toast.makeText(MyApplication.getContext(),"该话题已存在，请重新输入",Toast.LENGTH_SHORT).show();
                            break;
                        }
                        else {
                            if (a == FunctionActivity.forumList.size()-1){
                                if (addTopic.isEmpty()||addContent.isEmpty()){
                                    Toast.makeText(MyApplication.getContext(),"不能为空哦",Toast.LENGTH_SHORT).show();
                                    break;
                                }
                                else {
                                    int length = TitleSet.getWordCount(addTopic);
                                    if (length > 20){
                                        Toast.makeText(MyApplication.getContext(),"话题名不能超过10个字哦",Toast.LENGTH_SHORT).show();
                                    }
                                    else {
                                        if (TitleSet.isNumeric(addTopic)){
                                            Toast.makeText(MyApplication.getContext(),"话题名不能是纯数字哦",Toast.LENGTH_SHORT).show();
                                        }
                                        else {
                                            if (TitleSet.specialSymbols(addTopic)){
                                                Toast.makeText(MyApplication.getContext(),"不能以特殊字符开头哦",Toast.LENGTH_SHORT).show();
                                            }
                                            else {
                                                if (addTopic.equals("null")){
                                                    Toast.makeText(MyApplication.getContext(),"不能以null为话题名哦",Toast.LENGTH_SHORT).show();
                                                }
                                                else {
                                                    postNewForum(addUser,addTopic,addContent);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        });

        TitleSet.setNavBtn(mNavView,mDrawerLayout);
    }

    private void postNewForum(String addUser,String addTopic,String addContent){
        ActivityData.setAboutForum(0);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date dataTime = new Date(System.currentTimeMillis());

        String addPostTime = simpleDateFormat.format(dataTime);
        AddAForum.AddForumRequest(addUser,addTopic,addContent,addPostTime);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.toolbar,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.register_mainAc:
                ActivityData.setAboutForum(1);
                Intent intent = new Intent(MyApplication.getContext(),LoginUsers.class);
                ActivityData.setLoOrRe(0);
                MyApplication.getContext().startActivity(intent);
                break;
            case R.id.login_mainAc:
                ActivityData.setAboutForum(1);
                Intent intent1 = new Intent(MyApplication.getContext(),LoginUsers.class);
                ActivityData.setLoOrRe(1);
                MyApplication.getContext().startActivity(intent1);
                break;
            case R.id.aboutUs:
                ActivityData.setAboutForum(1);
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
        ActivityData.setActivityId(3);
        header_user_name.setText(User.getUserName());
        super.onResume();
    }

    @Override
    public void onStop(){
        if (ActivityData.getAboutForum() == 0) {
            finish();
        }
        else ;
        super.onStop();
    }
}
