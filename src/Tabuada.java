import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        //Pedindo ao usuário para atribuir qual a tabuada que o mesmo deseja visualizar
        System.out.print("Digite qual a tabuada voce quer visualizar: ");
        //Inserinando uma variável para o número que o usuário vai inserir
        int numero = ler.nextInt();
        //O for irá começar com o indíce 0 e irá até 0 10
        for (int i = 0;i <= 10;i++){
        //Este print irá imprimir a tabuada do número inicialemente atribuido pelo úsario, indo de 0 a 10
            System.out.println(numero+"x" +i+ " = " + numero * i);

             ler.close();
        }
    }
}
