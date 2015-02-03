package com.xy.slidingdrawer;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SlidingDrawer;

public class MainActivity extends Activity {

	MultiDirectionSlidingDrawer mDrawer1;
	MultiDirectionSlidingDrawer mDrawer2;
	MultiDirectionSlidingDrawer mDrawer3;
	MultiDirectionSlidingDrawer mDrawer4;
	LinearLayout content1;
	LinearLayout content2;
	LinearLayout content3;
	LinearLayout content4;
	ImageButton sliding_switch;
	ImageView SettingContent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main2);
		initView();
		
	}
	private void initView() {
		mDrawer1 = (MultiDirectionSlidingDrawer) findViewById(R.id.drawer1);
		mDrawer2 = (MultiDirectionSlidingDrawer) findViewById(R.id.drawer2);
		mDrawer3 = (MultiDirectionSlidingDrawer) findViewById(R.id.drawer3);
		mDrawer4 = (MultiDirectionSlidingDrawer) findViewById(R.id.drawer4);
		content1 = (LinearLayout) findViewById(R.id.content1);
		content2 = (LinearLayout) findViewById(R.id.content2);
		content3 = (LinearLayout) findViewById(R.id.content3);
		content4 = (LinearLayout) findViewById(R.id.content4);
//		sliding_switch = (ImageButton) findViewById(R.id.sliding_switch);
//		SettingContent = (ImageView) findViewById(R.id.SettingContent);
		content1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				mDrawer1.animateClose();
			}
		});
		content2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				mDrawer2.animateClose();
			}
		});
		content3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				mDrawer3.animateClose();
			}
		});
		content4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				mDrawer4.animateClose();
			}
		});
		
	}

	

}
