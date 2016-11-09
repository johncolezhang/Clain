
public class Clain {}

class PurchaseRequest{
	private double amount;
	private int number;
	private String purpose;
	public PurchaseRequest(double amount, int number, String purpose) {
		super();
		this.amount = amount;
		this.number = number;
		this.purpose = purpose;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
}

abstract class Approver{
	protected Approver successor;
	protected String name;
	
	public Approver(String name) {
		this.name = name;
	}
	
	public void setSuccessor(Approver successor) {
		this.successor = successor;
	}
	
	public abstract void processRequest(PurchaseRequest request);
}

class Director extends Approver{
	public Director(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		// TODO Auto-generated method stub
		if(request.getAmount() < 50000){
			System.out.println("director:" + this.name + " number:" + request.getNumber() + 
					" money:" + request.getAmount() + " purpose:" + request.getPurpose());
		}else{
			this.successor.processRequest(request);//×ª·¢ÇëÇó
		}
	}
}

class VicePresident extends Approver{

	public VicePresident(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		// TODO Auto-generated method stub
		if(request.getAmount() < 100000){
			System.out.println("vicepresident:" + this.name + " number:" + request.getNumber() +
					" money:" + request.getAmount() + "purpose:" + request.getPurpose());
		}else{
			this.successor.processRequest(request);
		}
	}	
}

class President extends Approver{

	public President(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		// TODO Auto-generated method stub
		if(request.getAmount() < 500000){
			System.out.println("president:" + this.name + " number:" + request.getNumber() +
					" money:" + request.getAmount() + "purpose:" + request.getPurpose());
		}else{
			this.successor.processRequest(request);
		}
	}
}

class Congress extends Approver{

	public Congress(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		// TODO Auto-generated method stub
		System.out.println("congresspresident:" + this.name + " number:" + request.getNumber() +
				" money:" + request.getAmount() + "purpose:" + request.getPurpose());
	}
}
