package ex1;

public class Ordena {
    public void ordenaNumerosCrescentes(int iVet[]){
        int iA, iB, iT;
        for(iA = 1; iA<iVet.length; iA++){
            for(iB = iVet.length-1; iB >= iA; iB--){
                if(iVet[iB-1] > iVet[iB]){
                    iT = iVet[iB-1];
                    iVet[iB-1] = iVet[iB];
                    iVet[iB] = iT;
                }
            }
        }
    }

    public void ordenaNumerosDecrescentes(int iVet[]){
        int iA, iB, iT;
        for(iA = 1; iA<iVet.length; iA++){
            for(iB = iVet.length-1; iB >= iA; iB--){
                if(iVet[iB-1] < iVet[iB]){
                    iT = iVet[iB-1];
                    iVet[iB-1] = iVet[iB];
                    iVet[iB] = iT;
                }
            }
        }
    }
}
