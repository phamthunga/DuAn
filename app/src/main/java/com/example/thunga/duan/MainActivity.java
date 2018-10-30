package com.example.thunga.duan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edMaSV;
    private EditText edNameSV;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = edMaSV.getText().toString();
                String name = edNameSV.getText().toString();
                Toast.makeText(MainActivity.this, "Xin chào: "+name+" có mã SV: "+id, Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }

    public void initView(){
        edMaSV = (EditText) findViewById(R.id.edMaSV);
        edNameSV = (EditText) findViewById(R.id.edNameSV);
        btnSave = (Button) findViewById(R.id.btnSave);

    }
}
