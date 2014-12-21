package com.example.walletofindia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.widget.TextView;

public class Chal2Page2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chal2_page2);
		
		 /*for(int i=0;i<9;i++)
		 {
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			 TextView ti = (TextView) findViewById(R.id.secleft);
			 ti.setText((Integer.parseInt(ti.getText().toString())-1)+"");
		 }*/
		
		/*long t1=System.currentTimeMillis(),t2;
		int x=1,c=0;
		
		while(true)
		{
			if(x==1){
				t1=System.currentTimeMillis();
				x=0;
			}
			t2=System.currentTimeMillis();
			if(t2-t1>1000)
			{
				TextView ti = (TextView) findViewById(R.id.secleft);
				ti.setText((Integer.parseInt(ti.getText().toString())-1)+"");
				Toast.makeText(getApplicationContext(), "hello", Toast.LENGTH_SHORT).show();
				x=1;
				c++;
			}
			if(c==9)	break;
		}*/
		new CountDownTimer(10000, 1000) {

            public void onTick(long millisUntilFinished) {
            	TextView ti = (TextView) findViewById(R.id.secleft);
                ti.setText("" + (int) (millisUntilFinished / 1000));
            }

            public void onFinish() {
                //text.setText("done!");
            	Intent intent = new Intent(getApplicationContext(), Chal2Page3.class);
                startActivity(intent);
            }
        }.start();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.chal2_page2, menu);
		return true;
	}

}
