package com.example.aidongprover2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

public class ForumDetailAdapter extends BaseAdapter {

    private List<ForumDetail> forumDetailList;
    private Context context;
    private int resource;

    public ForumDetailAdapter(Context context, List<ForumDetail> forumDrtailList, int resource){
        this.context = context;
        this.forumDetailList = forumDrtailList;
        this.resource = resource;
    }

    @Override
    public int getCount(){
        return forumDetailList.size();
    }

    @Override
    public Object getItem(int i){
        return forumDetailList.get(i);
    }

    @Override
    public long getItemId(int i){
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup){

        forumDetailUtil forumDetailutil = null;

        final int flag = i;
        if (view == null){
            forumDetailutil = new forumDetailUtil();

            LayoutInflater inflater = LayoutInflater.from(context);
            view = inflater.inflate(resource,null);

            forumDetailutil.forum_detail_userName = (TextView) view.findViewById(R.id.forum_detail_username);
            forumDetailutil.forum_detail_content = (TextView) view.findViewById(R.id.forum_detail_content);
            forumDetailutil.forum_detail_floorId = (TextView) view.findViewById(R.id.forum_detail_floorId);
            forumDetailutil.forum_detail_startTime = (TextView) view.findViewById(R.id.forum_detail_startTime);
            view.setTag(forumDetailutil);
        } else {
            forumDetailutil = (forumDetailUtil) view.getTag();
        }

        ForumDetail forumDetail = forumDetailList.get(i);
        forumDetailutil.forum_detail_userName.setText(forumDetail.getUserName());
        forumDetailutil.forum_detail_content.setText(forumDetail.getDetailContent());
        forumDetailutil.forum_detail_floorId.setText(forumDetail.getFloorId()+"楼");
        forumDetailutil.forum_detail_startTime.setText(" "+ forumDetail.getStartTime());

        return view;
    }
}

class forumDetailUtil{
    TextView forum_detail_userName,forum_detail_content,forum_detail_floorId,forum_detail_startTime;
}
