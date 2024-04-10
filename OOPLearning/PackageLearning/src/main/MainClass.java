package main;

import Shape.hinhchunhat;
import Shape.hinhtron;

public class MainClass {
    
    public static void main(String[] args)
    {
       hinhtron ht = new hinhtron();
       hinhchunhat hcn = new hinhchunhat();

       ht.NhapBanKinh();
       ht.tinhCV();
       ht.tinhDT();
       ht.inCV();
       ht.inDT();

       System.out.println("\n");

       hcn.nhapdulieu();
       hcn.tinhCV();
       hcn.tinhDT();
       hcn.inCV();
       hcn.inDT();
    }

}
