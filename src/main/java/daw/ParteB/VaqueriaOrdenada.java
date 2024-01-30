/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.ParteB;

import daw.Vaca;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author edu
 */
public class VaqueriaOrdenada {

    private SortedSet<Vaca> numVacas;

    public VaqueriaOrdenada() {
        this.numVacas = new TreeSet<>();
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

    public SortedSet<Vaca> getNumVacas() {
        return numVacas;
    }

    public void setNumVacas(SortedSet<Vaca> numVacas) {
        this.numVacas = numVacas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Número Vacas = ").append(numVacas);
        return sb.toString();
    }
}
