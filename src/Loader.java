import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        Pattern pattern = Pattern.compile("[0-9]+"); // регулярное выражение на числа
        Matcher matcher = pattern.matcher(text);

        int sum = 0;
        while(matcher.find()) {
            sum += Integer.parseInt(matcher.group()); //конвертируем найденные строки в числа и суммируем их
        }
        System.out.println(sum);

//        System.out.println(String.format());


//        for (char i = 'a'; i <= 'z'; i++) {
//            int c = i;
//            System.out.println(i + " :" + c + ".");
//        }
//        System.out.println("\n ========================\n");
//        for (char j = 'а'; j <= 'я'; j++) {
//            int x = j;
//            System.out.println(j + " :" + x + ".");
//        }
//        int v1 = text.indexOf("Вася заработал");
//        int v2 = text.indexOf("руб");
//        String str1 = text.substring(v1 + 14, v2).trim();
//
//        int p1 = text.indexOf("Петя ");
//        int p2 = text.indexOf("рубля");
//        String str2 = text.substring(p1 + 6, p2).trim();
//
//        int m3 = text.indexOf("Маша - ");
//        int m4 = text.lastIndexOf("руб");
//        String str3 = text.substring(m3 + 6, m4).trim();
//
//        int summ = Integer.parseInt(str1) + Integer.parseInt(str2) + Integer.parseInt(str3);
//        System.out.println(String.format("Вася, Петя и Маша заработали %d рублей", summ));
        // ========================
//        String FIO = "Фёдоров Дмитрий Петрович";
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите ФИО!");
//        String FIO = sc.nextLine();
//
//        Pattern pattern = Pattern.compile("\\d+");
//        Matcher matcher = pattern.matcher(FIO);
//        if (FIO.equals("0") || FIO.equals(" ") || FIO.equals("") || FIO.equals(null) || matcher.find()
//                || FIO.split(" ").length == 1 || FIO.split(" ").length == 2) {
//            System.out.println("Неправильно!");
//        } else {
//            int F = FIO.indexOf(" ");
//            String str4 = FIO.substring(0, F).trim();
//
//            int FN = FIO.lastIndexOf(" ");
//            String str5 = FIO.substring(F, FN).trim();
//
//            int LN = FIO.lastIndexOf(" ");
//            String str6 = FIO.substring(LN);
//
//            System.out.println("Фамилия: " + str4 + " \nИмя: " + str5 + "\nОтчество: " + str6);
//        }
    }
}