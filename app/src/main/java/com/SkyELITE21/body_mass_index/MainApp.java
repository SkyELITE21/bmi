package com.SkyELITE21.body_mass_index;
import android.app.*;
import android.os.*;
import com.SkyELITE21.body_mass_index.math.*;
import android.widget.*;
import android.view.*;
import android.content.*;

public class MainApp extends Activity
{

	private BMI bMi;
	private Button calculate;
	private EditText height,weight;
	private String h,w,r,t,ty;
	private double hh,ww,def = 0.0;
	private int rr;
	private TextView result,type;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bmi);
		height = (EditText)findViewById(R.id.height);
		weight = (EditText)findViewById(R.id.weight);
		result = (TextView)findViewById(R.id.result);
		calculate = (Button)findViewById(R.id.calculate);
		type = (TextView)findViewById(R.id.classification);
		bMi = new BMI();
		calculate.setOnClickListener(new View.OnClickListener()
			{

				@Override
				public void onClick(View p1)
				{
					h = height.getText().toString();
					w = weight.getText().toString();
					
					if(h != null | w != null)
					{
						hh = Double.parseDouble(h);
						ww = Double.parseDouble(w);
						rr = bMi.getBMI(hh,ww);
						r = getString(R.string.bmi);
						t = getString(R.string.classification);
						ty = bMi.getType();
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
