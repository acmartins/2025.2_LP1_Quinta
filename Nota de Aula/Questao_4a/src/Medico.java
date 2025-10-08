public class Medico {
    protected String nome;
    protected String crm;
    protected boolean trabalhaNoHospital;

    public Medico() {
    }

    public Medico(String nome) {
        this.nome = nome;
    }

    public Medico(String nome, String crm) {
        this.nome = nome;
        this.crm = crm;
    }

    public Medico(String nome, String crm, boolean trabalhaNoHospital) {
        this.nome = nome;
        this.crm = crm;
        this.trabalhaNoHospital = trabalhaNoHospital;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public boolean getTrabalhaNoHospital() {
        return trabalhaNoHospital;
    }

    public void setTrabalhaNoHospital(boolean trabalhaNoHospital) {
        this.trabalhaNoHospital = trabalhaNoHospital;
    }

    public void trataPaciente() {

    };
}
