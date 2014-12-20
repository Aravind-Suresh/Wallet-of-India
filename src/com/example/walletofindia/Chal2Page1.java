package com.example.walletofindia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;

public class Chal2Page1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chal2_page1);
		
		final Runnable mMyRunnable = new Runnable()
		{
		    @Override
		    public void run()
		    {
		    	Intent intent = new Intent(getApplicationContext(),Chal2Page2.class);
		    	startActivity(intent);
		    	
		    }
		 };
		 
		 Handler myHandler = new Handler();
		 myHandler.postDelayed(mMyRunnable, 1000);
		 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.chal2_page1, menu);
		return true;
	}

}
