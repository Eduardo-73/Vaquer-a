/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

import java.time.LocalDate;

/**
 *
 * @author edu
 */
public record Vaca(String id, LocalDate fechaNacimiento, String descripcion)
        implements Comparable<Vaca> {

    @Override
    public int compareTo(Vaca o) {
        return this.id.compareTo(o.id);
    }

}
