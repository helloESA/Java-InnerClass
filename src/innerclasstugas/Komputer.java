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
public class Komputer {
    public class Lenovo{
        String tipe, layar, kelengkapan;

        public String getTipe() {
            return tipe;
        }

        public void setTipe(String tipe) {
            this.tipe = tipe;
        }

        public String getLayar() {
            return layar;
        }

        public void setLayar(String layar) {
            this.layar = layar;
        }

        public String getKelengkapan() {
            return kelengkapan;
        }

        public void setKelengkapan(String kelengkapan) {
            this.kelengkapan = kelengkapan;
        }

        
    }
    
    public static class Asus{
        String tipe, layar, kelengkapan;

        public String getTipe() {
            return tipe;
        }

        public void setTipe(String tipe) {
            this.tipe = tipe;
        }

        public String getLayar() {
            return layar;
        }

        public void setLayar(String layar) {
            this.layar = layar;
        }

        public String getKelengkapan() {
            return kelengkapan;
        }

        public void setKelengkapan(String kelengkapan) {
            this.kelengkapan = kelengkapan;
        }

        
        
    }
}
