import java.util.Scanner;

public class Contador {
 public static void main(String[] args){
    Scanner terminal = new Scanner(System.in);

    int paremetroUm = terminal.nextInt();
    int paremetroDois = terminal.nextInt();

    terminal.close();

    try {
        contar(paremetroUm, paremetroDois);
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
 }


 static void contar(int paremetroUm, int paremetroDois) throws ParametrosInvalidosExecption{
    if(paremetroDois<paremetroUm){
        throw new ParametrosInvalidosExecption("O primeiro parametro deve ser menor que o segundo");
    }
    for(int i=paremetroUm; i<=paremetroDois; i++){
        System.out.println(i);
    }
 }
}

 class ParametrosInvalidosExecption extends RuntimeException{
    public ParametrosInvalidosExecption(String message){
        super(message);
    }
}
