package com.robin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class ActivityIntent extends Activity implements OnClickListener {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_intent);

		findViewById(R.id.back).setOnClickListener(this);
		findViewById(R.id.button1).setOnClickListener(this);
		findViewById(R.id.button2).setOnClickListener(this);

	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intent = null;
		switch (v.getId()) {
		case R.id.button1:
			TextView tv = (TextView) findViewById(R.id.textView1);
			tv.setText(R.string.hello);
			intent = new Intent(ActivityIntent.this, SubActivity.class);
			intent.putExtra("Msg", "startActivity from ActivityIntent!");
			startActivity(intent);
			break;
		case R.id.button2:
			intent = new Intent(ActivityIntent.this, SubActivity.class);
			intent.putExtra("Msg",
					"startActivityForResult from ActivityIntent!");
			startActivityForResult(intent, 1001);
			break;
		case R.id.back:
			setResult(RESULT_OK, intent);
			finish();
		}
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

}
