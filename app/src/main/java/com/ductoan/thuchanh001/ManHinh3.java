package com.ductoan.thuchanh001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ManHinh3 extends AppCompatActivity {

    Button manhinh2 , gianu1 , gianu2, gianu3, gianu4;

    ImageButton giaynu1 , giaynu2 , giaynu3 , giaynu4 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinh3);

        init();
    }
    public void init(){

        gianu1 = findViewById(R.id.gianu1);
        gianu2 = findViewById(R.id.gianu2);
        gianu3 = findViewById(R.id.gianu3);
        gianu4 = findViewById(R.id.gianu4);

        gianu1.setOnClickListener(view ->{
            startActivity(new Intent(ManHinh3.this,sanpham.class));
        });
        gianu2.setOnClickListener(view ->{
            startActivity(new Intent(ManHinh3.this,sanpham.class));
        });
        gianu4.setOnClickListener(view ->{
            startActivity(new Intent(ManHinh3.this,sanpham.class));
        });
        gianu4.setOnClickListener(view ->{
            startActivity(new Intent(ManHinh3.this,sanpham.class));
        });

        giaynu1 = findViewById(R.id.giaynu1);
        giaynu2 = findViewById(R.id.giaynu2);
        giaynu3 = findViewById(R.id.giaynu3);
        giaynu4 = findViewById(R.id.giaynu4);

        giaynu1.setOnClickListener(view ->{
            startActivity(new Intent(ManHinh3.this,sanpham.class));
        });

        giaynu2.setOnClickListener(view ->{
            startActivity(new Intent(ManHinh3.this,sanpham.class));
        });

        giaynu3.setOnClickListener(view ->{
            startActivity(new Intent(ManHinh3.this,sanpham.class));
        });

        giaynu4.setOnClickListener(view ->{
            startActivity(new Intent(ManHinh3.this,sanpham.class));
        });
        manhinh2 = findViewById(R.id.btnManHinh2);
        manhinh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManHinh3.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}