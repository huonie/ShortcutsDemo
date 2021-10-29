package com.example.shortcutstest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.example.shortcutstest.R;
import com.example.shortcutstest.entity.Friend;

import androidx.appcompat.app.AppCompatActivity;

public class ResponseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_response);
        // Friend friend = (Friend) getIntent().getSerializableExtra("friend");
        Bundle bundle = getIntent().getExtras();
        Friend friend = (Friend) bundle.getSerializable("boyFriend");
        TextView text1 = (TextView) findViewById(R.id.girl_name);
        text1.setText(friend.getName());

        Button btn = (Button) findViewById(R.id.doBoyFriend);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = (EditText) findViewById(R.id.my_tel);
                String phoneNum = editText.getText().toString();
                friend.setPhoneNum(phoneNum);

                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                bundle.putSerializable("my_info", friend);
                intent.putExtras(bundle);
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });
    }
}