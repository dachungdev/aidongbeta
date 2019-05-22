package com.example.aidongprover2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;

public class ShopItemAdapter extends BaseAdapter {
    private List<ShopItem> ShopItemList;
    private Context context;
    private int resource;
    private int selectedPosition = 0;
    String taobao = "com.taobao.taobao";

    public ShopItemAdapter(Context context,List<ShopItem> ShopItemList,int resouece){
        this.context = context;
        this.ShopItemList = ShopItemList;
        this.resource = resouece;
    }

    @Override
    public int getCount(){
        return ShopItemList.size();
    }

    @Override
    public Object getItem(int i){
        return ShopItemList.get(i);
    }

    @Override
    public long getItemId(int i){
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        shopItemUtil shopItemutil = null;

        final int flag = i;
        if (view == null) {
            shopItemutil = new shopItemUtil();

            LayoutInflater inflater = LayoutInflater.from(context);
            view = inflater.inflate(resource, null);

            shopItemutil.shopName = (TextView) view.findViewById(R.id.shopName);
            shopItemutil.shopCost = (TextView) view.findViewById(R.id.shopCost);
            shopItemutil.shopImage = (ImageView) view.findViewById(R.id.shopImage);
            shopItemutil.shopRemarks = (TextView) view.findViewById(R.id.shopRemarks);
            view.setTag(shopItemutil);
        } else {
            shopItemutil = (shopItemUtil) view.getTag();
        }

        ShopItem shopitem = ShopItemList.get(flag);
        shopItemutil.shopName.setText(shopitem.getShopItemName());
        shopItemutil.shopCost.setText(shopitem.getShopItemCost());
        shopItemutil.shopRemarks.setText(shopitem.getShopItemRemarks());
        Glide.with(MyApplication.getContext()).load(shopitem.getShopItemImage()).into(shopItemutil.shopImage);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TitleSet.isAvilible(MyApplication.getContext(),taobao)){
                    ShopItem shopItem = ShopItemList.get(flag);
                    NetWorkRequest.ShopTaobao(shopItem.getShopItemUrl());
                }
                else {
                    Toast.makeText(MyApplication.getContext(),"需要您先安装淘宝手机客户端哦",Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }

}
class shopItemUtil{
    ImageView shopImage;
    TextView shopName;
    TextView shopCost;
    TextView shopRemarks;
}
