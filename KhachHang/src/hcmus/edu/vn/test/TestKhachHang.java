package hcmus.edu.vn.test;

import java.util.ArrayList;

import hcmus.edu.vn.io.TextFileFactory;
import hcmus.edu.vn.model.KhachHang;

public class TestKhachHang {
	public static void testLuuFile()
	{
		ArrayList<KhachHang>dsKH = new ArrayList<KhachHang>();
		dsKH.add(new KhachHang("KH01","Nguyen Van A"));
		dsKH.add(new KhachHang("KH02","Nguyen Van B"));
		dsKH.add(new KhachHang("KH03","Nguyen Van C"));
		dsKH.add(new KhachHang("KH04","Nguyen Van D"));
		dsKH.add(new KhachHang("KH05","Nguyen Van E"));
		dsKH.add(new KhachHang("KH06","Nguyen Van F"));
		
		boolean kt = TextFileFactory.luuFile(dsKH, "D:\\dulieu.txt");
		if(kt==true) {
			System.out.println("Da luu file thanh cong");
		}
		else {
			System.out.println("Luu file that bai");
		}
	}
	public static void main(String[] args) {
		//testLuuFile();
		ArrayList<KhachHang>dsKH=TextFileFactory.docFile("D:\\dulieu.txt");
		System.out.println("Danh sach KH nap vao may tinh: ");
		System.out.println("ten\t ma");
		for(KhachHang kh:dsKH)
		{
			System.out.println(kh);
		}
	}
}
