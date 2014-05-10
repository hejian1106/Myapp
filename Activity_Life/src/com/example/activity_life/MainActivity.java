package com.example.activity_life;

import java.text.SimpleDateFormat;
import java.util.Date;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView output;
	private SimpleDateFormat sDateFormat = new SimpleDateFormat("hh:mm:ss");
	private final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        output = (TextView)findViewById(R.id.output);
        output.append(sDateFormat.format(new Date()) + " onCreate\n");
        Log.i(TAG, "onCreate Method is exxcuted");
    }
    @Override
    protected void onDestroy() {
    	// TODO Auto-generated method stub
    	super.onDestroy();
    	output.append(sDateFormat.format(new Date()) + " onDestroy\n");
    	Log.i(TAG, "onDestroy Method is exxcuted");
    }
    
    
    @Override
    protected void onStart() {
    	// TODO Auto-generated method stub
    	super.onStart();
    	output.append(sDateFormat.format(new Date()) + " onStart\n");
    	Log.i(TAG, "onStart Method is exxcuted");
    }
    @Override
    protected void onStop() {
    	// TODO Auto-generated method stub
    	super.onStop();
    	output.append(sDateFormat.format(new Date()) + " onStop\n");
    	Log.i(TAG, "onStop Method is exxcuted");
    }
    
    
    @Override
    protected void onResume() {
    	// TODO Auto-generated method stub
    	super.onResume();
    	output.append(sDateFormat.format(new Date()) + " onResume\n");
    	Log.i(TAG, "onResume Method is exxcuted");
    }
    @Override
    protected void onPause() {
    	// TODO Auto-generated method stub
    	super.onPause();
    	output.append(sDateFormat.format(new Date()) + " onPause\n");
    	Log.i(TAG, "onPause Method is exxcuted");
    }
    
    
    @Override
    protected void onRestart() {
    	// TODO Auto-generated method stub
    	super.onRestart();
    	output.append(sDateFormat.format(new Date()) + " aonRestart\n");
    	Log.i(TAG, "onRestart Method is exxcuted");
    }
}
