import junit.framework.Assert;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @org.junit.jupiter.api.Test
    void calcImc() {
        Pessoa pessoa = new Pessoa(80, 70);

        assertEquals(0.010937499813735485,pessoa.calcImc(pessoa, pessoa.altura, pessoa.peso));
    }

    @org.junit.jupiter.api.Test
    void calcImcCorrigido() {
        Pessoa pessoa = new Pessoa(80, 70);

        assertEquals(0.010937499813735485, pessoa.calcImcCorrecao(pessoa));
    }
}