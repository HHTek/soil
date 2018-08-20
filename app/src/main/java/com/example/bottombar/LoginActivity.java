package com.example.bottombar;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText username = (EditText) findViewById(R.id.nameedit);
        final EditText usersecret = (EditText)findViewById(R.id.secretedit);
        final Intent intent = new Intent(LoginActivity.this, StationActivity.class);
        final Button loginbutton = (Button) findViewById(R.id.loginbutton);

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* int flag=1;
                switch (flag){
                    case 1:
                        Toast.makeText(LoginActivity.this,"登录失败，账号密码不匹配",Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        startActivity(intent);
                }
              */
               String name="张三";
               String secret="123456";
               if(usersecret.getText().toString().length()>5){
                  if(username.getText().toString().equals(name)&&usersecret.getText().toString().equals(secret)){
                     Toast.makeText(LoginActivity.this,"登录成功",Toast.LENGTH_SHORT).show();
                     startActivity(intent);
                     finish();
                  }
                  else {
                   Toast.makeText(LoginActivity.this,"登录失败，您输入的账号密码不匹配，请重新输入。",Toast.LENGTH_SHORT).show();
              }}
               else {
                   return;
               }

            }
        });

        usersecret.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (((EditText) findViewById(R.id.secretedit)).length()>5){
                    findViewById(R.id.grayimage).setVisibility(View.INVISIBLE);
                }
                else {findViewById(R.id.grayimage).setVisibility(View.VISIBLE);}
            }
        });
    }
}
