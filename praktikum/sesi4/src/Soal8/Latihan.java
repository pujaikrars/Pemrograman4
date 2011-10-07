public class Latihan{/*mendeklarasikan sebuah class dengan nama Latihan yang bersifat public 
sehingga dapat diakses dari dalam maupun luar class*/

	public static void main(String args[]){/*mendeklarasikan suatu method bernama main yang akan
	 pertama diakses ketika program dieksekusi, method ini menggunakan keyword void sehingga tidak mengembalikan nilai apapun 
	 dan dapat diakses dari dalam maupun luar karena bersifat public*/
	 
		int count = 1; //mendeklarasikan variable bernama count dengan tipe data integer dan nilai 1
		
		while(count < 5){
			System.out.println("Count is equal to " + count);
			count++;
		}
	}
}