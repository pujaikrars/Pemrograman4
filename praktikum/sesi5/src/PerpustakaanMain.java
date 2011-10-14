import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PerpustakaanMain{
	public static void main(String[] args)throws Exception{
		File file = new File("Perpustakaan.txt");
		File file2 = new File("Hasil.txt");
		FileWriter fos = null;
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		List<Perpustakaan> listPerpustakaan = new ArrayList<Perpustakaan>();
		try{
			fis = new FileInputStream(file);
			fos = new FileWriter(file2);
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
			int count = 0;
			
			while(dis.available() !=0){
				count++;
				String line = dis.readLine();
				String[] data = line.split(",");
				
				Perpustakaan p = new Perpustakaan();
				p.setJumlah(count);
				p.setId(data[0]);
				p.setPeminjam(data[1]);
				p.setJudul(data[2]);
				
				listPerpustakaan.add(p);
			}
		} catch(IOException ex){
			System.out.println("File " + file.getName() + " tidak ketemu !");
			System.out.println("Exception : " + ex.getMessage());
		}
		
		for(Perpustakaan perpus : listPerpustakaan){
		
			System.out.println("=====================================");
			fos.write("=====================================\r\n");
			fos.write("ID : " + perpus.getId() + "\r\n");
			fos.write("Penyewa : " + perpus.getPeminjam() + "\r\n");
			fos.write("Judul : " + perpus.getJudul() + "\r\n");
			fos.write("Jumlah : " + perpus.getJumlah() + "\r\n");
			System.out.println("ID : " + perpus.getId());
			System.out.println("Penyewa : " + perpus.getPeminjam());
			System.out.println("Judul : " + perpus.getJudul());
			System.out.println("Jumlah : " + perpus.getJumlah());
		}
		
		fos.close();
	}
}