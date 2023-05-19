
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		registration
	 *	@date 		Monday 15th of May 2023 10:09:58 AM
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

public class registration_activity extends Activity {

	
	private View _bg__registration_ek2;
	private ImageView top_background_1;
	private ImageView white_line_1;
	private ImageView women1_1;
	private TextView ____________________;
	private TextView _______________________;
	private View rectangle_1;
	private TextView ___________;
	private ImageView white_line_2;
	private ImageView white_line_4;
	private TextView _____;
	private View rectangle_3;
	private TextView _____________;
	private TextView ______;
	private View rectangle_4;
	private TextView ______________;
	private TextView ________________;
	private View rectangle_5;
	private TextView ________________________;
	private View rectangle_1_ek1;
	private TextView ____________ek1;
	private ImageView circle_1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.registration);

		
		_bg__registration_ek2 = (View) findViewById(R.id._bg__registration_ek2);
		top_background_1 = (ImageView) findViewById(R.id.top_background_1);
		white_line_1 = (ImageView) findViewById(R.id.white_line_1);
		women1_1 = (ImageView) findViewById(R.id.women1_1);
		____________________ = (TextView) findViewById(R.id.____________________);
		_______________________ = (TextView) findViewById(R.id._______________________);
		rectangle_1 = (View) findViewById(R.id.rectangle_1);
		___________ = (TextView) findViewById(R.id.___________);
		white_line_2 = (ImageView) findViewById(R.id.white_line_2);
		white_line_4 = (ImageView) findViewById(R.id.white_line_4);
		_____ = (TextView) findViewById(R.id._____);
		rectangle_3 = (View) findViewById(R.id.rectangle_3);
		_____________ = (TextView) findViewById(R.id._____________);
		______ = (TextView) findViewById(R.id.______);
		rectangle_4 = (View) findViewById(R.id.rectangle_4);
		______________ = (TextView) findViewById(R.id.______________);
		________________ = (TextView) findViewById(R.id.________________);
		rectangle_5 = (View) findViewById(R.id.rectangle_5);
		________________________ = (TextView) findViewById(R.id.________________________);
		rectangle_1_ek1 = (View) findViewById(R.id.rectangle_1_ek1);
		____________ek1 = (TextView) findViewById(R.id.____________ek1);
		circle_1 = (ImageView) findViewById(R.id.circle_1);

		rectangle_1.setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View view) {
						Intent intent4 = new Intent("com.example.figmaexport.autorization_activity");
						startActivity(intent4);

					}
				}
		);
		
		//custom code goes here
	
	}
}
	
	