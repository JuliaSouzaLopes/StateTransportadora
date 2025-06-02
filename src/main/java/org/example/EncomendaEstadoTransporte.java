package org.example;

public class EncomendaEstadoTransporte extends EncomendaEstado{

    private EncomendaEstadoTransporte() {};
    private static EncomendaEstadoTransporte instance = new EncomendaEstadoTransporte();
    public static EncomendaEstadoTransporte getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em Transporte";
    }

    public boolean correios(Encomenda encomenda) {
        encomenda.setEstado(EncomendaEstadoCorreios.getInstance());
        return true;
    }

    public boolean entregar(Encomenda encomenda) {
        encomenda.setEstado(EncomendaEstadoEntregue.getInstance());
        return true;
    }
}
