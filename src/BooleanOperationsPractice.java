public class BooleanOperationsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operasi Boolean
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * operator boolean, operasi logika, dan evaluasi short-circuit.
         */

        // ===== OPERATOR BOOLEAN DASAR =====
        System.out.println("=== OPERATOR BOOLEAN DASAR ===");

        // Latihan 1: Berlatih operator AND (&&)

        boolean canAccessAdminPanel = false;
        System.out.println("User can access admin panel: " + canAccessAdminPanel);

        System.out.println("true && true = " + (true));
        System.out.println("true && false = " + (false));
        System.out.println("false && true = " + (false));
        System.out.println("false && false = " + (false));

        // Latihan 2: Berlatih operator OR (||)

        boolean isDayOff = true;
        System.out.println("Is it day off? " + isDayOff);

        System.out.println("true || true = " + (true));
        System.out.println("true || false = " + (true));
        System.out.println("false || true = " + (true));
        System.out.println("false || false = " + (false));

        // Latihan 3: Berlatih operator NOT (!)

        boolean isSunny = false;
        System.out.println("Is it sunny? " + isSunny);

        boolean doubleNot = true;
        System.out.println("Double NOT on isRaining: " + doubleNot);

        boolean notComparison = false;
        System.out.println("!(5 > 3) = " + notComparison);

        // ===== EKSPRESI BOOLEAN GABUNGAN =====
        System.out.println("\n=== EKSPRESI BOOLEAN GABUNGAN ===");

        // Latihan 4: Gabungkan beberapa operator boolean

        boolean siswaOutstanding = false;
        System.out.println("Siswa outstanding: " + siswaOutstanding);

        boolean siswaMemuaskan = true;
        System.out.println("Siswa memuaskan: " + siswaMemuaskan);

        boolean perluPerbaikan = false;
        System.out.println("Perlu perbaikan: " + perluPerbaikan);

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\n=== APLIKASI PRAKTIS ===");

        // Latihan 5: Sistem kontrol akses
        boolean isAuthorizedTime = true;
        boolean aksesNormal = false;
        System.out.println("Akses normal: " + aksesNormal);

        System.out.println("Akses darurat: " + isAuthorizedTime);

        boolean aksesDitolak = false;
        System.out.println("Akses ditolak: " + aksesDitolak);

        // Latihan 6: Pengambilan keputusan berdasarkan cuaca

        // reuse variable

        boolean cuacaBagus = false;
        System.out.println("Cuaca bagus untuk outdoor: " + cuacaBagus);

        boolean butuhPayung = false;
        System.out.println("Butuh payung: " + butuhPayung);

        boolean jalanBerbahaya = true;
        System.out.println("Jalan mungkin berbahaya: " + jalanBerbahaya);

        // ===== EVALUASI SHORT-CIRCUIT =====
        System.out.println("\n=== EVALUASI SHORT-CIRCUIT ===");

        // Latihan 7: Demonstrasikan perilaku short-circuit dengan AND

        boolean safeAnd = false;
        System.out.println("(b != 0) && (a / b > 2): " + safeAnd);

        boolean safeOr = true;
        System.out.println("(b == 0) || (a / b > 2): " + safeOr);

        // Latihan 8: Short-circuit dengan pemanggilan method (simulasi)

        System.out.println("expensiveCheck1 && expensiveCheck2 = " + false);

        System.out.println("expensiveCheck2 || expensiveCheck1 = " + true);
    }
}