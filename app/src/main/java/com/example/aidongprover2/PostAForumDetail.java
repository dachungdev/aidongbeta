package com.example.aidongprover2;

import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class PostAForumDetail {
    public static void AddForumDetailRequest(final String userName, final String addTopic , final String detailContent, final String startTime) {
        String url = "http://47.112.17.83:8080/MyFirstWebAp/BuildForumDetailServlet";
        String tag = "AddAForumDetail";

        //获得请求队列
        RequestQueue requestQueue = Volley.newRequestQueue(MyApplication.getContext());

        //防止重复请求，所以先取消tag标识的请求队列
        requestQueue.cancelAll(tag);

        //创建StringRequest.定义字符串请求的请求方式为POST（省略第一个参数会默认为GET方式）
        final StringRequest request = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = (JSONObject) new JSONObject(response).get("params");
                    String result = jsonObject.getString("Result");
                    Intent intent1 = new Intent(MyApplication.getContext(),ShowForumDetail.class);
                    intent1.putExtra(ShowForumDetail.forumTopic,addTopic);
                    MyApplication.getContext().startActivity(intent1);

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
                params.put("UserName", userName);
                params.put("AddTopic", addTopic);
                params.put("DetailContent", detailContent);
                params.put("StartTime", startTime);
                params.put("HobbyId", KnownHobby.getHobby());

                return params;
            }
        };

        request.setTag(tag);

        requestQueue.add(request);
    }
}
