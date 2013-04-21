package com.marceloh.fundamentals;

import com.marceloh.fundamentals.fragments.Fragments_01;
import com.marceloh.fundamentals.fragments.Fragments_02;
import com.marceloh.fundamentals.fragments.StartFragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.View;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		FragmentManager fragmentManager = getSupportFragmentManager();
		FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
		StartFragment startFragment = new StartFragment();
		
		fragmentTransaction.add(R.id.palceHolder, startFragment);
		fragmentTransaction.commit();
	}
	
	public void onSelectedFragment(View view){
		Fragment newFragment;
		
		if(view == findViewById(R.id.btnStartFragments)){
			newFragment = new StartFragment();			
		}else if(view == findViewById(R.id.btnFragments01)){
			newFragment = new Fragments_01();
		}else if(view == findViewById(R.id.btnFragments02)){
			newFragment = new Fragments_02();
		}else {
			newFragment = new StartFragment();
		}
		
		FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
		fragmentTransaction.replace(R.id.palceHolder,newFragment);
		fragmentTransaction.addToBackStack(null);
		fragmentTransaction.commit();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
