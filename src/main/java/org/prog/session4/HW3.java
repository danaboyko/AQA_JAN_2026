package org.prog.session4;

public class HW3 {
    public static void main(String[] args) {
        String[] emails = new String[]{
                "abcdefg@gmail.com", //+
                "a@gmail.com", //-
                "josh@@gmail.com", //-
                "janegmail.com", // -
                "pete@gmail.com", //+
                "zoe@gmailcom", //-
                "steve@outlook.com", //+
                "abcd@a.a", //+
                "abcd.a@fakemail" //-
        };
        int i = 0;
        while (i < emails.length) {
            String email = emails[i];
            int firstAt = email.indexOf('@');
            int lastAt = email.lastIndexOf('@');
                         {

                             if (firstAt>= 3 && firstAt == lastAt) {
                    ;
                    String domain = email.substring(firstAt + 1);
                    int dots = 0;
                    int j = 0;
                    while (j < domain.length()) {
                        if (domain.charAt(j) == '.') {
                            dots++;
                        }
                        j++;
                    }

                    if (dots == 1) {
                        System.out.println(email);
                    }
                }
                i++;

            }
        }
    }
}

