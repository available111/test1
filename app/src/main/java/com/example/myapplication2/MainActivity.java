package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("onCreate");
    }

    @Override
    protected void onStart(){
        super.onStart();
        System.out.println("onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        System.out.println("onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        System.out.println("onPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        System.out.println("onStop");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        System.out.println("onRestart");
    }

    @Override
        protected void onDestroy(){
        super.onDestroy();
        System.out.println("onDestroy");
    }
//    int size=30;
//    public void bigger(View v){     // 按钮对应的 onclick 响应
//        TextView txv;
//        txv= (TextView) findViewById(R.id.txv);  // 根据ID找到对应的text对象
//        txv.setTextSize(++size);       // 修改对象的字符大小-size
//    }
//
//    public void ss(View v){     // 按钮对应的 onclick 响应
//        TextView txv;
//        txv= (TextView) findViewById(R.id.txv);  // 根据ID找到对应的text对象
//        txv.setTextSize(--size);       // 修改对象的字符大小-size
//    }
//
//    public void change(View v){     // 按钮对应的 onclick 响应
//        TextView txv;
//        txv= (TextView) findViewById(R.id.txv);  // 根据ID找到对应的text对象
//        txv.setTextColor(Color.rgb(0, 255, 0));      // 修改对象的字符颜色
//    }
//
//    public void display(View v){     // 另外一个按钮对应的 onclick 响应
//        EditText name= (EditText) findViewById(R.id.name);  //还是根据ID找到对象，并进行接下来的操作
//        TextView text2= (TextView) findViewById(R.id.txv);
//
//        text2.setText(name.getText().toString());   // 设置字符
//    }

}

