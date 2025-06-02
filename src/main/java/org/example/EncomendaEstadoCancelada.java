package org.example;

public class EncomendaEstadoCancelada extends EncomendaEstado{

    private EncomendaEstadoCancelada() {};
    private static EncomendaEstadoCancelada instance = new EncomendaEstadoCancelada();
    public static EncomendaEstadoCancelada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Cancelada";
    }

}
