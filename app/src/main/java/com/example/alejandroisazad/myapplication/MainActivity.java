package com.example.alejandroisazad.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.alejandroisazad.myapplication.dao.CancionDao;
import com.example.alejandroisazad.myapplication.dao.impl.CancionDaoImpl;
import com.example.alejandroisazad.myapplication.dto.Cancion;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Cancion> canciones = new ArrayList<Cancion>();
        for (int i=0;i<20;i++){
            Cancion cancion = new Cancion();
            cancion.setAlbum("AlBUM 101"+i);
            cancion.setArtista("jorge 2"+i);
            cancion.setIdCancion(21+i);
            cancion.setTituloCancion("menealo mami "+i);
            cancion.setRutaCancion("/hola/bn/cancion1"+i+"mp3");
            canciones.add(cancion);
        }

        CancionDao cancionDao = new CancionDaoImpl();
        cancionDao.guardar(canciones);

    }
}
