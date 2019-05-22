package com.example.aidongprover2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;

public class ShowStudyDetail extends AppCompatActivity {

    public static String studyDetailFunc = "";
    String reshen = "reshen";
    String yufang = "yufang";
    String chuli = "chuli";
    String tiaoyang = "tiaoyang";

    LinearLayout studyWarmKnowLin;
    ScrollView reshenLin;
    LinearLayout muscleStretchingLin;
    LinearLayout neckStretchingLin;
    LinearLayout shoulderStreLin;
    LinearLayout legStreLin;
    LinearLayout waistArLin;
    LinearLayout kneeJointArLin;
    LinearLayout ankleJointLin;
    LinearLayout jointMotionLin;
    Button reshenOp;
    Button yufangOp;
    Button chuliOp;
    Button tiaoyangOp;

    //慢跑按钮
    Button jogBtn;

    //肌肉拉伸按钮
    Button muscleStretchingBtn;
    Button neckStreBtn;
    Button shoulderStreBtn;
    Button legStreBtn;

    //关节运动按钮
    Button jointMotionBtn;
    Button waistArdBtn;
    Button kneeArBtn;
    Button ankleArBtn;
    Button shuttleRunBtn;
    Button warmUpWithBallBtn;
    LinearLayout warmUpWithABallLin;
    TextView jogText;
    TextView ankleArText;
    TextView shuttleRunText;

    ScrollView yufangLin;
    Button fullyWarmUpBtn ;
    Button snakerSelectionBtn ;
    Button matterNeedingBtn;
    Button matterAfSportBtn;
    TextView fullyWarmUpText;
    TextView snakerSelectionText;
    TextView matterNeedingText;
    TextView matterAfSportText;

    ScrollView chuliLin;
    Button muscleStrainBtn;
    TextView muscleStrainText;
    Button jointStrainBtn;
    TextView jointStrainText;
    Button abrasionBtn;
    TextView abrasionText;

    ScrollView tiaoyangLin;
    Button muscleStrainAfBtn;
    TextView muscleStrainAfText;
    Button jointStrainAfBtn;
    TextView jointStrainAfText;
    Button abrasionAfBtn;
    TextView abrasionAfText;

    TextView jointAcText;

    ImageView neckStreImag;
    ImageView shoulderStreImag;
    ImageView legStreImagone;
    ImageView legStreImagetwo;
    ImageView legStreImagethree;
    ImageView legStreImagefour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_study_detail);
        Toolbar studyDetailToolbar = (Toolbar) findViewById(R.id.studyDetailToolbar);

        studyWarmKnowLin = (LinearLayout) findViewById(R.id.studyWarmKnowLin);
        reshenLin = (ScrollView) findViewById(R.id.reshenLin);
        muscleStretchingLin = (LinearLayout) findViewById(R.id.muscleStretchingLin);
        jointMotionLin = (LinearLayout) findViewById(R.id.jointMotionLin);
        warmUpWithABallLin = (LinearLayout) findViewById(R.id.warmUpWithABallLin);

        yufangLin = (ScrollView) findViewById(R.id.yufangLin);
        chuliLin = (ScrollView) findViewById(R.id.chuliLin);
        tiaoyangLin = (ScrollView) findViewById(R.id.tiaoyangLin);

        //studyAdvancedKnow = (LinearLayout) findViewById(R.id.studyAdvancedKnow);

        setSupportActionBar(studyDetailToolbar);
        getSupportActionBar().setTitle(KnownHobby.getHobby()+"·运动前后");

        reshenOp = (Button) findViewById(R.id.reshenOp);
        yufangOp = (Button) findViewById(R.id.yufangOp);
        chuliOp = (Button) findViewById(R.id.chuliOp);
        tiaoyangOp = (Button) findViewById(R.id.tiaoyangOp);

        jogBtn = (Button) findViewById(R.id.jogBtn);
        muscleStretchingBtn = (Button) findViewById(R.id.muscleStretchingBtn);
        neckStreBtn = (Button) findViewById(R.id.neckStretchingBtn);
        shoulderStreBtn = (Button) findViewById(R.id.shoulderStretchingBtn);
        legStreBtn = (Button) findViewById(R.id.legStretchingBtn);

        jointMotionBtn = (Button) findViewById(R.id.jointMotionBtn);
        waistArdBtn = (Button) findViewById(R.id.waistAroundBtn);
        kneeArBtn = (Button) findViewById(R.id.kneeJointAroundBtn);
        ankleArBtn = (Button) findViewById(R.id.ankleJointBtn);

        shuttleRunBtn = (Button) findViewById(R.id.shuttleRunBtn);
        warmUpWithBallBtn = (Button) findViewById(R.id.warmUpWithABallBtn);

        jogText = (TextView) findViewById(R.id.jogText);

        neckStretchingLin = (LinearLayout) findViewById(R.id.neckStretchingLin);
        shoulderStreLin = (LinearLayout) findViewById(R.id.shoulderStreLin);
        legStreLin = (LinearLayout) findViewById(R.id.legStreLin);
        waistArLin = (LinearLayout) findViewById(R.id.waistArLin);
        kneeJointArLin = (LinearLayout) findViewById(R.id.kneeJointArLin);
        ankleJointLin = (LinearLayout) findViewById(R.id.ankleJointLin);

        shuttleRunText = (TextView) findViewById(R.id.shuttleRunText);
        jointAcText = (TextView) findViewById(R.id.jointAcText);

        fullyWarmUpBtn = (Button) findViewById(R.id.fullyWarmUpBtn);
        snakerSelectionBtn = (Button) findViewById(R.id.snakerSelectionBtn);
        matterNeedingBtn = (Button) findViewById(R.id.mattersNeedingBtn);
        matterAfSportBtn = (Button) findViewById(R.id.matterAfSportBtn);

        fullyWarmUpText = (TextView) findViewById(R.id.fullyWarmUpText);
        snakerSelectionText = (TextView) findViewById(R.id.snakerSelectionText);
        matterNeedingText = (TextView) findViewById(R.id.mattersNeedingText);
        matterAfSportText = (TextView) findViewById(R.id.matterAfSportText);

        muscleStrainBtn = (Button) findViewById(R.id.muscleStrainBtn);
        jointStrainBtn = (Button) findViewById(R.id.jointStrainBtn);
        abrasionBtn = (Button) findViewById(R.id.abrasionBtn);

        muscleStrainText = (TextView) findViewById(R.id.muscleStrainText);
        jointStrainText = (TextView) findViewById(R.id.jointStrainText);
        abrasionText = (TextView) findViewById(R.id.abrasionText);

        muscleStrainAfBtn = (Button) findViewById(R.id.muscleStrainAfBtn);
        jointStrainAfBtn = (Button) findViewById(R.id.jointStrainAfBtn);
        abrasionAfBtn = (Button) findViewById(R.id.abrasionAfBtn);

        muscleStrainAfText = (TextView) findViewById(R.id.muscleStrainAfText);
        jointStrainAfText = (TextView) findViewById(R.id.jointStrainAfText);
        abrasionAfText = (TextView) findViewById(R.id.abrasionAfText);

        //studyText1.setMovementMethod(ScrollingMovementMethod.getInstance());

        Intent intent = getIntent();
        String detailFunc = intent.getStringExtra(studyDetailFunc);



        if (detailFunc.equals(reshen)){
            showReshenKnow();
        }

        else if (detailFunc.equals(yufang)){
            showYufangKnow();
        }

        else if (detailFunc.equals(chuli)){
            showChuliKnow();
        }

        else if (detailFunc.equals(tiaoyang)){
            showTiaoyang();
        }
        else {
            showReshenKnow();
        }

        jogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyDetail.getJogflag()){
                    case 0:
                        jogText.setVisibility(View.VISIBLE);
                        StudyDetail.setJogflag(1);
                        break;
                    case 1:
                        jogText.setVisibility(View.GONE);
                        StudyDetail.setJogflag(0);
                        break;
                }
            }
        });


        muscleStretchingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyDetail.getMuscleStreflag()){
                    case 0:
                        muscleStretchingLin.setVisibility(View.VISIBLE);
                        StudyDetail.setMuscleStreflag(1);
                        break;
                    case 1:
                        muscleStretchingLin.setVisibility(View.GONE);
                        StudyDetail.setMuscleStreflag(0);
                        break;
                }
            }
        });

        neckStreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyDetail.getNeckStreflag()){
                    case 0:
                        neckStretchingLin.setVisibility(View.VISIBLE);
                        StudyDetail.setNeckStreflag(1);
                        break;
                    case 1:
                        neckStretchingLin.setVisibility(View.GONE);
                        StudyDetail.setNeckStreflag(0);
                        break;
                }
            }
        });

        shoulderStreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyDetail.getShoulderStreflag()){
                    case 0:
                        shoulderStreLin.setVisibility(View.VISIBLE);
                        StudyDetail.setShoulderStreflag(1);
                        break;
                    case 1:
                        shoulderStreLin.setVisibility(View.GONE);
                        StudyDetail.setShoulderStreflag(0);
                        break;
                }
            }
        });

        legStreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyDetail.getLegStreflag()){
                    case 0:
                        StudyDetail.setLegStreflag(1);
                        legStreLin.setVisibility(View.VISIBLE);
                        break;
                    case 1:
                        StudyDetail.setLegStreflag(0);
                        legStreLin.setVisibility(View.GONE);
                        break;
                }
            }
        });

        jointMotionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyDetail.getJointAcflag()){
                    case 0:
                        jointAcText.setVisibility(View.VISIBLE);
                        jointMotionLin.setVisibility(View.VISIBLE);
                        StudyDetail.setJointAcflag(1);
                        break;
                    case 1:
                        jointAcText.setVisibility(View.GONE);
                        jointMotionLin.setVisibility(View.GONE);
                        StudyDetail.setJointAcflag(0);
                        break;
                }
            }
        });

        waistArdBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyDetail.getWaistArflag()){
                    case 0:
                        waistArLin.setVisibility(View.VISIBLE);
                        StudyDetail.setWaistArflag(1);
                        break;
                    case 1:
                        waistArLin.setVisibility(View.GONE);
                        StudyDetail.setWaistArflag(0);
                        break;
                }
            }
        });

        kneeArBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyDetail.getKneeArflag()){
                    case 0:
                        kneeJointArLin.setVisibility(View.VISIBLE);
                        StudyDetail.setKneeArflag(1);
                        break;
                    case 1:
                        kneeJointArLin.setVisibility(View.GONE);
                        StudyDetail.setKneeArflag(0);
                        break;
                }
            }
        });

        ankleArBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyDetail.getAnkleArflag()){
                    case 0:
                        ankleJointLin.setVisibility(View.VISIBLE);
                        StudyDetail.setAnkleArflag(1);
                        break;
                    case 1:
                        ankleJointLin.setVisibility(View.GONE);
                        StudyDetail.setAnkleArflag(0);
                        break;
                }
            }
        });

        shuttleRunBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyDetail.getShuttleRunflag()){
                    case 0:
                        shuttleRunText.setVisibility(View.VISIBLE);
                        StudyDetail.setShuttleRunflag(1);
                        break;
                    case 1:
                        shuttleRunText.setVisibility(View.GONE);
                        StudyDetail.setShuttleRunflag(0);
                        break;
                }
            }
        });

        warmUpWithBallBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyDetail.getWarmUpWithflag()){
                    case 0:
                        warmUpWithABallLin.setVisibility(View.VISIBLE);
                        StudyDetail.setWarmUpWithflag(1);
                        break;
                    case 1:
                        warmUpWithABallLin.setVisibility(View.GONE);
                        StudyDetail.setWarmUpWithflag(0);
                        break;
                }
            }
        });


        reshenOp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reshenLin.setVisibility(View.VISIBLE);
                yufangLin.setVisibility(View.GONE);
                chuliLin.setVisibility(View.GONE);
                tiaoyangLin.setVisibility(View.GONE);

                reshenOp.setActivated(true);
                yufangOp.setActivated(false);
                chuliOp.setActivated(false);
                tiaoyangOp.setActivated(false);
            }
        });

        fullyWarmUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyDetail.getFullyWarmUpflag()){
                    case 0:
                        fullyWarmUpText.setVisibility(View.VISIBLE);
                        StudyDetail.setFullyWarmUpflag(1);
                        break;
                    case 1:
                        fullyWarmUpText.setVisibility(View.GONE);
                        StudyDetail.setFullyWarmUpflag(0);
                        break;
                }
            }
        });

        snakerSelectionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyDetail.getSnakerSelectionflag()){
                    case 0:
                        snakerSelectionText.setVisibility(View.VISIBLE);
                        StudyDetail.setSnakerSelectionflag(1);
                        break;
                    case 1:
                        snakerSelectionText.setVisibility(View.GONE);
                        StudyDetail.setSnakerSelectionflag(0);
                        break;
                }
            }
        });

        matterNeedingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyDetail.getMatterNeedingflag()){
                    case 0:
                        matterNeedingText.setVisibility(View.VISIBLE);
                        StudyDetail.setMatterNeedingflag(1);
                        break;
                    case 1:
                        matterNeedingText.setVisibility(View.GONE);
                        StudyDetail.setMatterNeedingflag(0);
                        break;
                }
            }
        });

        matterAfSportBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyDetail.getMatterAfSportflag()){
                    case 0:
                        matterAfSportText.setVisibility(View.VISIBLE);
                        StudyDetail.setMatterAfSportflag(1);
                        break;
                    case 1:
                        matterAfSportText.setVisibility(View.GONE);
                        StudyDetail.setMatterAfSportflag(0);
                        break;
                }
            }
        });

        yufangOp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reshenLin.setVisibility(View.GONE);
                yufangLin.setVisibility(View.VISIBLE);
                chuliLin.setVisibility(View.GONE);
                tiaoyangLin.setVisibility(View.GONE);

                reshenOp.setActivated(false);
                yufangOp.setActivated(true);
                chuliOp.setActivated(false);
                tiaoyangOp.setActivated(false);
            }
        });


        chuliOp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reshenLin.setVisibility(View.GONE);
                yufangLin.setVisibility(View.GONE);
                chuliLin.setVisibility(View.VISIBLE);
                tiaoyangLin.setVisibility(View.GONE);

                reshenOp.setActivated(false);
                yufangOp.setActivated(false);
                chuliOp.setActivated(true);
                tiaoyangOp.setActivated(false);
            }
        });

        muscleStrainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyDetail.getMuscleStrainflag()){
                    case 0:
                        muscleStrainText.setVisibility(View.VISIBLE);
                        StudyDetail.setMuscleStrainflag(1);
                        break;
                    case 1:
                        muscleStrainText.setVisibility(View.GONE);
                        StudyDetail.setMuscleStrainflag(0);
                        break;
                }
            }
        });

        jointStrainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyDetail.getJointStrainflag()){
                    case 0:
                        jointStrainText.setVisibility(View.VISIBLE);
                        StudyDetail.setJointStrainflag(1);
                        break;
                    case 1:
                        jointStrainText.setVisibility(View.GONE);
                        StudyDetail.setJointStrainflag(0);
                        break;
                }
            }
        });

        abrasionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyDetail.getAbrasionflag()){
                    case 0:
                        abrasionText.setVisibility(View.VISIBLE);
                        StudyDetail.setAbrasionflag(1);
                        break;
                    case 1:
                        abrasionText.setVisibility(View.GONE);
                        StudyDetail.setAbrasionflag(0);
                        break;
                }
            }
        });

        tiaoyangOp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reshenLin.setVisibility(View.GONE);
                yufangLin.setVisibility(View.GONE);
                chuliLin.setVisibility(View.GONE);
                tiaoyangLin.setVisibility(View.VISIBLE);

                reshenOp.setActivated(false);
                yufangOp.setActivated(false);
                chuliOp.setActivated(false);
                tiaoyangOp.setActivated(true);
            }
        });

        muscleStrainAfBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyDetail.getMuscleStrainAfflag()){
                    case 0:
                        muscleStrainAfText.setVisibility(View.VISIBLE);
                        StudyDetail.setMuscleStrainAfflag(1);
                        break;
                    case 1:
                        muscleStrainAfText.setVisibility(View.GONE);
                        StudyDetail.setMuscleStrainAfflag(0);
                        break;
                }
            }
        });

        jointStrainAfBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyDetail.getJointStrainAfflag()){
                    case 0:
                        jointStrainAfText.setVisibility(View.VISIBLE);
                        StudyDetail.setJointStrainAfflag(1);
                        break;
                    case 1:
                        jointStrainAfText.setVisibility(View.GONE);
                        StudyDetail.setJointStrainAfflag(0);
                        break;
                }
            }
        });

        abrasionAfBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyDetail.getAbrasionAfflag()){
                    case 0:
                        abrasionAfText.setVisibility(View.VISIBLE);
                        StudyDetail.setAbrasionAfflag(1);
                        break;
                    case 1:
                        abrasionAfText.setVisibility(View.GONE);
                        StudyDetail.setAbrasionAfflag(0);
                        break;
                }
            }
        });

    }

    private void showReshenKnow(){
        reshenOp.setActivated(true);
        yufangOp.setActivated(false);
        chuliOp.setActivated(false);
        tiaoyangOp.setActivated(false);

        reshenLin.setVisibility(View.VISIBLE);
        yufangLin.setVisibility(View.GONE);
        chuliLin.setVisibility(View.GONE);
        tiaoyangLin.setVisibility(View.GONE);
    }

    private void showYufangKnow(){
        reshenOp.setActivated(false);
        yufangOp.setActivated(true);
        chuliOp.setActivated(false);
        tiaoyangOp.setActivated(false);

        reshenLin.setVisibility(View.GONE);
        yufangLin.setVisibility(View.VISIBLE);
        chuliLin.setVisibility(View.GONE);
        tiaoyangLin.setVisibility(View.GONE);
    }

    private void showChuliKnow(){
        reshenOp.setActivated(false);
        yufangOp.setActivated(false);
        chuliOp.setActivated(true);
        tiaoyangOp.setActivated(false);

        reshenLin.setVisibility(View.GONE);
        yufangLin.setVisibility(View.GONE);
        chuliLin.setVisibility(View.VISIBLE);
        tiaoyangLin.setVisibility(View.GONE);
    }

    private void showTiaoyang(){
        reshenOp.setActivated(false);
        yufangOp.setActivated(false);
        chuliOp.setActivated(false);
        tiaoyangOp.setActivated(true);

        reshenLin.setVisibility(View.GONE);
        yufangLin.setVisibility(View.GONE);
        chuliLin.setVisibility(View.GONE);
        tiaoyangLin.setVisibility(View.VISIBLE);
    }
}
