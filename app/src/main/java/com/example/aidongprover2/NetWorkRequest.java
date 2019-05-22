package com.example.aidongprover2;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.ListView;
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

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NetWorkRequest {

    static int a = 0;

    //加载news
    public static void getNews(final int b){
        String url = "http://47.112.17.83:8080/MyFirstWebAp/NewsServlet";
        String tag = "GetInfo";

        //获得请求队列
        RequestQueue requestQueue = Volley.newRequestQueue(MyApplication.getContext());

        //防止重复请求，所以先取消tag标识的请求队列
        requestQueue.cancelAll(tag);

        //创建StringRequest.定义字符串请求的请求方式为POST（省略第一个参数会默认为GET方式）
        final StringRequest request = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject object1 = (JSONObject) new JSONObject(response).get("params");
                    JSONArray newss = object1.getJSONArray("Newss");

                    Toast.makeText(MyApplication.getContext(), "加载成功", Toast.LENGTH_SHORT).show();

                    if (ActivityData.getReflash()==1){
                        FunctionActivity.newsList.clear();
                        ActivityData.setReflash(0);
                        a = 0;
                        FunctionActivity.news_swipere.setRefreshing(false);
                    }

                    if (b == 0){
                        for (int i = 0; i < newss.length(); i++) {
                        News news = new News();
                        JSONObject jsonObject = newss.getJSONObject(i);
                        news.setTitle(jsonObject.getString("Title"));
                        news.setArticle(jsonObject.getString("Article"));
                        news.setDt(jsonObject.getString("Dt"));
                        news.setEditor(jsonObject.getString("Editor"));
                        news.setImageId(jsonObject.getString("Imageid"));
                        news.setNewsSource(jsonObject.getString("Newssource"));
                        FunctionActivity.newsList.add(news);
                    }
                        FunctionActivity.adapter = new NewsAdapter(MyApplication.getContext(),FunctionActivity.newsList,R.layout.news_item);
                    //setView(news_list,list_foot);
                        FunctionActivity.news_list.setAdapter(FunctionActivity.adapter);
                    }
                    else {
                        if (newss.length()!=0) {
                            Toast.makeText(MyApplication.getContext(), "加载成功", Toast.LENGTH_SHORT).show();
                            for (int i = 0; i < newss.length(); i++) {
                                JSONObject jsonObject1 = newss.getJSONObject(i);
                                /*for(int a = FunctionActivity.newsList.size(); a > a-5  ; a--){
                                    if (jsonObject1.getString("Title").equals(FunctionActivity.newsList.get(a-1).getTitle())){
                                        continue;
                                    }*/
                                        News news = new News();
                                        news.setTitle(jsonObject1.getString("Title"));
                                        news.setArticle(jsonObject1.getString("Article"));
                                        news.setDt(jsonObject1.getString("Dt"));
                                        news.setEditor(jsonObject1.getString("Editor"));
                                        news.setImageId(jsonObject1.getString("Imageid"));
                                        news.setNewsSource(jsonObject1.getString("Newssource"));
                                        FunctionActivity.newsList.add(news);
                                //}
                            }
                            FunctionActivity.adapter.notifyDataSetChanged();
                            FunctionActivity.news_list.loadComplete();
                        }
                        else {
                            FunctionActivity.news_list.loadComplete();
                            Toast.makeText(MyApplication.getContext(),"到底了",Toast.LENGTH_SHORT).show();
                            a = b - 10;
                        }
                    }

                } catch (JSONException e) {
                    Toast.makeText(MyApplication.getContext(), "no internet", Toast.LENGTH_SHORT).show();
                    Log.e("TAG", e.getMessage(), e);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("TAG", error.getMessage(), error);
            }
        })
        {
            @Override
            protected Map<String,String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("HobbyId", KnownHobby.getHobby());
                params.put("DataNum",String.valueOf(b));
                return params;
            }
        };
        request.setTag(tag);
        requestQueue.add(request);
    }

    public static Handler newsHandler = new Handler(){
        @Override
        public void handleMessage(Message msg){
            switch (msg.what) {
                case  1:
                    a = a + 10;
                    getNews(a);
                    break;
            }
        }
    };

    public static void newsOnClick(){
        FunctionActivity.news_list.setInterface(new LoadListView.ILoadListener() {
            @Override
            public void onLoad() {
                newsHandler.sendEmptyMessageDelayed(1,0);
            }
        });
    }


    //加载论坛
    public static void getForum(){
        String url = "http://47.112.17.83:8080/MyFirstWebAp/ForumServlet";
        String tag = "GetForum";

        RequestQueue requestQueue = Volley.newRequestQueue(MyApplication.getContext());

        requestQueue.cancelAll(tag);

        final StringRequest request = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject object2 = (JSONObject) new JSONObject(response).get("params");

                    JSONArray forums = object2.getJSONArray("Forums");

                    if (ActivityData.getReflash() == 1) {
                        FunctionActivity.forumList.clear();
                        ActivityData.setReflash(0);
                        FunctionActivity.talk_swipere.setRefreshing(false);
                    }

                    for (int i = 0; i < forums.length(); i++) {
                        Forum forum = new Forum();
                        JSONObject jsonObject = forums.getJSONObject(i);
                        forum.setTopic(jsonObject.getString("Topic"));
                        forum.setUserName(jsonObject.getString("UserName"));
                        forum.setContent(jsonObject.getString("Content"));
                        forum.setPostTime(jsonObject.getString("PostTime"));
                        FunctionActivity.forumList.add(forum);
                    }
                    FunctionActivity.forumAdapter = new ForumAdapter(MyApplication.getContext(),FunctionActivity.forumList,R.layout.forum_item);
                    FunctionActivity.talk_list.setAdapter(FunctionActivity.forumAdapter);
                } catch (JSONException e) {
                    Toast.makeText(MyApplication.getContext(), "no internet", Toast.LENGTH_SHORT).show();
                    Log.e("TAG", e.getMessage(), e);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("TAG",error.getMessage(),error);
            }
        })
        {
            @Override
            protected Map<String,String> getParams() throws AuthFailureError{
                Map<String,String> params = new HashMap<>();
                params.put("HobbyId", KnownHobby.getHobby());
                return params;
            }
        };

        request.setTag(tag);

        requestQueue.add(request);
    }


    //加载购物模块
    public static void getShopKind(){
        String url = "http://47.112.17.83:8080/MyFirstWebAp/ShopItemKindServlet";
        String tag = "GetShopItemKind";

        //获得请求队列
        RequestQueue requestQueue = Volley.newRequestQueue(MyApplication.getContext());

        //防止重复请求，所以先取消tag标识的请求队列
        requestQueue.cancelAll(tag);

        //创建StringRequest.定义字符串请求的请求方式为POST（省略第一个参数会默认为GET方式）
        final StringRequest request = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject object1 = (JSONObject) new JSONObject(response).get("params");
                    JSONArray shopItemkind = object1.getJSONArray("Result");

                    for (int i = 0; i < shopItemkind.length(); i++) {
                        ShopItemKind shopItemKind = new ShopItemKind();
                        JSONObject jsonObject = shopItemkind.getJSONObject(i);
                        shopItemKind.setShopItemKind(jsonObject.getString("Kind"));
                        shopItemKind.setShopItemKindId(jsonObject.getString("ItemId"));
                        FunctionActivity.shopItemKindList.add(shopItemKind);
                    }
                    ShopItemKindAdapter adapter = new ShopItemKindAdapter(MyApplication.getContext(),FunctionActivity.shopItemKindList,R.layout.shop_item_kind);
                    //setView(news_list,list_foot);
                    if (ActivityData.getShop()==0){
                        ShopItemKind shopItemKind1 = FunctionActivity.shopItemKindList.get(0);
                        getShopItem(shopItemKind1.getShopItemKindId());
                        ActivityData.setShop(1);
                    }
                    FunctionActivity.shop_item_kind_list.setAdapter(adapter);

                } catch (JSONException e) {
                    Toast.makeText(MyApplication.getContext(), "no internet", Toast.LENGTH_SHORT).show();
                    Log.e("TAG", e.getMessage(), e);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("TAG", error.getMessage(), error);
            }
        })
        {
            @Override
            protected Map<String,String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("HobbyId", KnownHobby.getHobby());
                return params;
            }
        }
                ;
        request.setTag(tag);
        requestQueue.add(request);
    }

    public static void aTourist(final String userId, final String resTime){

        String url = "http://47.112.17.83:8080/MyFirstWebAp/TouristServlet";
        String tag = "Login";

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
                    if (result.equals("success")) {
                        Toast.makeText(MyApplication.getContext(), "hi,"+userId, Toast.LENGTH_SHORT).show();
                        User.setUserName(userId);
                    } else {
                        Toast.makeText(MyApplication.getContext(), "没网哦", Toast.LENGTH_SHORT).show();
                    }
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
                params.put("UserId", userId);
                params.put("ResTime", resTime);
                params.put("UserIp",getIPAddress(MyApplication.getContext()));
                return params;
            }
        };

        request.setTag(tag);
        requestQueue.add(request);
    }

    public static void getShopItem(final String kind){
        String url = "http://47.112.17.83:8080/MyFirstWebAp/ShopItemServlet";
        String tag = "GetShopItem";

        //获得请求队列
        RequestQueue requestQueue = Volley.newRequestQueue(MyApplication.getContext());

        //防止重复请求，所以先取消tag标识的请求队列
        requestQueue.cancelAll(tag);

        //创建StringRequest.定义字符串请求的请求方式为POST（省略第一个参数会默认为GET方式）
        final StringRequest request = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject object1 = (JSONObject) new JSONObject(response).get("params");
                    JSONArray shopItem = object1.getJSONArray("ShopItem");

                    FunctionActivity.shopItemList = new ArrayList<>();

                    for (int i = 0; i < shopItem.length(); i++) {
                        ShopItem shopitem = new ShopItem();
                        JSONObject jsonObject = shopItem.getJSONObject(i);
                        shopitem.setShopItemName(jsonObject.getString("Name"));
                        shopitem.setShopItemCost(jsonObject.getString("Cost"));
                        shopitem.setShopItemRemarks(jsonObject.getString("Remarks"));
                        shopitem.setShopItemImage(jsonObject.getString("ImageUrl"));
                        shopitem.setShopItemUrl(jsonObject.getString("ItemUrl"));
                        FunctionActivity.shopItemList.add(shopitem);
                    }
                    ShopItemAdapter adapter = new ShopItemAdapter(MyApplication.getContext(),FunctionActivity.shopItemList,R.layout.shop_item);
                    //setView(news_list,list_foot);
                    FunctionActivity.shop_item_list.setAdapter(adapter);

                } catch (JSONException e) {
                    Toast.makeText(MyApplication.getContext(), "no internet", Toast.LENGTH_SHORT).show();
                    Log.e("TAG", e.getMessage(), e);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("TAG", error.getMessage(), error);
            }
        })
        {
            @Override
            protected Map<String,String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("ItemKind",kind);
                return params;
            }
        }
                ;
        request.setTag(tag);
        requestQueue.add(request);
    }

    public static void ShopTaobao(String a){
        Intent intent = new Intent();
        intent.setAction("Android.intent.action.VIEW");
        Uri uri = Uri.parse(a);
        intent.setData(uri);
        intent.setClassName("com.taobao.taobao","com.taobao.tao.detail.activity.DetailActivity");
        MyApplication.getContext().startActivity(intent);
    }

    public static void markType(final String userId, final String type ,final String resTime){

        String url = "http://47.112.17.83:8080/MyFirstWebAp/MarkTypeServlet";
        String tag = "markType";

        //获得请求队列
        RequestQueue requestQueue = Volley.newRequestQueue(MyApplication.getContext());

        //防止重复请求，所以先取消tag标识的请求队列
        requestQueue.cancelAll(tag);

        //创建StringRequest.定义字符串请求的请求方式为POST（省略第一个参数会默认为GET方式）
        final StringRequest request = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
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
                params.put("UserId", userId);
                params.put("ResTime", resTime);
                params.put("Type",type);
                return params;
            }
        };

        request.setTag(tag);
        requestQueue.add(request);
    }

    public static String getIPAddress(Context context) {
        NetworkInfo info = ((ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo();
        if (info != null && info.isConnected()) {
            if (info.getType() == ConnectivityManager.TYPE_MOBILE) {//当前使用2G/3G/4G网络
                 try {
                    //Enumeration<NetworkInterface> en=NetworkInterface.getNetworkInterfaces();
                    for (Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces();
                         en.hasMoreElements(); ) {
                    NetworkInterface intf = en.nextElement();
                        for (Enumeration<InetAddress> enumIpAddr = intf.getInetAddresses(); enumIpAddr.hasMoreElements(); ) {
                            InetAddress inetAddress = enumIpAddr.nextElement();
                            if (!inetAddress.isLoopbackAddress() && inetAddress instanceof Inet4Address) {
                                return inetAddress.getHostAddress();
                                    }
                                }
                    }
                 } catch (SocketException e) {
                            e.printStackTrace();
                 }
            } else if (info.getType() == ConnectivityManager.TYPE_WIFI) {//当前使用无线网络
                WifiManager wifiManager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
                WifiInfo wifiInfo = wifiManager.getConnectionInfo();
                String ipAddress = intIP2StringIP(wifiInfo.getIpAddress());//得到IPV4地址
                    return ipAddress;
            }
        } else {

        }
        return null;
    }

  public static String intIP2StringIP(int ip) {
        return (ip & 0xFF) + "." +
                ((ip >> 8) & 0xFF) + "." +
                ((ip >> 16) & 0xFF) + "." +
                (ip >> 24 & 0xFF);
    }
}
