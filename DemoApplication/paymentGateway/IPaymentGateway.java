package paymentGateway;

import enums.EPaymentMethod;
import model.IPaymentDetails;
import processor.IPaymentProcessor;

public interface IPaymentGateway {
    IPaymentGateway withPaymentMethod(EPaymentMethod _ePaymentMethod);

    IPaymentProcessor withPaymentDetails(IPaymentDetails _paymentDetails);

}




