public class IncremenDecremen {
    public static void main(String[] args) {
        int angka = 5;

        //operator dekrement
        System.out.println("Nilai awal angka"+ angka);
        angka++;
        System.out.println("Nilai seleteh Incrrement"+ angka);

        //operator dekrement
        angka--;
        System.out.println("Nilai setelah Dekrement"+ angka);

        //contoh lain dengan prefik inkrement dan dekrement
        int nilai =10;
        System.out.println("Nilai awal nilai"+ nilai);
        int hasilIncrement = ++nilai;
        System.out.println("nilai setelah ikrement"+ hasilIncrement);

        int hasilDekremet = --nilai;
        System.out.println("Nilai setelah prefik dekrement"+hasilDekremet);
    }
}
