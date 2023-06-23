package com.nkxgen.spring.jdbc.model;

public class service {
	static int value = 0;

	public static Customer dotheservice(Customertrail customertrail) {
		Customer customer = new Customer();
		customer.setCust_id(customertrail.getId());
		customer.setCust_title(customertrail.getTitle());
		customer.setCust_type(customertrail.getType());
		customer.setCust_caddress(customertrail.getCurrentAddress());
		customer.setCust_capincode(customertrail.getCurrentPINCode());
		customer.setCust_dob(customertrail.getDateOfBirth());
		customer.setCust_mobile1(customertrail.getMobile1());
		customer.setCust_mobile2(customertrail.getMobile2());
		customer.setCust_rphone(customertrail.getResidencePhone());
		customer.setCust_raddress(customertrail.getResidenceAddress());

		return customer;
	}

	public static Customer changing(Customer customer2, CustomerSub customerSub) {
		customer2.setCust_title(customerSub.getTitle());
		customer2.setCust_mobile1(customerSub.getPhoneNo());
		customer2.setCust_raddress(customerSub.getAddress());
		return customer2;
	}

	public EMIpay changeToEmiObj(LoanAccount account) {
		EMIpay obj1 = new EMIpay();
		obj1.setLoanId(account.getLoanId());
		// obj.setAccountHolder(account.);
		obj1.setLoanType(account.getLoanType());
		obj1.setLoanamount(account.getLoanAmount());
		obj1.setLoanduration(account.getLoanDuration());
		obj1.setNOI(account.getLoanDuration() * 12);
		obj1.setInterestRate(account.getInterestRate());
		obj1.setLoan_pending(account.getdeductionAmt());

		obj1.setPaidMonths(
				service.calPM(account.getdeductionAmt(), account.getLoanAmount(), account.getLoanDuration()));

		obj1.setEmi(service.calEMI(account.getLoanAmount(), account.getLoanDuration(), account.getdeductionAmt()));
		obj1.setInterest(service.calinterest(account.getLoanAmount(), account.getdeductionAmt(),
				account.getLoanDuration(), account.getInterestRate(), account.getLoanType()));
		obj1.setTotal(service.total(account.getLoanAmount(), account.getLoanDuration(), account.getInterestRate(),
				account.getdeductionAmt(), account.getLoanType()));
		obj1.setPastDue(service.pastdue());
		obj1.setTotalWithPenalty(service.totalwithpenalty(account.getLoanAmount(), account.getLoanDuration(),
				account.getInterestRate(), account.getdeductionAmt(), account.getLoanType()));
		obj1.setComplete(service.complete(account.getLoanDuration(), account.getdeductionAmt(), account.getLoanAmount(),
				account.getInterestRate(), account.getLoanType(), account.getLoanDuration() * 12));
		return obj1;
	}

	public static int calPM(double damount, double lamount, int duration) {
		int x = (int) ((int) (lamount - damount) / (lamount / (duration * 12)));
		return x;
	}

	public static double calEMI(double lamount, int duration, double damount) {
		if (damount == 0) {
			return 0;
		} else {
			double value1 = (lamount / (duration * 12));
			return value1;
		}
	}

	public static double calinterest(double lamount, double damount, int duration, double ir, String typee) {
		if (damount == 0) {
			return 0;
		} else {

			String s1 = typee;
			String s2 = "Personal";
			if (s1.equals(s2)) {
				double value1 = ((lamount * duration * ir) / 1200);
				return value1;
			} else {
				int n = (12 * duration);
				double r = (ir / 1200);
				double value = lamount * r * (Math.pow((1 + r), n)) / (Math.pow((1 + r), n) - 1);
				double value1 = value - (lamount / (duration * 12));
				return value1;
			}

		}

	}

	public static int total(double lamount, int duration, double ir, double damount, String typee) {
		double value2 = (calinterest(lamount, damount, duration, ir, typee) + calEMI(lamount, duration, damount));
		int x = (int) Math.ceil(value2);
		return x;

	}

	public static int pastdue() {
		return 0;
	}

	public static int totalwithpenalty(double lamount, int duration, double ir, double damount, String typee) {
		double value1 = total(lamount, duration, ir, damount, typee) + pastdue();
		int x = (int) Math.ceil(value1);
		return x;
	}

	public static int complete(int duration, double damount, double lamount, double ir, String typee, int noi) {
		String s1 = typee;
		String s2 = "Personal";
		if (s1.equals(s2)) {

			double value1 = ((((lamount * duration * ir) / 100) + lamount) / 12)
					* (noi - calPM(damount, lamount, duration));
			value1 = value1 + pastdue();
			int x = (int) Math.ceil(value1);
			return x;
		} else {

			int n = (12 * duration);
			double r = (ir / 1200);
			double value = lamount * r * (Math.pow((1 + r), n)) / (Math.pow((1 + r), n) - 1);

			long value2 = (long) (value * (noi - calPM(damount, lamount, duration)));
			// long value2 = (long) (damount + service.pastdue());
			// long value2 = (long) (service.calinterest(lamount, damount, duration, ir, typee) + damount +
			// service.pastdue());
			int x = (int) Math.ceil(value2);
			return x;
		}

	}

}
