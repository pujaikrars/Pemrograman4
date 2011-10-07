public class Latihan{/*mendeklarasikan sebuah class dengan nama Latihan yang bersifat public 
sehingga dapat diakses dari dalam maupun luar class*/

	public static void main(String[] args){/*mendeklarasikan suatu method bernama main yang akan
	 pertama diakses ketika program dieksekusi, method ini menggunakan keyword void sehingga tidak mengembalikan nilai apapun 
	 dan dapat diakses dari dalam maupun luar karena bersifat public*/
	 
		System.out.println("Instr 1");
		if(1>2){
			System.out.println("Instr 2");
		} else{
			System.out.println("Instr 3");
		}
		System.out.println("Instr 4");
	}
}