package com.example.shortcutstest.myLinsteners;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.shortcutstest.R;
import com.example.shortcutstest.MainActivity;
import com.example.shortcutstest.ResponseActivity;
import com.example.shortcutstest.entity.Friend;


/**
 * @authour: Lenga
 * @time: 15:40
 * @desc:
 */
public class FriendLinstener implements View.OnClickListener{
    private MainActivity mainActivity;

    public FriendLinstener(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View view) {
        EditText editText1 = (EditText) mainActivity.findViewById(R.id.friend_name_txt);
        Friend boyFriend = new Friend();
        boyFriend.setGander("男");
        boyFriend.setName(editText1.getText().toString());
        Log.d("TAG", "找男朋友: " + boyFriend);

        Bundle bundle = new Bundle();
        bundle.putSerializable("boyFriend", boyFriend);
        Intent intent = new Intent(mainActivity, ResponseActivity.class);
        intent.putExtras(bundle);
        mainActivity.startActivityForResult(intent, 666);
    }
}
