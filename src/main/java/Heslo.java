public class Heslo {
    public boolean validuj(String heslo) {
        if (heslo.length() <= 5) {
            return false;
        }

        for (char znak : heslo.toCharArray()) {
            if (Character.isUpperCase(znak)) {
                return true;
            }
        }
        return false;
    }

}
