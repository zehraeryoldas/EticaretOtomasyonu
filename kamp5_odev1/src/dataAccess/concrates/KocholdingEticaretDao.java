package dataAccess.concrates;

import java.util.List;

import dataAccess.abstracts.EticaretDao;
import entities.concrates.EticaretInfo;

public class KocholdingEticaretDao implements EticaretDao{
	

	@Override
	public void add(EticaretInfo eticaretInfo) {
		// TODO Auto-generated method stub
		System.out.println("eklendi :"+eticaretInfo.getFirstName());
		
	}

	@Override
	public void delete(EticaretInfo eticaretInfo) {
		// TODO Auto-generated method stub
		System.out.println("silindi :"+eticaretInfo.getFirstName());
		
	}

	@Override
	public void update(EticaretInfo eticaretInfo) {
		// TODO Auto-generated method stub
		System.out.println("güncellendi :"+eticaretInfo.getFirstName());
		
	}

	@Override
	public List<EticaretInfo> getAll(EticaretInfo eticaretInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getEmail(EticaretInfo eticaretInfo) {
		// TODO Auto-generated method stub
		System.out.println("e posta dogrulandi :"+eticaretInfo.getFirstName());
		return false;
	}

}
