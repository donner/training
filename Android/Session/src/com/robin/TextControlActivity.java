package com.robin;

import android.app.Activity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;



public class TextControlActivity extends Activity implements OnClickListener {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.text_control); 
		
		TextView tv = (TextView) findViewById(R.id.textView1); 
		tv.setAutoLinkMask(Linkify.ALL);
		tv.setText("go to http://jillzhang.cnblogs.com or email jillzhang@126.com");
		
		EditText et =  (EditText) findViewById(R.id.editText1); 
		et.setText("i am robin");
		
		et =  (EditText) findViewById(R.id.editText2); 
		et.setText("i am robin");
		
		et =  (EditText) findViewById(R.id.editText4); 
		et.setText("jillzhang@126.com");
		
		et =  (EditText) findViewById(R.id.editText5); 
		et.setText("18618203356");
		
		et =  (EditText) findViewById(R.id.editText6); 
		et.setText("100120");
		
		et =  (EditText) findViewById(R.id.editText7); 
		et.append("i am  robin ");
		et.append("\n");
		et.append("haha ");
		
		AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
		ArrayAdapter<String>  aa = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,
				new String[]{"English","Chinese","Spanish","German","Greek"});
		actv.setAdapter(aa);
		
		MultiAutoCompleteTextView mactv = (MultiAutoCompleteTextView) findViewById(R.id.multiAutoCompleteTextView1);
		ArrayAdapter<String>  aa2 = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,
				new String[]{"English","Chinese","Spanish","German","Greek"});
		mactv.setAdapter(aa2);
		mactv.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
		
 
	}
	
	public void onClick(View v) {
		// TODO Auto-generated method stub 
		switch (v.getId()) { 
		 
		}
	}


}
