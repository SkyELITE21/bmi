package com.SkyELITE21.body_mass_index;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.content.*;

public class Company extends Activity {
	SharedPreferences sp;
	SharedPreferences.Editor spe;
	String Prefs = "BMIPrefs";
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        window.setFormat(PixelFormat.RGBA_8888);
    }
    /** Called when the activity is first created. */
    Thread splashTread;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.company_layout);
        StartAnimations();
    }
    private void StartAnimations() {
		addShared();
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.alpha);
        anim.reset();
        LinearLayout l=(LinearLayout) findViewById(R.id.companylin_lay);
        l.clearAnimation();
        l.startAnimation(anim);

        anim = AnimationUtils.loadAnimation(this, R.anim.translate);
        anim.reset();
        ImageView iv = (ImageView) findViewById(R.id.companysplash);
        iv.clearAnimation();
        iv.startAnimation(anim);

        splashTread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    // Splash screen pause time
                    while (waited < 3500) {
                        sleep(100);
                        waited += 100;
                    }
                    Intent intent = new Intent(Company.this,
											   FirstRunCheck.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    Company.this.finish();
                } catch (InterruptedException e) {
                    // do nothing
                } finally {
                    Company.this.finish();
                }

            }
        };
        splashTread.start();

    }
	public void addShared()
	{
		sp = getSharedPreferences(Prefs,MODE_PRIVATE);
		spe = sp.edit();
		int times = sp.getInt("runCounter",0);
		int count = times + 1;
		if(times == Integer.MAX_VALUE)
		{
			spe.putInt("runCounter",1);
			spe.commit();
		}
		else if(times != 0)
		{
			spe.putInt("runCounter",count);
			spe.commit();
		}
		else
		{
			spe.putInt("runCounter",1);
			spe.putBoolean("isFirstTime",true);
			spe.putBoolean("eulaAccepted",false);
			spe.putBoolean("KidsTeensMode",false);
			spe.commit();
		}
	}
}

