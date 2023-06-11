package com.example.projeto01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Carrinho extends AppCompatActivity {

    private ClienteDAO clientedao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrinho);
    }


}