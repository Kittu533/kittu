# kittu
nothing is zero
package algoritma;
import java.util.Scanner;
import java.util.LinkedList;

public class Algoritma {
static Scanner sc = new Scanner(System.in);
static LinkedList<String> list = new LinkedList<>();
    public static void main(String[] args) {
        // TODO code application logic here
        //CREAT NEW OBJECT
       
        while(true){
            
        System.out.println("Program Menu");
        System.out.println("1.Tambah Data");
        System.out.println("2.Tambah data diarea tertentu");
        System.out.println("3.Hapus data dengan posisi");
        System.out.println("4.Tampil semua data");
        System.out.println("5.Hapus semua data");
        System.out.println("0. Keluar Program");
        System.out.println("");
        System.out.print("Pilih : ");
        int pilih = sc.nextInt();
        sc.nextLine();
        
        if(pilih == 1){
            System.out.print("Nama : ");
            list.add(sc.nextLine());
        }else if(pilih == 2){
            System.out.print("indeks ke : ");
            int urut = sc.nextInt();
            System.out.print("Nama : ");
            list.add(urut,sc.next());
        }else if(pilih == 3){
            System.out.print("indeks ke : ");
            int urut = sc.nextInt();
            list.remove(urut);
        }else if(pilih == 4){
            System.out.println(list);
        }else if(pilih == 5){
            list.clear();
        }else {
            break;
        }
        }
        
    }
}
