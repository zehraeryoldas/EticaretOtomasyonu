package business.abstracts;

import entities.concrates.EticaretInfo;

public interface MailService {
	boolean mailEmail(EticaretInfo eticaretInfo);
	boolean emailKullanimKntrl(EticaretInfo eticaretInfo);

}
