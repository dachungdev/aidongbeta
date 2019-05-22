package com.example.aidongprover2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

import java.util.List;

public class ShopItemKindAdapter extends BaseAdapter {

    private List<ShopItemKind> shopItemKindList;
    private Context context;
    private int resource;
    private int selectedPosition = 0;

    public ShopItemKindAdapter(Context context,List<ShopItemKind> shopItemKindList,int resouece){
        this.context = context;
        this.shopItemKindList = shopItemKindList;
        this.resource = resouece;
    }

    @Override
    public int getCount(){
        return shopItemKindList.size();
    }

    @Override
    public Object getItem(int i){
        return shopItemKindList.get(i);
    }

    @Override
    public long getItemId(int i){
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup){
        shopitemkindUtil shopitemkindutil = null;

        final int flag = i;
        if (view == null){
            shopitemkindutil = new shopitemkindUtil();

            LayoutInflater inflater = LayoutInflater.from(context);
            view = inflater.inflate(resource,null);

            shopitemkindutil.shopitemkindBtn = (Button) view.findViewById(R.id.shopitemkindBtn);
            view.setTag(shopitemkindutil);
        } else {
            shopitemkindutil = (shopitemkindUtil) view.getTag();
        }

        final ShopItemKind shopItemKind = shopItemKindList.get(flag);
        shopitemkindutil.shopitemkindBtn.setText(shopItemKind.getShopItemKind());

        shopitemkindutil.shopitemkindBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NetWorkRequest.markType(User.getUserName(),"shop",ActivityData.getSystemTime());
                ShopItemKind shopItemKind = shopItemKindList.get(flag);
                FunctionActivity.shopItemList.clear();
                NetWorkRequest.getShopItem(shopItemKind.getShopItemKindId());
                //MainActivity.show.setText(fbiTem.getFbStudyItemDetail());
                setSelectedPosition(flag);

                notifyDataSetChanged();
            }
        });

        if (selectedPosition == flag){
            shopitemkindutil.shopitemkindBtn.setActivated(true);
        } else {
            shopitemkindutil.shopitemkindBtn.setActivated(false);
        }

        return view;
    }

    public void setSelectedPosition(int position){
        selectedPosition = position;
    }

}
class shopitemkindUtil{
    Button shopitemkindBtn;
}
