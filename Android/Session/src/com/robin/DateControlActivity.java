package com.robin;

import java.util.Calendar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.DatePicker;
import android.widget.DatePicker.OnDateChangedListener;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.TimePicker.OnTimeChangedListener;

public class DateControlActivity extends Activity implements OnClickListener{

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.date_control);
		
		DatePicker dp = (DatePicker) findViewById(R.id.datePicker1);
		final TextView tv = (TextView) findViewById(R.id.textView1);
		
		Calendar ca = Calendar.getInstance();
		int year = ca.get(Calendar.YEAR);
		int month = ca.get(Calendar.MONTH);
		int day = ca.get(Calendar.DAY_OF_MONTH);
		tv.setText("您选择的日期是："+year+"年"+(month+1)+"月"+day+"日。");
		dp.init(year, month, day, new OnDateChangedListener(){

			public void onDateChanged(DatePicker view, int year,
					int monthOfYear, int dayOfMonth) {
				// TODO Auto-generated method stub
				tv.setText("您选择的日期是："+year+"年"+(monthOfYear+1)+"月"+dayOfMonth+"日。");
			}
			
		});
		
		TimePicker tp = (TimePicker) findViewById(R.id.timePicker1);
		final TextView tv2 = (TextView) findViewById(R.id.textView2); 
		tv2.setText("您选择的时间："+tp.getCurrentHour()+"时"+tp.getCurrentMinute()+"分");
		tp.setOnTimeChangedListener(new OnTimeChangedListener(){

			public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
				// TODO Auto-generated method stub
				tv2.setText("您选择的时间："+hourOfDay+"时"+minute+"分");
			}
			
		});
		
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}
