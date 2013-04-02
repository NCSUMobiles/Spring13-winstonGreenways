package com.winstonsalem.greenways;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class Header extends RelativeLayout{

	ImageButton homeButton;
	ImageButton mapButton;
	ImageButton weatherButton;
	ImageButton citilink;
	
	public Header(Context context) {
		super(context);
		
	}
	
	public Header(Context context, AttributeSet attrs) {
	    super(context, attrs);
	}

	public Header(Context context, AttributeSet attrs, int defStyle) {
	    super(context, attrs, defStyle);
	}

	public void initHeader(Context context) {
	        inflateHeader(context);
	}

	private void inflateHeader(final Context mContext) {
	    LayoutInflater inflater = (LayoutInflater) getContext()
	            .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    inflater.inflate(R.layout.header, this);
	    homeButton = (ImageButton) findViewById(R.id.home);
	    mapButton = (ImageButton) findViewById(R.id.map);
	    weatherButton = (ImageButton) findViewById(R.id.weather);
	    citilink = (ImageButton) findViewById(R.id.citilink);
	    
	    homeButton.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				
				
				Intent intent=new Intent(mContext, GreenwayListActivity.class);
				
				mContext.startActivity(intent);				
			}
	    	
	    });
	    
	    mapButton.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				
				
				Intent intent=new Intent(mContext, GreenwayMap.class);
				
				mContext.startActivity(intent);				
			}
	    	
	    });
	    
	    weatherButton.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				
				
				Weather.inital(mContext);				
			}
	    	
	    });
	    
	    citilink.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				
				
				Intent intent=new Intent(mContext, CityLink.class);
				
				mContext.startActivity(intent);				
			}
	    	
	    });

	}
	
}
