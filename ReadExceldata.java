package Day1;

public class ReadExceldata {

	public static void main(String[] args) {
		
		Exceldataconfig excel = new Exceldataconfig ("C:\\Users\\vaidyat1\\Desktop\\Testdata.xlsx");
		System.out.println(excel.getData(0, 1, 2));

	}

}
