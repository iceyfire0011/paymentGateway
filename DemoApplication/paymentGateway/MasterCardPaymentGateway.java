package paymentGateway;

import enums.EPaymentMethod;
import model.IPaymentDetails;
import processor.IPaymentProcessor;
import processor.MasterCardPaymentProcessor;

public class MasterCardPaymentGateway implements IPaymentGateway{
    @Override
    public IPaymentGateway withPaymentMethod(EPaymentMethod _ePaymentMethod) {
        System.out.println("MasterCardPaymentGateway selected");
        return this;
    }

    @Override
    public IPaymentProcessor withPaymentDetails(IPaymentDetails _paymentDetails) {
        return new MasterCardPaymentProcessor(_paymentDetails);
    }
}
