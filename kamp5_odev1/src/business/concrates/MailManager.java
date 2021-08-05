package business.concrates;

import java.util.ArrayList;
import java.util.List;

import business.abstracts.MailService;
import entities.concrates.EticaretInfo;

public class MailManager implements MailService{
	
	List<String> listOfEmail = new ArrayList<String>();

	
	private List<String> emails;
	@Override
	public boolean mailEmail(EticaretInfo eticaretInfo) {
				String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
			      boolean result = eticaretInfo.getePosta().matches(regex);
			      if(result) {
			         return true;
			      } else {
			         return false;
			      }
	}

	@Override
	public boolean emailKullanimKntrl(EticaretInfo eticaretInfo) {
		
		
		if (listOfEmail.contains(eticaretInfo.getePosta())) {
			System.out.println("Bu mail adresi ile sisteme daha önce kayıt olunmuş, farklı bir mail adresi deneyiniz.");
			return false;
		}else{
			listOfEmail.add(eticaretInfo.getePosta());
			return true;
		}		
		
		
		
	}

}
