public class StringType {
    public static void main (String[] args) {
        System.out.println("Ola pessoal");
        System.out.println("Ola pessoal" .charAt(2));

        String s = "Boa noite";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!\n");

        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toUpperCase().endsWith("noite"));
    }
}