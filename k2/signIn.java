package k2;

public class signIn {
    public static void main(String[] args) {
        String s[][] = new String[5][2];
        s[0][0] = "jack";
        s[0][1] = "yes";
        s[1][0] = "ted";
        s[1][1] = "no";
        s[2][0] = "marry";
        s[2][1] = "yes";
        s[3][0] = "tom";
        s[3][1] = "yes";
        s[4][0] = "jerry";
        s[4][1] = "no";
        for (int i = 0; i < 5; i++) {

            if (s[i][1] == "yes") {
                new student(s[i][0], true);
            } else {
                new student(s[i][0], false);
            }
        }
    }
}