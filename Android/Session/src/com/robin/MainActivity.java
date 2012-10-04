package com.robin;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener,
		OnTouchListener {
	private static String TAG = "";

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		findViewById(R.id.activity_intent).setOnClickListener(this);
		findViewById(R.id.control).setOnClickListener(this);
		findViewById(R.id.button3).setOnClickListener(this);
		findViewById(R.id.button4).setOnClickListener(this);
		findViewById(R.id.button5).setOnClickListener(this);
		findViewById(R.id.button6).setOnClickListener(this);
		findViewById(R.id.button7).setOnClickListener(this);

		// 字符串数组的使用
		Resources res = getResources();
		String strings[] = res.getStringArray(R.array.test_array);
		for (String s : strings) {
			Log.d("example", s);
		}

		findViewById(R.id.imageView1).setOnTouchListener(this);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		switch (requestCode) {
		case 1001:
			if (resultCode == RESULT_OK) {
				Bundle bundle = data.getExtras();
				String msg = bundle.getString("ReturnVal");
				TextView tv = (TextView) findViewById(R.id.textView1);
				tv.setText(msg);
			}
			break;
		}
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intent = null;
		switch (v.getId()) {
		case R.id.activity_intent:
			intent = new Intent(MainActivity.this, ActivityIntent.class);
			startActivity(intent);
			break;
		case R.id.control:
			intent = new Intent(MainActivity.this, ControlActivity.class);
			startActivity(intent);
			break;
		case R.id.button2:
			intent = new Intent(MainActivity.this, SubActivity.class);
			intent.putExtra("Msg", "startActivityForResult from MainActivity!");
			startActivityForResult(intent, 1001);
			break;
		case R.id.button3:
			intent = new Intent(MainActivity.this, TableLayoutActivity.class);
			startActivity(intent);
			break;
		case R.id.button4:
			intent = new Intent(MainActivity.this, RelativeLayoutActivity.class);
			startActivity(intent);
			break;
		case R.id.button5:
			intent = new Intent(MainActivity.this, HandlerActivity.class);
			startActivity(intent);
			break;

		case R.id.button6:
			intent = new Intent(MainActivity.this, TestBarHandlerActivity.class);
			startActivity(intent);
			break;
		case R.id.button7:
			intent = new Intent(MainActivity.this, BroadcastActivity.class);
			startActivity(intent);
			break;
		}
	}

	public void onStart() {
		super.onStart();
		Log.v(TAG, "onStart");
	}

	public void onStop() {
		super.onStop();
		Log.v(TAG, "onStop");
	}

	public void onResume() {
		super.onResume();
		Log.v(TAG, "onResume");
	}

	public void onRestart() {
		super.onRestart();
		Log.v(TAG, "onReStart");
	}

	public void onPause() {
		super.onPause();
		Log.v(TAG, "onPause");
	}

	public void onDestroy() {
		super.onDestroy();
		Log.v(TAG, "onDestroy");
	}

	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:
			Log.d("example", "ACTION_DOWN");
			break;
		case MotionEvent.ACTION_MOVE:
			Log.d("example", "ACTION_MOVE");
			break;
		case MotionEvent.ACTION_UP:
			Log.d("example", "ACTION_UP");
			break;
		}
		return true;
	}
}