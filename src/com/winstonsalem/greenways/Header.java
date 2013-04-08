package com.winstonsalem.greenways;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class Header extends LinearLayout{

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
		super(context, attrs);
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

				final ProgressDialog myPd_ring=ProgressDialog.show(mContext, "", "Loading please wait..", true);
				myPd_ring.setCancelable(true);
				new Thread(new Runnable() {  
					public void run() {

						Intent intent=new Intent(mContext, GreenwayListActivity.class);

						mContext.startActivity(intent);	
						try
						{
							Thread.sleep(7000);
						}catch(Exception e){}
						myPd_ring.dismiss();
					}
				}).start();


			}

		});

		mapButton.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {

				final ProgressDialog myPd_ring=ProgressDialog.show(mContext, "", "Loading please wait..", true);
				myPd_ring.setCancelable(true);
				new Thread(new Runnable() {  
					public void run() {

						Intent intent=new Intent(mContext, GreenwayMap.class);

						mContext.startActivity(intent);	
						try
						{
							Thread.sleep(7000);
						}catch(Exception e){}
						myPd_ring.dismiss();
					}
				}).start();

			}

		});

		weatherButton.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {

				Weather.inital(mContext);				
			}

		});

		citilink.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {

				final ProgressDialog myPd_ring=ProgressDialog.show(mContext, "", "Loading please wait..", true);
				myPd_ring.setCancelable(true);
				new Thread(new Runnable() {  
					public void run() {
						Intent intent=new Intent(mContext, CityLink.class);

						mContext.startActivity(intent);		
						try
						{
							Thread.sleep(10000);
						}catch(Exception e){}
						myPd_ring.dismiss();
					}
				}).start();

			}

		});

	}

}