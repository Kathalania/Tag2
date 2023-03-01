public class nameLength {
    public static void main(String[] args) {

        String name = "Hottentottenstottertrottel";
        int nameLength = name.length();
        boolean fancy = name.contains("fancy");

        System.out.println(fancy);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        System.out.println(nameLength);

        lengthTest(nameLength);
        containsFancy(name);
        conclusion(nameLength);


    }
    public static boolean lengthTest(int nameLength){
        if (nameLength >= 20)
            System.out.println("name is longer than 20 digits");
        else
            System.out.println("name is shorter than 20 digits");
        return nameLength>=20;
        }

    public static boolean containsFancy(String name){
        System.out.println(name.contains("fancy"));
        return name.contains("fancy");
    }

    public static boolean conclusion(int nameLength){
        System.out.println(nameLength);
        return lengthTest(nameLength);


    }
    }
