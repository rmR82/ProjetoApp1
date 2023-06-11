package com.example.projeto01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cliente extends AppCompatActivity {

    //declara a existência dos editText
    private EditText nomeCliente;
    private EditText cpfCliente;
    private EditText emailCliente;
    private ClienteDAO clientedao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);

        //vincula os editText da xml com os criados nessa classe, isso puxa os valores pra cá
        nomeCliente = findViewById(R.id.editNomeCliente);
        cpfCliente = findViewById(R.id.editCPFCliente);
        emailCliente = findViewById(R.id.editEmailCliente);
        clientedao = new ClienteDAO((this)); //vincula à classe ClienteDAO


    }

    public void salvar (View view) {
        RegistroCliente a = new RegistroCliente();
        a.setNomeCliente(nomeCliente.getText().toString());
        a.setCpfCliente(cpfCliente.getText().toString());
        a.setEmailCliente(emailCliente.getText().toString());
        clientedao.inserir(a);
        Toast.makeText(this, "Cliente salvo.", Toast.LENGTH_SHORT);
    }

}