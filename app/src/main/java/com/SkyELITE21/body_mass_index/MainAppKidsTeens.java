package com.SkyELITE21.body_mass_index;
import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import com.SkyELITE21.body_mass_index.math.*;

public class MainAppKidsTeens extends Activity
{
	private BMIKidsTeens bMi;
	private RadioButton gm,gf;
	private Button calculate;
	private EditText height,weight,age;
	private String a,h,w,r,t,ty,g,MALE = "male", FEMALE = "female";
	private double hh,ww,def = 0.0;
	private int rr,aa;
	private TextView result,type;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bmi_kids_teens);
		gm = (RadioButton)findViewById(R.id.genderMale);
		gf = (RadioButton)findViewById(R.id.genderFemale);
		height = (EditText)findViewById(R.id.kidsTeensHeight);
		weight = (EditText)findViewById(R.id.kidsTeensWeight);
		age = (EditText)findViewById(R.id.kidsTeensAge);
		result = (TextView)findViewById(R.id.kidsTeensResult);
		calculate = (Button)findViewById(R.id.kidsTeensCalculate);
		type = (TextView)findViewById(R.id.kidsTeensType);
		bMi = new BMIKidsTeens();
		calculate.setOnClickListener(new View.OnClickListener()
			{

				@Override
				public void onClick(View p1)
				{
					a = age.getText().toString();
					h = height.getText().toString();
					w = weight.getText().toString();
					if(gm.isChecked())
					{
						g = MALE;
					}
					else if(gf.isChecked())
					{
						g = FEMALE;
					}
					if(h != null | w != null)
					{
						aa = Integer.parseInt(a);
						hh = Double.parseDouble(h);
						ww = Double.parseDouble(w);
						rr = bMi.getBMI(hh,ww);
						r = getString(R.string.bmi);
						t = getString(R.string.classification);
						ty = bMi.getType(aa,g);
						result.setText(r + " " + rr);
						type.setText(t + " " + ty);
					}
				}


			});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// TODO: Implement this method
		MenuInflater inflr = getMenuInflater();
		inflr.inflate(R.menu.main_menu,menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		// TODO: Implement this method
		switch(item.getItemId())
		{
			case R.id.About:
				Intent a = new Intent(this,About.class);
				startActivity(a);
				return true;
				
			case R.id.Settings:
				Intent b = new Intent(this,Settings.class);
				startActivity(b);
				return true;

			case R.id.Exit:
				finish();
				return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
