package Candidatura;
public class ProcessoSeletivo {
    public static void main(String[] args) {
        
    }
    static void analisarCandidato(double SalarioPretendido) {
        double SalarioBase = 2000.0;
        if(SalarioBase > SalarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO");
        } else if(SalarioBase == SalarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
    
}
