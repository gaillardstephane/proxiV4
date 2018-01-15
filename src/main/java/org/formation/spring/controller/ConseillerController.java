package org.formation.spring.controller;

import java.lang.ProcessBuilder.Redirect;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConseillerController {

	
@Autowired
private IServiceConseiller serviceConseiller; 


@RequestMapping(value="/index",method=RequestMethod.POST)
public ModelAndView sidentifier(HttpServletRequest request, HttpServletResponse response) {
	
	String selogger = request.getParameter("login");
	String motDePasse = request.getParameter("password");
		
	
	Conseiller cons = serviceConseiller.getConseillerByLogin(selogger); 
	
	if (selogger.equals(cons.getLoginConseiller()) && motDePasse.equals(cons.getmotDePasse())) {
		
		return new ModelAndView("displayClients","clients",clients); 

	} else {
		
		return new ModelAndView("index"); 
	}
	
	
	
	
}

}
