package com.SkyELITE21.body_mass_index;
import android.app.*;
import android.os.*;
import android.content.*;
import android.view.*;
import android.widget.*;
import java.net.*;

public class FirstRunCheck extends Activity
{

	public static final String Pref = "BMIPrefs";
	SharedPreferences sp;
	SharedPreferences.Editor spe;
	private Button con;
	private CheckBox cbox;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		sp = getSharedPreferences(Pref,Context.MODE_PRIVATE);
		spe = sp.edit();
		boolean check = sp.getBoolean("isFirstTime",false);
		if(check)
		{
			setContentView(R.layout.eula);
			con = (Button)findViewById(R.id.continueButton);
			cbox = (CheckBox)findViewById(R.id.acceptCheckBox);
			con.setOnClickListener(new View.OnClickListener()
				{

					@Override
					public void onClick(View p1)
					{
						if(cbox.isChecked())
						{
							spe.putBoolean("isFirstTime",false);
							spe.putBoolean("eulaAccepted",true);
							spe.commit();
							startApp();
						}
						else
						{
							spe.putBoolean("eulaAccepted",false);
							spe.putBoolean("isFirstTime",true);
							spe.commit();
							try
							{
								Intent uninstall = new Intent(Intent.parseUri(getPackageName(),Intent.FLAG_ACTIVITY_SINGLE_TOP));
								uninstall.setAction(Intent.ACTION_UNINSTALL_PACKAGE);
								startActivity(uninstall);
							}
							catch (URISyntaxException e)
							{}
							finish();
						}
						// TODO: Implement this method
					}
					
				
			});
			
		}
		else
		{
			startApp();
		}
	}

	public void startApp()
	{
		Intent a = new Intent(this,ModeLoader.class);
		startActivity(a);
	}
	
	@Override
	protected void onStop()
	{
		// TODO: Implement this method
		super.onStop();
		finish();
	}
}
