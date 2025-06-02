package org.example;

public class EncomendaEstadoSeparada extends EncomendaEstado{

    private EncomendaEstadoSeparada() {};
    private static EncomendaEstadoSeparada instance = new EncomendaEstadoSeparada();
    public static EncomendaEstadoSeparada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em Separação";
    }

    public boolean cancelar(Encomenda encomenda) {
        encomenda.setEstado(EncomendaEstadoCancelada.getInstance());
        return true;
    }

    public boolean transportar(Encomenda encomenda) {
        encomenda.setEstado(EncomendaEstadoTransporte.getInstance());
        return true;
    }
}
