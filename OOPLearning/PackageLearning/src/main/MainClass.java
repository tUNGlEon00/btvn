package main;

import Shape.hinhchunhat;
import Shape.hinhtron;

public class MainClass {
    public static void main(String[] args){
            hinhchunhat hcn = new hinhchunhat();
            hinhtron ht = new hinhtron();

            hcn.nhapdulieu();
            hcn.tinhCV();
            hcn.tinhDT();
            hcn.inCV();
            hcn.inDT();

            System.out.println("\n\n");
            
            ht.NhapBanKinh();
            ht.tinhCV();
            ht.tinhDT();
            ht.inCV();
            ht.inDT();
    }
}
