package com.example.walletofindia;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TextView;

public class Chal3Page2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chal3_page2);
		
		TextView but_playnow = (TextView) findViewById(R.id.but_playnow_3);
		TextView but_chal = (TextView) findViewById(R.id.but_chal_3);
		TextView but_prac = (TextView) findViewById(R.id.but_practice_3);
		
		final Resources reso = this.getResources();
		
		but_playnow.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View arg0, MotionEvent arg1)
			{
				switch(arg1.getActionMasked())
				{
				case MotionEvent.ACTION_DOWN:
				{   
					TextView tv = (TextView) findViewById(arg0.getId());
					tv.setBackground((GradientDrawable)reso.getDrawable(R.drawable.roundrect_chal3_hover));
					tv.setPadding(20,10, 20, 10);
					return true;
					
				}
				case MotionEvent.ACTION_UP:
				// TODO Auto-generated method stub
				{
					TextView tv = (TextView) findViewById(arg0.getId());
					tv.setBackground((GradientDrawable)reso.getDrawable(R.drawable.roundrect_chal3));
					
					tv.setPadding(20,10, 20, 10);
					
					Intent intent = new Intent(getApplicationContext(),Chal3Page3.class);
				    startActivity(intent);
				    
					return true;
				}
			}
				return false;
		}
		});
		
			but_chal.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View arg0, MotionEvent arg1)
			{
				switch(arg1.getActionMasked())
				{
				case MotionEvent.ACTION_DOWN:
				{   
					TextView tv = (TextView) findViewById(arg0.getId());
					tv.setBackground((GradientDrawable)reso.getDrawable(R.drawable.roundrect_chal3_hover));
					tv.setPadding(20,10, 20, 10);
					return true;
					
				}
				case MotionEvent.ACTION_UP:
				// TODO Auto-generated method stub
				{
					TextView tv = (TextView) findViewById(arg0.getId());
					tv.setBackground((GradientDrawable)reso.getDrawable(R.drawable.roundrect_chal3));
					
					tv.setPadding(20,10, 20, 10);
					
					return true;
				}
			}
				return false;
		}
		});

			but_prac.setOnTouchListener(new OnTouchListener() {
	
	@Override
	public boolean onTouch(View arg0, MotionEvent arg1)
	{
		switch(arg1.getActionMasked())
		{
		case MotionEvent.ACTION_DOWN:
		{   
			TextView tv = (TextView) findViewById(arg0.getId());
			tv.setBackground((GradientDrawable)reso.getDrawable(R.drawable.roundrect_chal3_prac));
			tv.setPadding(20,10, 20, 10);
			return true;
			
		}
		case MotionEvent.ACTION_UP:
		// TODO Auto-generated method stub
		{
			TextView tv = (TextView) findViewById(arg0.getId());
			tv.setBackground((GradientDrawable)reso.getDrawable(R.drawable.roundrect_chal3_prac));
			
			tv.setPadding(20,10, 20, 10);
			
			Intent intent = new Intent(getApplicationContext(),Chal3Page3.class);
		    startActivity(intent);
		    
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
		getMenuInflater().inflate(R.menu.chal3_page2, menu);
		return true;
	}

}
