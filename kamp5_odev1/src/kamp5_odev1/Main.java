package kamp5_odev1;

import business.abstracts.EticaretService;
import business.concrates.EticaretManager;
import business.concrates.MailManager;
import core.EpostaDogManagerAdaptor;
import dataAccess.concrates.KocholdingEticaretDao;
import entities.concrates.EticaretInfo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EticaretService eticaretService = new EticaretManager(new KocholdingEticaretDao(),new MailManager(),new EpostaDogManagerAdaptor());
		
		EticaretInfo eticaretInfo = new EticaretInfo();
		eticaretInfo.setFirstName("zehra");
		eticaretInfo.setLastName("er");
		eticaretInfo.setePosta("zery@gmail.com");
		eticaretInfo.setPassword("fggsdfsdfsd");
		
		EticaretInfo eticaretInfo2 = new EticaretInfo();
		eticaretInfo2.setFirstName("zehra");
		eticaretInfo2.setLastName("yoldas");
		eticaretInfo2.setePosta("gkoc5@gmail.com");
		eticaretInfo2.setPassword("fggsdfsdfsd");
		
		eticaretService.add(eticaretInfo);
		eticaretService.add(eticaretInfo2);

	}

}
