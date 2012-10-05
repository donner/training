package com.robin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class ControlActivity extends Activity implements OnClickListener {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.controls);

		findViewById(R.id.back).setOnClickListener(this);
		findViewById(R.id.text_control).setOnClickListener(this);
	}

	public void onClick(View v) {
		Intent intent = null;
		switch (v.getId()) {
		case R.id.back:
			setResult(RESULT_OK, intent);
			finish();
			break;
		case R.id.text_control:
			intent = new Intent(ControlActivity.this, TextControlActivity.class); 
			startActivity(intent);
			break;
		}
		
	}

}
