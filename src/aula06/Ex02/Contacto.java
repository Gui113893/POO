package aula06.Ex02;
import aula06.Ex01.Pessoa;

public class Contacto {
    private static int ID = 1;
    int id;
    Pessoa pessoa;
    int ntel;
    String email;

    public void nextID(){
        this.id = Contacto.ID++;
    }

    Contacto(Pessoa pessoa, int ntel){
        if (isNtelValid(ntel)){
            this.setNtel(ntel);
            this.setPessoa(pessoa);
            this.nextID();
        }
    }

    Contacto(Pessoa pessoa, String email){
        if (isEmailValid(email)){
            this.setPessoa(pessoa);
            this.setEmail(email);
            this.nextID();
        }
    }

    Contacto(Pessoa pessoa, int ntel, String email){
        if (isEmailValid(email) && isNtelValid(ntel)){
            this.setEmail(email);
            this.setNtel(ntel);
            this.setPessoa(pessoa);
            this.nextID();
        }
    }


    public int getId() {
        return this.id;
    }

    public Pessoa getPessoa() {
        return this.pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public int getNtel() {
        return this.ntel;
    }

    public void setNtel(int ntel) {
        this.ntel = ntel;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static boolean isNtelValid(int ntel){
        return Integer.toString(ntel).matches("9\\d{8}");   
    }

    public static boolean isEmailValid(String email){
        return email.matches("\\s+@\\s+.\\s+");
    }


    @Override
    public String toString() {
        return "{" +
            " Id ='" + getId() + "'" +
            ", Nome ='" + getPessoa().getNome() + "'" +
            ", Nº ='" + getNtel() + "'" +
            ", Email ='" + getEmail() + "'" +
            "}";
    }


}
