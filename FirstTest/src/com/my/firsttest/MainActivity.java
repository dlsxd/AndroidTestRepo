package com.my.firsttest;

import com.my.firsttest.constants.MyConstants;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void sendMessage(View view){
		EditText edit = (EditText)findViewById(R.id.edit_message);
		String message = edit.getText().toString();
		Intent intent = new Intent(this, ShowMessageActivity.class);
		intent.putExtra(MyConstants.INTENT_TEXT_MESSAGE, message);
		startActivity(intent);
	}

}
