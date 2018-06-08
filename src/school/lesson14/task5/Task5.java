package school.lesson14.task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Написать метод, который проверяет, является ли строка адресом IPv4.
 */

public class Task5 {

    private static String REG = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

    public static boolean isIP4(String ip, String reg) {
        Pattern p = Pattern.compile(reg);
        Matcher matcher = p.matcher(ip.trim());
        return matcher.find();
    }

    public static void main(String[] args) {
        String ip1 = "255.255.255.255";
        String ip2 = ".25.25.55.255";
        String ip3 = " 255.255.255.255 ";
        String ip4 = "295.255.255.255";
        String ip5 = "-5.255.255.255";
        String ip6 = "0.0.289.311";
        String ip7 = "255.255.255";

        System.out.println("IP1 - " + isIP4(ip1, REG));
        System.out.println("IP2 - " +isIP4(ip2, REG));
        System.out.println("IP3 - " +isIP4(ip3, REG));
        System.out.println("IP4 - " +isIP4(ip4, REG));
        System.out.println("IP5 - " +isIP4(ip5, REG));
        System.out.println("IP6 - " +isIP4(ip6, REG));
        System.out.println("IP7 - " +isIP4(ip7, REG));
    }
}
