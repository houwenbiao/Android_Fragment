package com.gree.hwb.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Administrator on 2016/7/6.
 */
public class Fragment2 extends Fragment {

	Button btn_fragment2;
	EditText et_fragment;

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		//使用布局填充器填充
		View v = View.inflate(getActivity(),R.layout.fragment2,null);

		btn_fragment2 = (Button) v.findViewById(R.id.btn_fragment2);
		et_fragment = (EditText) v.findViewById(R.id.et_fragment);

		btn_fragment2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String string = et_fragment.getText().toString();
				((MainActivity)getActivity()).mysetText(string);
			}
		});
		return v;
	}
}
