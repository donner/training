package com.robin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import android.app.Activity;
import android.content.ContentUris;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Contacts.People;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.SimpleCursorAdapter;

public class ListActivity extends Activity implements OnItemClickListener {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list_control);
		
		ListView lv = (ListView) findViewById(R.id.listView1);
		/*Cursor c = managedQuery(People.CONTENT_URI,null,null,null,People.NAME);
		String[] cols = new String[]{People.NAME};
		int[] views = new int[] { android.R.id.text1 };
		SimpleCursorAdapter adapter = new SimpleCursorAdapter(this,android.R.layout.simple_list_item_single_choice,c,cols,views);
		lv.setAdapter(adapter);
		lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
		lv.setOnItemClickListener(this);*/
		SimpleAdapter adapter = new SimpleAdapter(this,getData(),R.layout.list_item,
				new String[]{"title","info","img"},
				new int[]{R.id.title,R.id.info,R.id.img});
		lv.setAdapter(adapter);
	}
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		 Uri selectedPerson = ContentUris.withAppendedId(People.CONTENT_URI, arg3);
		 Intent intent = new Intent(Intent.ACTION_VIEW,selectedPerson);
		 startActivity(intent);
		 
	}
	
	private List<Map<String, Object>> getData() {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("title", "G1");
		map.put("info", "google 1");
		map.put("img", R.drawable.i1);
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("title", "G2");
		map.put("info", "google 2");
		map.put("img", R.drawable.i2);
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("title", "G3");
		map.put("info", "google 3");
		map.put("img", R.drawable.i3);
		list.add(map);
		
		return list;
	}
}