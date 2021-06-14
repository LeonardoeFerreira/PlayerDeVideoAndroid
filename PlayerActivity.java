package com.playxcodes.executandovideos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class PlayerActivity extends AppCompatActivity {

    //criando atributo
    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        //fazendo a conexão com a view
        videoView = findViewById(R.id.videoView);

        //Esconder s statusbar e barra de navegação 
        View decoView = getWindow().getDecorView();
        int uiOpcoes = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decoView.setSystemUiVisibility(uiOpcoes);

                

        //Esconder actionBar
        getSupportActionBar().hide();


        //executando o video
        videoView.setMediaController(new MediaController(this)); //botoes controlador de videos
        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video); //getpacktname recupera o nome do pacote de onde esta o video
        videoView.start();


    }
}