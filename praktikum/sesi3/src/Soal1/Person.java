public class Person{ /*mendeklarasikan sebuah class dengan nama Person yang bersifat public 
sehingga dapat diakses dari dalam maupun luar class*/
	public static void main(String[] args){/*mendeklarasikan suatu method bernama main yang akan
	 pertama diakses ketika program dieksekusi, method ini menggunakan keyword void sehingga tidak mengembalikan nilai apapun 
	 dan dapat diakses dari dalam maupun luar karena bersifat public*/
		int value = 10; //mendeklarasikan variable bernama value dengan tipe data integer dan nilai 10
		char x; //mendeklarasikan variable x dengan tipe data character
		x = 'A'; //memberikan nilai A ke dalam variable x
		
		System.out.println(value); //menampilkan output dalam satu baris line dari nilai variable value
		System.out.println("The value of x= " + x);//menampilkan output berupa tulisan dan disertai nilai dari variable x
	}
}
