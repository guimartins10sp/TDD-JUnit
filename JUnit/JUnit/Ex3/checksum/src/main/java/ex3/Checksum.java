package ex3;

import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Formatter;


public class Checksum{

    public Checksum(){
        
    }

    public int calcularChecksum(char[] list){
        int soma = 0;
        for(char c:list){
            soma += (int)c;
        }
        int checksum = soma & 0xFFFF;
        checksum = ~checksum & 0xFFFF;
        checksum += 1;

        return checksum;
    }

    public int calcularChecksumDoArquivoTexto(){
        Path path = Paths.get("bytes.txt");
        int checksum = 0;
        int soma = 0;

        try(Scanner scanner = new Scanner(path.toFile())){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                char[] chars = line.toCharArray();
                for(char c:chars){
                    soma += (int)c;
                }
                checksum = soma & 0xFFFF;
                checksum = ~checksum & 0xFFFF;
                checksum += 1;
            }
        }catch(FileNotFoundException e){
            System.out.println("Erro ao abrir o arquivo");
        }
        return checksum;
    }

    public void gravarChecksum(){
        try(Formatter formatter = new Formatter("checksum.txt")){
            formatter.format("%s",calcularChecksumDoArquivoTexto());
        }catch(FormatterClosedException formatterClosedException){
            System.out.println("Soma gravada com sucesso");
        }catch(NoSuchElementException elementException){
            System.out.println("Sem elementos suficientes");
        }catch(FileNotFoundException e){
            System.out.println("Erro ao abrir arquivo");
        }
    }

    public int calcularCRC(char[] list){
        int crc = 0xFFFF;
        for(char c: list){
            crc = calcularCRCtab((crc >>> 8)^(int) c, crc);
        }
        crc = ~crc & 0xFFFF;
        crc += 1;
        return crc;
    }

    private int calcularCRCtab(int data, int crc){
        for(int i=0;i < 8; i++){
            if(((crc ^ data) & 1) == 1){
                crc = (crc >>> 1) ^ 0xA001;
            }else{
                crc >>>= 1;
            }
            data >>>= 1;
        }
        return crc;
    }

    public int calcularCRCDoArquivo(){
        Path path = Paths.get("CRCbytes.txt");
        int crc = 0xFFFF;

        try(Scanner scanner = new Scanner(path.toFile())){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                char[] chars = line.toCharArray();
                for( char c : chars){
                    crc = calcularCRCtab((crc >>> 8)^(int) c, crc);
                }
                crc = ~crc & 0xFFFF;
                crc += 1;
            }
        }catch(FileNotFoundException e){
            System.out.println("Erro ao abrir o arquivo");
        }
        return crc;
    }

    public void gravarCRC(){
        try(Formatter formatter = new Formatter("CRC.txt")){
            formatter.format("%s",calcularCRCDoArquivo());
        }catch(FormatterClosedException formatterClosedException){
            System.out.println("Soma gravada com sucesso");
        }catch(NoSuchElementException elementException){
            System.out.println("Sem elementos suficientes");
        }catch(FileNotFoundException e){
            System.out.println("Erro ao abrir arquivo");
        }
    }
}