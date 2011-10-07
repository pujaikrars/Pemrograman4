public class Latihan{/*mendeklarasikan sebuah class dengan nama Latihan yang bersifat public 
sehingga dapat diakses dari dalam maupun luar class*/

	public static void main(String args[]){/*mendeklarasikan suatu method bernama main yang akan
	 pertama diakses ketika program dieksekusi, method ini menggunakan keyword void sehingga tidak mengembalikan nilai apapun 
	 dan dapat diakses dari dalam maupun luar karena bersifat public*/
	 
		int firstNumber, secondNumber, results; //mendeklarasikan variable firstNumber, secondNumber dan 
		firstNumber = 20; //results dengan tipe data integer dan bernilai masing - masing 20 dan 10.
		secondNumber = 10; //tetapi untuk results hanya dideklarasikan saja tanpa nilai.
		results = firstNumber + secondNumber; //hasil dari penambahan firstNumber dan secondNumber
		System.out.println(results); //mengeluarkan hasil dari results
	}
}