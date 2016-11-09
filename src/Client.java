
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Approver a, b, c, d;
		a = new Director("aaa");
		b = new VicePresident("bbb");
		c = new President("ccc");
		d = new Congress("ddd");
		
		a.setSuccessor(b);
		b.setSuccessor(c);
		c.setSuccessor(d);
		
		PurchaseRequest pr1 = new PurchaseRequest(45000, 10001, "buy tool1");
		a.processRequest(pr1);
		PurchaseRequest pr2 = new PurchaseRequest(60000, 10002, "buy tool2");
		b.processRequest(pr2);
		PurchaseRequest pr3 = new PurchaseRequest(160000, 10003, "buy tool3");
		c.processRequest(pr3);
		PurchaseRequest pr4 = new PurchaseRequest(8000000, 10004, "buy tool4");
	}

}
