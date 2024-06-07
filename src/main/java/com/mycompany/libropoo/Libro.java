package com.mycompany.libropoo;
public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private int publicacion;
    private boolean leido;

    public Libro(String titulo, String autor, int publicacion, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.publicacion = publicacion;
        this.leido = false;
        this.genero = genero;
    }
    public String mostrarInformacion(){
        return ("Titulo: "+ titulo + ","+ " sAutor: "+ autor +","+" Año de publicación: "+ publicacion +","+" Género: "+ genero);
    }
    public void marcarLeido(){
       leido = true;
    }
    public boolean esAntiguo(){
       int diferencia = 2024-publicacion;
       return (diferencia>=50);
    }
    public boolean getLeido(){
        return leido;
    }
}