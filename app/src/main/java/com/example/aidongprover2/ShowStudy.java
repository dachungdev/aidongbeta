package com.example.aidongprover2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ShowStudy extends AppCompatActivity {

    public static final String studyFunc = "";

    Button studyWarmKnowOp;

    Button studyBasicKnowOp;

    Button studyAdvancedOp;

    LinearLayout warmKnowDetail;

    LinearLayout basicKnowDettail;

    LinearLayout advancedKnowDetail;

    ScrollView warmKnowScro;

    ScrollView basicKnowScro;

    String reshen = "reshen";
    String yufang = "yufang";
    String chuli = "chuli";
    String tiaoyang = "tiaoyang";

    String rule = "rule";
    String motion = "motion";
    String skill = "skill";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_study);

        Toolbar studyToolbar = (Toolbar) findViewById(R.id.studyToolbar);
        studyWarmKnowOp = (Button) findViewById(R.id.studyWarmKnowOp);
        studyBasicKnowOp = (Button) findViewById(R.id.studyBasicKnowOp);
        studyAdvancedOp = (Button) findViewById(R.id.studyAdvancedKnowOp);

        //运动前后板块
        Button reshen_btn = (Button) findViewById(R.id.reshen_btn);
        Button yufang_btn = (Button) findViewById(R.id.yufang_btn);
        Button chuli_btn = (Button) findViewById(R.id.chuli_btn);
        Button tiaoyang_btn = (Button) findViewById(R.id.tiaoyang_btn);


        //基础板块
        Button ruler_btn = (Button) findViewById(R.id.ruler_btn);
        Button action_btn = (Button) findViewById(R.id.action_btn);
        Button skill_btn = (Button) findViewById(R.id.skill_btn);

        warmKnowDetail = (LinearLayout) findViewById(R.id.warmKnowDetail);
        basicKnowDettail = (LinearLayout) findViewById(R.id.basicKnowDetail);

        warmKnowScro = (ScrollView) findViewById(R.id.warmKnowScro);

        setSupportActionBar(studyToolbar);
        getSupportActionBar().setTitle(KnownHobby.getHobby()+"·学习");

        studyWarmKnowOp.setActivated(false);
        studyBasicKnowOp.setActivated(false);
        studyAdvancedOp.setActivated(false);

        warmKnowDetail.setVisibility(View.GONE);
        basicKnowDettail.setVisibility(View.GONE);

        warmKnowScro.setVisibility(View.GONE);

        final Intent intent = getIntent();
        String study_func = intent.getStringExtra(studyFunc);

        if (study_func.equals("studyWarm")){
            studyWarm();
        }
        if (study_func.equals("studyBasic")){
            studyBasic();
        }

        studyWarmKnowOp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                studyWarm();
            }
        });

        studyBasicKnowOp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                studyBasic();
            }
        });

        studyAdvancedOp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                studyAdvanced();
            }
        });

        reshen_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NetWorkRequest.markType(User.getUserName(),"study",ActivityData.getSystemTime());
                if (hobbyNo() == 1) {
                    Intent intent1 = new Intent(MyApplication.getContext(), ShowStudyDetail.class);
                    intent1.putExtra(ShowStudyDetail.studyDetailFunc, reshen);
                    MyApplication.getContext().startActivity(intent1);
                }
                else {
                    Intent intent3 = new Intent(MyApplication.getContext(),ShowFbStudyDetail.class);
                    intent3.putExtra(ShowFbStudyDetail.studyFbDetailFunc,reshen);
                    MyApplication.getContext().startActivity(intent3);
                }
            }
        });

        yufang_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NetWorkRequest.markType(User.getUserName(),"study",ActivityData.getSystemTime());
                if (hobbyNo() == 1) {
                    Intent intent1 = new Intent(MyApplication.getContext(), ShowStudyDetail.class);
                    intent1.putExtra(ShowStudyDetail.studyDetailFunc, yufang);
                    MyApplication.getContext().startActivity(intent1);
                }
                else {
                    Intent intent3 = new Intent(MyApplication.getContext(),ShowFbStudyDetail.class);
                    intent3.putExtra(ShowFbStudyDetail.studyFbDetailFunc,yufang);
                    MyApplication.getContext().startActivity(intent3);
                }
            }
        });

        chuli_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NetWorkRequest.markType(User.getUserName(),"study",ActivityData.getSystemTime());
                if (hobbyNo() == 1) {
                    Intent intent1 = new Intent(MyApplication.getContext(), ShowStudyDetail.class);
                    intent1.putExtra(ShowStudyDetail.studyDetailFunc, chuli);
                    MyApplication.getContext().startActivity(intent1);
                }
                else {
                    Intent intent3 = new Intent(MyApplication.getContext(),ShowFbStudyDetail.class);
                    intent3.putExtra(ShowFbStudyDetail.studyFbDetailFunc,chuli);
                    MyApplication.getContext().startActivity(intent3);
                }
            }
        });

        tiaoyang_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NetWorkRequest.markType(User.getUserName(),"study",ActivityData.getSystemTime());
                if (hobbyNo() == 1) {
                    Intent intent1 = new Intent(MyApplication.getContext(), ShowStudyDetail.class);
                    intent1.putExtra(ShowStudyDetail.studyDetailFunc, tiaoyang);
                    MyApplication.getContext().startActivity(intent1);
                }
                else {
                    Intent intent3 = new Intent(MyApplication.getContext(),ShowFbStudyDetail.class);
                    intent3.putExtra(ShowFbStudyDetail.studyFbDetailFunc,tiaoyang);
                    MyApplication.getContext().startActivity(intent3);
                }
            }
        });

        ruler_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NetWorkRequest.markType(User.getUserName(),"study",ActivityData.getSystemTime());
                if (hobbyNo() == 1) {
                    Intent intent2 = new Intent(MyApplication.getContext(), ShowBasicStudyDetail.class);
                    intent2.putExtra(ShowBasicStudyDetail.studyBasicDetailKind, rule);
                    MyApplication.getContext().startActivity(intent2);
                }
                else {
                    Intent intent4 = new Intent(MyApplication.getContext(),ShowFbBasicStudyDetail.class);
                    intent4.putExtra(ShowFbBasicStudyDetail.studyFbDetailKind,rule);
                    MyApplication.getContext().startActivity(intent4);
                }
            }
        });

        action_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NetWorkRequest.markType(User.getUserName(),"study",ActivityData.getSystemTime());
                if (hobbyNo() == 1) {
                    Intent intent2 = new Intent(MyApplication.getContext(), ShowBasicStudyDetail.class);
                    intent2.putExtra(ShowBasicStudyDetail.studyBasicDetailKind, motion);
                    MyApplication.getContext().startActivity(intent2);
                }
                else {
                    Intent intent4 = new Intent(MyApplication.getContext(),ShowFbBasicStudyDetail.class);
                    intent4.putExtra(ShowFbBasicStudyDetail.studyFbDetailKind,motion);
                    MyApplication.getContext().startActivity(intent4);
                }
            }
        });

        skill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NetWorkRequest.markType(User.getUserName(),"study",ActivityData.getSystemTime());
                if (hobbyNo() == 1) {
                    Intent intent2 = new Intent(MyApplication.getContext(), ShowBasicStudyDetail.class);
                    intent2.putExtra(ShowBasicStudyDetail.studyBasicDetailKind, skill);
                    MyApplication.getContext().startActivity(intent2);
                }
                else {
                    Intent intent4 = new Intent(MyApplication.getContext(),ShowFbBasicStudyDetail.class);
                    intent4.putExtra(ShowFbBasicStudyDetail.studyFbDetailKind,skill);
                    MyApplication.getContext().startActivity(intent4);
                }
            }
        });
    }

    private void studyWarm(){
        studyWarmKnowOp.setActivated(true);
        studyBasicKnowOp.setActivated(false);
        studyAdvancedOp.setActivated(false);

        warmKnowDetail.setVisibility(View.VISIBLE);
        basicKnowDettail.setVisibility(View.GONE);

        warmKnowScro.setVisibility(View.VISIBLE);
    }

    private void studyBasic(){
        studyWarmKnowOp.setActivated(false);
        studyBasicKnowOp.setActivated(true);
        studyAdvancedOp.setActivated(false);

        warmKnowDetail.setVisibility(View.GONE);
        basicKnowDettail.setVisibility(View.VISIBLE);

        warmKnowScro.setVisibility(View.GONE);
    }

    private void studyAdvanced(){
        studyWarmKnowOp.setActivated(false);
        studyBasicKnowOp.setActivated(false);
        studyAdvancedOp.setActivated(true);

        warmKnowDetail.setVisibility(View.GONE);
        basicKnowDettail.setVisibility(View.GONE);

        warmKnowScro.setVisibility(View.GONE);
    }

    private int hobbyNo(){
        if (KnownHobby.getHobby().equals("篮球") ){
            return 1;
        }
        else {return 2;}
    }

    @Override
    public void onStop(){
        if (ActivityData.getActivityId()==2){
            finish();
        }
        else;
        super.onStop();
    }
}
