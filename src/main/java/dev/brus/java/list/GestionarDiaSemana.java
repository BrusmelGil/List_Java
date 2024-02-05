package dev.brus.java.list;

import java.util.ArrayList;
import java.util.List;

public class GestionarDiaSemana {

private List<String> diasDeLaSemana;

    public GestionarDiaSemana() {
        crearDiasDeLaSemana();
    }

    private void crearDiasDeLaSemana() {
        diasDeLaSemana = new ArrayList<>();
        diasDeLaSemana.add("Domingo");
        diasDeLaSemana.add("Lunes");
        diasDeLaSemana.add("Martes");
        diasDeLaSemana.add("Miércoles");
        diasDeLaSemana.add("Jueves");
        diasDeLaSemana.add("Viernes");
        diasDeLaSemana.add("Sábado");
    }

    public List<String> getDiasDeLaSemana() {
        return diasDeLaSemana;
    }

    public int obtenerLongitudLista() {
        return diasDeLaSemana.size();
    }

    public void eliminarDia(String dia) {
        diasDeLaSemana.remove(dia);
    }
}

