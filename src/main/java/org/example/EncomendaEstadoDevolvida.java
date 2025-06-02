package org.example;

public class EncomendaEstadoDevolvida extends EncomendaEstado{

    private EncomendaEstadoDevolvida() {};
    private static EncomendaEstadoDevolvida instance = new EncomendaEstadoDevolvida();
    public static EncomendaEstadoDevolvida getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Devolvida";
    }

}
