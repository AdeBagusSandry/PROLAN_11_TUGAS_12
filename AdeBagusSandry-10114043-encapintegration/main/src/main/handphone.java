public class handphone 
{
 private String tipe;
 private String warna;
 private int harga;
 private String jenishandphone;

    public String getjenishandphone() {
        return jenishandphone;
    }

    public void setjenishandphone(String jenishandphone) {
        this.jenishandphone = jenishandphone;
    }

    public int getharga() {
        return harga;
    }

    public void setharga (int harga) {
        this.harga = harga;
    }

    public String getTipe() {
        return tipe;
    }

    public void settipe(String tipe) {
        this.tipe = tipe;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
 
    public void stok(){
       System.out.print("STOK TERSEDIA: ");
   }
   public void garansi(){
       System.out.print("GARANSI: ");
   }
    public void jenishandphone(){
       System.out.print("JENIS Tipe: ");
   }
   
      
  
 public void tampilkandata(){
	        System.out.println("MEREK HANDPHONE :"+getTipe());
        System.out.println("WARNA HANDPHONE:"+getWarna());
        System.out.println("Harga :"+getharga());
        System.out.println("JENIS HANDPHONE :"+getjenishandphone());
            
		 }

 public void inputData(String m,String w,String j,int jp){
     settipe(m);
     setWarna(w);
     setjenishandphone(j);
     setharga(jp);
     
 }
}