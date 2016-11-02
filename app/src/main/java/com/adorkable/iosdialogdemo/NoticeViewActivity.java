package com.adorkable.iosdialogdemo;

import com.vivavideo.mobile.commonui.XYNoticeView;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Arrays;

public class NoticeViewActivity extends Activity {

    public static String[] notices = new String[]{
            "伪装者:胡歌演绎'痞子特工'",
            "无心法师:生死离别!月牙遭虐杀",
            "花千骨:尊上沦为花千骨",
            "综艺饭:胖轩偷看夏天洗澡掀波澜",
            "碟中谍4:阿汤哥高塔命悬一线,超越不可能",
    };
    private XYNoticeView mXYNoticeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice_view);
        mXYNoticeView = (XYNoticeView) findViewById(R.id.notice);
        mXYNoticeView.start(Arrays.asList(notices));
        mXYNoticeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(NoticeViewActivity.this, notices[mXYNoticeView.getIndex()], Toast.LENGTH_SHORT).show();
            }
        });
    }

}
