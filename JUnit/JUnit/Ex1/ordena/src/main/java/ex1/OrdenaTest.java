package ex1;
import ex1.Ordena;

public class OrdenaTest {
    public OrdenaTest(){
        int proposto[] = new int[]{9,10};
        int esperado[] = new int[]{10,9};
        int inesperado[] = new int[]{9};

        Ordena teste = new Ordena();
        teste.ordenaNumerosDecrescentes(proposto);

        System.out.println("Teste de Ordenação\n===================");
        System.out.println("Ficou com o mesmo tamanho: " +caso1Test(proposto.length, esperado.length));
        System.out.println("Ordenou com sucesso......: " +caso2Test(proposto, esperado));
    }

    public boolean caso1Test(int tamprop, int tamesp){
        boolean resp = true;
        if(tamprop != tamesp){
            resp = false;
        }
        return resp;
    }

    public boolean caso2Test(int prop[], int esp[]){
        return numerosIguais(prop, esp);
    }

    public boolean numerosIguais(int nums1[], int nums2[]){
        boolean resultado = true;
        for(int i = 0, j = 0;i<nums1.length; i++, j++){
            if(nums1[i] != nums2[i]){
                resultado = false;
                i = nums1.length;
            }
        }
        return resultado;
    }
}
