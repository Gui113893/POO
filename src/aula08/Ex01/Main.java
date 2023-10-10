package aula08.Ex01;

import java.util.Vector;

import aula08.Ex01.Ligeiros.Taxi;
import aula08.Ex01.Motociclo.Motociclo;
import aula08.Ex01.Motociclo.MotocicloType;
import aula08.Ex01.Pesados.PesadoMercadorias;

public class Main {
    public static void main(String[] args) {
        
        Vector <Viatura> viaturas = new Vector<Viatura>();
        Viatura v1 = new Taxi("XX-11-BB", "Mercedes", "Benz", 200, 5, 10, 33);
        Viatura v2 = new Motociclo("AN-13-UO", "Benelli", "Bn-125", 11, MotocicloType.ESTRADA);
        Viatura v3 = new PesadoMercadorias("AA-11-BB", "Citroen", "C2", 450, 7, 1500, 500);

        v1.trajeto(1500);
        v1.trajeto(200);
        v2.trajeto(500);
        v3.trajeto(3000);

        viaturas.add(v1);
        viaturas.add(v2);
        viaturas.add(v3);

        Empresa e1 = new Empresa("CompanyVehicles", "3770-355", "companyvehicles@gmail.com", viaturas);

        Viatura maisKm = null;

        for (int i = 0; i < e1.getViaturas().size(); i++){
            if (i == 0){
                maisKm = e1.getViaturas().get(i);
            }else{
                if (maisKm.distanciaTotal() < e1.getViaturas().get(i).distanciaTotal()){
                    maisKm = e1.getViaturas().get(i);
                }
            }
        }

        System.out.println(maisKm);
        System.out.println(e1);

    }
}
