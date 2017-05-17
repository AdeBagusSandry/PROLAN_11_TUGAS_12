public class iphone extends handphone {
public void tampilkan(){
     double stok =9;
     String garansi="1 TAHUN";
     String kategori="IPHONE";

     handphone m = new handphone();

     m.inputData("XIOMI REDMI 4", "PUTIH", "SMARTPHONE",7000000);
     m.tampilkandata();

      System.out.println("banyak nya stok:"+stok);
      System.out.println("Tipe garansi :"+garansi);
      System.out.println("Kategori Model :"+kategori);
    
}    
}