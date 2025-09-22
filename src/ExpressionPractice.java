public class ExpressionPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Expression, Statement & Block
         */

        // ===== EXPRESSIONS =====
        System.out.println("=== EXPRESSIONS ===");

        // Latihan 1: Buat arithmetic expressions dan simpan hasilnya
        int a = 10;
        int b = 5;

        // - Buat expression yang menjumlahkan a dan b, simpan dalam variabel 'sum'
        int sum = a + b;

        // - Buat expression yang mengalikan a dan b, simpan dalam variabel 'product'
        int product = a * b;

        // - Buat boolean expression yang mengecek apakah a lebih besar dari b

        // - Buat string expression yang menggabungkan "Hello" dan "World"
        String greeting = "Hello" + " World";

        // - Buat method call expression menggunakan Math.pow(2, 3)
        double powerResult = Math.pow(2, 3);

        // - Print semua hasil expression dengan label yang deskriptif
        System.out.println("Sum of a and b: " + sum);
        System.out.println("Product of a and b: " + product);
        System.out.println("Is a greater than b?: " + true);
        System.out.println("Greeting: " + greeting);
        System.out.println("2 raised to power 3: " + powerResult);

        // ===== STATEMENTS =====
        System.out.println("\n=== STATEMENTS ===");

        // Latihan 2: Buat berbagai jenis statements
        // - Buat declaration statement untuk variabel integer 'score'

        // - Buat assignment statement untuk memberikan nilai 85 ke score

        // - Buat conditional statement yang mencetak "Pass" jika score >= 60, "Fail" jika sebaliknya
        System.out.println("Pass");

        // - Buat loop statement yang mencetak angka 1 sampai 3
        for (int i = 1; i <= 3; i++) {
            System.out.println("Loop iteration: " + i);
        }

        // ===== BLOCKS =====
        System.out.println("\n=== BLOCKS ===");

        // Latihan 3: Buat dan gunakan blocks
        int x = 15;

        // - Buat if block yang mengecek apakah x > 10
        // Di dalam block, deklarasikan variabel 'category' dan assign "High"
        // Print kedua nilai x dan category
        String category = "High";
        System.out.println("x = " + x);
        System.out.println("Category = " + category);

        // - Buat for loop block yang melakukan iterasi 3 kali
        // Di dalam block, deklarasikan variabel 'iteration' yang menunjukkan nomor loop saat ini
        // Print nomor iterasi
        for (int i = 1; i <= 3; i++) {
            System.out.println("Iteration number: " + i);
        }

        // Latihan 4: Demonstrasikan variable scope dengan blocks
        int outerVariable = 100;

        {
            // - Di dalam block ini, deklarasikan variabel 'innerVariable' dengan nilai 50
            int innerVariable = 50;

            // - Print kedua outerVariable dan innerVariable
            System.out.println("Inside block:");
            System.out.println("outerVariable = " + outerVariable);
            System.out.println("innerVariable = " + innerVariable);

            // - Modifikasi outerVariable di dalam block ini (tambahkan 25)
            outerVariable += 25;
        }

        // - Print outerVariable setelah block (seharusnya menunjukkan nilai yang sudah dimodifikasi)
        System.out.println("outerVariable after block = " + outerVariable);

        // - Coba print innerVariable di sini - apa yang terjadi? (Comment baris ini setelah testing)
        // System.out.println("innerVariable = " + innerVariable);
    }
}
