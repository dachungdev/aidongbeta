package com.example.aidongprover2;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShowForumDetail extends AppCompatActivity {

    public static String forumTopic = "FORUMTOPIC";

    private DrawerLayout mDrawerLayout;
    private TextView header_user_name;
    private NavigationView mNavView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_forum_detail);
        Toolbar forumDetailToor = (Toolbar) findViewById(R.id.forumDetailToolbar);
        final EditText forum_detail_editText = (EditText) findViewById(R.id.forum_detail_edittext);
        Button forum_detail_button = (Button) findViewById(R.id.forum_detail_botton);
        final ListView listView = (ListView) findViewById(R.id.forum_listview);
        //Button postForumDetail = (Button) findViewById(R.id.title_button);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.forumDetailDrawer);
        mNavView = (NavigationView) findViewById(R.id.forumDetail_nav_view);

        setSupportActionBar(forumDetailToor);
        View headerView = mNavView.getHeaderView(0);
        header_user_name = (TextView)headerView.findViewById(R.id.username);
        header_user_name.setText(User.getUserName());
        ActionBar actionBar = getSupportActionBar();
        TitleSet.setNav(actionBar,mNavView,mDrawerLayout);

        final Intent intent = getIntent();

        final String topic = intent.getStringExtra(forumTopic);
        getSupportActionBar().setTitle(topic);
        //TitleSet.setTitleCenter(forumDetailToor,topic);


        String url = "http://47.112.17.83:8080/MyFirstWebAp/ForumDetailServlet";
        String tag = "GetForumDetail";

        RequestQueue requestQueue = Volley.newRequestQueue(MyApplication.getContext());

        requestQueue.cancelAll(tag);

        final StringRequest request = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject object3 = (JSONObject) new JSONObject(response).get("params");
                    JSONArray forumDetails = object3.getJSONArray("ForumDetails");
                    ArrayList<ForumDetail> forumDetailList = new ArrayList<>();
                    for (int i = 0; i < forumDetails.length(); i++) {
                        ForumDetail forumDetail = new ForumDetail();
                        JSONObject jsonObject = forumDetails.getJSONObject(i);
                        forumDetail.setUserName(jsonObject.getString("UserName"));
                        int b = i + 1;
                        final String a = String.valueOf(b);
                        forumDetail.setFloorId(a);
                        forumDetail.setDetailContent(jsonObject.getString("DetailContent"));
                        forumDetail.setStartTime(jsonObject.getString("StartTime"));
                        forumDetailList.add(forumDetail);
                    }
                    ForumDetailAdapter adapter = new ForumDetailAdapter(MyApplication.getContext(), forumDetailList, R.layout.forumdetail_item);
                    View forum_detail_list_foot = LayoutInflater.from(MyApplication.getContext()).inflate(R.layout.forum_detail_list_foot,null);
                    listView.addFooterView(forum_detail_list_foot);
                    listView.setAdapter(adapter);
                } catch (JSONException e) {
                    Toast.makeText(MyApplication.getContext(), "no internet", Toast.LENGTH_SHORT).show();
                    Log.e("TAG", e.getMessage(), e);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MyApplication.getContext(), "wrong response", Toast.LENGTH_SHORT).show();
                Log.e("TAG", error.getMessage(), error);
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("Topic", topic);
                params.put("HobbyId", KnownHobby.getHobby());
                return params;
            }
        };

        request.setTag(tag);
        requestQueue.add(request);

        forum_detail_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = User.getUserName();

                String addContent = forum_detail_editText.getText().toString();

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                Date dataTime = new Date(System.currentTimeMillis());

                String addPostTime = simpleDateFormat.format(dataTime);

                if (User.getUserName().equals("未登录")) {
                    Snackbar.make(view,"发回复前需登陆哦，或者使用",Snackbar.LENGTH_SHORT)
                            .setAction("游客模式", new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMddHHmm");
                                    Date dataTime = new Date(System.currentTimeMillis());
                                    String resTime = simpleDateFormat.format(dataTime);
                                    String tourist = "游客" + resTime;

                                    User.setUserName(tourist);

                                    ActivityData.setActivityData(2);
                                    NetWorkRequest.aTourist(tourist,resTime);
                                    header_user_name.setText(tourist);
                                }
                            })
                            .show();
                }
                else {

                    if (addContent.isEmpty()){
                        Toast.makeText(MyApplication.getContext(),"发帖内容不能为空哦",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        PostAForumDetail.AddForumDetailRequest(userName,topic,addContent,addPostTime);
                        finish();
                    }

                }
            }
        });

        TitleSet.setNavBtn(mNavView,mDrawerLayout);
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
        header_user_name.setText(User.getUserName());
        super.onResume();
    }
}
