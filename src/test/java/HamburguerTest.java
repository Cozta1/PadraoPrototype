package test.java;

import main.java.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HamburguerTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Receita receitaOriginal = new Receita("Pão Brioche", "Ao Ponto");
        Hamburguer hamburguerOriginal = new Hamburguer(1, "X-Bacon", 35.50, receitaOriginal);

        Hamburguer hamburguerClone = hamburguerOriginal.clone();

        hamburguerClone.setIdPedido(2);
        hamburguerClone.getReceita().setTipoPao("Pão Australiano");
        hamburguerClone.getReceita().setPontoCarne("Bem Passada");

        assertEquals(
                "Hamburguer{idPedido=1, nomeLanche='X-Bacon', preco=35.5, receita=Receita{tipoPao='Pão Brioche', pontoCarne='Ao Ponto'}}",
                hamburguerOriginal.toString()
        );

        assertEquals(
                "Hamburguer{idPedido=2, nomeLanche='X-Bacon', preco=35.5, receita=Receita{tipoPao='Pão Australiano', pontoCarne='Bem Passada'}}",
                hamburguerClone.toString()
        );
    }
}