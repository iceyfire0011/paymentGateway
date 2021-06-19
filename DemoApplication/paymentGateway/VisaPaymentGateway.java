package paymentGateway;

import enums.EPaymentMethod;
import model.IPaymentDetails;
import processor.IPaymentProcessor;
import processor.VisaPaymentProcessor;

public class VisaPaymentGateway implements IPaymentGateway{
    @Override
    public IPaymentGateway withPaymentMethod(EPaymentMethod _ePaymentMethod) {
        System.out.println("VisaPaymentGateway selected");
        return this;

    }

    @Override
    public IPaymentProcessor withPaymentDetails(IPaymentDetails _paymentDetails) {
        return new  VisaPaymentProcessor();
    }
}
