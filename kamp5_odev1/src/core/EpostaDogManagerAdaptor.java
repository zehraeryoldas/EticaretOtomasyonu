package core;

import epostadogrulama.epostaDogManager;

public class EpostaDogManagerAdaptor implements EpostaDogService{

	@Override
	public boolean dogrulamaValidation() {
		// TODO Auto-generated method stub
		epostaDogManager dogManager = new epostaDogManager();
		dogManager.dogrulama();
		if(dogManager.dogrulama()==true) {
			return true;
		}
		else {
			return false;
		}
		
	}

}