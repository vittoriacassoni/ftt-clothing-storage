package br.com.clothing.storage.console.estadoConsole;
import br.com.clothing.storage.comuns.enums.ColorEnum;
import br.com.clothing.storage.comuns.enums.SizeEnum;
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
        String purchaseLocation = scanner.next();

        System.out.println("Tipo: ");
        String type = scanner.next();

        System.out.println("Marca: ");
        String brand = scanner.next();

        System.out.println("Descrição: ");
        String description = scanner.next();

        System.out.println("Tamanho (P, M ou G): ");
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


        Main.estadoConsole = EnumEstadoConsole.MENU_PRINCIPAL.getEstadoMaquina();

        return false;
    }
    catch (Exception error){
        System.out.println("Ocorreu um erro, reinicie e tente novamente");
        return true;
    }

    }
}
