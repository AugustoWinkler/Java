package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {
	
	
	@FXML
	
	private Circle myCircle;
	private double x;
	private double y;
	
	public void up(ActionEvent e) {

		myCircle.setCenterY(y-=3);
	}
	public void right(ActionEvent e) {

		myCircle.setCenterX(x+=3);
	}
	public void down(ActionEvent e) {
		myCircle.setCenterY(y+=3);
	}
	public void left(ActionEvent e) {
		System.out.println("Left");
		myCircle.setCenterX(x-=3);
	}




}
