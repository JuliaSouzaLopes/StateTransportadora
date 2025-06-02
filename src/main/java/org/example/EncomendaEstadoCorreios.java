package org.example;

public class EncomendaEstadoCorreios extends EncomendaEstado{

    private EncomendaEstadoCorreios() {};
    private static EncomendaEstadoCorreios instance = new EncomendaEstadoCorreios();
    public static EncomendaEstadoCorreios getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Para Retirar nos Correios";
    }

    public boolean devolver(Encomenda encomenda) {
        encomenda.setEstado(EncomendaEstadoDevolvida.getInstance());
        return true;
    }

    public boolean entregar(Encomenda encomenda) {
        encomenda.setEstado(EncomendaEstadoEntregue.getInstance());
        return true;
    }
}