package aula05.Ex03;
import aula05.Ex02.DateYMD;

public class RealEstate {
    int nmoveis;
    Imovel[] imoveis = new Imovel[10];

    RealEstate(){
    }

    public void newProperty(String localidade, int nquartos, double preco){
        imoveis[nmoveis] = Imovel.create(localidade, nquartos, preco);
        nmoveis ++;
    }


    public void sell(int id){
        if (id % 1000 < imoveis.length){
            imoveis[id%1000].setDisponivel(false);
            System.out.printf("Imóvel %d vendido.\n", id);
            System.out.printf("Imóvel %d não está disponível.\n", id);
        }
    }

    public void setAuction(int id, DateYMD data_inical, int periodo_dias){
        if (id % 1000 < imoveis.length && imoveis[id%1000] != null){
            imoveis[id%1000].setLeilao(Leilao.create(data_inical, periodo_dias));
        }else{
            System.out.printf("Imóvel %d não existe\n", id);
        }
    }


    @Override
    public String toString() {
        System.out.println("Propriedades:");
        
        for (int i = 0; i < nmoveis; i++){
            System.out.printf("Imóvel: %d; quartos: %d; localidade: %s; preço: %.0f; disponível: ", imoveis[i].id, imoveis[i].nquartos, imoveis[i].localidade, imoveis[i].preco);
            if (imoveis[i].disponivel){
                System.out.print("sim");
            }else{
                System.out.print("não");
            }

            if (imoveis[i].leilao != null){
                System.out.printf("; leilão %d-%d-%d : %d-%d-%d\n",imoveis[i].leilao.data_inicio.getYear(), imoveis[i].leilao.data_inicio.getMonth(), imoveis[i].leilao.data_inicio.getDay(), imoveis[i].leilao.data_fim.getYear(), imoveis[i].leilao.data_fim.getMonth(), imoveis[i].leilao.data_fim.getDay());
            }else{
                System.out.print("\n");
            }
        }
        return "";
    }

    
}
