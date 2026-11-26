public class Student {
    // Instance variables
    private String nama;
    private int kredit;
    private double ip;
    private double poinMutu;

    // Constructor method
    public Student(String nama, int kredit, double poinMutu) {
        this.nama = nama;
        this.kredit = kredit;
        this.poinMutu = poinMutu;
        this.ip = (kredit > 0) ? (poinMutu / kredit) : 0.0;
    }

    // 4a. Method mengembalikan rata-rata IP saat ini (poin mutu dibagi kredit)
    public double getIP() {
        if (kredit == 0) {
            return 0.0;
        }
        this.ip = poinMutu / kredit;
        return this.ip;
    }

    // 4b. Method menerima input kredit & poin mutu baru, lalu memperbarui kredit, poin mutu, dan IP
    public void tambahNilai(int kreditBaru, double poinMutuBaru) {
        this.kredit += kreditBaru;
        this.poinMutu += poinMutuBaru;
        this.ip = (this.kredit > 0) ? (this.poinMutu / this.kredit) : 0.0;
    }

    // Getter opsional untuk membantu menampilkan data
    public String getNama() {
        return nama;
    }

    public int getKredit() {
        return kredit;
    }

    public double getPoinMutu() {
        return poinMutu;
    }

    // Contoh pengujian class Student
    public static void main(String[] args) {
        Student mhs = new Student("Natasya", 20, 75.0);
        System.out.println("IP awal: " + mhs.getIP());

        mhs.tambahNilai(4, 15.0);
        System.out.println("Total kredit: " + mhs.getKredit());
        System.out.println("Total poin mutu: " + mhs.getPoinMutu());
        System.out.println("IP terbaru: " + mhs.getIP());
    }
}