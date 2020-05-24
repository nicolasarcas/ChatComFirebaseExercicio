package com.example.chatcomfirebaseexercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CategoriasActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);
    }
    public void irParaChatCinema(View view){
        Intent intent = new Intent(this, ChatActivity.class);
        Bundle extras = new Bundle();
        extras.putString("chat","cinema");
        intent.putExtras(extras);
        startActivity(intent);
    }
    public void irParaChatNovidades(View view){
        Intent intent = new Intent(this, ChatActivity.class);
        Bundle extras = new Bundle();
        extras.putString("chat","novidades");
        intent.putExtras(extras);
        startActivity(intent);
    }
    public void irParaChatTecnologia(View view){
        Intent intent = new Intent(this, ChatActivity.class);
        Bundle extras = new Bundle();
        extras.putString("chat","tecnologia");
        intent.putExtras(extras);
        startActivity(intent);
    }
    public void irParaChatEconomia(View view){
        Intent intent = new Intent(this, ChatActivity.class);
        Bundle extras = new Bundle();
        extras.putString("chat","economia");
        intent.putExtras(extras);
        startActivity(intent);
    }
}
