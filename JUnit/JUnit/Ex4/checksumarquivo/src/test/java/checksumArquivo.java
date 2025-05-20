// Importa a classe para asserções do JUnit
import static org.junit.jupiter.api.Assertions.assertEquals;
// Importa anotações para descrever os testes
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
// Importa a classe Checksum que será testada
import ex4.Checksum;

// Declara a classe de teste
public class checksumArquivo {
    // Cria uma instância da classe Checksum para ser usada nos testes
    Checksum checksum = new Checksum();

    // Anotação que indica que este método é um teste
    @Test
    // Define um nome legível para o teste
    @DisplayName("Checksum arquivo texto:")
    // Método que realiza o teste do cálculo do checksum para um arquivo texto
    public void deveChecksumArquivo() {
        // Verifica se o cálculo do checksum do arquivo texto retorna 65439
        assertEquals(65439, checksum.calcularChecksumDoArquivoTexto());
    }
}
