package com.example.aidongprover2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowShopItemDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_shop_item_detail);
        ShopItem shopItem = (ShopItem) getIntent().getSerializableExtra("a");
        ImageView iTemImage = (ImageView) findViewById(R.id.sItemDetailImage);
        TextView iTemName = (TextView) findViewById(R.id.sItemNameDetail);
        TextView iTemCost = (TextView) findViewById(R.id.sItemCostDetail);
        Button buy = (Button) findViewById(R.id.buy);

        iTemImage.setImageResource(R.drawable.ic_launcher_background);
        iTemName.setText(shopItem.getShopItemName());
        iTemCost.setText(shopItem.getShopItemCost());


                Intent intent = new Intent();
                intent.setAction("Android.intent.action.VIEW");
                Uri uri = Uri.parse("https://detail.m.tmall.com/item.htm?spm=a3204.11780841.todayCrazy-92.d0&id=583996458533&addressId=0&storeCode=0");
                intent.setData(uri);
                intent.setClassName("com.taobao.taobao","com.taobao.tao.detail.activity.DetailActivity");
                startActivity(intent);

    }
}
