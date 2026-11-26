public class LatihanNo5 {
    public static void main(String[] args) {
        // Membuat 3 instance dari class Student sesuai tabel nomor 5
        Student maryJones = new Student("Mary Jones", 14, 46);
        Student johnStiner = new Student("John Stiner", 60, 173);
        Student ariSamala = new Student("Ari Samala", 31, 69);

        // Menampilkan data ketiga instance untuk memastikan sudah terbuat
        System.out.println("Nama: " + maryJones.getNama() + " | Kredit: " + maryJones.getKredit() + " | Poin Mutu: " + maryJones.getPoinMutu() + " | IP: " + maryJones.getIP());
        System.out.println("Nama: " + johnStiner.getNama() + " | Kredit: " + johnStiner.getKredit() + " | Poin Mutu: " + johnStiner.getPoinMutu() + " | IP: " + johnStiner.getIP());
        System.out.println("Nama: " + ariSamala.getNama() + " | Kredit: " + ariSamala.getKredit() + " | Poin Mutu: " + ariSamala.getPoinMutu() + " | IP: " + ariSamala.getIP());
    }
}