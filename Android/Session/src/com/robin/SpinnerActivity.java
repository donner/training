package com.robin;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class SpinnerActivity extends Activity {
	private static final String[] countriesStr = {

	"北京市", "上海市", "天津市", "重庆市"

	};

	private TextView myTextView;

	private Spinner mySpinner;

	private Animation myAnimation;

	private ArrayAdapter<String> adapter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.spinner_control);
		myTextView = (TextView) findViewById(R.id.textView1);

		mySpinner = (Spinner) findViewById(R.id.spinner1);

		adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, countriesStr);
		mySpinner.setAdapter(adapter);

		mySpinner
				.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {

					public void onItemSelected(AdapterView<?> parent,
							View view,

							int position, long id) {

						myTextView.setText("选择的是:" + countriesStr[position]);

						view.setVisibility(View.VISIBLE);

					}

					public void onNothingSelected(AdapterView<?> arg0) {

					}
				});

	}

}
