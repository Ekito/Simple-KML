package com.ekito.simplekmldemo;

import java.io.IOException;
import java.io.InputStream;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import com.ekito.simpleKML.Serializer;
import com.ekito.simpleKML.model.Kml;

public class SimpleKMLDemoActivity extends Activity {

	private final String TAG = "SimpleKMLDemoActivity";
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        new ParsingTask().execute("bdx_airsidearea.kml");
    }
    
    private class ParsingTask extends AsyncTask<String, String, Kml> {

    	Serializer kmlSerializer;
    	
    	public ParsingTask() {
    		kmlSerializer = new Serializer();
    	}
    	
		@Override
		protected Kml doInBackground(String... params) {
	        Log.d(TAG, "parsing started");
			Kml kml = null;
	        try {
	            InputStream is = getResources().getAssets().open(params[0]);
	           	kml = kmlSerializer.read(is);
			} catch (IOException e) {
				Log.e(TAG, e.getMessage());
			} catch (Exception e) {
				Log.e(TAG, e.getMessage());
			}
	        Log.d(TAG, "parsing done");
			return kml;
		}
    	
    }
}