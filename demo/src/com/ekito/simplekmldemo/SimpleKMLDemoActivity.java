package com.ekito.simplekmldemo;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import android.app.Activity;
import android.content.Context;
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

		new ParsingTask().execute("test.kml");
	}

	private class ParsingTask extends AsyncTask<String, String, Kml> {

		Serializer kmlSerializer;

		public ParsingTask() {
			kmlSerializer = new Serializer();
		}

		@Override
		protected Kml doInBackground(String... params) {
			Log.d(TAG, "read started");
			// this will create a Kml class based on the informations described in params[0] (assets/test.kml)
			Kml kml = null;
			try {
				InputStream is = getResources().getAssets().open(params[0]);
				Log.d(TAG, "parsing started");
				kml = kmlSerializer.read(is);
				Log.d(TAG, "parsing done");
			} catch (IOException e) {
				Log.e(TAG, e.getMessage());
			} catch (Exception e) {
				Log.e(TAG, e.getMessage());
			}
			Log.d(TAG, "read done");

			if (kml != null) {
				Log.d(TAG, "write started");
				// this will output the KML to /data/data/com.ekito.simplekmldemo/example_out.kml
				File out = new File(getDir("assets", Context.MODE_PRIVATE), "test.kml");
				try {
					kmlSerializer.write(kml, out);
				} catch (Exception e) {
					Log.e(TAG, e.getMessage());
				}
				Log.d(TAG, "write done");
			}

			return kml;
		}

	}
}