package praktikumod3;

import java.util.Scanner;
public class mainprogram {
public static void main(String[] args){ 

String ul ="y";
while (ul.equals("y")){
Scanner input = new Scanner(System.in);
           
     System.out.println("Input Data ");         
     System.out.print("Universitas : "); subclass.Univ = input.nextLine();
     System.out.print("NIM         : "); subclass.NIM = input.nextLine();
     System.out.print("Nama        : "); subclass.Name = input.nextLine();
     System.out.print("Alamat      : "); subclass.Alamat = input.nextLine();          
     System.out.println("Kode Jurusan");
     System.out.println("matematika   (61)");
     System.out.println("Biologi      (62)");
     System.out.println("Kimia        (63)");
     System.out.println("Fisika       (64)");
     System.out.println("Teknik Iformatika (65)");
     System.out.println("Sistem Informasi (66)");
     
     
     System.out.print("Input kode Jurusan : "); subclass.Jurusan = input.nextLine();
            
     subclass.getJurusan();         
     System.out.println("apakah anda ingin memasukkan lagi ?");     
     System.out.println("Jika iya masukkan (y) & jika tidak masukkan (t)");
            ul = input.nextLine();
                if (ul.startsWith("y")){
                    ul="y";
                }
                else{
                    System.out.println("Selesai");  
                    }
        }   
    }
}
