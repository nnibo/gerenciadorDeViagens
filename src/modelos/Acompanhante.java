package modelos;

public class Acompanhante extends Pessoa{
    private boolean temParentesco;
    private String tipoParentesco;
    public Acompanhante(String nome, int idade, boolean temParentesco, String tipoParentesco) {
        super(nome, idade);
        this.temParentesco = temParentesco;

        if(temParentesco){
            this.tipoParentesco = tipoParentesco;
        } else {
            this.tipoParentesco = null;
        }
    }

    public boolean isTemParentesco() {
        return temParentesco;
    }

    public String getTipoParentesco() {
        return tipoParentesco;
    }

    @Override
    public String toString() {
        return "Parentesco: " + this.getTipoParentesco();
    }
}
