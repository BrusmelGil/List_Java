package dev.brus.java.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Arrays;
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
        List<String> diasEsperados = Arrays.asList("Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado");
        assertEquals(diasEsperados, gestionarDiaSemana.getDiasDeLaSemana());
}

@Test
    public void testObtenerLongitudLista() {
        assertEquals(7, gestionarDiaSemana.obtenerLongitudLista());
    }

    @Test
    public void testEliminarDiaSemana() {
    
    }
}
