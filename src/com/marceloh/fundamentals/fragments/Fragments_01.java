package com.marceloh.fundamentals.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.marceloh.fundamentals.R;
import com.marceloh.fundamentals.R.layout;

public class Fragments_01 extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragmentes_01, container, false);
	}
}