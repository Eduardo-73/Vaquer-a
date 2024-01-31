/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.ParteB;

import daw.ParteA.Vaqueria;
import daw.Vaca;
import java.time.LocalDate;

/**
 *
 * @author edu
 */
public class MainVaqueriaOrdenada {

    public static void main(String[] args) {

        VaqueriaOrdenada vo = new VaqueriaOrdenada();
        VaqueriaOrdenada vaca2 = new VaqueriaOrdenada();
        Vaca v1 = new Vaca("1", LocalDate.now(), "Pepe");
        Vaca v2 = new Vaca("2", LocalDate.now(), "Pepa");
        Vaca v3 = new Vaca("3", LocalDate.now(), "Andrés");
        Vaca v4 = new Vaca("4", LocalDate.now(), "Andrea");
        Vaca v5 = new Vaca("5", LocalDate.now(), "David");
        Vaca v6 = new Vaca("5", LocalDate.now(), "David");

        System.out.println(vo.numeroVacas());
        vo.aniadirVaca(v1);
        vo.aniadirVaca(v2);
        vo.aniadirVaca(v3);
        vo.aniadirVaca(v4);
        vo.aniadirVaca(v5);

        System.out.println(vo.numeroVacas());

        System.out.println(vo.hayVacas());
        System.out.println(vaca2.hayVacas());

        System.out.println(vo.animalEnVaqueria(v5));
        System.out.println(vo.animalEnVaqueria(v6));

        vo.darBajaVaca(v3);

        for (Vaca vacas : vo.sacarAnimalesArrayList()) {
            System.out.println(vacas);
        }
    }
}
