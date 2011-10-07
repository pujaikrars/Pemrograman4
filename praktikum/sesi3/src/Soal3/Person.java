public class Person{ /*mendeklarasikan sebuah class dengan nama Person yang bersifat public 
sehingga dapat diakses dari dalam maupun luar class*/
	public static void main(String[] args){ /*mendeklarasikan suatu method bernama main yang akan
	 pertama diakses ketika program dieksekusi , method ini menggunakan keyword void sehingga tidak mengembalikan nilai apapun 
	 dan dapat diakses dari dalam maupun luar karena bersifat public*/
		int ourfirstnumber = 10; //mendeklarasikan suatu variable dengan nama ourfirstnumber dengan tipe data integer dan nilai 10
		double ourfirstdouble = 10; //mendeklarasikan suatu variable dengan nama ourfirstdouble dengan tipe data double dan nilai 10
		
		System.out.println(ourfirstnumber); //menampilan output berupa nilai dari variable ourfirstnumber dalam satu baris
		System.out.println(ourfirstdouble); //menampilan output berupa nilai dari variable ourfirstdouble dalam satu baris
	}
}
