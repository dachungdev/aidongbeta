package com.example.aidongprover2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.Map;

public class ForumAdapter extends BaseAdapter {

    private List<Forum> forumList;
    private Context context;
    private int resource;

    public ForumAdapter(Context context, List<Forum> forumList,int resource) {
        this.context = context;
        this.forumList = forumList;
        this.resource = resource;

    }

    @Override
    public int getCount() {
        return forumList.size();
    }

    @Override
    public Object getItem(int i) {
        return forumList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {

        forumUtil forumutil = null;

        final int flag = i;
        if (view == null) {
            forumutil = new forumUtil();

            LayoutInflater inflater = LayoutInflater.from(context);
            view = inflater.inflate(resource,null);

            forumutil.topic = (TextView) view.findViewById(R.id.forum_topic);
            forumutil.userName = (TextView) view.findViewById(R.id.forum_userName);
            forumutil.content = (TextView) view.findViewById(R.id.forum_content);
            forumutil.postTime = (TextView) view.findViewById(R.id.forum_postTime);
            view.setTag(forumutil);
        } else {
            forumutil = (forumUtil) view.getTag();
        }

        Forum forum = forumList.get(i);
        forumutil.topic.setText(forum.getTopic());
        forumutil.userName.setText(forum.getUserName()+" : ");
        forumutil.content.setText(forum.getContent());
        forumutil.postTime.setText(forum.getPostTime());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NetWorkRequest.markType(User.getUserName(),"forum",ActivityData.getSystemTime());
                Forum forum1 = forumList.get(i);
                Intent intent = new Intent(MyApplication.getContext(),ShowForumDetail.class);
                intent.putExtra(ShowForumDetail.forumTopic,forum1.getTopic());
                MyApplication.getContext().startActivity(intent);
            }
        });

        return view;
    }
}
class forumUtil{
    TextView topic,userName,content,postTime;
}
