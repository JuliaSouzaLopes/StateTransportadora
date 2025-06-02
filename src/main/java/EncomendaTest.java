import org.example.Encomenda;
import org.example.EncomendarEstadoRecebida;
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

}