package com.example.projeto01;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import android.database.Cursor;

public class ClienteDAO {
    private Conexao conexao; //ligo na classe Conexao, criando nova conexão, uma tabela
    private SQLiteDatabase banco; //ativo o SQLite com o banco

    public ClienteDAO (Context context){  //ativando a conexão com o BD
        conexao = new Conexao(context);
        banco = conexao.getWritableDatabase();
    }

    public long inserir (RegistroCliente cliente) { //linkado ao botão Salvar do Cliente xml
        ContentValues values = new ContentValues();
        values.put("nome", cliente.getNomeCliente());
        values.put("cpf", cliente.getCpfCliente());
        values.put("email", cliente.getEmailCliente());

        return banco.insert("cliente", null, values);

    }
}
