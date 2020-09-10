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
import br.com.clothing.storage.business.Validations;

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


        boolean validDate = false;

        String inputDate = "";

        while (!validDate)
        {
            inputDate = scanner.next();
            validDate = Validations.validateDate(inputDate);
        }

        Date enterDate = new SimpleDateFormat("dd/MM/yyyy").parse(inputDate);

        System.out.println("Local da compra: ");
        scanner.nextLine();
        String purchaseLocation = scanner.nextLine();

        System.out.println("Tipo: ");
        String type = scanner.nextLine();

        System.out.println("Marca: ");
        String brand = scanner.nextLine();

        System.out.println("Descrição: ");
        String description = scanner.nextLine();

        System.out.println("Tamanho (P, M ou G): ");
<<<<<<< HEAD
        boolean validSize = false;

        String inputSize = "";

        while (!validSize)
        {
            inputSize = scanner.next().toUpperCase();
            validSize = Validations.ValidateSizeEnum(inputSize);
        }

        SizeEnum size = SizeEnum.valueOf(inputSize);


        System.out.println("Cor (Rosa, Azul, Branco ou Preto): ");
        boolean validColor = false;

         String inputColor = "";
=======
        String sizeString =  scanner.next();
        SizeEnum size = SizeEnum.valueOf(sizeString.toUpperCase());

        System.out.println("Cor (Rosa, Azul, Branco ou Preto): ");
        String colorString = scanner.next();
        ColorEnum color = ColorEnum.valueOf(colorString.toUpperCase());
>>>>>>> e73d8f4ea507d4c93c002fc956011f0e16ca77ef

         while (!validColor)
         {
             inputColor = scanner.next().toUpperCase();
             validColor = Validations.ValidateColorEnum(inputColor);
         }

         ColorEnum color = ColorEnum.valueOf(inputColor);
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
