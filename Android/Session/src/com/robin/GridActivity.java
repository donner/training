package com.robin;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class GridActivity extends Activity implements OnItemClickListener {
	public class GridInfo {

		private String name;

		public GridInfo(String name) {
			super();
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

	public class GridAdapter extends BaseAdapter {

		private class GridHolder {
			ImageView appImage;
			TextView appName;
		}

		private Context context;

		private List<GridInfo> list;
		private LayoutInflater mInflater;

		public GridAdapter(Context c) {
			super();
			this.context = c;
		}

		public void setList(List<GridInfo> list) {
			this.list = list;
			mInflater = (LayoutInflater) context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		}

		public int getCount() {
			// TODO Auto-generated method stub
			return list.size();
		}
 
		public View getView(int index, View convertView, ViewGroup parent) {
			GridHolder holder;
			if (convertView == null) {
				convertView = mInflater.inflate(R.layout.grid_item, null);
				holder = new GridHolder();
				holder.appImage = (ImageView) convertView
						.findViewById(R.id.itemImage);
				holder.appName = (TextView) convertView
						.findViewById(R.id.itemText);
				convertView.setTag(holder);

			} else {
				holder = (GridHolder) convertView.getTag();

			}
			GridInfo info = list.get(index);
			if (info != null) {
				holder.appName.setText(info.getName());
			}
			return convertView;
		}

		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return null;
		}

		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return 0;
		} 
	}
	GridView gridview;
	ArrayList<GridInfo> list;
	GridAdapter adapter;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.grid_control);
		gridview = (GridView) findViewById(R.id.gridview);
		list = new ArrayList<GridInfo>();
		list.add(new GridInfo("name1"));
		list.add(new GridInfo("name2"));
		list.add(new GridInfo("name3"));
		list.add(new GridInfo("name4"));
		list.add(new GridInfo("name5"));
		list.add(new GridInfo("name6"));
		list.add(new GridInfo("name6"));
		list.add(new GridInfo("name7"));
		list.add(new GridInfo("name8"));
		list.add(new GridInfo("name9"));
		list.add(new GridInfo("name10"));
		adapter = new GridAdapter(this);
		adapter.setList(list);
		gridview.setAdapter(adapter);
	}

	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub

	} 
}
