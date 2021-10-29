package com.example.shortcutstest.myLinsteners;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.shortcutstest.R;
import com.example.shortcutstest.MainActivity;
import com.example.shortcutstest.RegisterActivity;
import com.example.shortcutstest.entity.User;

/**
 * @authour: Lenga
 * @time: 14:31
 * @desc:
 */
public class RegisterLinstener implements View.OnClickListener{
    private RegisterActivity registerActivity;

    public RegisterLinstener(RegisterActivity registerActivity) {
        this.registerActivity = registerActivity;
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(registerActivity, "Loading...", Toast.LENGTH_SHORT).show();
        User user = new User();
        EditText editText1 = (EditText)registerActivity.findViewById(R.id.acc);
        EditText editText2 = (EditText)registerActivity.findViewById(R.id.pas);
        user.setAccount(editText1.getText().toString());
        user.setPassword(editText2.getText().toString());
        Log.d("TAG", "onClick: "+ user);
        if (null!=user && "root".equals(user.getAccount()) && "root".equals(user.getPassword())){
            Toast.makeText(registerActivity, "Resist successfully", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(registerActivity, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            registerActivity.startActivity(intent);
            registerActivity.finish();
        }else {
            Toast.makeText(registerActivity, "Resist unsuccessfully", Toast.LENGTH_SHORT).show();
        }
    }
}
