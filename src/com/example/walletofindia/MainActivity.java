package com.example.walletofindia;

import java.util.LinkedList;
import java.util.List;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final int fadeInDuration = 500;
	    final int fadeOutDuration = 1000;
	    
	    final int brgt_inc=90;
	    final int def_alpha = 200;

		ImageView disp_pic = (ImageView) findViewById(R.id.disp_pic);
		disp_pic.setImageBitmap(getRoundedShape(drawableToBitmap(disp_pic.getDrawable()),120,120));
		disp_pic.setImageAlpha(def_alpha);
		
		TextView user_name = (TextView) findViewById(R.id.user_name);
		TextView user_loc = (TextView) findViewById(R.id.user_loc);
		
		user_name.setText("Aravind");
		user_loc.setText("Chennai");
		
		ImageView offer_wall = (ImageView) findViewById(R.id.offer_wall);
		offer_wall.setImageBitmap(getRoundedShape(drawableToBitmap(offer_wall.getDrawable()),50,50));
		offer_wall.setImageAlpha(def_alpha);
		
		ImageView refer_a_friend = (ImageView) findViewById(R.id.refer_a_friend);
		refer_a_friend.setImageBitmap(getRoundedShape(drawableToBitmap(refer_a_friend.getDrawable()),50,50));
		refer_a_friend.setImageAlpha(def_alpha);
		
		ImageView transfer = (ImageView) findViewById(R.id.transfer);
		transfer.setImageBitmap(getRoundedShape(drawableToBitmap(transfer.getDrawable()),50,50));
		transfer.setImageAlpha(def_alpha);
		
		ImageView math_challenge = (ImageView) findViewById(R.id.math_challenge);
		math_challenge.setImageBitmap(getRoundedShape(drawableToBitmap(math_challenge.getDrawable()),50,50));
		math_challenge.setImageAlpha(def_alpha);
		
		ImageView memory_challenge = (ImageView) findViewById(R.id.memory_challenge);
		memory_challenge.setImageBitmap(getRoundedShape(drawableToBitmap(memory_challenge.getDrawable()),50,50));
		memory_challenge.setImageAlpha(def_alpha);
		
		ImageView monthly_challenge = (ImageView) findViewById(R.id.monthly_challenge);
		monthly_challenge.setImageBitmap(getRoundedShape(drawableToBitmap(monthly_challenge.getDrawable()),50,50));
		monthly_challenge.setImageAlpha(def_alpha);
		
		ImageView friends = (ImageView) findViewById(R.id.friends);
		friends.setImageBitmap(getRoundedShape(drawableToBitmap(friends.getDrawable()),50,50));
		friends.setImageAlpha(def_alpha);
		
		ImageView shopping = (ImageView) findViewById(R.id.shopping);
		shopping.setImageBitmap(getRoundedShape(drawableToBitmap(shopping.getDrawable()),50,50));
		shopping.setImageAlpha(def_alpha);
		
		ImageView transactions = (ImageView) findViewById(R.id.transactions);
		transactions.setImageBitmap(getRoundedShape(drawableToBitmap(transactions.getDrawable()),50,50));
		transactions.setImageAlpha(def_alpha);
		
		disp_pic.setOnTouchListener(new View.OnTouchListener(){

			@Override
			public boolean onTouch(View v, MotionEvent e) {
				// TODO Auto-generated method stub
				switch(e.getActionMasked())
				{
				
				case MotionEvent.ACTION_DOWN:
				{
					
					//Toast.makeText(getApplicationContext(), "ACTION_DOWN", Toast.LENGTH_SHORT).show();
					ImageView iv = (ImageView) findViewById(v.getId());
				    iv.setImageAlpha(255);
				    return true;
				}
				case MotionEvent.ACTION_UP:
				{
					
					//Toast.makeText(getApplicationContext(), "ACTION_UP", Toast.LENGTH_SHORT).show();
					ImageView iv = (ImageView) findViewById(v.getId());
					iv.setImageAlpha(def_alpha);
				    return true;
				}
				}
				return false;
			}
			
		});
		
		offer_wall.setOnTouchListener(new View.OnTouchListener(){

			@Override
			public boolean onTouch(View v, MotionEvent e) {
				// TODO Auto-generated method stub
				switch(e.getActionMasked())
				{
				
				case MotionEvent.ACTION_DOWN:
				{
					
					//Toast.makeText(getApplicationContext(), "ACTION_DOWN", Toast.LENGTH_SHORT).show();
					ImageView iv = (ImageView) findViewById(v.getId());
				    iv.setImageAlpha(255);
					return true;
				}
				case MotionEvent.ACTION_UP:
				{
					
					//Toast.makeText(getApplicationContext(), "ACTION_UP", Toast.LENGTH_SHORT).show();
					ImageView iv = (ImageView) findViewById(v.getId());
					iv.setImageAlpha(def_alpha);
				    return true;
				}
				}
				return false;
			}
			
		});
		
		refer_a_friend.setOnTouchListener(new View.OnTouchListener(){

			@Override
			public boolean onTouch(View v, MotionEvent e) {
				// TODO Auto-generated method stub
				switch(e.getActionMasked())
				{
				
				case MotionEvent.ACTION_DOWN:
				{
					
					//Toast.makeText(getApplicationContext(), "ACTION_DOWN", Toast.LENGTH_SHORT).show();
					ImageView iv = (ImageView) findViewById(v.getId());
				    iv.setImageAlpha(255);
					return true;
				}
				case MotionEvent.ACTION_UP:
				{
					
					//Toast.makeText(getApplicationContext(), "ACTION_UP", Toast.LENGTH_SHORT).show();
					ImageView iv = (ImageView) findViewById(v.getId());
					iv.setImageAlpha(def_alpha);
				    return true;
				}
				}
				return false;
			}
			
		});
		
		transfer.setOnTouchListener(new View.OnTouchListener(){

			@Override
			public boolean onTouch(View v, MotionEvent e) {
				// TODO Auto-generated method stub
				switch(e.getActionMasked())
				{
				
				case MotionEvent.ACTION_DOWN:
				{
					
					//Toast.makeText(getApplicationContext(), "ACTION_DOWN", Toast.LENGTH_SHORT).show();
					ImageView iv = (ImageView) findViewById(v.getId());
				    iv.setImageAlpha(255);
					return true;
				}
				case MotionEvent.ACTION_UP:
				{
					
					//Toast.makeText(getApplicationContext(), "ACTION_UP", Toast.LENGTH_SHORT).show();
					ImageView iv = (ImageView) findViewById(v.getId());
					iv.setImageAlpha(def_alpha);
				    return true;
				}
				}
				return false;
			}
			
		});
		
		math_challenge.setOnTouchListener(new View.OnTouchListener(){

			@Override
			public boolean onTouch(View v, MotionEvent e) {
				// TODO Auto-generated method stub
				switch(e.getActionMasked())
				{
				
				case MotionEvent.ACTION_DOWN:
				{
					
					//Toast.makeText(getApplicationContext(), "ACTION_DOWN", Toast.LENGTH_SHORT).show();
					ImageView iv = (ImageView) findViewById(v.getId());
				    iv.setImageAlpha(255);
				    
					return true;
				}
				case MotionEvent.ACTION_UP:
				{
					
					//Toast.makeText(getApplicationContext(), "ACTION_UP", Toast.LENGTH_SHORT).show();
					ImageView iv = (ImageView) findViewById(v.getId());
					iv.setImageAlpha(def_alpha);
					
				    Intent intent = new Intent(getApplicationContext(),Chal1Page1.class);
				    startActivity(intent);
				    return true;
				}
				}
				return false;
			}
			
		});
		
		memory_challenge.setOnTouchListener(new View.OnTouchListener(){

			@Override
			public boolean onTouch(View v, MotionEvent e) {
				// TODO Auto-generated method stub
				switch(e.getActionMasked())
				{
				
				case MotionEvent.ACTION_DOWN:
				{
					
					//Toast.makeText(getApplicationContext(), "ACTION_DOWN", Toast.LENGTH_SHORT).show();
					ImageView iv = (ImageView) findViewById(v.getId());
				    iv.setImageAlpha(255);
				    
				    return true;
				}
				case MotionEvent.ACTION_UP:
				{
					
					//Toast.makeText(getApplicationContext(), "ACTION_UP", Toast.LENGTH_SHORT).show();
					ImageView iv = (ImageView) findViewById(v.getId());
					iv.setImageAlpha(def_alpha);
					

				    Intent intent = new Intent(getApplicationContext(),Chal2Page1.class);
				    startActivity(intent);
				    
				    return true;
				}
				}
				return false;
			}
			
		});
		
		monthly_challenge.setOnTouchListener(new View.OnTouchListener(){

			@Override
			public boolean onTouch(View v, MotionEvent e) {
				// TODO Auto-generated method stub
				switch(e.getActionMasked())
				{
				
				case MotionEvent.ACTION_DOWN:
				{
					
					//Toast.makeText(getApplicationContext(), "ACTION_DOWN", Toast.LENGTH_SHORT).show();
					ImageView iv = (ImageView) findViewById(v.getId());
				    iv.setImageAlpha(255);
					return true;
				}
				case MotionEvent.ACTION_UP:
				{
					
					//Toast.makeText(getApplicationContext(), "ACTION_UP", Toast.LENGTH_SHORT).show();
					ImageView iv = (ImageView) findViewById(v.getId());
					iv.setImageAlpha(def_alpha);

				    Intent intent = new Intent(getApplicationContext(),Chal3Page1.class);
				    startActivity(intent);
				    
				    return true;
				}
				}
				return false;
			}
			
		});
		
		friends.setOnTouchListener(new View.OnTouchListener(){

			@Override
			public boolean onTouch(View v, MotionEvent e) {
				// TODO Auto-generated method stub
				switch(e.getActionMasked())
				{
				
				case MotionEvent.ACTION_DOWN:
				{
					
					//Toast.makeText(getApplicationContext(), "ACTION_DOWN", Toast.LENGTH_SHORT).show();
					ImageView iv = (ImageView) findViewById(v.getId());
				    iv.setImageAlpha(255);
					return true;
				}
				case MotionEvent.ACTION_UP:
				{
					
					//Toast.makeText(getApplicationContext(), "ACTION_UP", Toast.LENGTH_SHORT).show();
					ImageView iv = (ImageView) findViewById(v.getId());
					iv.setImageAlpha(def_alpha);
				    return true;
				}
				}
				return false;
			}
			
		});
		
		shopping.setOnTouchListener(new View.OnTouchListener(){

			@Override
			public boolean onTouch(View v, MotionEvent e) {
				// TODO Auto-generated method stub
				switch(e.getActionMasked())
				{
				
				case MotionEvent.ACTION_DOWN:
				{
					
					//Toast.makeText(getApplicationContext(), "ACTION_DOWN", Toast.LENGTH_SHORT).show();
					ImageView iv = (ImageView) findViewById(v.getId());
				    iv.setImageAlpha(255);
					return true;
				}
				case MotionEvent.ACTION_UP:
				{
					
					//Toast.makeText(getApplicationContext(), "ACTION_UP", Toast.LENGTH_SHORT).show();
					ImageView iv = (ImageView) findViewById(v.getId());
					iv.setImageAlpha(def_alpha);
				    return true;
				}
				}
				return false;
			}
			
		});

		
		transactions.setOnTouchListener(new View.OnTouchListener(){

			@Override
			public boolean onTouch(View v, MotionEvent e) {
				// TODO Auto-generated method stub
				switch(e.getActionMasked())
				{
				
				case MotionEvent.ACTION_DOWN:
				{
					
					//Toast.makeText(getApplicationContext(), "ACTION_DOWN", Toast.LENGTH_SHORT).show();
					ImageView iv = (ImageView) findViewById(v.getId());
				    iv.setImageAlpha(255);
					return true;
				}
				case MotionEvent.ACTION_UP:
				{
					
					//Toast.makeText(getApplicationContext(), "ACTION_UP", Toast.LENGTH_SHORT).show();
					ImageView iv = (ImageView) findViewById(v.getId());
					iv.setImageAlpha(def_alpha);
				    return true;
				}
				}
				return false;
			}
			
		});
		
		
		
		
		
	}
	
	public Bitmap changeBitmapBrightness(Bitmap src, int value) {
	     // original image size
	     int width = src.getWidth();
	     int height = src.getHeight();
	     // create output bitmap
	     Bitmap bmOut = Bitmap.createBitmap(width, height, src.getConfig());
	     // color information
	     int A, R, G, B;
	     int pixel;
	   
	     // scan through all pixels
	     for(int x = 0; x < width; ++x) {
	         for(int y = 0; y < height; ++y) {
	             // get pixel color
	             pixel = src.getPixel(x, y);
	             A = Color.alpha(pixel);
	             R = Color.red(pixel);
	             G = Color.green(pixel);
	             B = Color.blue(pixel);
	   
	             // increase/decrease each channel
	             R += value;
	             if(R > 255) { R = 255; }
	             else if(R < 0) { R = 0; }
	   
	             G += value;
	             if(G > 255) { G = 255; }
	             else if(G < 0) { G = 0; }
	   
	             B += value;
	             if(B > 255) { B = 255; }
	             else if(B < 0) { B = 0; }
	   
	             // apply new pixel color to output bitmap
	             bmOut.setPixel(x, y, Color.argb(A, R, G, B));
	         }
	     }
	   
	     // return final image
	     return bmOut;
	 }
	
	
	public static Bitmap changeBitmapContrastBrightness(Bitmap bmp, float contrast, float brightness)
	{
	    ColorMatrix cm = new ColorMatrix(new float[]
	            {
	                contrast, 0, 0, 0, brightness,
	                0, contrast, 0, 0, brightness,
	                0, 0, contrast, 0, brightness,
	                0, 0, 0, 1, 0
	            });

	    Bitmap ret = Bitmap.createBitmap(bmp.getWidth(), bmp.getHeight(), bmp.getConfig());

	    Canvas canvas = new Canvas(ret);

	    Paint paint = new Paint();
	    paint.setColorFilter(new ColorMatrixColorFilter(cm));
	    canvas.drawBitmap(bmp, 0, 0, paint);

	    return ret;
	}
	
	
	public String getUsername() {
	    AccountManager manager = AccountManager.get(this); 
	    Account[] accounts = manager.getAccountsByType("com.google"); 
	    List<String> possibleEmails = new LinkedList<String>();

	    for (Account account : accounts) {
	      // TODO: Check possibleEmail against an email regex or treat
	      // account.name as an email address only for certain account.type values.
	      possibleEmails.add(account.name);
	    }

	    if (!possibleEmails.isEmpty() && possibleEmails.get(0) != null) {
	        String email = possibleEmails.get(0);
	        String[] parts = email.split("@");

	        if (parts.length > 1)
	            return parts[0];
	    }
	    return null;
	}
	
	public void animate(final ImageView imageView, final int images[], final int imageIndex, final boolean forever) {

		  //imageView <-- The View which displays the images
		  //images[] <-- Holds R references to the images to display
		  //imageIndex <-- index of the first image to show in images[] 
		  //forever <-- If equals true then after the last image it starts all over again with the first image resulting in an infinite loop. You have been warned.

		    int fadeInDuration = 500; // Configure time values here
		    int timeBetween = 3000;
		    int fadeOutDuration = 1000;

		    imageView.setVisibility(View.INVISIBLE);    //Visible or invisible by default - this will apply when the animation ends
		    imageView.setImageResource(images[imageIndex]);

		    Animation fadeIn = new AlphaAnimation(0, 1);
		    fadeIn.setInterpolator(new DecelerateInterpolator()); // add this
		    fadeIn.setDuration(fadeInDuration);

		    Animation fadeOut = new AlphaAnimation(1, 0);
		    fadeOut.setInterpolator(new AccelerateInterpolator()); // and this
		    fadeOut.setStartOffset(fadeInDuration + timeBetween);
		    fadeOut.setDuration(fadeOutDuration);

		    AnimationSet animation = new AnimationSet(false); // change to false
		    animation.addAnimation(fadeIn);
		    animation.addAnimation(fadeOut);
		    animation.setRepeatCount(1);
		    imageView.setAnimation(animation);

		    animation.setAnimationListener(new AnimationListener() {
		        public void onAnimationEnd(Animation animation) {
		            if (images.length - 1 > imageIndex) {
		                animate(imageView, images, imageIndex + 1,forever); //Calls itself until it gets to the end of the array
		            }
		            else {
		                if (forever == true){
		                animate(imageView, images, 0,forever);  //Calls itself to start the animation all over again in a loop if forever = true
		                }
		            }
		        }
		        public void onAnimationRepeat(Animation animation) {
		            // TODO Auto-generated method stub
		        }
		        public void onAnimationStart(Animation animation) {
		            // TODO Auto-generated method stub
		        }
		    });
		}
	
	public static Bitmap drawableToBitmap (Drawable drawable) {
	    if (drawable instanceof BitmapDrawable) {
	        return ((BitmapDrawable)drawable).getBitmap();
	    }

	    Bitmap bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Config.ARGB_8888);
	    Canvas canvas = new Canvas(bitmap); 
	    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
	    drawable.draw(canvas);

	    return bitmap;
	}
	public int dpToPx(int dp)
	 {
	     float density = getApplicationContext().getResources().getDisplayMetrics().density;
	     return Math.round((float)dp * density);
	 }

	public Bitmap getRoundedShape(Bitmap scaleBitmapImage,int wdp,int hdp) {

	    int targetWidth = dpToPx(wdp);
	    int targetHeight = dpToPx(hdp);
	    Bitmap targetBitmap = Bitmap.createBitmap(targetWidth, 
	                        targetHeight,Bitmap.Config.ARGB_8888);
	                        Canvas canvas = new Canvas(targetBitmap);
	    Path path = new Path();
	    path.addCircle(((float) targetWidth - 1) / 2,
	    ((float) targetHeight - 1) / 2,
	    (Math.min(((float) targetWidth), 
	            ((float) targetHeight)) / 2),
	      Path.Direction.CCW);

	    
	    canvas.clipPath(path);
	    Bitmap sourceBitmap = scaleBitmapImage;
	    
	    Paint paint=new Paint();
        paint.setColor(Color.WHITE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(15);
        paint.setStyle(Style.STROKE);

        // 'paintWhite' colors the inner path
        Paint paintWhite = new Paint();
        paintWhite.setColor(Color.WHITE);
        paintWhite.setAntiAlias(true);
        paintWhite.setStrokeWidth(12);
        paintWhite.setStyle(Style.FILL);
        
        canvas.drawPath(path, paint);
        canvas.drawPath(path, paintWhite);
        
	    /*paint.setColor(Color.parseColor("#00ffffff"));
	    paint.setStyle(android.graphics.Paint.Style.FILL);
	    	    
	    canvas.drawCircle(((float) targetWidth - 1) / 2,
	    ((float) targetHeight - 1) / 2,
	    (Math.min(((float) targetWidth-dpToPx(3)), 
	            ((float) targetHeight-dpToPx(3)))) / 2,paint);*/
	    
	 // canvas.clipPath(path);
	    canvas.drawBitmap(sourceBitmap, 
	                            new Rect(0, 0, sourceBitmap.getWidth(),
	      sourceBitmap.getHeight()), 
	                            new Rect(0, 0, targetWidth,
	      targetHeight), null);
	    return targetBitmap;
	   }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle presses on the action bar items
	    switch (item.getItemId()) {
	        case R.id.navig_drawer:
	        	
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}

}
