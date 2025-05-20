// Importa a classe para asserções do JUnit
import static org.junit.jupiter.api.Assertions.assertEquals;
// Importa anotações para descrever os testes
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
// Importa a classe que contém o método de ordenação a ser testado
import ex1.OrdenaTest;

// Declara a classe de teste
public class ExemploTDD {
    // Cria uma instância da classe OrdenaTest para ser usada nos testes
    OrdenaTest tdd = new OrdenaTest();
    // Define um vetor de propriedades a ser testado
    int[] prop = {9, 10};
    // Define um vetor esperado para comparação
    int[] esp = {10, 9};

    // Anotação que indica que este método é um teste
    @Test
    // Define um nome legível para o teste
    @DisplayName("Ordenação:")
    // Método que realiza o teste de ordenação
    public void deveOrdenarVetores() {
        // Verifica se o método caso2Test retorna false ao comparar os vetores prop e esp
        assertEquals(false, tdd.caso2Test(prop, esp));
    }
}
