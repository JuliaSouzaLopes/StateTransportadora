import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EncomendaTest {

    Encomenda encomenda;

    @BeforeEach
    public void setUp() {
        encomenda = new Encomenda();
    }

    @Test
    public void naoDeveReceberEncomendaRecebida() {
        encomenda.setEstado(EncomendarEstadoRecebida.getInstance());
        assertFalse(encomenda.receber());
    }

    @Test
    public void deveSepararEncomendaRecebida() {
        encomenda.setEstado(EncomendarEstadoRecebida.getInstance());
        assertTrue(encomenda.separar());
        assertEquals(EncomendaEstadoSeparada.getInstance(),encomenda.getEstado());
    }

    @Test
    public void deveCancelarEncomendaRecebida() {
        encomenda.setEstado(EncomendarEstadoRecebida.getInstance());
        assertTrue(encomenda.cancelar());
        assertEquals(EncomendaEstadoCancelada.getInstance(),encomenda.getEstado());
    }

    @Test
    public void deveTransportatEncomendaSeparada() {
        encomenda.setEstado(EncomendarEstadoRecebida.getInstance());
        assertTrue(encomenda.transportar());
        assertEquals(EncomendaEstadoTransporte.getInstance(),encomenda.getEstado());
    }

    @Test
    public void deveCorreiosEncomendaTransporte(){
        encomenda.setEstado(EncomendaEstadoTransporte.getInstance());
        assertTrue(encomenda.correios());
        assertEquals(EncomendaEstadoCorreios.getInstance(),encomenda.getEstado());
    }

    @Test
    public void deveEntregarEncomendaTransporte(){
        encomenda.setEstado(EncomendaEstadoTransporte.getInstance());
        assertTrue(encomenda.entregar());
        assertEquals(EncomendaEstadoEntregue.getInstance(),encomenda.getEstado());
    }

    @Test
    public void deveDevolverEncomendaCorreios(){
        encomenda.setEstado(EncomendaEstadoCorreios.getInstance());
        assertTrue(encomenda.devolver());
        assertEquals(EncomendaEstadoDevolvida.getInstance(),encomenda.getEstado());
    }

    @Test
    public void deveDevolverEncomendaEntregue(){
        encomenda.setEstado(EncomendaEstadoEntregue.getInstance());
        assertTrue(encomenda.devolver());
        assertEquals(EncomendaEstadoDevolvida.getInstance(),encomenda.getEstado());
    }



}