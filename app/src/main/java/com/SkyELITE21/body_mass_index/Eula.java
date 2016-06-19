package com.SkyELITE21.body_mass_index;
import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import java.net.*;

public class Eula extends Activity
{

	private CheckBox cbox;
	private Button con;
	private SharedPreferences sp;
	private SharedPreferences.Editor spe;
	private static final String Pref = "BMIPrefs";
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.eula);
		cbox = (CheckBox)findViewById(R.id.acceptCheckBox);
		con = (Button)findViewById(R.id.continueButton);
		sp = getSharedPreferences(Pref,Context.MODE_PRIVATE);
		spe = sp.edit();
		boolean isAccepted = sp.getBoolean("eulaAccepted",false);
		if(isAccepted)
		{
			cbox.setVisibility(View.INVISIBLE);
			con.setVisibility(View.INVISIBLE);
		}
		else
		{
			cbox.setVisibility(View.VISIBLE);
			con.setVisibility(View.VISIBLE);
		}
		con.setOnClickListener(new View.OnClickListener()
			{

				@Override
				public void onClick(View p1)
				{
					if(cbox.isChecked())
					{
						spe.putBoolean("eulaAccepted",true);
						spe.commit();
						goBack(new Intent(Eula.this,ModeLoader.class));
					}
					else
					{
						spe.putBoolean("eulaAccepted",false);
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
	
	public void goBack(Intent intent)
	{
		startActivity(intent);
	}

	@Override
	protected void onStop()
	{
		// TODO: Implement this method
		super.onStop();
		finish();
	}
	
	
}
