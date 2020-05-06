package org.helloworldmvc.view;

import org.helloworldmvc.Contract.IView;

public class View implements IView{
	
	@Override
	public void displayMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
	}
	
}
