/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.ParteA;

import daw.ParteA.Vaqueria;
import daw.Vaca;
import java.time.LocalDate;

/**
 *
 * @author edu
 */
public class MainVaqueria {

    public static void main(String[] args) {
        
        Vaqueria vaca = new Vaqueria();
        Vaca v1 = new Vaca("1", LocalDate.now(), "Pepe");
        Vaca v2 = new Vaca("2", LocalDate.now(), "Pepa");
        Vaca v3 = new Vaca("3", LocalDate.now(), "Andrés");
        Vaca v4 = new Vaca("4", LocalDate.now(), "Andrea");
        Vaca v5 = new Vaca("5", LocalDate.now(), "David");
        
    }
}
