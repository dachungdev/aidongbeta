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

public class AddAForum {

    public static void AddForumRequest(final String addUser, final String addTopic , final String addContent, final String addPostTime){
        String url = "http://47.112.17.83:8080/MyFirstWebAp/BuildForumServlet";
        String tag = "AddAForum";

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
                    Toast.makeText(MyApplication.getContext(),result,Toast.LENGTH_SHORT).show();
                    ActivityData.setActivityData(2);
                    Intent intent = new Intent(MyApplication.getContext(), FunctionActivity.class);
                    MyApplication.getContext().startActivity(intent);

                } catch (JSONException e) {
                    Toast.makeText(MyApplication.getContext(),"no internet",Toast.LENGTH_SHORT).show();
                    Log.e("TAG", e.getMessage(), e);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MyApplication.getContext(),"wrong response",Toast.LENGTH_SHORT).show();
                Log.e("TAG", error.getMessage(), error);
            }
        })
        {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("AddUser", addUser);
                params.put("AddTopic", addTopic);
                params.put("AddContent", addContent);
                params.put("AddPostTime", addPostTime);
                params.put("HobbyId", KnownHobby.getHobby());

                return params;
            }
        };
        request.setTag(tag);

        requestQueue.add(request);
    }

}
