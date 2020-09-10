package br.com.clothing.storage.business;

import br.com.clothing.storage.comuns.enums.SizeEnum;
import br.com.clothing.storage.comuns.enums.ColorEnum;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Validations {

    private String dateFormat;

    public static boolean validateDate (String dateStr) {

        try {
            Date sdf = new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
            return true;

        } catch (ParseException e) {
            System.out.println("Digite uma data válida!");
            return false;
        }
    }

    public static boolean ValidateColorEnum(String color){

        try
        {
            color.toLowerCase();
            ColorEnum cor = Enum.valueOf(ColorEnum.class, color);
            return true;

        }
        catch (Exception e)
        {
            System.out.println("Digite uma cor valida!");
                return false;
        }
       }
    public static boolean ValidateSizeEnum(String size){

        try
        {
            size.toLowerCase();
            SizeEnum cor = Enum.valueOf(SizeEnum.class, size);
            return true;

        }
        catch (Exception e)
        {
            System.out.println("Digite uma cor valida!");
            return false;
        }
    }
}