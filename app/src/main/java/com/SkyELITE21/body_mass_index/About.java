package com.SkyELITE21.body_mass_index;
import android.app.*;
import android.os.*;
import android.content.pm.*;
import android.widget.*;
import android.content.pm.PackageManager.*;

public class About extends Activity
{

	private PackageManager pkManager;
	private TextView version;
	private String cVersionName,versionString;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		version = (TextView)findViewById(R.id.cVersion);
		pkManager = getPackageManager();
		getVersion(pkManager);
		versionString = getString(R.string.version);
		version.setText(versionString + cVersionName);
	}
	
	public void getVersion(PackageManager manager)
	{
		try
		{
			cVersionName = manager.getPackageInfo(getPackageName(), 1).versionName;
		}
		catch (PackageManager.NameNotFoundException e)
		{}
	}

	@Override
	protected void onStop()
	{
		// TODO: Implement this method
		super.onStop();
		finish();
	}

	@Override
	protected void onDestroy()
	{
		// TODO: Implement this method
		super.onDestroy();
	}
	
}
