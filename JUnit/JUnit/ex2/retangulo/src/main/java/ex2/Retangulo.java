package ex2;

public class Retangulo {
    private int altura;
    private int base;

    public Retangulo(int base, int altura){

        this.base = base;
        this.altura = altura;

    }

    public int calcularArea(){
        return base * altura;
    }

    
    public int calcularPerimetro(){
        return base*2 + altura*2;
    }
}
