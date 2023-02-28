import java.sql.SQLOutput;

public class Tag2 {

    public static void main (String[] args) {

        /*int month = 2;

        String welcome = "Willkommen im ";

        switch (month) {

            case 1:
                System.out.println(welcome + "Januar");
                break;

            case 2:
                System.out.println(welcome + "Februar");
                break;

            default:
                System.out.println("Tschüss");
                break;

        }*/

        int value1 = 171;
        int value2 = 3;

        String text = "Summe: ";

        duplicate(value1, value2);
        duplicate2(value1,value2,text);
        duplicate3(value1,value2);

        int result = duplicate(value1,value2);
        System.out.println(result);

        String resultString = duplicate2(value1,value2,text);
        System.out.println(resultString);
    }

    public static int duplicate(int value1, int value2){
        //System.out.println(value1+value2);
        int result = value1 + value2;
        return result;
    }

    public static String duplicate2(int value1, int value2, String text){
        //System.out.println(text+(value1+value2));
        return text + (value1+value2);

    }

    public static void duplicate3(int value1, int value2){
        if (value1>100)
            System.out.println("Erster Wert ist größer als 100");
        else
            System.out.println("Erster Wert ist kleiner als 100");
        if (value2>100)
            System.out.println("Zweiter Wert ist größer als 100");
        else
            System.out.println("Zweiter Wert ist kleiner als 100");

        String name = "Hottentottenstottertrottel";
        int nameLength = name.length();
        boolean fancy = name.contains("fancy");

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(nameLength);
        System.out.println(name.contains("fancy"));

    }

    public static int lengthTest(int nameLength) {
        if (nameLength>=20)
            System.out.println("");
        return
    }

}
