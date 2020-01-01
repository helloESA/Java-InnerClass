/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclasstugas;

/**
 *
 * @author Kelompok 1 OOP
 */
public class TokoKomputer {

    public void Laptop(){
        class Merek{
            String tipe = "Lenovo G400s", 
                   layar = "14 inch", 
                   spesifikasi = "RAM 2GB, Prosessor i3, Storage 500 GB";
            void isidata(){
                System.out.println("Tipe\t\t: "+tipe);
                System.out.println("Layar\t\t: "+layar);
                System.out.println("Spesifikasi\t: "+spesifikasi);
            }
        }
        Merek e = new Merek();
        e.isidata();
    }
    
    public static void main(String[] args) {
        // Deklarasi Class
        Komputer a = new Komputer();
        Komputer.Asus c = new Komputer.Asus();
        Komputer.Lenovo b = a.new Lenovo();
        TokoKomputer d = new TokoKomputer();
        
        
        System.out.println("-----------| Toko Komputer 'Serba Ada' |-----------");
        System.out.println("A. Komputer ");
        
        System.out.println("LENOVO");
        b.setTipe("L400");
        b.setLayar("14 inch");
        b.setKelengkapan("CPU, Monitor, Mouse, Keyboard\n");
        
        System.out.println("Tipe\t\t: "+b.getTipe());
        System.out.println("Layar\t\t: "+b.getLayar());
        System.out.println("Kelengkapan\t: "+b.getKelengkapan());
        
        System.out.println("ASUS");
        c.setTipe("B992");
        c.setLayar("21 inch");
        c.setKelengkapan("CPU, Monitor, Mouse, Keyboard, Webcam");
        
        System.out.println("Tipe\t\t:"+c.getTipe());
        System.out.println("Layar\t\t: "+c.getLayar());
        System.out.println("Kelengkapan\t: "+c.getKelengkapan());
        System.out.println("----------------------------------------------------");
        System.out.println("B. Laptop");
        d.Laptop();
        System.out.println("");
        Laptop f = new Laptop() {
            @Override
            public void merek(String tipe, String layar, String spesifikasi) {
                System.out.println("Tipe\t\t: "+tipe);
                System.out.println("Layar\t\t: "+layar);
                System.out.println("Spesifikasi\t: "+spesifikasi);
            }
        };
        f.merek("Lenovo G440s", "11 inch", "RAM 2GB, Prosessor Intel Celeron, Storage 320GB");
    }
    
}
