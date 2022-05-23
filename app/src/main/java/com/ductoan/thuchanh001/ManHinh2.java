package com.ductoan.thuchanh001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ManHinh2 extends AppCompatActivity {
    Button manhinh1 , giaynam1 , giaynam2, giaynam3, giaynam4 ;
    ImageButton anh1 , anh2 , anh3 , anh4 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinh2);
        init();
    }
    public void init(){
        anh1 = findViewById(R.id.anh1);
        anh2 = findViewById(R.id.anh2);
        anh3 = findViewById(R.id.anh3);
        anh4 = findViewById(R.id.anh4);

        anh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(ManHinh2.this,sanpham.class);
                startActivity(intent3);
            }
        });
        anh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManHinh2.this,sanpham.class);
                startActivity(intent);
            }
        });
        anh3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManHinh2.this,sanpham.class);
                startActivity(intent);
            }
        });
        anh4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManHinh2.this,sanpham.class);
                startActivity(intent);
            }
        });


        giaynam1 = findViewById(R.id.giaynam1);
        giaynam2 = findViewById(R.id.giaynam2);
        giaynam3 = findViewById(R.id.giaynam3);
        giaynam4 = findViewById(R.id.giaynam4);


        giaynam1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManHinh2.this,sanpham.class);
                startActivity(intent);
            }
        });
        giaynam2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManHinh2.this,sanpham.class);
                startActivity(intent);
            }
        });
        giaynam3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManHinh2.this,sanpham.class);
                startActivity(intent);
            }
        });
        giaynam4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManHinh2.this,sanpham.class);
                startActivity(intent);
            }
        });

//        manhinh1 = findViewById(R.id.btnManhinh1);
//
//        manhinh1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(ManHinh2.this,MainActivity.class);
//                startActivity(intent);
//            }
//        });
//
  }

}