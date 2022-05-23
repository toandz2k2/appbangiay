package com.ductoan.thuchanh001;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.ductoan.thuchanh001.databinding.ActivityMainBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class Sign extends AppCompatActivity {

 TextInputEditText emailet,passworlet;
 Button signUpbtn;
 TextView tvLoginHere;

 FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign);

        emailet = findViewById(R.id.emailet);
        passworlet = findViewById(R.id.passworlet);
        signUpbtn = findViewById(R.id.SignUpbtn);
        tvLoginHere = findViewById((R.id.tvLoginHere));

        mAuth = FirebaseAuth.getInstance();

        signUpbtn.setOnClickListener(view ->{
            createUser();
        });

        tvLoginHere.setOnClickListener(view ->{
            startActivity(new Intent(Sign.this, login.class));
        });
    }
private void createUser(){
        String email = emailet.getText().toString();
        String pass = passworlet.getText().toString();

        if(TextUtils.isEmpty(email)){
            emailet.setError("không có gmail");
            emailet.requestFocus();
        } else if(TextUtils.isEmpty(pass)){
            passworlet.setError("chưa đặt mật khẩu");
            passworlet.requestFocus();
        }else {
            mAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        Toast.makeText(Sign.this, "tạo tài khoản thành công", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(Sign.this,login.class));
                    }else {
                        Toast.makeText(Sign.this, "tạo tài khoản không thành công" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();

                    }
                }
            });
        }
}
}
