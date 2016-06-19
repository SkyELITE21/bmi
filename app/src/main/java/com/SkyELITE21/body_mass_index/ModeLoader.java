package com.SkyELITE21.body_mass_index;
import android.app.*;
import android.os.*;
import android.content.*;
import android.widget.*;

public class ModeLoader extends Activity
{

	private static final String Pref = "BMIPrefs";
	private SharedPreferences sp;
	private int DURATION = 3500;
	private long SLEEP = 100;
	private Thread loader;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mode_loader);
		runLoader();
	}
	
	public void MainAppLaunch()
	{
		Intent launch = new Intent(this,MainApp.class);
		startActivity(launch);
	}
	
	public void MainAppKidsTeensLaunch()
	{
		Intent launch = new Intent(this,MainAppKidsTeens.class);
		startActivity(launch);
	}
	
	public void runLoader()
	{
		loader = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    // Splash screen pause time
                    while (waited < DURATION) {
                        sleep(SLEEP);
                        waited += 100;
                    }
					sp = getSharedPreferences(Pref,Context.MODE_PRIVATE);
					boolean isKidsTeensMode = sp.getBoolean("KidsTeensMode",false);
					if(isKidsTeensMode)
					{
						MainAppKidsTeensLaunch();
					}
					else
					{
						MainAppLaunch();
					}
                    ModeLoader.this.finish();
                } catch (InterruptedException e) {
                    // do nothing
                } finally {
                    ModeLoader.this.finish();
                }

            }
        };
        loader.start();
	}

	@Override
	protected void onStop()
	{
		// TODO: Implement this method
		super.onStop();
		finish();
	}
	
}
