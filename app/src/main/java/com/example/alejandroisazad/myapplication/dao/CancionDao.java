package com.example.alejandroisazad.myapplication.dao;

import com.example.alejandroisazad.myapplication.dto.Cancion;

import java.util.List;

/**
 * Created by alejandro.isazad on 20/09/16.
 */
public interface CancionDao {

    public void guardar(List<Cancion> canciones);

}
