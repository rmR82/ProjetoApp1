package com.example.projeto01;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Conexao extends SQLiteOpenHelper {

    //crio o Banco de Dados, com o nome e número da versão, que é 1
    private static final String name = "banco.db";
    private static final int version = 1;


    //ativando o BD
    public Conexao (Context context) {
        super(context, name, null, version);
    }

    @Override
    //dentro do banco BD, crio 2 tabelas, uma pro cliente e uma pros itens

    //pro Cliente
    public void onCreate(SQLiteDatabase db){
        db.execSQL("create table cliente (id integer primary key autoincrement, " +
                "nome varchar (50), cpf varchar (11), email varchar (50))");

    //pros Itens
        db.execSQL("create table itens (id integer primary key autoincrement," +
                "nomeitem varchar (50), valorUnitario double, quantidade double, valorFinal double)");
    }

    //aqui é a parte da atualização do BD, que não vai ser usado
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }


}
