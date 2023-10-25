
package tn.esprit.rh.achat.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.rh.achat.AchatApplication;
import tn.esprit.rh.achat.entities.Reglement;
import tn.esprit.rh.achat.services.IFactureService;
import tn.esprit.rh.achat.services.IReglementService;

@SpringBootTest(classes = AchatApplication.class)
@TestMethodOrder(OrderAnnotation.class)

public class ReglementJunitTest {
	
	
	@Autowired
	IReglementService regServ;

	@Autowired
	IFactureService fff;
	  
	  @Test
	  @Order(1)

	 
	  void addReglement() {
		  
		  Date date = new GregorianCalendar(2013, Calendar.FEBRUARY, 11).getTime();
		  
		  Reglement s1 = new Reglement();
		  s1.setMontantPaye(50f);
		  s1.setMontantRestant(30f);
		  s1.setPayee(true);
		  s1.setDateReglement(date);
		  
	      Reglement savedReg1= regServ.addReglement(s1);
	      assertEquals(s1.getMontantPaye(), savedReg1.getMontantPaye());
	  }

	  @Test
	  void retrieveAllReglements() {
	      List<Reglement> listRegs = regServ.retrieveAllReglements();
	      Assertions.assertNotNull(listRegs);
	  }
  
	  @Test
	  void retrieveReglement() {
		  regServ.retrieveReglement(1L);
	  }

	  @Test
	  void retrieveReglementByFacture() {
		  regServ.retrieveReglementByFacture(1L);
	  }
	  

//	@Test
//	  void getChiffreAffaireEntreDeuxDate() {
//		  Date startDate = new GregorianCalendar(2022, Calendar.NOVEMBER, 1).getTime();
//		  Date endDate = new GregorianCalendar(2022, Calendar.NOVEMBER, 30).getTime();
//		  
//		  regServ.getChiffreAffaireEntreDeuxDate(startDate,endDate);
//	  }
	
	  

}
