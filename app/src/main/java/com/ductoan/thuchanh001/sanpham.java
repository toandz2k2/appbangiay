package com.ductoan.thuchanh001;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class sanpham extends AppCompatActivity {

    TextView tensp,giasp,mota;
    Button btnthem;
    ImageView imghinhanh;
    Spinner spinner;
    Toolbar toolbar;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.xemthem);

        init();
    }
    private void init(){
        tensp = findViewById(R.id.tensp);
        giasp = findViewById(R.id.giasp);
        mota = findViewById(R.id.motachitiet);
        btnthem = findViewById(R.id.btnthemvao);
        spinner = findViewById(R.id.spinner);
        imghinhanh = findViewById(R.id.imghinhanh);
        toolbar = findViewById(R.id.toolbar);
    }
}
