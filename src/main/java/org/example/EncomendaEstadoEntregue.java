package org.example;

public class EncomendaEstadoEntregue extends EncomendaEstado{

    private EncomendaEstadoEntregue() {};
    private static EncomendaEstadoEntregue instance = new EncomendaEstadoEntregue();
    public static EncomendaEstadoEntregue getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Entregue";
    }

    public boolean devolver(Encomenda encomenda) {
        encomenda.setEstado(EncomendaEstadoDevolvida.getInstance());
        return true;
    }

}
