package com.example.beatmakingapp;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class TrackActivity extends Activity {
	private Button pattern1Button, pattern2Button, pattern3Button,
			pattern4Button;
	private ImageButton addPattern1Button, addPattern2Button,
			addPattern3Button, addPattern4Button;
	private Context context = this;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.track_layout2);
		addButtons();

	}
	
	public void addButtons() {
		pattern1Button = (Button) findViewById(R.id.pattern1Button);
		pattern1Button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO : change current pattern before switching views
				Intent patternIntent = new Intent().setClass(context,
						PatternActivity.class);
				startActivity(patternIntent);
			}
		});
		pattern2Button = (Button) findViewById(R.id.pattern2Button);
		pattern2Button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO : change current pattern before switching views
				Intent patternIntent = new Intent().setClass(context,
						PatternActivity.class);
				startActivity(patternIntent);
			}
		});
		pattern3Button = (Button) findViewById(R.id.pattern3Button);
		pattern3Button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO : change current pattern before switching views
				Intent patternIntent = new Intent().setClass(context,
						PatternActivity.class);
				startActivity(patternIntent);
			}
		});
		pattern4Button = (Button) findViewById(R.id.pattern4Button);
		pattern4Button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO : change current pattern before switching views
				Intent patternIntent = new Intent().setClass(context,
						PatternActivity.class);
				startActivity(patternIntent);
			}
		});
		
		addPattern1Button = (ImageButton) findViewById(R.id.addPattern1Button);
		addPattern1Button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				int num = 1;
				LinearLayout p1TrackLayout = (LinearLayout) findViewById(R.id.pattern1TrackRow);
				Button p1B = new Button(context);
				LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(300, LayoutParams.WRAP_CONTENT);
				lp.gravity=17;
				p1B.setLayoutParams(lp);
				p1B.setBackgroundResource(R.drawable.rounded_button_red);
				//p1TrackLayout.addView(p1B);
				Dialog addPattern1Dialog = new Dialog(context);
				addPattern1Dialog.setTitle("Add Pattern 1 at which bar?");
				addPattern1Dialog.setContentView(R.layout.add_pattern_dialog);
				
				addPattern1Dialog.show();
			}
		});
	}
}
