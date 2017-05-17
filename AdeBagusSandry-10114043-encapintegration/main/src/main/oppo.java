public class oppo extends handphone {
	        
			@Override
  public void stok(){
        super.stok();
        System.out.println("13");
   
  }
  	@Override
    public void garansi(){
        super.garansi();
        System.out.println("Bergarasi 1 Tahun");
   
  }
  	@Override
    public void jenishandphone(){
        super.jenishandphone();
        System.out.println("OPPO F1 ");
   
  }
public void tampilkan(){
        
   

     handphone m = new handphone();

     m.inputData("OPPO F1 ", "PUTIH", "SMARTPHOE",4000000);
     m.tampilkandata();

 
    
}    
}