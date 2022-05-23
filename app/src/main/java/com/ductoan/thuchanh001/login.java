package com.ductoan.thuchanh001;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class login extends AppCompatActivity {
    TextInputEditText passwordet,emaidet;
    Button loginbtn;
    FirebaseAuth mAuth;
    TextView tvRegisterHere;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        passwordet = findViewById(R.id.passwordet);
        emaidet = findViewById(R.id.emaidet);
        tvRegisterHere = findViewById(R.id.tvRegisterHere);
        loginbtn = findViewById(R.id.Loginbtn);
        mAuth  = FirebaseAuth.getInstance();


        loginbtn.setOnClickListener(view ->{
            loginUser();
        });
        tvRegisterHere.setOnClickListener(view ->{
            startActivity(new Intent(login.this, Sign.class));
        });
    }
private void  loginUser(){
    String email = emaidet.getText().toString();
    String pass = passwordet.getText().toString();

    if(TextUtils.isEmpty(email)){
        emaidet.setError("không có gmail");
        emaidet.requestFocus();
    } else if(TextUtils.isEmpty(pass)){
        passwordet.setError("chưa đặt mật khẩu");
        passwordet.requestFocus();
    }else {
        mAuth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(login.this, "đăng nhập thành công", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(login.this,MainActivity.class));


                }else {
                    Toast.makeText(login.this, "đăng nhập không thành công" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();

                }
            }
        });
    }


}







//    @Override
//    protected void onStart() {
//        super.onStart();
//        FirebaseUser user = Mauth.getCurrentUser();
//        if(user == null){
//            startActivity(new Intent(login.this,MainActivity.class));
//        }
//    }
}
