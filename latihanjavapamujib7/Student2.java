public class Student2 {
    String nama;
    int kredit;
    double ip;
    double poinMutu;

    public Student2(String nama, int kredit, double poinMutu) {
        this.nama = nama;
        this.kredit = kredit;
        this.poinMutu = poinMutu;
        this.ip = (kredit > 0) ? (poinMutu / kredit) : 0.0;
    }

    public double getIP() {
        if (kredit == 0) {
            return 0.0;
        }
        this.ip = poinMutu / kredit;
        return this.ip;
    }

    public void tambahNilai(int kreditBaru, double poinMutuBaru) {
        this.kredit += kreditBaru;
        this.poinMutu += poinMutuBaru;
        this.ip = (this.kredit > 0) ? (this.poinMutu / this.kredit) : 0.0;
    }

    public static void main(String[] args) {
        Student2 maryJones = new Student2("Mary Jones", 14, 46);
        Student2 johnStiner = new Student2("John Stiner", 60, 173);
        Student2 ariSamala = new Student2("Ari Samala", 31, 69);

        System.out.println("=== Data Awal (Nomor 5) ===");
        System.out.println(maryJones.nama + " | Kredit: " + maryJones.kredit + " | Poin Mutu: " + maryJones.poinMutu + " | IP: " + maryJones.getIP());
        System.out.println(johnStiner.nama + " | Kredit: " + johnStiner.kredit + " | Poin Mutu: " + johnStiner.poinMutu + " | IP: " + johnStiner.getIP());
        System.out.println(ariSamala.nama + " | Kredit: " + ariSamala.kredit + " | Poin Mutu: " + ariSamala.poinMutu + " | IP: " + ariSamala.getIP());

        ariSamala.kredit = ariSamala.kredit + 13;
        ariSamala.poinMutu = ariSamala.poinMutu + 52;
        ariSamala.ip = ariSamala.poinMutu / ariSamala.kredit;

        System.out.println("\n=== Setelah Update Ari Samala (Nomor 6) ===");
        System.out.println(ariSamala.nama + " | Kredit: " + ariSamala.kredit + " | Poin Mutu: " + ariSamala.poinMutu + " | IP: " + ariSamala.ip);
    }
}