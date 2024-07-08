package desafios;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        System.out.println("Processo seletivo");
        analisarCandidato(3000);
        analisarCandidato(2000);
        analisarCandidato(500);
    }

    static public void analisarCandidato(double salarioPretendido) {
        final double salarioBase = 2000.0;
        if (salarioPretendido > salarioBase) {
            System.out.println("Ligar para o candidato");
        } else if (salarioPretendido == salarioBase) {
            System.out.println("Ligar para o candidato com uma contra proposta.");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos.");
        }
    }


}
