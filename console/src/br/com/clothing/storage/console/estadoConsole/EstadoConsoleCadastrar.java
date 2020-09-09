package br.com.clothing.storage.console.estadoConsole;
import br.com.clothing.storage.console.Main;

public class EstadoConsoleCadastrar extends MaquinaEstadoConsole {

    @Override
    public boolean Executa() {

        System.out.println("Cadastrar usuário");
        Main.estadoConsole = EnumEstadoConsole.MENU_PRINCIPAL.getEstadoMaquina();

        return false;
    }
}
