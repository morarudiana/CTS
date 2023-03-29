package ro.ase.csie.cts.course3.solid;

public class Student {
	
	//loose coupling with the accounting module
	AccountingInterface accounting = null;
	
	//constructor injection 
	Student(AccountingInterface accountingModule){
		this.accounting = accountingModule;
	}
	
	//setter injection
	void setAccounting(AccountingInterface accountingModule)
	{
		this.accounting = accountingModule;
	}
	
	String getName() {return "Dummy";}
	void payTuition() {
		if(accounting == null) {
			throw new UnsupportedOperationException();
		}
		//callback
		accounting.payTuition(this);}
	//tight coupling with OOP and DB
	void takeOOPExam() {//details on taking the exam
		}
	void saveToDB() {} 
}
