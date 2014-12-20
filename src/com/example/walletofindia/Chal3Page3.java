package com.example.walletofindia;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Chal3Page3 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chal3_page3);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.chal3_page3, menu);
		return true;
	}

}
