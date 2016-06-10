package com.example.news;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class NewsAdapter extends ArrayAdapter< News > {
    
	private int resourceId;
	public NewsAdapter(Context context, int textViewResourceId,
			List<News> objects) {
		super(context,  textViewResourceId, objects);
		// TODO Auto-generated constructor stub
		resourceId=textViewResourceId;
	}
	

	public View getView(int position ,View convertView,ViewGroup parent){
		News news=getItem(position);
				View view;
		if(convertView==null){
			view=LayoutInflater.from(getContext()).inflate(resourceId, null);
			
		}else{
			view =convertView;
		}
		TextView newsTitleText=(TextView) view.findViewById(R.id.news_title);
		
		newsTitleText.setText(news.getTitle());
		return view;
	}
}
