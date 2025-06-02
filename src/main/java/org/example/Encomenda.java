package org.example;

public class Encomenda {

    private String identificacao;
    private EncomendaEstado estado;

    public Encomenda() {
        this.estado = EncomendaEstadoRecebida.getInstance();
    }

    public void setEstado(EncomendaEstado estado) {
        this.estado = estado;
    }

    public boolean receber() {
        return estado.receber(this);
    }
    public boolean separar() {
        return estado.separar(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public boolean transportar() {
        return estado.transportar(this);
    }

    public boolean entregar() {
        return estado.entregar(this);
    }

    public boolean devolver() {
        return estado.devolver(this);
    }

    public boolean correios() {
        return estado.correios(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public EncomendaEstado getEstado() {
        return estado;
    }
}