// Importa a classe para asserções do JUnit
import static org.junit.jupiter.api.Assertions.assertEquals;
// Importa anotações para descrever os testes
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
// Importa a classe que será testada
import exemplo.Calculadora;

// Declara a classe de teste
public class CalculadoraTeste {
    // Cria uma instância da classe Calculadora para ser usada nos testes
    Calculadora calc = new Calculadora();

    // Anotação que indica que este método é um teste
    @Test
    // Define um nome legível para o teste
    @DisplayName("Soma:")
    // Método que realiza o teste da soma
    public void deveSomarInteiros() {
        // Verifica se a soma de 1 e 2 é igual a 3
        assertEquals(3, calc.soma(1, 2));
    }
}
