package com.mycompany.libropoo;
import java.util.Scanner;
public class Principal {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        String titulo, autor, genero;
        int anoPublicacion;
        System.out.println("***BIENVENIDOS A SU BIBLIOTECA VIRTUAL***");
        System.out.println("Ingrese el titulo del libro que va a retirar");
        titulo = sc.nextLine();
        System.out.println("Ingrese el autor del libro");
        autor = sc.nextLine();
        System.out.println("Ingrese el año de publicación del libro");
        anoPublicacion = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el genero del libro");
        genero = sc.nextLine();
        
        Libro book = new Libro (titulo, autor, anoPublicacion, genero);
        String title = book.mostrarInformacion();
      
        System.out.println(title);
        book.marcarLeido();
        boolean libroLeido = book.getLeido();
        if (libroLeido == true)
            System.out.println("El libro ya fue leido");
        else
            System.out.println("El libro aún no ha sido leido");
        
        boolean antiguo = book.esAntiguo();
        if (antiguo == true)
            System.out.println("El libro tiene más de 50 años");
        
        else
            System.out.println("El libro tiene menos de 50 años");
    }    
}