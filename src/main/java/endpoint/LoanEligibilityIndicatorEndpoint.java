package endpoint;

import com.example.springloansoap.ws.Acknowledgement;
import com.example.springloansoap.ws.CustomerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import service.LoanEligibilityService;

@Endpoint
public class LoanEligibilityIndicatorEndpoint {
    private static final String NAMESPACE="http://www.bci.com/spring/soap/api/loaneligibility";
    @Autowired
    private LoanEligibilityService service;
    @PayloadRoot(namespace =NAMESPACE,localPart = "CustomerRequest")
    @ResponsePayload
    public Acknowledgement getLoanStatus(@RequestPayload CustomerRequest request){
        return service.checkLoanEligibility(request);
    }

}
