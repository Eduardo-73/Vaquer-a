/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.ParteA;

import daw.Vaca;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author edu
 */
public class Vaqueria {

    private Set<Vaca> numVacas;

    public Vaqueria() {
        this.numVacas = new HashSet<>();
    }

    public int numeroVacas() {
        return numVacas.size();
    }

    public void aniadirVaca(Vaca nuevaVaca) {
        numVacas.add(nuevaVaca);
    }

    public boolean hayVacas() {
        return numVacas.isEmpty();
    }

    public boolean animalEnVaqueria(Vaca vacas) {
        return numVacas.contains(vacas);
    }

    public ArrayList<Vaca> sacarAnimalesArrayList() {
        ArrayList<Vaca> arrayVacas = new ArrayList<>();
        for (Vaca vacas : numVacas) {
            arrayVacas.add(vacas);
        }
        return arrayVacas;
    }

    public void darBajaVaca(Vaca vacas) {
        numVacas.remove(vacas);
    }

    public Set<Vaca> getNumVacas() {
        return numVacas;
    }

    public void setNumVacas(Set<Vaca> numVacas) {
        this.numVacas = numVacas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Número Vacas = ").append(numVacas);
        return sb.toString();
    }

}
