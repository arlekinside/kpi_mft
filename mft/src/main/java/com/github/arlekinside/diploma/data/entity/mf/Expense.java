package com.github.arlekinside.diploma.data.entity.mf;

import jakarta.persistence.Entity;

@Entity
public class Expense extends MoneyFlow {

    @Override
    public boolean isExpense() {
        return true;
    }
}
