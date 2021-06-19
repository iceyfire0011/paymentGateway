package paymentGateway;

import enums.EPaymentMethod;
import model.IPaymentDetails;
import processor.IPaymentProcessor;
import processor.BkashPaymentProcessor;

public class BkashPaymentGateway implements IPaymentGateway{
    @Override
    public IPaymentGateway withPaymentMethod(EPaymentMethod _ePaymentMethod) {
        System.out.println("BkashPaymentGateway selected");
        return this;
    }

    @Override
    public IPaymentProcessor withPaymentDetails(IPaymentDetails _paymentDetails) {
        return new BkashPaymentProcessor(_paymentDetails);
    }
}
