
package praktikumod3;
import java.util.Scanner;

public class subclass extends superclass{
    static String Alamat;
    static String Jurusan;
    
    public static String getAlamat(){
        return Alamat;
    }
    
    public static void setAlamat(String Alamat){
        subclass.Alamat = Alamat;
    }
    
    public static String getJurusan(){  
    Scanner input = new Scanner(System.in);
    switch(Jurusan){
    case "61":
    System.out.println("Data Mahasiswa");  
    System.out.println("Universitas : " + subclass.getUniversitas());
    System.out.println("NIM         : " + superclass.getNim());
    System.out.println("Nama        : " + superclass.getNama());
    System.out.println("Alamat      : " + subclass.getAlamat());
    System.out.println("Jurusan     : Matematika");
    break;
        case "62":
    System.out.println("Data Mahasiswa");
    System.out.println("Universitas : " + subclass.getUniversitas());
    System.out.println("Nim : " + superclass.getNim());
    System.out.println("Nama : " + superclass.getNama());
    System.out.println("Alamat : " + subclass.getAlamat());
    System.out.println("Jurusan : Biologi");
    break;
        case "63":
    System.out.println("Data Mahasiswa");
    System.out.println("Universitas : " + subclass.getUniversitas());
    System.out.println("NIM : " + superclass.getNim());
    System.out.println("Nama : " + superclass.getNama());
    System.out.println("Alamat : " + subclass.getAlamat());
    System.out.println("Jurusan : Kimia");
    break;
        case "64":
    System.out.println("Data Mahasiswa");
    System.out.println("Universitas : " + subclass.getUniversitas());
    System.out.println("NIM : " + superclass.getNim());
    System.out.println("Nama : " + superclass.getNama());
    System.out.println("Alamat : " + subclass.getAlamat());
    System.out.println("Jurusan : Fisika");
    break;
        case "65":;
    System.out.println("Data Mahasiswa");
    System.out.println("UNIVERSITAS : " + subclass.getUniversitas());
    System.out.println("NIM : " + superclass.getNim());
    System.out.println("Nama : " + superclass.getNama());
    System.out.println("Alamat : " + subclass.getAlamat());
    System.out.println("Jurusan : Teknik informatika");
    break;
        case "66":
    System.out.println("Data Mahasiswa");
    System.out.println("Universitas : " + subclass.getUniversitas());
    System.out.println("NIM : " + superclass.getNim());
    System.out.println("Nama : " + superclass.getNama());
    System.out.println("Alamat : " + subclass.getAlamat());
    System.out.println("Jurusan : Sistem Informasi");
    break;
        default :
        System.out.println("Kode yang anda masukkan salah");
        System.out.print("Silahkan masukkan ulang : "); Jurusan = input.nextLine();getJurusan();             
        }
        return Jurusan;
    }
    public static void setJurusan(String Jurusan){
        subclass.Jurusan = Jurusan;
    }
}
