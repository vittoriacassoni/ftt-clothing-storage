package br.com.clothing.storage.console.estadoConsole;
import br.com.clothing.storage.console.Main;
import java.util.Scanner;

public class EstadoConsoleMenuPrincipal extends MaquinaEstadoConsole {

    @Override
    public boolean Executa() {
        System.out.println("*** Menu Principal");
        Scanner scan = new Scanner(System.in);
        System.out.println("0 - Leitura");
        System.out.println("1 - Novo cadastro");
        System.out.println("2 - Editar");
        System.out.println("3 - Listar");
        System.out.println("4 - Excluir");
        System.out.println("5 - Salvar");
        System.out.println("6 - Sair sem salvar");

        int option = scan.nextInt();

        boolean exit = false;
        switch (option)
        {
            case 0:
                Main.estadoConsole = EnumEstadoConsole.LEITURA.getEstadoMaquina();
                break;
            case 1:
                Main.estadoConsole = EnumEstadoConsole.CADASTRAR.getEstadoMaquina();
                break;
            case 2:
                Main.estadoConsole = EnumEstadoConsole.EDITAR.getEstadoMaquina();
                break;
            case 3:
                Main.estadoConsole = EnumEstadoConsole.LISTAR.getEstadoMaquina();
                break;
            case 4:
                Main.estadoConsole = EnumEstadoConsole.EXCLUIR.getEstadoMaquina();
                break;
            case 5:
                Main.estadoConsole = EnumEstadoConsole.SALVAR.getEstadoMaquina();
                break;
            case 6:
                exit = true;
                break;
        }

        return exit;
    }
}
