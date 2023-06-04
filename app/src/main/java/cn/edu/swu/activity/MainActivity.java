package cn.edu.swu.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

/**
 * 作者：王品皓
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("首页");
    }

    public void jumpToSetting(View view){
        Intent intent = new Intent(MainActivity.this,settingActivity2.class);
        startActivity(intent);
    }
}
