Class JavaClass {

public void method() {
	
if (DigitProducts.MOTOR_PRIVATE_4W_COMPREHENSIVE_PRODUCT.equals(contract.getInsuranceProductCode())) {

                           if (isDigitRenewalCase && isEarlyDiscountAllowed
                                         && LocalDate.now().compareTo(LocalDate.parse(contract.getStartDate()).minusDays(7)) <= 0) {

                                  double earlyDiscountNet = netPremium * 0.075;
                                  double earlyDiscountGross = grossPremium * 0.075;
                                  netPremium = netPremium - earlyDiscountNet;
                                  grossPremium = grossPremium - earlyDiscountGross;
                           }

                           if ((netPremium < 299) && contract.getTerm() == 1) {
                                  netPremium = 299.0;
                                  grossPremium = 1.18 * netPremium;
                           }

                           if ((netPremium < 1500) && contract.getTerm() == 3) {
                                  netPremium = 1500.0;
                                  grossPremium = 1.18 * netPremium;
                           }

                     }
}
					 
}
