package com.ductoan.thuchanh001;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity  {

    Button btnlogout,manhinh3;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = findViewById(R.id.viewpager);
        ImageAdapter adapter = new ImageAdapter(this);
        viewPager.setAdapter(adapter);
        btnlogout = findViewById(R.id.btnlogout);
        mAuth  = FirebaseAuth.getInstance();

        btnlogout.setOnClickListener(view ->{
            mAuth.signOut();
            startActivity(new Intent(MainActivity.this,login.class));

        });

        init();
    }


    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser user = mAuth.getCurrentUser();
        if(user == null){
            startActivity(new Intent(MainActivity.this,login.class));
        }
    }

    public void init(){
//        manhinh1 =  findViewById(R.id.btnManhinh1);
        manhinh3 =  findViewById(R.id.btnManHinh3);
//        manhinh1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                Intent intent3 = new Intent(MainActivity.this,ManHinh2.class);
////                startActivity(intent3);
//                startActivity(new Intent(MainActivity.this, ManHinh2.class));
//                finish();
//
//            }
//        });
        manhinh3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MainActivity.this,ManHinh3.class);
                startActivity(intent4);

//                startActivity(new Intent(MainActivity.this, ManHinh3.class));
//               finish();
            }
        });
    }

}
