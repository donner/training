package com.robin;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class ButtonControl extends Activity implements OnClickListener {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.button_control);

		findViewById(R.id.button1).setOnClickListener(this);
		findViewById(R.id.imageButton1).setOnClickListener(this);
		findViewById(R.id.toggleButton1).setOnClickListener(this);
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.button1:
			Dialog alertDialog = new AlertDialog.Builder(this)
					.setTitle("标题").setMessage("Button被点击了")
					.setIcon(R.drawable.icon).create();
			alertDialog.show();
			break;
		case R.id.imageButton1:
			Dialog alertDialog2 = new AlertDialog.Builder(this)
					.setTitle("标题").setMessage("ImageButton被点击了")
					.setIcon(R.drawable.icon).create();
			alertDialog2.show();
			break;
		case R.id.toggleButton1:
			Dialog alertDialog3 = new AlertDialog.Builder(this)
					.setTitle("标题").setMessage("ToggleButton被点击了")
					.setIcon(R.drawable.icon).create();
			alertDialog3.show();
			break;
		}
	}

}
