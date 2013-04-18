package com.example.intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntentSample extends Activity implements View.OnClickListener {
	/**
	 * Button1
	 */
	Button mButton1;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		mButton1 = (Button)findViewById(R.id.button1);
		mButton1.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		if(view.equals(mButton1)){
			
			Intent testIntent = new Intent();
			testIntent.setAction(Intent.ACTION_MAIN);
			startActivity(testIntent);
		}
		
	}
}