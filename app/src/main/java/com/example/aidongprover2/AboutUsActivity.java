package com.example.aidongprover2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class AboutUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        Toolbar aboutUsToo = (Toolbar) findViewById(R.id.aboutUsToolbar);
        setSupportActionBar(aboutUsToo);
        getSupportActionBar().setTitle("关于我们");
        TitleSet.setTitleCenter(aboutUsToo,"关于我们");
    }

    @Override
    public void onStop(){
        finish();
        super.onStop();
    }
}
