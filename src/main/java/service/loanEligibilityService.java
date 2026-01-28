package service;

import org.springframework.stereotype.Service;

// Import the JAXB-generated classes
import com.example.springloansoap.ws.CustomerRequest;
import com.example.springloansoap.ws.Acknowledgement;

import java.util.List;

@Service
public class loanEligibilityService {

    public Acknowledgement checkLoanEligibility(CustomerRequest request) {
        Acknowledgement acknowledgement=new Acknowledgement();
        List<String> mismatchCriteriaList=acknowledgement.getCriteriaMismatch();

        if(!(request.getAge()>30&& request.getAge()<=60)){
           mismatchCriteriaList.add("Person age should be in between 30 to 60");
        }
        if(!(request.getYearlyIncome()>200000)){
            mismatchCriteriaList.add("The mimnum income should be more than 200000");
        }
        if(!(request.getCibilScore() >500)){
            mismatchCriteriaList.add("Low CIBIL Score please try after 6 months");
        }

if (mismatchCriteriaList.size() > 0){
    acknowledgement.setApprovedAmount(0);
    acknowledgement.setIsEligible(false);
}

return acknowledgement;

    }
}
