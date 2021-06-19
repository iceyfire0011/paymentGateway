package paymentGateway;

import enums.EPaymentMethod;
import model.IPaymentDetails;
import processor.IPaymentProcessor;
import processor.AmexPaymentProcessor;

public class AmexPaymentGateway implements IPaymentGateway{
    @Override
    public IPaymentGateway withPaymentMethod(EPaymentMethod _ePaymentMethod) {
        System.out.println("AmexPaymentGateway selected");
        return this;
    }

    @Override
    public IPaymentProcessor withPaymentDetails(IPaymentDetails _paymentDetails) {
        return new AmexPaymentProcessor();
    }
}
