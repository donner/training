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
		findViewById(R.id.button_control).setOnClickListener(this);
		findViewById(R.id.date_control).setOnClickListener(this);
		findViewById(R.id.list_control).setOnClickListener(this);
		findViewById(R.id.grid_control).setOnClickListener(this);
		findViewById(R.id.spinner_control).setOnClickListener(this);
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
		case R.id.button_control:
			intent = new Intent(ControlActivity.this, ButtonControl.class);
			startActivity(intent);
			break;
		case R.id.date_control:
			intent = new Intent(ControlActivity.this, DateControlActivity.class);
			startActivity(intent);
			break;
		case R.id.list_control:
			intent = new Intent(ControlActivity.this, ListActivity.class);
			startActivity(intent);
			break;
		case R.id.grid_control:
			intent = new Intent(ControlActivity.this, GridActivity.class);
			startActivity(intent);
			break;
		case R.id.spinner_control:
			intent = new Intent(ControlActivity.this, SpinnerActivity.class);
			startActivity(intent);
			break;
		}

	}

}
