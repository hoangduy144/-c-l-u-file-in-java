package hcmus.edu.vn.test;

import java.util.ArrayList;

import hcmus.edu.vn.io.SerializeFileFactory;
import hcmus.edu.vn.io.TextFileFactory;
import hcmus.edu.vn.model.KhachHang;

public class TestKhachHang2 {
	public static void testLuuFile()
	{
		ArrayList<KhachHang>dsKH = new ArrayList<KhachHang>();
		dsKH.add(new KhachHang("KH01","Nguyen Van A"));
		dsKH.add(new KhachHang("KH02","Nguyen Van B"));
		dsKH.add(new KhachHang("KH03","Nguyen Van C"));
		dsKH.add(new KhachHang("KH04","Nguyen Van D"));
		dsKH.add(new KhachHang("KH05","Nguyen Van E"));
		dsKH.add(new KhachHang("KH06","Nguyen Van F"));
		
		boolean kt = SerializeFileFactory.luuFile(dsKH, "D:\\dulieu2.txt");
		if(kt==true) {
			System.out.println("Da luu file thanh cong");
		}
		else {
			System.out.println("Luu file that bai");
		}
	}
	public static void main(String[] agrs)
	{
		//testLuuFile();
		ArrayList<KhachHang>dsKH=SerializeFileFactory.docFile("D:\\dulieu2.txt");
		System.out.println("Danh sach KH nap vao may tinh: ");
		System.out.println("ten\t ma");
		for(KhachHang kh:dsKH)
		{
			System.out.println(kh);
		}
	}
}
