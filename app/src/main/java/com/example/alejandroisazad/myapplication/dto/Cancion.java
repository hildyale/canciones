package com.example.alejandroisazad.myapplication.dto;

/**
 * Created by alejandro.isazad on 20/09/16.
 */
public class Cancion {
    private Integer idCancion;
    private String tituloCancion;
    private String album;
    private String artista;
    private String rutaCancion;

    public Integer getIdCancion() {
        return idCancion;
    }

    public String getTituloCancion() {
        return tituloCancion;
    }

    public String getAlbum() {
        return album;
    }

    public String getArtista() {
        return artista;
    }

    public String getRutaCancion() {
        return rutaCancion;
    }

    public void setIdCancion(Integer idCancion) {
        this.idCancion = idCancion;
    }

    public void setTituloCancion(String tituloCancion) {
        this.tituloCancion = tituloCancion;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setRutaCancion(String rutaCancion) {
        this.rutaCancion = rutaCancion;
    }
}
