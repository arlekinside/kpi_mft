package com.github.arlekinside.diploma.ws.controller.mf;

import com.github.arlekinside.diploma.data.entity.mf.RecurringIncome;
import com.github.arlekinside.diploma.data.repo.MoneyFlowRepo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mf/recurring/income")
public class RecurringIncomeController extends MoneyFlowController<RecurringIncome> {


    public RecurringIncomeController(MoneyFlowRepo<RecurringIncome> moneyFlowRepo) {
        super(moneyFlowRepo);
    }
    
}
