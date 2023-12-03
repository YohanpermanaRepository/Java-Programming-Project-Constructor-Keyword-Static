
package praktikumod3;
public class superclass {
    static String Univ;
    static String NIM;
    static String Name;
    
    public static String getUniversitas(){
        return Univ;
    }   
    public static void setUniversitas(String Universitas){
        superclass.Univ = Universitas;
    }  
    public static String getNim(){
        return NIM;
    }  
    public static void setNIM(String NIM){
        superclass.NIM = NIM;
    }   
    public static String getNama(){
        return Name;
    }  
    public static void setNama(String Nama){
        superclass.Name = Nama;
    }
}
