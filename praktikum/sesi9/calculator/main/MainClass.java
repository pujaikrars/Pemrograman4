package main;
import service.CalculatorService;
import service.impl.CalculatorServiceImpl;
import java.io.*;


public class MainClass{

	public static void main(String[] args){
		try{
		CalculatorService service = new CalculatorServiceImpl();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
				System.out.println("Enter first num : ");
				String bil1 = reader.readLine();
				System.out.println("Enter second num : ");
				String bil2 = reader.readLine();
				
//				String operator = "+-*/";
				
				System.out.println("Masukan operator (*,-,*,/) : ");
				String op = reader.readLine();
				
				Integer nomor1= Integer.parseInt(bil1);
				Integer nomor2= Integer.parseInt(bil2); 
				
				
				int hasil = 0;
				if(op.equals("+")){
					hasil = service.tambah(nomor1, nomor2);
				}else if(op.equals("-") ){
					hasil = service.kurang(nomor1, nomor2);
				}else if(op.equals("*")){
					hasil = service.kali(nomor1, nomor2);
				}else if(op.equals("/")){
					hasil = service.bagi(nomor1, nomor2);
				}
				
				
				System.out.println(" ");
				System.out.println("Total Nilai : " + nomor1 +" "+ op +" "+ nomor2 + " = " + hasil);
			
		}catch(Exception e){
			System.out.println("error!!!");
		}	 
		
		
	}
}