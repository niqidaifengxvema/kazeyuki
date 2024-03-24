package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;
import androidx.activity.ComponentActivity;

public class Net1814080903210Activity extends ComponentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 在布局中找到 ID 为 "helloTextView" 的 TextView
        TextView helloTextView = findViewById(R.id.helloTextView);

        // 将 TextView 的文本设置为 "Hello World!"1
        helloTextView.setText("");
    }
}