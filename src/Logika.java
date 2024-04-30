public class Logika {
    public static void main(String[] args) {
        int nilaiKelulusan = 50;
        int nilaiKehadiran = 75;
        int nilaiMhs = 60;

        boolean lulus = (nilaiMhs >= nilaiKelulusan ) && (nilaiKehadiran >= nilaiMhs);
        if (lulus) {
            System.out.println(" lulus ");
        } else {
            System.out.println("tidak lulus ");
        }

    }
}

