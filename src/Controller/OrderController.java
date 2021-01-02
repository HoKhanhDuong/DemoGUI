package Controller;

import Manager.Application;
import Object.OrderObject;
import user.Payment;

public class OrderController {

	private Application application;
	
	private final int SIZE = 10000;
	OrderObject orderObject;
	public OrderController(Application application) {
		// TODO Auto-generated constructor stub
		this.application = application;
	}
	public void saveOrder(OrderObject orderObject) {
		application.connect.saveOrder(orderObject, application.getID(), application.cart.listp);
		Payment payment = new Payment(application, orderObject.total);
		application.switchPanel(application.home);
	}
}
