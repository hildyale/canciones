package com.example.alejandroisazad.myapplication.dao.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.example.alejandroisazad.myapplication.Contract;
import com.example.alejandroisazad.myapplication.dao.CancionDao;
import com.example.alejandroisazad.myapplication.dao.DbHelper;
import com.example.alejandroisazad.myapplication.dto.Cancion;

import java.util.List;

/**
 * Created by alejandro.isazad on 20/09/16.
 */
public class CancionDaoImpl implements CancionDao {
    @Override
    public void guardar(List<Cancion> canciones) {
        int size = canciones.size();
        Cancion cancion = null;

        DbHelper dbHelper= new DbHelper();//Instancia de DbHelper
        SQLiteDatabase db=dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();

        for (int i=0;i<size;i++){
            cancion = canciones.get(i);
            values.put(Contract.Column.ID,cancion.getIdCancion());
            values.put(Contract.Column.TITULO,cancion.getTituloCancion());
            values.put(Contract.Column.ALBUM,cancion.getAlbum());
            values.put(Contract.Column.ARTISTA,cancion.getArtista());
            values.put(Contract.Column.RUTA,cancion.getRutaCancion());
        }

        db.insert(Contract.CANCION,null,values);
    }
}

