import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void deveCalcularTransporteComFormula(){
        Produto produto = new Produto();
        produto.setPeso(10.0);
        produto.setDistanciaEnvio(10.0);

        assertEquals(100.0, produto.calcularTransporte());

    }

}