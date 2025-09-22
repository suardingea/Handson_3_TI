public class ComparisonOperationsPractice {
    public static void main(String[] args) {

        // ===== PERBANDINGAN NUMERIK DASAR =====
        System.out.println("=== PERBANDINGAN NUMERIK DASAR ===");

        int firstNum = 25;
        int secondNum = 18;

        System.out.println(firstNum + " > " + secondNum + " : " + true);
        System.out.println(firstNum + " < " + secondNum + " : " + false);
        System.out.println(firstNum + " >= " + secondNum + " : " + true);
        System.out.println(firstNum + " <= " + secondNum + " : " + false);
        System.out.println(firstNum + " == " + secondNum + " : " + false);
        System.out.println(firstNum + " != " + secondNum + " : " + true);

        // ===== PERBANDINGAN FLOATING-POINT =====
        System.out.println("\n=== PERBANDINGAN FLOATING-POINT ===");

        System.out.println("price1 < price2 : " + true);
        System.out.println("Math.abs(price1 - price2) < 1.0 : " + true);

        System.out.println("0.1 + 0.2 == 0.3 : " + false); // false karena presisi floating-point

        // ===== PERBANDINGAN KARAKTER =====
        System.out.println("\n=== PERBANDINGAN KARAKTER ===");

        System.out.println("letter1 < letter2 : " + true); // A(65) < B(66)
        System.out.println("'a' > 'A' : " + ('a' > 'A')); // 97 > 65

        System.out.println("Apakah '5' digit? : " + true);

        // ===== PERBANDINGAN STRING =====
        System.out.println("\n=== PERBANDINGAN STRING ===");

        System.out.println("name1 == name2 : " + true); // true, interned string

        System.out.println("name1 == name3 : " + true); // false, objek berbeda

        System.out.println("name1.equals(name3) : " + true); // true, konten sama
        System.out.println("name1.equals(\"java\") : " + false); // false, case-sensitive
        System.out.println("name1.equalsIgnoreCase(\"java\") : " + true); // true

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\n=== APLIKASI PRAKTIS ===");

        System.out.println("Lulus? " + true);
        System.out.println("Honor Roll? " + false);

        System.out.println("Boleh mengemudi? " + true);
        System.out.println("Boleh memilih? " + false);
        System.out.println("Boleh minum? " + false);

        System.out.println("Diskon bulk? " + true);
        System.out.println("Diskon senior? " + true);
        System.out.println("Diskon akhir? " + true);

        // ===== PENGUJIAN BATAS =====
        System.out.println("\n=== PENGUJIAN BATAS ===");

        System.out.println("Score valid? " + true);

        int[] testScores = {0, 100, -1, 101};
        for (int s : testScores) {
            System.out.println("Score " + s + " valid? " + (s >= 0 && s <= 100));
        }

        System.out.println("Suhu valid? " + true);

        // Rantai perbandingan & sistem penilaian
        System.out.println("Tinggi diterima? " + true);

        String gradeLetter;
        gradeLetter = "B";
        System.out.println("Grade: " + gradeLetter);
    }
}
