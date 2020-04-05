package com.example.tutorial_androidapp_byn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MSG = "com.example.tutorial_androidapp_byn.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView: 画面サイズにあったレイアウトを読み込む
        setContentView(R.layout.activity_main);
        View mainView = findViewById(R.id.edit_message);
        // 2ペインレイアウト判定(20200405時点未使用。2ペインレイアウト処理時に使用)
        IsDualPane = mainView != null && mainView.getVisibility() == View.VISIBLE;
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MSG, message);
        startActivity(intent);
    }
}
