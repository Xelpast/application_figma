
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		main_page
	 *	@date 		Monday 15th of May 2023 09:20:47 AM
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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class main_page_activity extends Activity {

	
	private View _bg__main_page_ek2;
	private ImageView background_intro_1;
	private ImageView white_line_1;
	private ImageView women_1;
	private TextView __________________________________________;
	private TextView xelpast;
	private TextView _____________________________________________________________________________;
	private View rectangle_1;
	private TextView ___________;
	private ImageView white_line_2;
	private ImageView white_line_4;
	private View rectangle_2;
	private TextView ____________ek1;
	private ImageView white_line_3;
	private ImageView white_line_5;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_page);

		
		_bg__main_page_ek2 = (View) findViewById(R.id._bg__main_page_ek2);
		background_intro_1 = (ImageView) findViewById(R.id.background_intro_1);
		white_line_1 = (ImageView) findViewById(R.id.white_line_1);
		women_1 = (ImageView) findViewById(R.id.women_1);
		__________________________________________ = (TextView) findViewById(R.id.__________________________________________);
		xelpast = (TextView) findViewById(R.id.xelpast);
		_____________________________________________________________________________ = (TextView) findViewById(R.id._____________________________________________________________________________);
		rectangle_1 = (View) findViewById(R.id.rectangle_1);
		___________ = (TextView) findViewById(R.id.___________);
		white_line_2 = (ImageView) findViewById(R.id.white_line_2);
		white_line_4 = (ImageView) findViewById(R.id.white_line_4);
		rectangle_2 = (Button) findViewById(R.id.rectangle_2);
		____________ek1 = (TextView) findViewById(R.id.____________ek1);
		white_line_3 = (ImageView) findViewById(R.id.white_line_3);
		white_line_5 = (ImageView) findViewById(R.id.white_line_5);

		rectangle_2.setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View view) {
						Intent intent = new Intent("com.example.figmaexport.registration_activity");
						startActivity(intent);

					}
				}
		);

		rectangle_1.setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View view) {
						Intent intent2 = new Intent("com.example.figmaexport.autorization_activity");
						startActivity(intent2);

					}
				}
		);
		
		//custom code goes here
	}
}
	
	