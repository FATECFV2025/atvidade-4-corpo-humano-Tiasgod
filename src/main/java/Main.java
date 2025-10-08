import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner comeco = new Scanner(System.in);
 
        System.out.println("CRIAÇÃO DO OBJETO CORPO HUMANO");
        System.out.print("Digite a massa inicial (kg): ");
        float massa = comeco.nextFloat();
 
        System.out.print("Digite o volume inicial (m³): ");
        float volume = comeco.nextFloat();
 
        System.out.print("Digite a densidade inicial (kg/m³): ");
        float densidade = comeco.nextFloat();
 
        System.out.print("Digite a altura inicial (m): ");
        float altura = comeco.nextFloat();
 
        CorpoHumano c1 = new CorpoHumano(massa, volume, densidade, altura);
 
        System.out.println("VALORES INICIAIS");
        System.out.println("Massa: " + c1.getMassa() + " kg");
        System.out.println("Volume: " + c1.getVolume() + " m³");
        System.out.println("Densidade: " + c1.getDensidade() + " kg/m³");
        System.out.println("Altura: " + c1.getAltura() + " m");
        System.out.println("IMC: " + c1.calcularIMC());
 
        System.out.print("\nDigite uma nova massa (kg): ");
        float novaMassa = comeco.nextFloat();
 
        System.out.print("Digite uma nova altura (m): ");
        float novaAltura = comeco.nextFloat();
 
        c1.setMassa(novaMassa);
        c1.setAltura(novaAltura);
 
        System.out.println("NOVOS VALORES");
        System.out.println("Massa: " + c1.getMassa() + " kg");
        System.out.println("Altura: " + c1.getAltura() + " m");
        System.out.println("Novo IMC: " + c1.calcularIMC());
 
        comeco.close();
 
       
        //QUESTÕES SOLICITADAS:
   
        //1 - Ocorrência: Erro de compilação ("massa has private access in CorpoHumano")
        //Conclusão: O atributo é privado, então não pode ser acessado diretamente fora da classe.
         
        //2 Ocorrência: O código compila e permite alterar o valor diretamente.
        //Conclusão: Tornando público, o atributo perde o encapsulamento, podendo ser alterado sem controle.
         
        //3 - Ocorrência: Erro ao tentar usar c1.setVolume(), pois o método é privado.
        //Conclusão: Métodos privados só podem ser acessados dentro da própria classe.
 
 
    }
}
 
