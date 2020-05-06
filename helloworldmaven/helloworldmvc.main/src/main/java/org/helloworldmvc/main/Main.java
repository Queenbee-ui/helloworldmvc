package org.helloworldmvc.main;

import java.io.IOException;

import org.helloworldmvc.controller.Controller;
import org.helloworldmvc.model.DAOHelloWorld;
import org.helloworldmvc.model.Model;
import org.helloworldmvc.view.View;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		View view = new View();
		view.toString();
		
		Model model = new Model();
		model.toString();
		
		Controller controller = new Controller(view, model);
		controller.toString();
		
		DAOHelloWorld dao = new DAOHelloWorld(null);
		dao.readFile();
	}

}
