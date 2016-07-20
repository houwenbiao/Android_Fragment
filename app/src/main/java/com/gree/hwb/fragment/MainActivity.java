package com.gree.hwb.fragment;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.FragmentManager;
import android.widget.EditText;

import java.util.Set;

public class MainActivity extends AppCompatActivity {

	//声明变量
	Button btn1,btn2,btn3,btnCommit;
	private Fragment1 fg1;
	private EditText et;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//关联控件
		btn1 = (Button) findViewById(R.id.btn_activity1);
		btn2 = (Button) findViewById(R.id.btn_activity2);
		btn3 = (Button) findViewById(R.id.btn_activity3);
		btnCommit = (Button) findViewById(R.id.btn_commit);
		et = (EditText) findViewById(R.id.et);
		btn1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//把Fragment显示在界面上
				//1.创建Fragment对象
				fg1 = new Fragment1();
				//2.获取Fragment管理器
				FragmentManager fm = getFragmentManager();
				//3.开启事务
				FragmentTransaction ft = fm.beginTransaction();
				//4.把Fragment显示至界面
				ft.replace(R.id.fl, fg1);
				//5.提交
				ft.commit();
			}
		});

		btn2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//把Fragment显示在界面上
				//1.创建Fragment对象
				Fragment2 fg2 = new Fragment2();
				//2.获取Fragment管理器
				FragmentManager fm = getFragmentManager();
				//3.开启事务
				FragmentTransaction ft = fm.beginTransaction();
				//4.把Fragment显示至界面
				ft.replace(R.id.fl,fg2);
				//5.提交
				ft.commit();
			}
		});

		btn3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//把Fragment显示在界面上
				//1.创建Fragment对象
				Fragment3 fg3 = new Fragment3();
				//2.获取Fragment管理器
				FragmentManager fm = getFragmentManager();
				//3.开启事务
				FragmentTransaction ft = fm.beginTransaction();
				//4.把Fragment显示至界面
				ft.replace(R.id.fl,fg3);
				//5.提交
				ft.commit();
			}
		});

		btnCommit.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String s = et.getText().toString();
				fg1.setText(s);
			}
		});
	}

	public void mysetText(String content)
	{
		et.setText(content);
	}
}
























