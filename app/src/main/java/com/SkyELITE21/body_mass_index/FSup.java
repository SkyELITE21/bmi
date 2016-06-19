package com.SkyELITE21.body_mass_index;
import android.app.*;
import android.os.*;
import android.webkit.*;
import android.content.res.*;
import android.widget.*;
import android.content.*;
import android.view.*;

public class FSup extends Activity
{
	
	private RadioButton f,r;
	private Button send;
	private EditText sub,mes;
	private String subject, message,feedback = "(Feedback)",review = "(Review)";
	private Intent email,emailApp;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fsup_frame_layout);
		f = (RadioButton)findViewById(R.id.feedbackRadio);
		r = (RadioButton)findViewById(R.id.reviewRadio);
		send = (Button)findViewById(R.id.sendButton);
		sub = (EditText)findViewById(R.id.subjectText);
		mes = (EditText)findViewById(R.id.meSsage);
		message = mes.getText().toString();
		send.setOnClickListener(new View.OnClickListener()
			{

				@Override
				public void onClick(View p1)
				{
					if(f.isChecked())
					{
						subject = feedback + sub.getText().toString();
						sendEmail(subject,message);
					}
					else if(r.isChecked())
					{
						subject = review + sub.getText().toString();
						sendEmail(subject,message);
					}
					else
					{
						Toast.makeText(FSup.this,"Please choose a message type!",Toast.LENGTH_LONG).show();
					}
					
				}
				
			
		});
		
		
	}
	
	public void sendEmail(String esubject,String emessage)
	{
		email = new Intent(Intent.ACTION_SEND);
		email.putExtra(esubject,Intent.EXTRA_SUBJECT);
		email.putExtra(message,Intent.EXTRA_TEXT);
		emailApp = new Intent(Intent.CATEGORY_APP_EMAIL);
		email.createChooser(emailApp,"Email via...");
		startActivity(email);
	}

	@Override
	protected void onStop()
	{
		// TODO: Implement this method
		super.onStop();
		finish();
	}
	
}
