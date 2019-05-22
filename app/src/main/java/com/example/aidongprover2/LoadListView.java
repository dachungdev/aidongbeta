package com.example.aidongprover2;

import android.content.Context;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;

public class LoadListView extends ListView implements AbsListView.OnScrollListener {
    View footer;
    int totalItemCount;
    int lastVisibleItem;
    boolean isLoading;
    ILoadListener iLoadListener;

    public LoadListView(Context context, AttributeSet attrs){
        super(context,attrs);
        initView(context);
    }

    private void initView(Context context){
        LayoutInflater inflater = LayoutInflater.from(context);
        footer = inflater.inflate(R.layout.load_footer_layout,null);
        footer.findViewById(R.id.load_layout).setVisibility(GONE);
        this.addFooterView(footer);
        this.setOnScrollListener(this);
    }

    @Override
    public void onScroll(AbsListView view,int firstVisibleItem,int visibleItemCount, int totalItemCount){
        this.lastVisibleItem = firstVisibleItem + visibleItemCount;
        this.totalItemCount = totalItemCount;
    }

    @Override
    public void onScrollStateChanged(AbsListView view,int scrollState){
        if (totalItemCount == lastVisibleItem && scrollState == SCROLL_STATE_IDLE){
            if (!isLoading){
                isLoading = true;
                footer.findViewById(R.id.load_layout).setVisibility(VISIBLE);
                if (iLoadListener != null){
                    iLoadListener.onLoad();
                }
            }
        }
    }

    public void loadComplete(){
        isLoading = false;
        footer.findViewById(R.id.load_layout).setVisibility(GONE);
    }

    public void setInterface(ILoadListener iLoadListener){
        this.iLoadListener = iLoadListener;
    }

    public interface ILoadListener{
        public void onLoad();
    }

}
