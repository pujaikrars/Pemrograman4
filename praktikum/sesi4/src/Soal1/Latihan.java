public class Latihan{ /*mendeklarasikan sebuah class dengan nama Latihan yang bersifat public 
sehingga dapat diakses dari dalam maupun luar class*/

	public static void main(String[] args){/*mendeklarasikan suatu method bernama main yang akan
	 pertama diakses ketika program dieksekusi, method ini menggunakan keyword void sehingga tidak mengembalikan nilai apapun 
	 dan dapat diakses dari dalam maupun luar karena bersifat public*/
	 
		int age = 21; //mendeklarasikan variable bernama age dengan tipe data integer dan nilai 21
		
		System.out.println(age > 50 ? "You are old" : "You are young"); /*Disebut operator ternary. Jika kondisi 
		bernilai benar (true) maka akan menghasilkan pernyataan "You are old" dan jika salah (false) akan menghasilkan penyataan
		"You are young".*/
	}
}