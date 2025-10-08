public class ClinicoGeral extends Medico {

    private boolean atendeEmCasa;

    public ClinicoGeral() {
    }

    public ClinicoGeral(String nome) {
        super(nome);
    }

    public ClinicoGeral(String nome, String crm) {
        super(nome, crm);
    }

    public ClinicoGeral(String nome, String crm, boolean trabalhaNoHospital) {
        super(nome, crm, trabalhaNoHospital);
    }

    public ClinicoGeral(String nome, String crm, boolean trabalhaNoHospital, boolean atendeEmCasa) {
        super(nome, crm, trabalhaNoHospital);
        this.atendeEmCasa = atendeEmCasa;
    }

    public boolean getAtendeEmCasa() {
        return atendeEmCasa;
    }

    public void setAtendeEmCasa(boolean atendeEmCasa) {
        this.atendeEmCasa = atendeEmCasa;
    }

    public void receitar() {

    }

}
