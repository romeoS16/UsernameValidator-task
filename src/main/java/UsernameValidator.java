public class UsernameValidator {

    /**
     * Prüft, ob ein Benutzername gültig ist.
     *
     * Ein Benutzername gilt als gültig, wenn:
     *  - er mindestens 3 Zeichen lang ist,
     *  - er höchstens 15 Zeichen lang ist,
     *  - das erste Zeichen ein Buchstabe ist (a–z oder A–Z),
     *  - alle weiteren Zeichen nur aus Buchstaben, Ziffern oder Unterstrichen ('_') bestehen,
     *  - keine Leerzeichen oder sonstige Sonderzeichen vorkommen.
     *
     * @param name der zu prüfende Benutzername (darf nicht null sein)
     * @return true, wenn der Name alle Regeln erfüllt, sonst false
     */

    public static boolean isValidUsername(String name) {
        if(name == null || name.isEmpty()){
            return false;
        }
        if(name.length() < 3 || name.length() > 15){
            return false;
        }
        if(!Character.isLetter(name.charAt(0))){
            return false;
        }
        for(int i = 1; i < name.length(); i++){
            if(!(Character.isLetter(name.charAt(i))
                    || Character.isDigit(name.charAt(i))
                    || name.charAt(i) == '_')){
                return false;
            }
        }
        return true;
    }
}
