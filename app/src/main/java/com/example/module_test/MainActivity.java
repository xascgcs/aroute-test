package com.example.module_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn2Click(View view) {
        /*String aliPayPackageName = "com.example.third";
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_LAUNCHER);
            ComponentName cn = new ComponentName(aliPayPackageName, "com.example.third.MainActivity");
            intent.setComponent(cn);
            startActivity(intent);*/

        ARouter.getInstance().build("/test/test").navigation();
    }
}