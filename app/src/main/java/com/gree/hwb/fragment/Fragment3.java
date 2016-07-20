package com.gree.hwb.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2016/7/6.
 */
public class Fragment3 extends Fragment {

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		//使用布局填充器填充
		View v = View.inflate(getActivity(),R.layout.fragment3,null);
		return v;
	}
}
