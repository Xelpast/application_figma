
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		autorization
	 *	@date 		Friday 19th of May 2023 04:40:43 PM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.example.figmaexport;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class autorization_activity extends Activity {

	
	private View _bg__autorization_ek2;
	private ImageView top_background_1;
	private ImageView white_line_1;
	private TextView ____________________;
	private TextView _____________;
	private TextView ______________;
	private View rectangle_1;
	private TextView __________________;
	private ImageView white_line_2;
	private ImageView white_line_4;
	private TextView _____;
	private View rectangle_3;
	private TextView ______________ek1;
	private TextView ______;
	private View rectangle_4;
	private TextView _______________ek1;
	private View rectangle_1_ek1;
	private TextView ______ek1;
	private ImageView circle_1;
	private ImageView facebook_1;
	private ImageView google_1;
	private ImageView twitter_1;
	private ImageView women2_1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.autorization);

		
		_bg__autorization_ek2 = (View) findViewById(R.id._bg__autorization_ek2);
		top_background_1 = (ImageView) findViewById(R.id.top_background_1);
		white_line_1 = (ImageView) findViewById(R.id.white_line_1);
		____________________ = (TextView) findViewById(R.id.____________________);
		_____________ = (TextView) findViewById(R.id._____________);
		______________ = (TextView) findViewById(R.id.______________);
		rectangle_1 = (View) findViewById(R.id.rectangle_1);
		__________________ = (TextView) findViewById(R.id.__________________);
		white_line_2 = (ImageView) findViewById(R.id.white_line_2);
		white_line_4 = (ImageView) findViewById(R.id.white_line_4);
		_____ = (TextView) findViewById(R.id._____);
		rectangle_3 = (View) findViewById(R.id.rectangle_3);
		______________ek1 = (TextView) findViewById(R.id.______________ek1);
		______ = (TextView) findViewById(R.id.______);
		rectangle_4 = (View) findViewById(R.id.rectangle_4);
		_______________ek1 = (TextView) findViewById(R.id._______________ek1);
		rectangle_1_ek1 = (View) findViewById(R.id.rectangle_1_ek1);
		______ek1 = (TextView) findViewById(R.id.______ek1);
		circle_1 = (ImageView) findViewById(R.id.circle_1);
		facebook_1 = (ImageView) findViewById(R.id.facebook_1);
		google_1 = (ImageView) findViewById(R.id.google_1);
		twitter_1 = (ImageView) findViewById(R.id.twitter_1);
		women2_1 = (ImageView) findViewById(R.id.women2_1);

		rectangle_1.setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View view) {
						Intent intent3 = new Intent("com.example.figmaexport.registration_activity");
						startActivity(intent3);

					}
				}
		);
		
		//custom code goes here
	
	}
}
	
	