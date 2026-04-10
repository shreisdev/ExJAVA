package Aula05.Q01;

public class ClinicoGeral extends Medico {
    boolean atendeEmCasa;

    public ClinicoGeral(boolean trabalhaNoHospital, boolean atendeEmCasa) {
        super(trabalhaNoHospital); // chama o construtor do Médico
        this.atendeEmCasa = atendeEmCasa;
    }

    public void receitar() {
        System.out.println("Receitando medicamento...");
    }
}