package com.example.aidongprover2;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ShowFbBasicStudyDetail extends AppCompatActivity {
    public static String studyFbDetailKind = "";
    String rule = "rule";
    String motion = "motion";
    String skill = "skill";

    Button fbRuleOp;
    Button fbMotionOp;
    Button fbSkillOp;

    ScrollView fbRuleLin;
    Button fbAreanBtn;
    LinearLayout fbAreanLin;
    Button fbSiteAreaBtn;
    TextView fbSiteAreaText;
    Button fbGoalAreaBtn;
    TextView fbGoalAreaText;
    Button fbPenaltyAreaBtn;
    TextView fbPenaltyAreaText;
    Button fbCornerAreaBtn;
    TextView fbCornerAreaText;

    Button fbMatchTimeBtn;
    LinearLayout fbMatchTimeLin;
    Button fbHalfTimeBtn;
    TextView fbHalfTimeText;
    Button fbLossTimeBtn;
    TextView fbLossTimeText;
    Button fbTimePenaltyKickBtn;
    TextView fbTimePenaltyKickText;
    Button fbInjuryTimeBtn;
    TextView fbInjuryTimeText;

    Button fbDeadBallBtn;
    LinearLayout fbDeadBallLin;
    Button fbDeadBallInGameBtn;
    TextView fbDeadBallInGameText;
    Button fbDeadBallGoOnBtn;
    TextView fbDeadBallGoOnText;

    Button fbScoringMethodBtn;
    LinearLayout fbScoringMethodLin;
    Button fbGoalScoreBtn;
    TextView fbGoalScoreText;
    Button fbWiningTeamBtn;
    TextView fbWiningTeamText;
    Button fbCompetitionRulesBtn;
    TextView fbCompetitionRulesText;

    Button fbOffsideBtn;
    LinearLayout fbOffsideLin;
    Button fbOffsidePositionBtn;
    TextView fbOffsidePositionText;
    Button fbOffsideFoulnBtn;
    TextView fbOffsideFoulnText;
    Button fbOffsideNoFoulBtn;
    TextView fbOffsideNoFoulText;
    Button fbOffsidePunishBtn;
    TextView fbOffsidePunishText;

    Button fbFoulConductBtn;
    LinearLayout fbFoulConductLin;
    Button fbFoulDirectFreeKickBtn;
    TextView fbFoulDirectFreeKickText;
    Button fbFoulPenaltyShotBtn;
    TextView fbFoulPenaltyShotText;
    Button fbWarningFoulBtn;
    TextView fbWarningFoulText;
    Button fbFoulOutBtn;
    TextView fbFoulOutText;
    Button fbFoulIndirectFreeKickBtn;
    TextView fbFoulIndirectFreeKickText;

    Button fbFreeKickBtn;
    LinearLayout fbFreeKickLin;
    Button fbDirectFreeKickBtn;
    TextView fbDirectFreeKickText;
    Button fbIndirectFreeKickBtn;
    LinearLayout fbIndirectFreeKickLin;
    Button fbIFKsignalBtn;
    TextView fbIFKsignalText;
    Button fbIFKgoalBtn;
    TextView fbIFKgoalText;
    Button fbIFKPositionBtn;
    TextView fbIFKPositionText;
    Button fbIFKfoulBtn;
    LinearLayout fbIFKfoulLin;

    Button fbThrowInBtn;
    LinearLayout fbThrowInLin;
    Button fbTIdetermineBtn;
    TextView fbTIdetermineText;
    Button fbTIprogramBtn;
    TextView fbTIprogramText;
    Button fbTIprogramFoulBtn;
    LinearLayout fbTIprogramFoulLin;

    Button fbGoalKickBtn;
    LinearLayout fbGoalKickLin;
    Button fbGKdetermineBtn;
    TextView fbGKdetermineText;
    Button fbGKprogramBtn;
    TextView fbGKprogramText;
    Button fbGKfoulBtn;
    LinearLayout fbGKfoulLin;

    Button fbCornerKickBtn;
    LinearLayout fbCornerKickLin;
    Button fbCKdetermineBtn;
    TextView fbCKdetermineText;
    Button fbCKprogramBtn;
    TextView fbCKprogramText;
    Button fbCKprogramFoulBtn;
    LinearLayout fbCKprogramFoulLin;

    //动作
    ScrollView fbMotionLin;
    Button fbJugglingBtn;
    LinearLayout fbJugglingLin;
    Button fbHowToJugglingBtn;
    TextView fbHowToJugglingText;

    Button fbPassTBBtn;
    LinearLayout fbpassTBLin;
    Button fbShortPassBtn;
    LinearLayout fbShortPassLin;
    Button fbLongPassBtn;
    LinearLayout fbLongPassLin;

    Button fbStoppingBtn;
    LinearLayout fbStoppingLin;
    Button fbStoppinStepBtn;
    LinearLayout fbStoppinStepLin;

    Button fbDriBtn;
    LinearLayout fbDriLin;
    Button fbDriTrainoneBtn;
    LinearLayout fbDriTrainoneLin;
    Button fbDriTraintwoBtn;
    LinearLayout fbDriTraintwoLin;
    Button fbDriTrainthreeBtn;
    LinearLayout fbDriTrainthreeLin;

    Button fbShotBtn;
    LinearLayout fbShotLin;


    //技巧
    ScrollView fbSkillLin;
    Button fbSkPassingBtn;
    LinearLayout fbSkPassingLin;
    Button fbSSFSBtn;
    LinearLayout fbSSFSLin;
    Button fbRnaldoBtn;
    LinearLayout fbRnaldoLin;
    Button fbCowsTailBtn;
    LinearLayout fbCowsTailLin;

    ImageView shortpassImag;
    ImageView shortpassoneImag;
    ImageView shortpasstwoImag;
    ImageView shortpassthreeImag;
    ImageView shortpassfourImag;
    ImageView longpassoneImag;
    ImageView longpasstwoImag;
    ImageView longpassthreeImag;
    ImageView goodstopImag;
    ImageView badstopImag;
    ImageView stoponeImag;
    ImageView stoptwoImag;
    ImageView stopthreeImag;
    ImageView messistopImag;
    ImageView stopfourImag;
    ImageView whiteDriImag;
    ImageView fbdrioneImag;
    ImageView fbdriImag;
    ImageView fbdritwoImag;
    ImageView fbdrithreeImag;
    ImageView fbdrifourImag;
    ImageView fbdrifiveImag;
    ImageView fbdrisixImag;
    ImageView fbdrisevenImag;
    ImageView fbdrieightImag;
    ImageView fbshotoneImag;
    ImageView fbshottwoImag;
    ImageView fbshotthreeImag;
    ImageView fbshotfourImage;
    ImageView fbcrossoneImag;
    ImageView fbmessicrossImag;
    ImageView fbronaldocrossImag;
    ImageView fbcrosstwoImag;
    ImageView fbcowsoneImag;
    ImageView fbcowstwoImag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_fb_basic_study_detail);
        Toolbar studyFbBasicDetailToolbar = (Toolbar) findViewById(R.id.studyFbBasicDetailToolbar);
        setSupportActionBar(studyFbBasicDetailToolbar);
        getSupportActionBar().setTitle(KnownHobby.getHobby()+"·基础");

        fbRuleOp = (Button) findViewById(R.id.fbRuleOp);
        fbMotionOp = (Button) findViewById(R.id.fbMotionOp);
        fbSkillOp = (Button) findViewById(R.id.fbSkillOp);

        fbRuleLin = (ScrollView) findViewById(R.id.fbRuleLin);
        fbMotionLin = (ScrollView) findViewById(R.id.fbMotionLin);
        fbSkillLin = (ScrollView) findViewById(R.id.fbSkillLin);

        fbAreanBtn = (Button) findViewById(R.id.fbAreanBtn);
        fbAreanLin = (LinearLayout) findViewById(R.id.fbAreanLin);
        fbSiteAreaBtn = (Button) findViewById(R.id.fbSiteAreaBtn);
        fbSiteAreaText = (TextView) findViewById(R.id.fbSiteAreaText);
        fbGoalAreaBtn = (Button) findViewById(R.id.fbGoalAreaBtn);
        fbGoalAreaText = (TextView) findViewById(R.id.fbGoalAreaText);
        fbPenaltyAreaBtn = (Button) findViewById(R.id.fbPenaltyAreaBtn);
        fbPenaltyAreaText = (TextView) findViewById(R.id.fbPenaltyAreaText);
        fbCornerAreaBtn = (Button) findViewById(R.id.fbCornerAreaBtn);
        fbCornerAreaText = (TextView) findViewById(R.id.fbCornerAreaText);
        fbMatchTimeBtn = (Button) findViewById(R.id.fbMatchTimeBtn);
        fbMatchTimeLin = (LinearLayout) findViewById(R.id.fbMatchTimeLin);
        fbHalfTimeBtn = (Button) findViewById(R.id.fbHalfTimeBtn);
        fbHalfTimeText = (TextView) findViewById(R.id.fbHalfTimeText);
        fbLossTimeBtn = (Button) findViewById(R.id.fbLossTimeBtn);
        fbLossTimeText = (TextView) findViewById(R.id.fbLossTimeText);
        fbTimePenaltyKickBtn = (Button) findViewById(R.id.fbTimePenaltyKickBtn);
        fbTimePenaltyKickText = (TextView) findViewById(R.id.fbTimePenaltyKickText);
        fbInjuryTimeBtn = (Button) findViewById(R.id.fbInjuryTimeBtn);
        fbInjuryTimeText = (TextView) findViewById(R.id.fbInjuryTimeText);
        fbDeadBallBtn = (Button) findViewById(R.id.fbDeadBallBtn);
        fbDeadBallLin = (LinearLayout) findViewById(R.id.fbDeadBallLin);
        fbDeadBallInGameBtn = (Button) findViewById(R.id.fbDeadBallInGameBtn);
        fbDeadBallInGameText = (TextView) findViewById(R.id.fbDeadBallInGameText);
        fbDeadBallGoOnBtn = (Button) findViewById(R.id.fbDeadBallGoOnBtn);
        fbDeadBallGoOnText = (TextView) findViewById(R.id.fbDeadBallGoOnText);
        fbScoringMethodBtn = (Button) findViewById(R.id.fbScoringMethodBtn);
        fbScoringMethodLin = (LinearLayout) findViewById(R.id.fbScoringMethodLin);
        fbGoalScoreBtn = (Button) findViewById(R.id.fbGoalScoreBtn);
        fbGoalScoreText = (TextView) findViewById(R.id.fbGoalScoreText);
        fbWiningTeamBtn = (Button) findViewById(R.id.fbWiningTeamBtn);
        fbWiningTeamText = (TextView) findViewById(R.id.fbWiningTeamText);
        fbCompetitionRulesBtn = (Button) findViewById(R.id.fbCompetitionRulesBtn);
        fbCompetitionRulesText = (TextView) findViewById(R.id.fbCompetitionRulesText);

        fbOffsideBtn = (Button) findViewById(R.id.fbOffsideBtn);
        fbOffsideLin = (LinearLayout) findViewById(R.id.fbOffsideLin);
        fbOffsidePositionBtn = (Button) findViewById(R.id.fbOffsidePositionBtn);
        fbOffsidePositionText = (TextView) findViewById(R.id.fbOffsidePositionText);
        fbOffsideFoulnBtn = (Button) findViewById(R.id.fbOffsideFoulnBtn);
        fbOffsideFoulnText = (TextView) findViewById(R.id.fbOffsideFoulnText);
        fbOffsideNoFoulBtn = (Button) findViewById(R.id.fbOffsideNoFoulBtn);
        fbOffsideNoFoulText = (TextView) findViewById(R.id.fbOffsideNoFoulText);
        fbOffsidePunishBtn = (Button) findViewById(R.id.fbOffsidePunishBtn);
        fbOffsidePunishText = (TextView) findViewById(R.id.fbOffsidePunishText);

        fbFoulConductBtn = (Button) findViewById(R.id.fbFoulConductBtn);
        fbFoulConductLin = (LinearLayout) findViewById(R.id.fbFoulConductLin);
        fbFoulDirectFreeKickBtn = (Button) findViewById(R.id.fbFoulDirectFreeKickBtn);
        fbFoulDirectFreeKickText = (TextView) findViewById(R.id.fbFoulDirectFreeKickText);
        fbFoulPenaltyShotBtn = (Button) findViewById(R.id.fbFoulPenaltyShotBtn);
        fbFoulPenaltyShotText = (TextView) findViewById(R.id.fbFoulPenaltyShotText);
        fbWarningFoulBtn = (Button) findViewById(R.id.fbWarningFoulBtn);
        fbWarningFoulText = (TextView) findViewById(R.id.fbWarningFoulText);
        fbFoulOutBtn = (Button) findViewById(R.id.fbFoulOutBtn);
        fbFoulOutText = (TextView) findViewById(R.id.fbFoulOutText);
        fbFoulIndirectFreeKickBtn = (Button) findViewById(R.id.fbFoulIndirectFreeKickBtn);
        fbFoulIndirectFreeKickText = (TextView) findViewById(R.id.fbFoulIndirectFreeKickText);

        fbFreeKickBtn = (Button) findViewById(R.id.fbFreeKickBtn);
        fbFreeKickLin = (LinearLayout) findViewById(R.id.fbFreeKickLin);
        fbDirectFreeKickBtn = (Button) findViewById(R.id.fbDirectFreeKickBtn);
        fbDirectFreeKickText = (TextView) findViewById(R.id.fbDirectFreeKickText);
        fbIndirectFreeKickBtn = (Button) findViewById(R.id.fbIndirectFreeKickBtn);
        fbIndirectFreeKickLin = (LinearLayout) findViewById(R.id.fbIndirectFreeKickLin);
        fbIFKsignalBtn = (Button) findViewById(R.id.fbIFKsignalBtn);
        fbIFKsignalText = (TextView) findViewById(R.id.fbIFKsignalText);
        fbIFKgoalBtn = (Button) findViewById(R.id.fbIFKgoalBtn);
        fbIFKgoalText = (TextView) findViewById(R.id.fbIFKgoalText);
        fbIFKPositionBtn = (Button) findViewById(R.id.fbIFKPositionBtn);
        fbIFKPositionText = (TextView) findViewById(R.id.fbIFKPositionText);
        fbIFKfoulBtn = (Button) findViewById(R.id.fbIFKfoulBtn);
        fbIFKfoulLin = (LinearLayout) findViewById(R.id.fbIFKfoulLin);

        fbThrowInBtn = (Button) findViewById(R.id.fbThrowInBtn);
        fbThrowInLin = (LinearLayout) findViewById(R.id.fbThrowInLin);
        fbTIdetermineBtn = (Button) findViewById(R.id.fbTIdetermineBtn);
        fbTIdetermineText = (TextView) findViewById(R.id.fbTIdetermineText);
        fbTIprogramBtn = (Button) findViewById(R.id.fbTIprogramBtn);
        fbTIprogramText = (TextView) findViewById(R.id.fbTIprogramText);
        fbTIprogramFoulBtn = (Button) findViewById(R.id.fbTIprogramFoulBtn);
        fbTIprogramFoulLin = (LinearLayout) findViewById(R.id.fbTIprogramFoulLin);

        fbGoalKickBtn = (Button) findViewById(R.id.fbGoalKickBtn);
        fbGoalKickLin = (LinearLayout) findViewById(R.id.fbGoalKickLin);
        fbGKdetermineBtn = (Button) findViewById(R.id.fbGKdetermineBtn);
        fbGKdetermineText = (TextView) findViewById(R.id.fbGKdetermineText);
        fbGKprogramBtn = (Button) findViewById(R.id.fbGKprogramBtn);
        fbGKprogramText = (TextView) findViewById(R.id.fbGKprogramText);
        fbGKfoulBtn = (Button) findViewById(R.id.fbGKfoulBtn);
        fbGKfoulLin = (LinearLayout) findViewById(R.id.fbGKfoulLin);

        fbCornerKickBtn = (Button) findViewById(R.id.fbCornerKickBtn);
        fbCornerKickLin = (LinearLayout) findViewById(R.id.fbCornerKickLin);
        fbCKdetermineBtn = (Button) findViewById(R.id.fbCKdetermineBtn);
        fbCKdetermineText = (TextView) findViewById(R.id.fbCKdetermineText);
        fbCKprogramBtn = (Button) findViewById(R.id.fbCKprogramBtn);
        fbCKprogramText = (TextView) findViewById(R.id.fbCKprogramText);
        fbCKprogramFoulBtn = (Button) findViewById(R.id.fbCKprogramFoulBtn);
        fbCKprogramFoulLin = (LinearLayout) findViewById(R.id.fbCKprogramFoulLin);

        fbJugglingBtn = (Button) findViewById(R.id.fbJugglingBtn);
        fbJugglingLin = (LinearLayout)findViewById(R.id.fbJugglingLin);
        fbHowToJugglingBtn = (Button) findViewById(R.id.fbHowToJugglingBtn);
        fbHowToJugglingText = (TextView) findViewById(R.id.fbHowToJugglingText);

        fbPassTBBtn = (Button) findViewById(R.id.fbPassTBBtn);
        fbpassTBLin = (LinearLayout) findViewById(R.id.fbPassTBLin);
        fbShortPassBtn = (Button) findViewById(R.id.fbShortPassBtn);
        fbShortPassLin = (LinearLayout) findViewById(R.id.fbShortPassLin);
        fbLongPassBtn = (Button) findViewById(R.id.fbLongPassBtn);
        fbLongPassLin = (LinearLayout) findViewById(R.id.fbLongPassLin);

        fbStoppingBtn = (Button) findViewById(R.id.fbStoppingBtn);
        fbStoppingLin = (LinearLayout) findViewById(R.id.fbStoppingLin);
        fbStoppinStepBtn = (Button) findViewById(R.id.fbStoppinStepBtn);
        fbStoppinStepLin = (LinearLayout) findViewById(R.id.fbStoppinStepLin);

        fbDriBtn = (Button) findViewById(R.id.fbDriBtn);
        fbDriLin = (LinearLayout) findViewById(R.id.fbDriLin);
        fbDriTrainoneBtn = (Button) findViewById(R.id.fbDriTrainoneBtn);
        fbDriTrainoneLin = (LinearLayout) findViewById(R.id.fbDriTrainoneLin);
        fbDriTraintwoBtn = (Button) findViewById(R.id.fbDriTraintwoBtn);
        fbDriTraintwoLin = (LinearLayout) findViewById(R.id.fbDriTraintwoLin);
        fbDriTrainthreeBtn = (Button) findViewById(R.id.fbDriTrainthreeBtn);
        fbDriTrainthreeLin = (LinearLayout) findViewById(R.id.fbDriTrainthreeLin);

        fbShotBtn = (Button) findViewById(R.id.fbShotBtn);
        fbShotLin = (LinearLayout) findViewById(R.id.fbShotLin);

        fbSkPassingBtn = (Button) findViewById(R.id.fbSkPassingBtn);
        fbSkPassingLin = (LinearLayout) findViewById(R.id.fbSkPassingLin);
        fbSSFSBtn = (Button) findViewById(R.id.fbSSFSBtn);
        fbSSFSLin = (LinearLayout) findViewById(R.id.fbSSFSLin);
        fbRnaldoBtn = (Button) findViewById(R.id.fbRnaldoBtn);
        fbRnaldoLin = (LinearLayout) findViewById(R.id.fbRnaldoLin);
        fbCowsTailBtn = (Button) findViewById(R.id.fbCowsTailBtn);
        fbCowsTailLin = (LinearLayout) findViewById(R.id.fbCowsTailLin);

        shortpassImag = (ImageView) findViewById(R.id.shortpassImag);
        shortpassoneImag = (ImageView) findViewById(R.id.shortpassoneImag);
        shortpasstwoImag = (ImageView) findViewById(R.id.shortpasstwoImag);
        shortpassthreeImag = (ImageView) findViewById(R.id.shortpassthreeImag);
        shortpassfourImag = (ImageView) findViewById(R.id.shortpassfourImag);
        longpassoneImag = (ImageView) findViewById(R.id.longpassoneImag);
        longpasstwoImag = (ImageView) findViewById(R.id.longpasstwoImag);
        longpassthreeImag = (ImageView) findViewById(R.id.longpassthreeImag);
        goodstopImag = (ImageView) findViewById(R.id.goodstopImag);
        badstopImag = (ImageView) findViewById(R.id.badstopImag);
        stoponeImag = (ImageView) findViewById(R.id.stoponeImag);
        stoptwoImag = (ImageView) findViewById(R.id.stoptwoImag);
        stopthreeImag = (ImageView) findViewById(R.id.stopthreeImag);
        messistopImag = (ImageView) findViewById(R.id.messistopImag);
        stopfourImag = (ImageView) findViewById(R.id.stopfourImag);
        whiteDriImag = (ImageView) findViewById(R.id.whiteDriImag);
        fbdrioneImag = (ImageView) findViewById(R.id.fbdrioneImag);
        fbdritwoImag = (ImageView) findViewById(R.id.fbdritwoImag);
        fbdrithreeImag = (ImageView) findViewById(R.id.fbdrithreeImag);
        fbdrifourImag = (ImageView) findViewById(R.id.fbdrifourImag);
        fbdrifiveImag = (ImageView) findViewById(R.id.fbdrifiveImag);
        fbdrisixImag = (ImageView) findViewById(R.id.fbdrisixImag);
        fbdrisevenImag = (ImageView) findViewById(R.id.fbdrisevenImag);
        fbdrieightImag = (ImageView) findViewById(R.id.fbdrieightImag);
        fbshotoneImag = (ImageView) findViewById(R.id.fbshotoneImag);
        fbshottwoImag = (ImageView) findViewById(R.id.fbshottwoImag);
        fbshotthreeImag = (ImageView) findViewById(R.id.fbshotthreeImag);
        fbshotfourImage = (ImageView) findViewById(R.id.fbshotfourImag);
        fbcrossoneImag = (ImageView) findViewById(R.id.fbcrossoneImag);
        fbcrosstwoImag = (ImageView) findViewById(R.id.fbcrosstwoImag);
        fbmessicrossImag = (ImageView) findViewById(R.id.fbmessicrossImag);
        fbronaldocrossImag = (ImageView) findViewById(R.id.fbronaldocrossImag);
        fbdriImag = (ImageView) findViewById(R.id.fbdriImag);
        fbcowsoneImag = (ImageView) findViewById(R.id.fbcowsoneImag);
        fbcowstwoImag = (ImageView) findViewById(R.id.fbcowstwoImag);


        Intent intent = getIntent();
        if (intent.getStringExtra(studyFbDetailKind).equals(rule)){
            showFbRule();
        }
        else if (intent.getStringExtra(studyFbDetailKind).equals(motion)){
            showFbMotion();
        }
        else if (intent.getStringExtra(studyFbDetailKind).equals(skill)){
            showFbSkill();
        }
        else {
            showFbRule();
        }

        fbRuleOp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showFbRule();
            }
        });

        fbMotionOp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showFbMotion();
            }
        });

        fbSkillOp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showFbSkill();
            }
        });

        fbAreanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbAreanFlag()){
                    case 0:
                        fbAreanLin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbAreanFlag(1);
                        break;
                    case 1:
                        fbAreanLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbAreanFlag(0);
                        break;
                }
            }
        });

        fbSiteAreaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbSiteAreaFlag()){
                    case 0:
                        fbSiteAreaText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbSiteAreaFlag(1);
                        break;
                    case 1:
                        fbSiteAreaText.setVisibility(View.GONE);
                        StudyFbDetail.setFbSiteAreaFlag(0);
                        break;
                }
            }
        });

        fbCornerAreaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbCornerAreaFlag()){
                    case 0:
                        StudyFbDetail.setFbCornerAreaFlag(1);
                        fbCornerAreaText.setVisibility(View.VISIBLE);
                        break;
                    case 1:
                        StudyFbDetail.setFbCornerAreaFlag(0);
                        fbCornerAreaText.setVisibility(View.GONE);
                        break;
                }
            }
        });

        fbPenaltyAreaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbPenaltyAreaFlag()){
                    case 0:
                        fbPenaltyAreaText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbPenaltyAreaFlag(1);
                        break;
                    case 1:
                        fbPenaltyAreaText.setVisibility(View.GONE);
                        StudyFbDetail.setFbPenaltyAreaFlag(0);
                        break;
                }
            }
        });

        fbGoalAreaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbGoalAreaFlag()){
                    case 0:
                        fbGoalAreaText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbGoalAreaFlag(1);
                        break;
                    case 1:
                        fbGoalAreaText.setVisibility(View.GONE);
                        StudyFbDetail.setFbGoalAreaFlag(0);
                        break;
                }
            }
        });

        fbMatchTimeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbMatchTimeFlag()){
                    case 0:
                        fbMatchTimeLin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbMatchTimeFlag(1);
                        break;
                    case 1:
                        fbMatchTimeLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbMatchTimeFlag(0);
                        break;
                }
            }
        });

        fbHalfTimeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbHalfTimeFlag()){
                    case 0:
                        fbHalfTimeText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbHalfTimeFlag(1);
                        break;
                    case 1:
                        fbHalfTimeText.setVisibility(View.GONE);
                        StudyFbDetail.setFbHalfTimeFlag(0);
                        break;
                }
            }
        });

        fbLossTimeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbLossTimeFlag()){
                    case 0:
                        fbLossTimeText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbLossTimeFlag(1);
                        break;
                    case 1:
                        fbLossTimeText.setVisibility(View.GONE);
                        StudyFbDetail.setFbLossTimeFlag(0);
                        break;
                }
            }
        });

        fbTimePenaltyKickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbTimePenaltyKickFlag()){
                    case 0:
                        fbTimePenaltyKickText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbTimePenaltyKickFlag(1);
                        break;
                    case 1:
                        fbTimePenaltyKickText.setVisibility(View.GONE);
                        StudyFbDetail.setFbTimePenaltyKickFlag(0);
                        break;
                }
            }
        });

        fbInjuryTimeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbInjuryTimeFlag()){
                    case 0:
                        fbInjuryTimeText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbInjuryTimeFlag(1);
                        break;
                    case 1:
                        fbInjuryTimeText.setVisibility(View.GONE);
                        StudyFbDetail.setFbInjuryTimeFlag(0);
                        break;
                }
            }
        });

        fbDeadBallBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbDeadBallFlag()){
                    case 0:
                        fbDeadBallLin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbDeadBallFlag(1);
                        break;
                    case 1:
                        fbDeadBallLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbDeadBallFlag(0);
                        break;
                }
            }
        });

        fbDeadBallInGameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbDeadBallInGameFlag()){
                    case 0:
                        fbDeadBallInGameText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbDeadBallInGameFlag(1);
                        break;
                    case 1:
                        fbDeadBallInGameText.setVisibility(View.GONE);
                        StudyFbDetail.setFbDeadBallInGameFlag(0);
                        break;
                }
            }
        });

        fbDeadBallGoOnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbDeadBallGoOnFlag()){
                    case 0:
                        fbDeadBallGoOnText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbDeadBallGoOnFlag(1);
                        break;
                    case 1:
                        fbDeadBallGoOnText.setVisibility(View.GONE);
                        StudyFbDetail.setFbDeadBallGoOnFlag(0);
                        break;
                }
            }
        });

        fbScoringMethodBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbScoringMethodFlag()){
                    case 0:
                        fbScoringMethodLin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbScoringMethodFlag(1);
                        break;
                    case 1:
                        fbScoringMethodLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbScoringMethodFlag(0);
                        break;
                }
            }
        });

        fbGoalScoreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbGoalScoreFlag()){
                    case 0:
                        fbGoalScoreText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbGoalScoreFlag(1);
                        break;
                    case 1:
                        fbGoalScoreText.setVisibility(View.GONE);
                        StudyFbDetail.setFbGoalScoreFlag(0);
                        break;
                }
            }
        });

        fbWiningTeamBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbWiningTeamFlag()){
                    case 0:
                        fbWiningTeamText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbWiningTeamFlag(1);
                        break;
                    case 1:
                        fbWiningTeamText.setVisibility(View.GONE);
                        StudyFbDetail.setFbWiningTeamFlag(0);
                        break;
                }
            }
        });

        fbCompetitionRulesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbCompetitionRulesFlag()){
                    case 0:
                        fbCompetitionRulesText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbCompetitionRulesFlag(1);
                        break;
                    case 1:
                        fbCompetitionRulesText.setVisibility(View.GONE);
                        StudyFbDetail.setFbCompetitionRulesFlag(0);
                        break;
                }
            }
        });

        fbOffsideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbOffsideFlag()){
                    case 0:
                        fbOffsideLin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbOffsideFlag(1);
                        break;
                    case 1:
                        fbOffsideLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbOffsideFlag(0);
                        break;
                }
            }
        });

        fbOffsidePositionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbOffsidePositionFlag()){
                    case 0:
                        fbOffsidePositionText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbOffsidePositionFlag(1);
                        break;
                    case 1:
                        fbOffsidePositionText.setVisibility(View.GONE);
                        StudyFbDetail.setFbOffsidePositionFlag(0);
                        break;
                }
            }
        });

        fbOffsideFoulnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbOffsideFoulnFlag()){
                    case 0:
                        fbOffsideFoulnText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbOffsideFoulnFlag(1);
                        break;
                    case 1:
                        fbOffsideFoulnText.setVisibility(View.GONE);
                        StudyFbDetail.setFbOffsideFoulnFlag(0);
                        break;
                }
            }
        });

        fbOffsideNoFoulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbOffsideNoFoulFlag()){
                    case 0:
                        fbOffsideNoFoulText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbOffsideNoFoulFlag(1);
                        break;
                    case 1:
                        fbOffsideNoFoulText.setVisibility(View.GONE);
                        StudyFbDetail.setFbOffsideNoFoulFlag(0);
                        break;
                }
            }
        });

        fbOffsidePunishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbOffsidePunishFlag()){
                    case 0:
                        fbOffsidePunishText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbOffsidePunishFlag(1);
                        break;
                    case 1:
                        fbOffsidePunishText.setVisibility(View.GONE);
                        StudyFbDetail.setFbOffsidePunishFlag(0);
                        break;
                }
            }
        });

        fbFoulConductBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbFoulConductFlag()){
                    case 0:
                        fbFoulConductLin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbFoulConductFlag(1);
                        break;
                    case 1:
                        fbFoulConductLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbFoulConductFlag(0);
                        break;
                }
            }
        });

        fbFoulDirectFreeKickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbFoulDirectFreeKickFlag()){
                    case 0:
                        fbFoulDirectFreeKickText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbFoulDirectFreeKickFlag(1);
                        break;
                    case 1:
                        fbFoulDirectFreeKickText.setVisibility(View.GONE);
                        StudyFbDetail.setFbFoulDirectFreeKickFlag(0);
                        break;
                }
            }
        });

        fbFoulIndirectFreeKickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbFoulIndirectFreeKickFlag()){
                    case 0:
                        fbFoulIndirectFreeKickText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbFoulIndirectFreeKickFlag(1);
                        break;
                    case 1:
                        fbFoulIndirectFreeKickText.setVisibility(View.GONE);
                        StudyFbDetail.setFbFoulIndirectFreeKickFlag(0);
                        break;
                }
            }
        });

        fbFoulPenaltyShotBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbFoulPenaltyShotFlag()){
                    case 0:
                        fbFoulPenaltyShotText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbFoulPenaltyShotFlag(1);
                        break;
                    case 1:
                        fbFoulPenaltyShotText.setVisibility(View.GONE);
                        StudyFbDetail.setFbFoulPenaltyShotFlag(0);
                        break;
                }
            }
        });

        fbWarningFoulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbWarningFoulFlag()){
                    case 0:
                        fbWarningFoulText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbWarningFoulFlag(1);
                        break;
                    case 1:
                        fbWarningFoulText.setVisibility(View.GONE);
                        StudyFbDetail.setFbWarningFoulFlag(0);
                        break;
                }
            }
        });

        fbFoulOutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbFoulOutFlag()){
                    case 0:
                        fbFoulOutText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbFoulOutFlag(1);
                        break;
                    case 1:
                        fbFoulOutText.setVisibility(View.GONE);
                        StudyFbDetail.setFbFoulOutFlag(0);
                        break;
                }
            }
        });

        fbFreeKickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbFreeKickFlag()){
                    case 0:
                        fbFreeKickLin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbFreeKickFlag(1);
                        break;
                    case 1:
                        fbFreeKickLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbFreeKickFlag(0);
                        break;
                }
            }
        });

        fbDirectFreeKickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbDirectFreeKickFlag()){
                    case 0:
                        fbDirectFreeKickText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbDirectFreeKickFlag(1);
                        break;
                    case 1:
                        fbDirectFreeKickText.setVisibility(View.GONE);
                        StudyFbDetail.setFbDirectFreeKickFlag(0);
                        break;
                }
            }
        });

        fbIndirectFreeKickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbIndirectFreeKickFlag()){
                    case 0:
                        fbIndirectFreeKickLin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbIndirectFreeKickFlag(1);
                        break;
                    case 1:
                        fbIndirectFreeKickLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbIndirectFreeKickFlag(0);
                        break;
                }
            }
        });

        fbIFKsignalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbIFKsignalFlag()){
                    case 0:
                        fbIFKsignalText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbIFKsignalFlag(1);
                        break;
                    case 1:
                        fbIFKsignalText.setVisibility(View.GONE);
                        StudyFbDetail.setFbIFKsignalFlag(0);
                        break;
                }
            }
        });

        fbIFKgoalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbIFKgoalFlag()){
                    case 0:
                        fbIFKgoalText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbIFKgoalFlag(1);
                        break;
                    case 1:
                        fbIFKgoalText.setVisibility(View.GONE);
                        StudyFbDetail.setFbIFKgoalFlag(0);
                        break;
                }
            }
        });

        fbIFKPositionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbIFKPositionFlag()){
                    case 0:
                        fbIFKPositionText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbIFKPositionFlag(1);
                        break;
                    case 1:
                        fbIFKPositionText.setVisibility(View.GONE);
                        StudyFbDetail.setFbIFKPositionFlag(0);
                        break;
                }
            }
        });

        fbIFKfoulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbIFKfoulFlag()){
                    case 0:
                        fbIFKfoulLin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbIFKfoulFlag(1);
                        break;
                    case 1:
                        fbIFKfoulLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbIFKfoulFlag(0);
                        break;
                }
            }
        });

        fbThrowInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbThrowInFlag()){
                    case 0:
                        fbThrowInLin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbThrowInFlag(1);
                        break;
                    case 1:
                        fbThrowInLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbThrowInFlag(0);
                        break;
                }
            }
        });

        fbTIdetermineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbTIdetermineFlag()){
                    case 0:
                        fbTIdetermineText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbTIdetermineFlag(1);
                        break;
                    case 1:
                        fbTIdetermineText.setVisibility(View.GONE);
                        StudyFbDetail.setFbTIdetermineFlag(0);
                        break;
                }
            }
        });

        fbTIprogramBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbTIprogramFlag()){
                    case 0:
                        fbTIprogramText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbTIprogramFlag(1);
                        break;
                    case 1:
                        fbTIprogramText.setVisibility(View.GONE);
                        StudyFbDetail.setFbTIprogramFlag(0);
                        break;
                }
            }
        });

        fbTIprogramFoulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbTIprogramFoulFlag()){
                    case 0:
                        fbTIprogramFoulLin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbTIprogramFoulFlag(1);
                        break;
                    case 1:
                        fbTIprogramFoulLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbTIprogramFoulFlag(0);
                        break;
                }
            }
        });

        fbGoalKickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbGoalKickFlag()){
                    case 0:
                        fbGoalKickLin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbGoalKickFlag(1);
                        break;
                    case 1:
                        fbGoalKickLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbGoalKickFlag(0);
                        break;
                }
            }
        });

        fbGKdetermineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbGKdetermineFlag()){
                    case 0:
                        fbGKdetermineText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbGKdetermineFlag(1);
                        break;
                    case 1:
                        fbGKdetermineText.setVisibility(View.GONE);
                        StudyFbDetail.setFbGKdetermineFlag(0);
                        break;
                }
            }
        });

        fbGKprogramBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbGKprogramFlag()){
                    case 0:
                        fbGKprogramText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbGKprogramFlag(1);
                        break;
                    case 1:
                        fbGKprogramText.setVisibility(View.GONE);
                        StudyFbDetail.setFbGKprogramFlag(0);
                        break;
                }
            }
        });

        fbGKfoulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbGKfoulFlag()){
                    case 0:
                        fbGKfoulLin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbGKfoulFlag(1);
                        break;
                    case 1:
                        fbGKfoulLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbGKfoulFlag(0);
                        break;
                }
            }
        });

        fbCornerKickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbCornerKickFlag()){
                    case 0:
                        fbCornerKickLin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbCornerKickFlag(1);
                        break;
                    case 1:
                        fbCornerKickLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbCornerKickFlag(0);
                        break;
                }
            }
        });

        fbCKdetermineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbCKdetermineFlag()){
                    case 0:
                        fbCKdetermineText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbCKdetermineFlag(1);
                        break;
                    case 1:
                        fbCKdetermineText.setVisibility(View.GONE);
                        StudyFbDetail.setFbCKdetermineFlag(0);
                        break;
                }
            }
        });

        fbCKprogramBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbCKprogramFlag()){
                    case 0:
                        fbCKprogramText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbCKprogramFlag(1);
                        break;
                    case 1:
                        fbCKprogramText.setVisibility(View.GONE);
                        StudyFbDetail.setFbCKprogramFlag(0);
                        break;
                }
            }
        });

        fbCKprogramFoulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbCKprogramFoulFlag()){
                    case 0:
                        fbCKprogramFoulLin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbCKprogramFoulFlag(1);
                        break;
                    case 1:
                        fbCKprogramFoulLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbCKprogramFoulFlag(0);
                        break;
                }
            }
        });

        fbJugglingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbJugglingFlag()){
                    case 0:
                        fbJugglingLin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbJugglingFlag(1);
                        break;
                    case 1:
                        fbJugglingLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbJugglingFlag(0);
                        break;
                }
            }
        });

        fbHowToJugglingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbHowToJugglingFlag()){
                    case 0:
                        fbHowToJugglingText.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbHowToJugglingFlag(1);
                        break;
                    case 1:
                        fbHowToJugglingText.setVisibility(View.GONE);
                        StudyFbDetail.setFbHowToJugglingFlag(0);
                        break;
                }
            }
        });

        fbPassTBBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbPassTBFlag()){
                    case 0:
                        fbpassTBLin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbPassTBFlag(1);
                        break;
                    case 1:
                        fbpassTBLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbPassTBFlag(0);
                        break;
                }
            }
        });

        fbShortPassBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/longpass1.jpg").into(longpassoneImag);
                Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/longpass2.jpg").into(longpasstwoImag);
                Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/longpass3.jpg").into(longpassthreeImag);
                switch (StudyFbDetail.getFbShortPassFlag()){
                    case 0:
                        fbShortPassLin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbShortPassFlag(1);
                        break;
                    case 1:
                        fbShortPassLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbShortPassFlag(0);
                        break;
                }
            }
        });

        fbLongPassBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/goodstop.gif").into(goodstopImag);
                Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/shitstop.gif").into(badstopImag);
                Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/stop1.gif").into(stoponeImag);
                Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/stop2.gif").into(stoptwoImag);
                Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/stop3.gif").into(stopthreeImag);
                Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/stop4.gif").into(stopfourImag);
                Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/goodstop.gif").into(messistopImag);
                switch (StudyFbDetail.getFbLongPassFlag()){
                    case 0:
                        fbLongPassLin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbLongPassFlag(1);
                        break;
                    case 1:
                        fbLongPassLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbLongPassFlag(0);
                        break;
                }
            }
        });

        fbStoppingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/laobaopandai.jpg").into(whiteDriImag);
                Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/dri1.jpg").into(fbdrioneImag);
                Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/dri2.jpg").into(fbdriImag);
                Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/dri3.jpg").into(fbdritwoImag);
                Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/dri4.jpg").into(fbdrithreeImag);
                Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/dri5.jpg").into(fbdrifourImag);
                switch (StudyFbDetail.getFbStoppingFlag()){
                    case 0:
                        fbStoppingLin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbStoppingFlag(1);
                        break;
                    case 1:
                        fbStoppingLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbStoppingFlag(0);
                        break;
                }
            }
        });

        fbStoppinStepBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/dri7.jpg").into(fbdrifiveImag);
                Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/dri32.jpg").into(fbdrisixImag);
                Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/dri33.jpg").into(fbdrisevenImag);
                Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/drizonghe.jpg").into(fbdrieightImag);
                switch (StudyFbDetail.getFbStoppinStepFlag()){
                    case 0:
                        StudyFbDetail.setFbStoppinStepFlag(1);
                        fbStoppinStepLin.setVisibility(View.VISIBLE);
                        break;
                    case 1:
                        fbStoppinStepLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbStoppinStepFlag(0);
                        break;
                }
            }
        });

        fbDriBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/shot1.gif").into(fbshotoneImag);
                Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/shot2.gif").into(fbshottwoImag);
                Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/shot3.gif").into(fbshotthreeImag);
                Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/shot4.gif").into(fbshotfourImage);
                switch (StudyFbDetail.getFbDriFlag()){
                    case 0:
                        fbDriLin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbDriFlag(1);
                        break;
                    case 1:
                        fbDriLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbDriFlag(0);
                        break;
                }
            }
        });

        fbDriTrainoneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbDriTrainoneFlag()){
                    case 0:
                        fbDriTrainoneLin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbDriTrainoneFlag(1);
                        break;
                    case 1:
                        fbDriTrainoneLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbDriTrainoneFlag(0);
                        break;
                }
            }
        });

        fbDriTraintwoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbDriTraintwoFlag()){
                    case 0:
                        fbDriTraintwoLin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbDriTraintwoFlag(1);
                        break;
                    case 1:
                        fbDriTraintwoLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbDriTraintwoFlag(0);
                        break;
                }
            }
        });

        fbDriTrainthreeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbDriTrainthreeFlag()){
                    case 0:
                        fbDriTrainthreeLin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbDriTrainthreeFlag(1);
                        break;
                    case 1:
                        fbDriTrainthreeLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbDriTrainthreeFlag(0);
                        break;
                }
            }
        });

        fbShotBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/pass1.jpg").into(fbcrossoneImag);
                Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/messi.gif").into(fbmessicrossImag);
                Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/pass2.jpg").into(fbcrosstwoImag);
                Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/ronaldocross.jpg").into(fbronaldocrossImag);
                Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/cow1.jpg").into(fbcowsoneImag);
                Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/cow2.jpg").into(fbcowstwoImag);
                switch (StudyFbDetail.getFbShotFlag()){
                    case 0:
                        fbShotLin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbShotFlag(1);
                        break;
                    case 1:
                        fbShotLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbShotFlag(0);
                        break;
                }
            }
        });

        fbSkPassingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbSkPassingFlag()){
                    case 0:
                        fbSkPassingLin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbSkPassingFlag(1);
                        break;
                    case 1:
                        fbSkPassingLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbSkPassingFlag(0);
                        break;
                }
            }
        });

        fbSSFSBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbSSFSFlag()){
                    case 0:
                        fbSSFSLin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbSSFSFlag(1);
                        break;
                    case 1:
                        fbSSFSLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbSSFSFlag(0);
                        break;
                }
            }
        });

        fbRnaldoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbRnaldoFlag()){
                    case 0:
                        fbRnaldoLin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbRnaldoFlag(1);
                        break;
                    case 1:
                        fbRnaldoLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbRnaldoFlag(0);
                        break;
                }
            }
        });

        fbCowsTailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (StudyFbDetail.getFbCowsTailFlag()){
                    case 0:
                        fbCowsTailLin.setVisibility(View.VISIBLE);
                        StudyFbDetail.setFbCowsTailFlag(1);
                        break;
                    case 1:
                        fbCowsTailLin.setVisibility(View.GONE);
                        StudyFbDetail.setFbCowsTailFlag(0);
                        break;
                }
            }
        });

    }

    private void showFbRule(){
        fbRuleOp.setActivated(true);
        fbMotionOp.setActivated(false);
        fbSkillOp.setActivated(false);

        fbRuleLin.setVisibility(View.VISIBLE);
        fbMotionLin.setVisibility(View.GONE);
        fbSkillLin.setVisibility(View.GONE);
    }

    private void showFbMotion(){
        fbRuleOp.setActivated(false);
        fbMotionOp.setActivated(true);
        fbSkillOp.setActivated(false);

        fbRuleLin.setVisibility(View.GONE);
        fbMotionLin.setVisibility(View.VISIBLE);
        fbSkillLin.setVisibility(View.GONE);
        Glide.with(MyApplication.getContext()).load("https://imgsa.baidu.com/forum/w%3D580/sign=ff09412927738bd4c421b239918a876c/1fb5a7c27d1ed21b2b491011a46eddc450da3f66.jpg").into(shortpassImag);
        Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/shortpass1.gif").into(shortpassoneImag);
        Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/shortpass2.gif").into(shortpasstwoImag);
        Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/shortpass3.gif").into(shortpassthreeImag);
        Glide.with(MyApplication.getContext()).load("http://47.112.17.83:8080/image/duiqiangti.gif").into(shortpassfourImag);
    }

    private void showFbSkill(){
        fbRuleOp.setActivated(false);
        fbMotionOp.setActivated(false);
        fbSkillOp.setActivated(true);

        fbRuleLin.setVisibility(View.GONE);
        fbMotionLin.setVisibility(View.GONE);
        fbSkillLin.setVisibility(View.VISIBLE);
    }

    @Override
    public void onStop(){
        finish();
        super.onStop();
    }
}
