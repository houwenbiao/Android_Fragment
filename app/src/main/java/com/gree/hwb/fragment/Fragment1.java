package com.gree.hwb.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/7/6.
 */
public class Fragment1 extends Fragment {

	private TextView tvshow;

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		//使用布局填充器填充
		View v = View.inflate(getActivity(), R.layout.fragment1, null);
		tvshow = (TextView) v.findViewById(R.id.tv_content);
		return v;
	}

	public void setText(String content) {
		tvshow.setText(content);
	}


}
