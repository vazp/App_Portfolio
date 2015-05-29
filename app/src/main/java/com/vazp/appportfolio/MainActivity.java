package com.vazp.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
	private static final String LOG_TAG = MainActivity.class.getSimpleName();
	private Button spotifyButton, scoresButton, libraryButton, buildItButton, xyzReaderButton, capstoneButton;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		spotifyButton = (Button) findViewById(R.id.main_activity_button_spottify);
		scoresButton = (Button) findViewById(R.id.main_activity_button_scores);
		libraryButton = (Button) findViewById(R.id.main_activity_button_library);
		buildItButton = (Button) findViewById(R.id.main_activity_button_build);
		xyzReaderButton = (Button) findViewById(R.id.main_activity_button_xyz);
		capstoneButton = (Button) findViewById(R.id.main_activity_button_capstone);

		spotifyButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				Toast.makeText(MainActivity.this, "This button will launch my Spotify Streamer App", Toast.LENGTH_LONG).show();
			}
		});

		scoresButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				Toast.makeText(MainActivity.this, "This button will launch my Scores App", Toast.LENGTH_LONG).show();
			}
		});

		libraryButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				Toast.makeText(MainActivity.this, "This button will launch my Library App", Toast.LENGTH_LONG).show();
			}
		});

		buildItButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				Toast.makeText(MainActivity.this, "This button will launch my Build It Bigger App", Toast.LENGTH_LONG).show();
			}
		});

		xyzReaderButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				Toast.makeText(MainActivity.this, "This button will launch my XYZ Reader App", Toast.LENGTH_LONG).show();
			}
		});

		capstoneButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				Toast.makeText(MainActivity.this, "This button will launch my Capstone App", Toast.LENGTH_LONG).show();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings)
		{
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
}
