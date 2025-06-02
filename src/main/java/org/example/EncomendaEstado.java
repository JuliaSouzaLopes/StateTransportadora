package org.example;

public abstract class EncomendaEstado {

    public abstract String getEstado();

    public boolean receber(Encomenda encomenda) {
        return false;
    }

    public boolean separar(Encomenda encomenda) {
        return false;
    }

    public boolean cancelar(Encomenda encomenda) {
        return false;
    }

    public boolean transportar(Encomenda encomenda) {
        return false;
    }

    public boolean entregar(Encomenda encomenda) {
        return false;
    }

    public boolean devolver(Encomenda encomenda) {
        return false;
    }

    public boolean correios(Encomenda encomenda) {
        return false;
    }

}
