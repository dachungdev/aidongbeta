package com.example.aidongprover2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;

import com.bumptech.glide.Glide;

public class ShowFbStudyDetail extends AppCompatActivity {

    public static String studyFbDetailFunc = "";
    String reshen = "reshen";
    String yufang = "yufang";
    String chuli = "chuli";
    String tiaoyang = "tiaoyang";

    Button fbReshenOp;
    Button fbYufangOp;
    Button fbChuliOp;
    Button fbTiaoyangOp;

    //热身专题
    ScrollView fbReshenLin;
    Button fbNormalWarmUpBtn;
    LinearLayout fbNormalWarmUpLin;
    Button fbJogBtn;
    TextView fbJogText;
    Button fbNormalMuscleStrainBtn;
    TextView fbNormalMuscleStrainText;
    Button fbVSRBtn;
    TextView fbVSRText;

    Button fbSpecialWarmUpBtn;
    LinearLayout fbSpecialWarmUpLin;
    Button fbSpecialWarmForwardBtn;
    TextView fbSpecialWarmForwardText;
    Button fbSpecialWarmMidfielderBtn;
    TextView fbSpecialWarmMidfielderText;
    Button fbSpecialWarmBackfielderBtn;
    TextView fbSpecialWarmBackfielderText;
    Button fbSpecialWarmGoalKeeperBtn;
    TextView fbSpecialWarmGoalKeeperText;

    //预防专题
    ScrollView fbYufangLin;
    Button fbSnakerSelBtn;
    LinearLayout fbSnakerSelLin;
    Button fbSnakerSGBtn;
    TextView fbSnakerSGText;
    Button fbSnakerFGBtn;
    TextView fbSnakerFGText;
    Button fbSnakerHGBtn;
    TextView fbSnakerHGText;
    Button fbSnakerAGBtn;
    TextView fbSnakerAGText;
    Button fbSnakerTFBtn;
    TextView fbSnakerTFText;
    Button fbSnakerICBtn;
    TextView fbSnakerICText;

    Button fbSpecialOtherBtn;
    LinearLayout fbSpecialOtherLin;

    //处理专题
    ScrollView fbChuliLin;
    Button fbCrampBtn;
    LinearLayout fbCrampLin;
    Button fbChuliMuscleStrainBtn;
    LinearLayout fbChuliMuscleStrainLin;
    Button fbChuliJointStrainBtn;
    TextView fbChuliJointStrainText;
    Button fbRICEBtn;
    LinearLayout fbRICELin;
    Button fbRBtn;
    TextView fbRText;
    Button fbIBtn;
    TextView fbIText;
    Button fbCBtn;
    TextView fbCText;
    Button fbEBtn;
    TextView fbEText;

    ImageView yufangImg;
    ImageView timg;

    //调养专题
    ScrollView fbTiaoyangLin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_fb_study_detail);
        Toolbar fbStudyDetailToolber = (Toolbar) findViewById(R.id.fbStudyDetailToolbar);

        fbReshenLin = (ScrollView) findViewById(R.id.fbReshenLin);
        fbYufangLin = (ScrollView) findViewById(R.id.fbYufangLin);
        fbChuliLin = (ScrollView) findViewById(R.id.fbChuliLin);
        fbTiaoyangLin = (ScrollView) findViewById(R.id.fbTiaoyangLin);

        setSupportActionBar(fbStudyDetailToolber);
        getSupportActionBar().setTitle(KnownHobby.getHobby()+"·运动前后");

        fbReshenOp = (Button) findViewById(R.id.fbReshenOp);
        fbYufangOp = (Button) findViewById(R.id.fbYufangOp);
        fbChuliOp = (Button) findViewById(R.id.fbChuliOp);
        fbTiaoyangOp = (Button) findViewById(R.id.fbTiaoyangOp);

        fbNormalWarmUpBtn = (Button) findViewById(R.id.fbNormalWarmUpBtn);
        fbNormalWarmUpLin = (LinearLayout) findViewById(R.id.fbNormalWarmUpLin);
        fbJogBtn = (Button) findViewById(R.id.fbJogBtn);
        fbJogText = (TextView) findViewById(R.id.fbJogText);
        fbNormalMuscleStrainBtn = (Button) findViewById(R.id.fbNormalMuscleStrainBtn);
        fbNormalMuscleStrainText = (TextView) findViewById(R.id.fbNormalMuscleStrainText);
        fbVSRBtn = (Button) findViewById(R.id.fbVSRBtn);
        fbVSRText = (TextView) findViewById(R.id.fbVSRText);

        fbSpecialWarmUpBtn = (Button) findViewById(R.id.fbSpecialWarmUpBtn);
        fbSpecialWarmUpLin = (LinearLayout) findViewById(R.id.fbSpecialWarmUpLin);
        fbSpecialWarmForwardBtn = (Button) findViewById(R.id.fbSpecialWarmForwardBtn);
        fbSpecialWarmForwardText = (TextView) findViewById(R.id.fbSpecialWarmForwardText);
        fbSpecialWarmMidfielderBtn = (Button) findViewById(R.id.fbSpecialWarmMidfielderBtn);
        fbSpecialWarmMidfielderText = (TextView) findViewById(R.id.fbSpecialWarmMidfielderText);
        fbSpecialWarmBackfielderBtn = (Button) findViewById(R.id.fbSpecialWarmBackfielderBtn);
        fbSpecialWarmBackfielderText = (TextView) findViewById(R.id.fbSpecialWarmBackfielderText);
        fbSpecialWarmGoalKeeperBtn = (Button) findViewById(R.id.fbSpecialWarmGoalKeeperBtn);
        fbSpecialWarmGoalKeeperText = (TextView) findViewById(R.id.fbSpecialWarmGoalKeeperText);

        fbSnakerSelBtn = (Button) findViewById(R.id.fbSnakerSelBtn);
        fbSnakerSelLin = (LinearLayout) findViewById(R.id.fbSnakerSelLin);
        fbSnakerSGBtn = (Button) findViewById(R.id.fbSnakerSGBtn);
        fbSnakerSGText = (TextView) findViewById(R.id.fbSnakerSGText);
        fbSnakerFGBtn = (Button) findViewById(R.id.fbSnakerFGBtn);
        fbSnakerFGText = (TextView) findViewById(R.id.fbSnakerFGText);
        fbSnakerHGBtn = (Button) findViewById(R.id.fbSnakerHGBtn);
        fbSnakerHGText = (TextView) findViewById(R.id.fbSnakerHGText);
        fbSnakerAGBtn = (Button) findViewById(R.id.fbSnakerAGBtn);
        fbSnakerAGText = (TextView) findViewById(R.id.fbSnakerAGText);
        fbSnakerTFBtn = (Button) findViewById(R.id.fbSnakerTFBtn);
        fbSnakerTFText = (TextView) findViewById(R.id.fbSnakerTFText);
        fbSnakerICBtn = (Button) findViewById(R.id.fbSnakerICBtn);
        fbSnakerICText = (TextView) findViewById(R.id.fbSnakerICText);
        fbSpecialOtherBtn = (Button) findViewById(R.id.fbSpecialOtherBtn);
        fbSpecialOtherLin = (LinearLayout) findViewById(R.id.fbSpecialOtherLin);

        fbCrampBtn = (Button) findViewById(R.id.fbCrampBtn);
        fbCrampLin = (LinearLayout) findViewById(R.id.fbCrampLin);
        fbChuliMuscleStrainBtn = (Button) findViewById(R.id.fbChuliMuscleStrainBtn);
        fbChuliMuscleStrainLin = (LinearLayout) findViewById(R.id.fbChuliMuscleStrainLin);
        fbChuliJointStrainBtn = (Button) findViewById(R.id.fbChuliJointStrainBtn);
        fbChuliJointStrainText = (TextView) findViewById(R.id.fbChuliJointStrainText);
        fbRICEBtn = (Button) findViewById(R.id.fbRICEBtn);
        fbRICELin = (LinearLayout) findViewById(R.id.fbRICELin);
        fbRBtn = (Button) findViewById(R.id.fbRBtn);
        fbRText = (TextView) findViewById(R.id.fbRText);
        fbIBtn = (Button) findViewById(R.id.fbIBtn);
        fbIText = (TextView) findViewById(R.id.fbIText);
        fbCBtn = (Button) findViewById(R.id.fbCBtn) ;
        fbCText = (TextView) findViewById(R.id.fbCText);
        fbEBtn = (Button) findViewById(R.id.fbEBtn);
        fbEText = (TextView) findViewById(R.id.fbEText);

        yufangImg = (ImageView) findViewById(R.id.yufangImg);
        timg = (ImageView) findViewById(R.id.timg);

        Intent intent = getIntent();
        if (reshen.equals(intent.getStringExtra(studyFbDetailFunc))){
            showReshen();
        }
        else if (yufang.equals(intent.getStringExtra(studyFbDetailFunc))){
            showYufang();
        }
        else if (chuli.equals(intent.getStringExtra(studyFbDetailFunc))){
            showChuli();
        }
        else if (tiaoyang.equals(intent.getStringExtra(studyFbDetailFunc))){
            showTiaoyang();
        }
        else {
            showReshen();
        }

        fbReshenOp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showReshen();
            }
        });

        fbYufangOp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showYufang();
            }
        });

        fbChuliOp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showChuli();
            }
        });

        fbTiaoyangOp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showTiaoyang();
            }
        });

        //常规热身运动
        fbNormalWarmUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbNormalWarmUpFlag()){
                    case 0:
                        fbNormalWarmUpLin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbNormalWarmUpFlag(1);
                        break;
                    case 1:
                        fbNormalWarmUpLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbNormalWarmUpFlag(0);
                        break;
                }
            }
        });

        fbJogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbJogFlag()){
                    case 0:
                        fbJogText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbJogFlag(1);
                        break;
                    case 1:
                        fbJogText.setVisibility(View.GONE);
                        StudyFbDetail.setFbJogFlag(0);
                        break;
                }
            }
        });

        fbNormalMuscleStrainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbNormalMuscleStrainFlag()){
                    case 0:
                        fbNormalMuscleStrainText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbNormalMuscleStrainFlag(1);
                        break;
                    case 1:
                        fbNormalMuscleStrainText.setVisibility(View.GONE);
                        StudyFbDetail.setFbNormalMuscleStrainFlag(0);
                        break;
                }
            }
        });

        fbVSRBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbVSRFlag()){
                    case 0:
                        fbVSRText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbVSRFlag(1);
                        break;
                    case 1:
                        fbVSRText.setVisibility(View.GONE);
                        StudyFbDetail.setFbVSRFlag(0);
                        break;
                }
            }
        });

        fbSpecialWarmUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbSpecialWarmUpFlag()){
                    case 0:
                        fbSpecialWarmUpLin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbSpecialWarmUpFlag(1);
                        break;
                    case 1:
                        fbSpecialWarmUpLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbSpecialWarmUpFlag(0);
                        break;
                }
            }
        });

        fbSpecialWarmForwardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbSpecialWarmForwardFlag()){
                    case 0:
                        fbSpecialWarmForwardText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbSpecialWarmForwardFlag(1);
                        break;
                    case 1:
                        fbSpecialWarmForwardText.setVisibility(View.GONE);
                        StudyFbDetail.setFbSpecialWarmForwardFlag(0);
                        break;
                }
            }
        });

        fbSpecialWarmMidfielderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbSpecialWarmMidfielderFlag()){
                    case 0:
                        fbSpecialWarmMidfielderText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbSpecialWarmMidfielderFlag(1);
                        break;
                    case 1:
                        fbSpecialWarmMidfielderText.setVisibility(View.GONE);
                        StudyFbDetail.setFbSpecialWarmMidfielderFlag(0);
                        break;
                }
            }
        });

        fbSpecialWarmBackfielderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbSpecialWarmBackfielderFlag()){
                    case 0:
                        fbSpecialWarmBackfielderText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbSpecialWarmBackfielderFlag(1);
                        break;
                    case 1:
                        fbSpecialWarmBackfielderText.setVisibility(View.GONE);
                        StudyFbDetail.setFbSpecialWarmBackfielderFlag(0);
                        break;
                }
            }
        });

        fbSpecialWarmGoalKeeperBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbSpecialWarmGoalKeeperFlag()){
                    case 0:
                        fbSpecialWarmGoalKeeperText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbSpecialWarmGoalKeeperFlag(1);
                        break;
                    case 1:
                        fbSpecialWarmGoalKeeperText.setVisibility(View.GONE);
                        StudyFbDetail.setFbSpecialWarmGoalKeeperFlag(0);
                        break;
                }
            }
        });

        fbSnakerSelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbSnakerSelFlag()){
                    case 0:
                        fbSnakerSelLin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbSnakerSelFlag(1);
                        break;
                    case 1:
                        fbSnakerSelLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbSnakerSelFlag(0);
                        break;
                }
            }
        });

        fbSnakerSGBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbSnakerSGFlag()){
                    case 0:
                        fbSnakerSGText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbSnakerSGFlag(1);
                        break;
                    case 1:
                        fbSnakerSGText.setVisibility(View.GONE);
                        StudyFbDetail.setFbSnakerSGFlag(0);
                        break;
                }
            }
        });

        fbSnakerFGBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbSnakerFGFlag()){
                    case 0:
                        fbSnakerFGText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbSnakerFGFlag(1);
                        break;
                    case 1:
                        fbSnakerFGText.setVisibility(View.GONE);
                        StudyFbDetail.setFbSnakerFGFlag(0);
                        break;
                }
            }
        });

        fbSnakerHGBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbSnakerHGFlag()){
                    case 0:
                        fbSnakerHGText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbSnakerHGFlag(1);
                        break;
                    case 1:
                        fbSnakerHGText.setVisibility(View.GONE);
                        StudyFbDetail.setFbSnakerHGFlag(0);
                        break;
                }
            }
        });

        fbSnakerAGBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbSnakerAGFlag()){
                    case 0:
                        fbSnakerAGText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbSnakerAGFlag(1);
                        break;
                    case 1:
                        fbSnakerAGText.setVisibility(View.GONE);
                        StudyFbDetail.setFbSnakerAGFlag(0);
                        break;
                }
            }
        });

        fbSnakerTFBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbSnakerTFFlag()){
                    case 0:
                        fbSnakerTFText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbSnakerTFFlag(1);
                        break;
                    case 1:
                        fbSnakerTFText.setVisibility(View.GONE);
                        StudyFbDetail.setFbSnakerTFFlag(0);
                        break;
                }
            }
        });

        fbSnakerICBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbSnakerICFlag()){
                    case 0:
                        fbSnakerICText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbSnakerICFlag(1);
                        break;
                    case 1:
                        fbSnakerICText.setVisibility(View.GONE);
                        StudyFbDetail.setFbSnakerICFlag(0);
                        break;
                }
            }
        });

        fbSpecialOtherBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbSpecialOtherFlag()){
                    case 0:
                        fbSpecialOtherLin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbSpecialOtherFlag(1);
                        break;
                    case 1:
                        fbSpecialOtherLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbSpecialOtherFlag(0);
                        break;
                }
            }
        });

        fbCrampBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbCrampFlag()){
                    case 0:
                        fbCrampLin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbCrampFlag(1);
                        break;
                    case 1:
                        fbCrampLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbCrampFlag(0);
                        break;
                }
            }
        });

        fbChuliMuscleStrainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbChuliMuscleStrainFlag()){
                    case 0:
                        fbChuliMuscleStrainLin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbChuliMuscleStrainFlag(1);
                        break;
                    case 1:
                        fbChuliMuscleStrainLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbChuliMuscleStrainFlag(0);
                        break;
                }
            }
        });

        fbChuliJointStrainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbChuliJointStrainFlag()){
                    case 0:
                        fbChuliJointStrainText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbChuliJointStrainFlag(1);
                        break;
                    case 1:
                        fbChuliJointStrainText.setVisibility(View.GONE);
                        StudyFbDetail.setFbChuliJointStrainFlag(0);
                        break;
                }
            }
        });

        fbRICEBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbRICEFlag()){
                    case 0:
                        fbRICELin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbRICEFlag(1);
                        break;
                    case 1:
                        fbRICELin.setVisibility(View.GONE);
                        StudyFbDetail.setFbRICEFlag(0);
                        break;
                }
            }
        });

        fbRBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbRFlag()){
                    case 0:
                        fbRText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbRFlag(1);
                        break;
                    case 1:
                        fbRText.setVisibility(View.GONE);
                        StudyFbDetail.setFbRFlag(0);
                        break;
                }
            }
        });

        fbIBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbIFlag()){
                    case 0:
                        fbIText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbIFlag(1);
                        break;
                    case 1:
                        fbIText.setVisibility(View.GONE);
                        StudyFbDetail.setFbIFlag(0);
                        break;
                }
            }
        });

        fbCBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbCFlag()){
                    case 0:
                        fbCText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbCFlag(1);
                        break;
                    case 1:
                        fbCText.setVisibility(View.GONE);
                        StudyFbDetail.setFbCFlag(0);
                        break;
                }
            }
        });

        fbEBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbEFlag()){
                    case 0:
                        fbEText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbEFlag(1);
                        break;
                    case 1:
                        fbEText.setVisibility(View.GONE);
                        StudyFbDetail.setFbEFlag(0);
                        break;
                }
            }
        });
    }

    private void showReshen(){
        fbReshenOp.setActivated(true);
        fbYufangOp.setActivated(false);
        fbChuliOp.setActivated(false);
        fbTiaoyangOp.setActivated(false);

        fbReshenLin.setVisibility(View.VISIBLE);
        fbYufangLin.setVisibility(View.GONE);
        fbChuliLin.setVisibility(View.GONE);
        fbTiaoyangLin.setVisibility(View.GONE);
    }

    private void showYufang(){
        fbReshenOp.setActivated(false);
        fbYufangOp.setActivated(true);
        fbChuliOp.setActivated(false);
        fbTiaoyangOp.setActivated(false);

        fbReshenLin.setVisibility(View.GONE);
        fbYufangLin.setVisibility(View.VISIBLE);
        fbChuliLin.setVisibility(View.GONE);
        fbTiaoyangLin.setVisibility(View.GONE);

        Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/yufang.jpg").into(yufangImg);
        Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/timg.jpg").into(timg);
    }

    private void showChuli(){
        fbReshenOp.setActivated(false);
        fbYufangOp.setActivated(false);
        fbChuliOp.setActivated(true);
        fbTiaoyangOp.setActivated(false);

        fbReshenLin.setVisibility(View.GONE);
        fbYufangLin.setVisibility(View.GONE);
        fbChuliLin.setVisibility(View.VISIBLE);
        fbTiaoyangLin.setVisibility(View.GONE);
    }

    private void showTiaoyang(){
        fbReshenOp.setActivated(false);
        fbYufangOp.setActivated(false);
        fbChuliOp.setActivated(false);
        fbTiaoyangOp.setActivated(true);

        fbReshenLin.setVisibility(View.GONE);
        fbYufangLin.setVisibility(View.GONE);
        fbChuliLin.setVisibility(View.GONE);
        fbTiaoyangLin.setVisibility(View.VISIBLE);
    }
}
