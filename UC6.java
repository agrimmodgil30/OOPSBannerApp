
public class UC6 {

    static String[] getOPattern() {
        return new String[] {
            String.join("", " ", "*", "*", "*", " "),
            String.join("", "*", " ", " ", " ", "*"),
            String.join("", "*", " ", " ", " ", "*"),
            String.join("", "*", " ", " ", " ", "*"),
            String.join("", "*", " ", " ", " ", "*"),
            String.join("", "*", " ", " ", " ", "*"),
            String.join("", " ", "*", "*", "*", " ")
        };
    }

    
    static String[] getPPattern() {
        return new String[] {
            String.join("", "*", "*", "*", "*", " "),
            String.join("", "*", " ", " ", " ", "*"),
            String.join("", "*", " ", " ", " ", "*"),
            String.join("", "*", "*", "*", "*", " "),
            String.join("", "*", " ", " ", " ", " "),
            String.join("", "*", " ", " ", " ", " "),
            String.join("", "*", " ", " ", " ", " ")
        };
    }

    
    static String[] getSPattern() {
        return new String[] {
            String.join("", " ", "*", "*", "*", "*"),
            String.join("", "*", " ", " ", " ", " "),
            String.join("", "*", " ", " ", " ", " "),
            String.join("", " ", "*", "*", "*", " "),
            String.join("", " ", " ", " ", " ", "*"),
            String.join("", " ", " ", " ", " ", "*"),
            String.join("", "*", "*", "*", "*", " ")
        };
    }

    public static void main(String[] args) {

        String[][] bannerLines = {
            getOPattern(),  // First  'O'
            getOPattern(),  // Second 'O'
            getPPattern(),  // 'P'
            getSPattern()   // 'S'
        };

        for (int line = 0; line < 7; line++) {
            StringBuilder row = new StringBuilder();
            for (String[] charPattern : bannerLines) {
                row.append(charPattern[line]).append("  "); // 2-space gap between letters
            }
            System.out.println(row.toString().stripTrailing());
        }
    }
}