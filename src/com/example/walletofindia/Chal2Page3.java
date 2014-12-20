package com.example.walletofindia;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TextView;

public class Chal2Page3 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chal2_page3);
		
		final Resources reso = this.getResources();
		
		TextView but_yes = (TextView) findViewById(R.id.but_yes);
		TextView but_no = (TextView) findViewById(R.id.but_no);
		
		but_yes.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View arg0, MotionEvent arg1)
			{
				switch(arg1.getActionMasked())
				{
				case MotionEvent.ACTION_DOWN:
				{   
					TextView tv = (TextView) findViewById(arg0.getId());
					tv.setBackground((GradientDrawable)reso.getDrawable(R.drawable.roundrectbackhover));
					return true;
					
				}
				case MotionEvent.ACTION_UP:
				// TODO Auto-generated method stub
				{
					TextView tv = (TextView) findViewById(arg0.getId());
					tv.setBackground((GradientDrawable)reso.getDrawable(R.drawable.roundrectback));
					return true;
				}
			}
				return false;
	
			}
		});
		
		but_no.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View arg0, MotionEvent arg1)
			{
				switch(arg1.getActionMasked())
				{
				case MotionEvent.ACTION_DOWN:
				{   
					TextView tv = (TextView) findViewById(arg0.getId());
					tv.setBackground((GradientDrawable)reso.getDrawable(R.drawable.roundrectbackhover));
					return true;
					
				}
				case MotionEvent.ACTION_UP:
				// TODO Auto-generated method stub
				{
					TextView tv = (TextView) findViewById(arg0.getId());
					tv.setBackground((GradientDrawable)reso.getDrawable(R.drawable.roundrectback));
					return true;
				}
			}
				return false;
	
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.chal2_page3, menu);
		return true;
	}

}
