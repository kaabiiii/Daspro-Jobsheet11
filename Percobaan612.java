import java.util.Scanner;
public class Percobaan612 {
    static int hitungLuas (int pjg, int lb){
        int Luas = pjg*lb;
        return Luas;
    
       }
        static int hitungVolume (int tinggi, int a, int b){
        int volume = a*b*tinggi;
        return volume;
    
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int p,l,t,L,vol;

        System.out.println("Masukkan panjang");
        p = input.nextInt();
        System.out.println("Masukkan lebar");
        l = input.nextInt();
        System.out.println("Masukkan tinggi");
        t = input.nextInt();

        // L = p*l;
        // System.out.println("Luas persegi panjang adalah " + L);

        // vol = p*l*t;
        // System.out.println("Volume balok adalah " + vol);
       
        L = hitungLuas(p, l);
        System.out.println("Luas persegi Panjang adalah " + L);
        vol = hitungVolume(t, l, p);
        System.out.println("Volume balok adalah " + vol);

        

   }

}