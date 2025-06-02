package org.example;

public class EncomendarEstadoRecebida extends EncomendaEstado{

    private EncomendarEstadoRecebida() {};
    private static EncomendarEstadoRecebida instance = new EncomendarEstadoRecebida();
    public static EncomendarEstadoRecebida getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Recebida";
    }

    public boolean cancelar(Encomenda encomenda) {
        encomenda.setEstado(EncomendaEstadoCancelada.getInstance());
        return true;
    }

    public boolean separar(Encomenda encomenda) {
        encomenda.setEstado(EncomendaEstadoSeparada.getInstance());
        return true;
    }
}
