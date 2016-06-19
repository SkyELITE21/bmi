package com.SkyELITE21.body_mass_index;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.content.*;
import android.view.*;

public class Settings extends Activity
{

	private Switch ktm;
	private Button eu,fs;
	private static final String Pref = "BMIPrefs";
	private SharedPreferences sp;
	private SharedPreferences.Editor spe;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.settings);
		fs = (Button)findViewById(R.id.feedbackSupport);
		eu = (Button)findViewById(R.id.eulaButton);
		ktm = (Switch)findViewById(R.id.kidsTeensMode);
		sp = getSharedPreferences(Pref,Context.MODE_PRIVATE);
		spe = sp.edit();
		boolean isKidsTeensMode = sp.getBoolean("KidsTeensMode",false);
		if(isKidsTeensMode)
		{
			ktm.setChecked(true);
		}
		else
		{
			ktm.setChecked(false);
		}
		ktm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
			{

				@Override
				public void onCheckedChanged(CompoundButton p1, boolean p2)
				{
					// TODO: Implement this method
					if(ktm.isChecked())
					{
						spe.putBoolean("KidsTeensMode",true);
						spe.commit();
					}
					else
					{
						spe.putBoolean("KidsTeensMode",false);
						spe.commit();
					}
					Toast.makeText(Settings.this,"Please restart the app to take effect!",Toast.LENGTH_LONG).show();
				}
				
			
		});
		eu.setOnClickListener(new View.OnClickListener()
			{

				@Override
				public void onClick(View p1)
				{
					showEula();
					// TODO: Implement this method
				}
				
			
		});
		fs.setOnClickListener(new View.OnClickListener()
			{

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					feedBack();
				}
				
			
		});
	}
	
	public void showEula()
	{
		Intent launch = new Intent(this,Eula.class);
		startActivity(launch);
	}
	
	public void feedBack()
	{
		Intent launch = new Intent(this,FSup.class);
		startActivity(launch);
	}

	@Override
	protected void onStop()
	{
		// TODO: Implement this method
		super.onStop();
		finish();
	}
	
	
}
