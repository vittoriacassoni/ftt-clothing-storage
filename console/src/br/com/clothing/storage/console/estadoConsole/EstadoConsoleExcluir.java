package br.com.clothing.storage.console.estadoConsole;
import br.com.clothing.storage.console.Main;
import br.com.clothing.storage.dao.StorageItemDAO;

import java.util.Scanner;

public class EstadoConsoleExcluir extends MaquinaEstadoConsole {

    @Override
    public boolean Executa() {
        System.out.println("Excluir");
        StorageItemDAO storageItemDAO = new StorageItemDAO();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código do item: ");
        Integer id = scanner.nextInt();

        if(storageItemDAO.delete(id)) {
            System.out.println("Item removido com sucesso!");
        }
        else{
            System.out.println("Não foi encontrado item com esse código!");
        }


        Main.estadoConsole = EnumEstadoConsole.MENU_PRINCIPAL.getEstadoMaquina();

        return false;
    }
}
