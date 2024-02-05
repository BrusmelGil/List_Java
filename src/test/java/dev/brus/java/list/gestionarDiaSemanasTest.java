package dev.brus.java.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class gestionarDiaSemanasTest {

    private GestionarDiaSemana gestionarDiaSemana;

    @BeforeEach
    public void setUp() {
        gestionarDiaSemana = new GestionarDiaSemana();
    }

    @Test
    public void testGestionarDiaDeSemana() {

        /* GestionarDiaSemana gestionador = new GestionarDiaSemana(); */
        List<String> diasEsperados = Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves", "Viernes",
                "Sábado", "Domingo");
        assertEquals(diasEsperados, gestionarDiaSemana.getDiasDeLaSemana()); 
    }

    @Test
    public void testObtenerLongitudLista() {
        assertEquals(7, gestionarDiaSemana.obtenerLongitudLista());
    }

    @Test
    public void testEliminarDiaSemana() {
        gestionarDiaSemana.eliminarDia("Lunes");
        assertFalse(gestionarDiaSemana.getDiasDeLaSemana().contains("Lunes"));
    }

    @Test
    public void testObtenerDia() {
        assertEquals("Lunes", gestionarDiaSemana.getDia(0));
        assertThrows(IllegalArgumentException.class, () -> {
            gestionarDiaSemana.getDia(-1);
        });
        
        assertThrows(IllegalArgumentException.class, () -> {
            gestionarDiaSemana.getDia(7);
        });
    }

    @Test
    public void testDiaExiste() {
        GestionarDiaSemana gestionarDiaSemana = new GestionarDiaSemana();
        assertTrue(gestionarDiaSemana.diaExiste("Lunes"));
        assertFalse(gestionarDiaSemana.diaExiste("No existe"));
    }


    @Test
    public void testOrdenarDiasAlfabeticamente() {
        List<String> diasOrdenados = Arrays.asList("Domingo", "Jueves", "Lunes", "Martes", "Miércoles", "Sábado",
                "Viernes");

        gestionarDiaSemana.ordenarDiasAlfabeticamente();

        List<String> diasOrdenadosObtenidos = gestionarDiaSemana.getDiasDeLaSemana();

        assertIterableEquals(diasOrdenados, diasOrdenadosObtenidos);
    }

    @Test
    public void testVaciarLista() {
        gestionarDiaSemana.vaciarLista();
        List<String> listaVacia = new ArrayList<>();
        assertEquals(listaVacia, gestionarDiaSemana.getDiasDeLaSemana());
        assertEquals(0, gestionarDiaSemana.obtenerLongitudLista());
    }

}