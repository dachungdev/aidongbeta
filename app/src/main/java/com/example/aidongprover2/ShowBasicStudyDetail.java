package com.example.aidongprover2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class ShowBasicStudyDetail extends AppCompatActivity {

    public static String studyBasicDetailKind = "";
    String rule = "rule";
    String motion = "motion";
    String skill = "skill";

    Button rulerOp;

    Button actionOp;

    Button skillOp;

    ScrollView rulerLin;

    ScrollView actionLin;

    ScrollView skillLin;


    Button attackBtn;

    Button defenseBtn;


    Button driBtn;

    LinearLayout driLin;

    Button passTBBtn;

    TextView passTBText;

    Button shotBtn;

    LinearLayout shotLin;

    Button layupBtn;

    LinearLayout layupLin;

    Button skDribtn;

    LinearLayout skDriLin;

    Button skShotBtn;

    TextView skShotText;

    Button cooBtn;

    TextView cooText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_basic_study_detail);
        Toolbar studyBasicDetailToolbar = (Toolbar) findViewById(R.id.studyBasicDetailToolbar);

        LinearLayout studyBasicKnowToo = (LinearLayout) findViewById(R.id.studyBasicKnowToo);
        rulerOp = (Button) findViewById(R.id.rulerOp);
        actionOp = (Button) findViewById(R.id.actionOp);
        skillOp = (Button) findViewById(R.id.skillOp);

        rulerLin = (ScrollView) findViewById(R.id.rulerLin);
        actionLin = (ScrollView) findViewById(R.id.actionLin);
        skillLin = (ScrollView) findViewById(R.id.skillLin);

        attackBtn = (Button) findViewById(R.id.attackBtn);
        defenseBtn = (Button) findViewById(R.id.defenseBtn);

        driBtn = (Button) findViewById(R.id.driBtn);
        driLin = (LinearLayout) findViewById(R.id.driLin);
        passTBBtn = (Button) findViewById(R.id.passTBBtn);
        passTBText = (TextView) findViewById(R.id.passTBText);
        shotBtn = (Button) findViewById(R.id.shotBtn);
        shotLin = (LinearLayout) findViewById(R.id.shotLin);
        layupBtn = (Button) findViewById(R.id.layupBtn);
        layupLin = (LinearLayout) findViewById(R.id.layupLin);
        skDribtn = (Button) findViewById(R.id.skDriBtn);
        skDriLin = (LinearLayout) findViewById(R.id.skDriLin);
        skShotBtn = (Button) findViewById(R.id.skShotBtn);
        skShotText = (TextView) findViewById(R.id.skShotText);
        cooBtn = (Button) findViewById(R.id.cooBtn);
        cooText = (TextView) findViewById(R.id.cooText);

        setSupportActionBar(studyBasicDetailToolbar);
        getSupportActionBar().setTitle(KnownHobby.getHobby()+"·基础");

        Intent intent = getIntent();
        final String basicDetailKind = intent.getStringExtra(studyBasicDetailKind);

        if (basicDetailKind.equals(rule)){
            kindRuler();
        }

        else if (basicDetailKind.equals(motion)){
            kindAction();
        }

        else if (basicDetailKind.equals(skill)){
            kindSkill();
        }

        rulerOp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rulerLin.setVisibility(View.VISIBLE);
                actionLin.setVisibility(View.GONE);
                skillLin.setVisibility(View.GONE);

                rulerOp.setActivated(true);
                actionOp.setActivated(false);
                skillOp.setActivated(false);
            }
        });

        actionOp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rulerLin.setVisibility(View.GONE);
                actionLin.setVisibility(View.VISIBLE);
                skillLin.setVisibility(View.GONE);

                rulerOp.setActivated(false);
                actionOp.setActivated(true);
                skillOp.setActivated(false);
            }
        });

        skillOp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rulerLin.setVisibility(View.GONE);
                actionLin.setVisibility(View.GONE);
                skillLin.setVisibility(View.VISIBLE);

                rulerOp.setActivated(false);
                actionOp.setActivated(false);
                skillOp.setActivated(true);
            }
        });

        driBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyDetail.getDriflag()){
                    case 0:
                        driLin.setVisibility(View.VISIBLE);
                        StudyDetail.setDriflag(1);
                        break;
                    case 1:
                        driLin.setVisibility(View.GONE);
                        StudyDetail.setDriflag(0);
                        break;
                }
            }
        });

        passTBBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyDetail.getPassTBflag()){
                    case 0:
                        passTBText.setVisibility(View.VISIBLE);
                        StudyDetail.setPassTBflag(1);
                        break;
                    case 1:
                        passTBText.setVisibility(View.GONE);
                        StudyDetail.setPassTBflag(0);
                        break;
                }
            }
        });

        shotBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyDetail.getShotflag()){
                    case 0:
                        shotLin.setVisibility(View.VISIBLE);
                        StudyDetail.setShotflag(1);
                        break;
                    case 1:
                        shotLin.setVisibility(View.GONE);
                        StudyDetail.setShotflag(0);
                        break;
                }
            }
        });

        layupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyDetail.getLayupflag()){
                    case 0:
                        layupLin.setVisibility(View.VISIBLE);
                        StudyDetail.setLayupflag(1);
                        break;
                    case 1:
                        layupLin.setVisibility(View.GONE);
                        StudyDetail.setLayupflag(0);
                        break;
                }
            }
        });

        skDribtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyDetail.getSkDriflag()){
                    case 0:
                        skDriLin.setVisibility(View.VISIBLE);
                        StudyDetail.setSkDriflag(1);
                        break;
                    case 1:
                        skDriLin.setVisibility(View.GONE);
                        StudyDetail.setSkDriflag(0);
                        break;
                }
            }
        });

        skShotBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyDetail.getSkShotflag()){
                    case 0:
                        skShotText.setVisibility(View.VISIBLE);
                        StudyDetail.setSkShotflag(1);
                        break;
                    case 1:
                        skShotText.setVisibility(View.GONE);
                        StudyDetail.setSkShotflag(0);
                        break;
                }
            }
        });

        cooBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyDetail.getCooflag()){
                    case 0:
                        cooText.setVisibility(View.VISIBLE);
                        StudyDetail.setCooflag(1);
                        break;
                    case 1:
                        cooText.setVisibility(View.GONE);
                        StudyDetail.setCooflag(0);
                        break;
                }
            }
        });


    }

    private void kindRuler(){
        rulerOp.setActivated(true);
        actionOp.setActivated(false);
        skillOp.setActivated(false);

        rulerLin.setVisibility(View.VISIBLE);
        actionLin.setVisibility(View.GONE);
        skillLin.setVisibility(View.GONE);
    }

    private void kindAction(){
        rulerOp.setActivated(false);
        actionOp.setActivated(true);
        skillOp.setActivated(false);

        rulerLin.setVisibility(View.GONE);
        actionLin.setVisibility(View.VISIBLE);
        skillLin.setVisibility(View.GONE);
    }

    private void kindSkill(){
        rulerOp.setActivated(false);
        actionOp.setActivated(false);
        skillOp.setActivated(true);

        rulerLin.setVisibility(View.GONE);
        actionLin.setVisibility(View.GONE);
        skillLin.setVisibility(View.VISIBLE);
    }

    @Override
    public void onStop(){
        finish();
        super.onStop();
    }
}
