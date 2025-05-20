// Importa a classe para asserções do JUnit
import static org.junit.jupiter.api.Assertions.assertEquals;
// Importa anotações para descrever os testes
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
// Importa a classe Checksum que será testada
import ex5.Checksum;

// Declara a classe de teste
public class crcTest {
    // Cria uma instância da classe Checksum para ser usada nos testes
    Checksum checksum = new Checksum();

    // Anotação que indica que este método é um teste
    @Test
    // Define um nome legível para o teste
    @DisplayName("CRC do arquivo:")
    // Método que realiza o teste do cálculo do CRC para um arquivo
    public void deveCRCdoArquivo() {
        // Verifica se o cálculo do CRC do arquivo retorna 65535
        assertEquals(65535, checksum.calcularCRCDoArquivo());
    }
}
