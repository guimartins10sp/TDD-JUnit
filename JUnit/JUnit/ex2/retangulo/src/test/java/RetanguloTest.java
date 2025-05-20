// Importa a classe para asserções do JUnit
import static org.junit.jupiter.api.Assertions.assertEquals;
// Importa anotações para descrever os testes
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
// Importa a classe Retangulo que será testada
import ex2.Retangulo;

// Declara a classe de teste
public class RetanguloTest {
    // Cria uma instância da classe Retangulo com largura 1 e altura 2
    Retangulo retangulo = new Retangulo(1, 2);

    // Anotação que indica que este método é um teste
    @Test
    // Define um nome legível para o teste
    @DisplayName("Area:")
    // Método que realiza o teste do cálculo da área
    public void deveCalcularArea() {
        // Verifica se o cálculo da área retorna 2
        assertEquals(2, retangulo.calcularArea());
    }
}
