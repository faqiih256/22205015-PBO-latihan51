
package pkg22205015.pbo.lat51;
//
// * Nama         : Ahmad Nurfaqih
// * Nim          : 22205015
// * prodi        : Teknik Informatia
// * Deskripsi    : Gaji Karyawan
import java.util.Scanner;
class Karyawan {
    protected String nik;
    protected String nama;
    protected String jabatan;
    protected int golongan;

    public Karyawan() {
    }

    public Karyawan(String nik, String nama, String jabatan, int golongan) {
        this.nik = nik;
        this.nama = nama;
        this.jabatan = jabatan;
        this.golongan = golongan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public int getGolongan() {
        return golongan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }

}

class Manager extends Karyawan{
  
    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;

    public Manager() {
    }

    public Manager(int kehadiran, float tunjanganGolongan, float tunjanganJabatan, float tunjanganKehadiran, String nik, String nama, String jabatan, int golongan) {
        super(nik, nama, jabatan, golongan);
        this.kehadiran = kehadiran;
        this.tunjanganGolongan = tunjanganGolongan;
        this.tunjanganJabatan = tunjanganJabatan;
        this.tunjanganKehadiran = tunjanganKehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public int getKehadiran() {
        return kehadiran;
    }
    
    public float tunjanganKehadiran(int hadir){
        if (hadir >= 1){
            return hadir*10000;
            
        }
        else{
            return 0;
        }
        
    }
    
    public float tunjanganJabatan(String jabatan){
       
        switch (jabatan.toLowerCase()) {
            case "manager":
                return 2000000;
                
            case "kabag":
                return  1000000;
                
            default:
                return  0;
                
        }      
    }
    
    public float tunjanganGolongan(int golongan){
        
        switch (golongan){
            case 1 : 
                return 500000;
            case 2 : 
                return 1000000;
            case 3 : 
                return 1500000;
            
            default : tunjanganGolongan = 0;
        }
        
        return golongan;
    }
    
    public float gajiTotal(){
        
        float gajiTotal = tunjanganJabatan(jabatan) + tunjanganGolongan(golongan) + tunjanganKehadiran(getKehadiran());
        return gajiTotal;
    }
}  
public class PBOLAT51 {
    public static void main(String[] args) {
        
        System.out.println("===LATIHAN 51===\n");
        Scanner scanner = new Scanner(System.in);
        Manager karyawan1 = new Manager();
               
        System.out.println("====Program Perhitungan Gaji Karyawan===");
        System.out.print("Masukkan NIK : ");
        karyawan1.setNik(scanner.nextLine());
        System.out.print("Masukkan Nama: ");
        karyawan1.setNama(scanner.nextLine());
        System.out.print("Masukkan Golongan (1/2/3): ");
        karyawan1.setGolongan(scanner.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        karyawan1.setJabatan(scanner.next());
        System.out.print("Masukkan Jumlah Kehadiran \t : ");
        karyawan1.setKehadiran(scanner.nextInt());
        System.out.println("");
        
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK \t : " + karyawan1.getNik());
        System.out.println("NAMA \t : " + karyawan1.getNama());
        System.out.println("GOLONGAN  : " + karyawan1.getGolongan());
        System.out.println("JABATAN : " + karyawan1.getJabatan());
        System.out.println("");
        
                
        System.out.println("TUNJANGAN GOLONGAN \t\t : " + karyawan1.tunjanganGolongan(karyawan1.getGolongan()));
        System.out.println("TUNJANGAn JABATAN \t\t : " + karyawan1.tunjanganJabatan(karyawan1.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN \t\t : " + karyawan1.tunjanganKehadiran(karyawan1.getKehadiran()));
        System.out.println("");
        System.out.println("GAJI TOTAL \t\t\t : " + karyawan1.gajiTotal());
    }
    
}
