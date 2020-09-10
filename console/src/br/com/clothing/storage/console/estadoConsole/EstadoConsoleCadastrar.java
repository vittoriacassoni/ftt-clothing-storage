package br.com.clothing.storage.console.estadoConsole;
import br.com.clothing.storage.comuns.enums.ColorEnum;
import br.com.clothing.storage.comuns.enums.SizeEnum;
import br.com.clothing.storage.comuns.vos.StorageItem;
import br.com.clothing.storage.console.Main;
import br.com.clothing.storage.dao.StorageItemDAO;

import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EstadoConsoleCadastrar extends MaquinaEstadoConsole {

    @Override
    public boolean Executa() throws ParseException {
    try{
        System.out.println("Cadastrar usuário");
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Código do item: ");
        Integer id = scanner.nextInt();

        System.out.println("Data de entrada: ");
        Date enterDate = dateFormat.parse(scanner.next());

        System.out.println("Local da compra: ");
        scanner.nextLine();
        String purchaseLocation = scanner.nextLine();

        System.out.println("Tipo: ");
        scanner.nextLine();
        String type = scanner.nextLine();

        System.out.println("Marca: ");
        scanner.nextLine();
        String brand = scanner.nextLine();

        System.out.println("Descrição: ");
        scanner.nextLine();
        String description = scanner.nextLine();

        System.out.println("Tamanho (P, M ou G): ");
        String sizeString =  scanner.next();
        SizeEnum size = SizeEnum.valueOf(sizeString.toUpperCase());

        System.out.println("Cor (Rosa, Azul, Branco ou Preto): ");
        String colorString = scanner.next();
        ColorEnum color = ColorEnum.valueOf(colorString.toUpperCase());

        System.out.println("Preço da etiqueta: ");
        Double priceTag = scanner.nextDouble();

        System.out.println("Valor pago na compra: ");
        Double paidPrice = scanner.nextDouble();

        Double profitPrice = paidPrice * 2;

        System.out.println("Valor sugerido: ");
        Double suggestedPrice = scanner.nextDouble();

        StorageItemDAO storageItemDAO = new StorageItemDAO();
        StorageItem item = new StorageItem(id, enterDate, purchaseLocation, type, brand, description, size,
                color, priceTag, paidPrice, profitPrice, suggestedPrice);


        storageItemDAO.add(item);
        System.out.println("Item cadastrado com sucesso!");

        Main.estadoConsole = EnumEstadoConsole.MENU_PRINCIPAL.getEstadoMaquina();

        return false;
    }
    catch (Exception error){
        System.out.println("Ocorreu um erro, reinicie e tente novamente");
        System.out.println(error);
        return true;

    }

    }
}
