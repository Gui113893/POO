package aula06.Ex03;

public class Conjunto {
    int[] conjunto;
    int Nnumeros;

    public Conjunto(){
        this.Nnumeros = 0;
    }

    public void insert(int n){
        if (this.Nnumeros == 0){
            this.Nnumeros++;
            this.conjunto = new int[1];
            this.conjunto[0] = n;
        }else{
            if (!this.contains(n)){
                int[] Newconjunto = new int[conjunto.length + 1];

                for (int j = 0; j < Nnumeros; j++){
                    Newconjunto[j] = conjunto[j];
                }

                this.conjunto = Newconjunto;
                this.conjunto[Nnumeros] = n;
                this.Nnumeros++;
            }
        }
    }

    public boolean contains(int n){
        boolean found = false;

        for (int i=0; i<this.Nnumeros; i++){
            if (this.conjunto[i] == n){
                found = true;
            }
        }
        return found;
    }

    public void remove(int n){
        if (this.contains(n)){
            int [] Newconjunto = new int[conjunto.length-1];

            boolean valorPassado = false;
            this.Nnumeros--;

            for (int i = 0; i < Nnumeros; i++){
                if (valorPassado){
                    Newconjunto[i] = conjunto[i+1];
                }else{
                    if (conjunto[i] == n){
                        valorPassado = true;
                        Newconjunto[i] = conjunto[i+1];
                    }else{
                        Newconjunto[i] = conjunto[i];
                    }
                }
            }
            this.conjunto = Newconjunto;
        }
    }

    public void empty(){
        this.Nnumeros = 0;
        this.conjunto = new int[0];
    }


    @Override
    public String toString() {
        String string = "";

        for (int i = 0; i < this.Nnumeros; i++){
            string += this.conjunto[i] + " ";
        }

        return string;

    }

    public int size(){
        return this.Nnumeros;
    }

    public Conjunto combine(Conjunto add){
        Conjunto c = new Conjunto();

        c.conjunto = this.conjunto;
        c.Nnumeros = this.Nnumeros;

        for (int i = 0; i < add.Nnumeros; i++){
            c.insert(add.conjunto[i]);
        }

        return c;
    }

    public Conjunto substract(Conjunto dif){
        Conjunto c = new Conjunto();

        c.Nnumeros = this.Nnumeros;
        c.conjunto = this.conjunto;

        for (int i = 0; i<dif.Nnumeros; i++){
            c.remove(dif.conjunto[i]);
        }

        return c;
    }

    public Conjunto intersect(Conjunto inter){
        Conjunto c = new Conjunto();

        for (int i = 0; i<inter.Nnumeros; i++){
            if (this.contains(inter.conjunto[i])){
                c.insert(inter.conjunto[i]);
            }
        }

        return c;
    }
}
