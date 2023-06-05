package br.com.guilherme.learningspring.service;

import br.com.guilherme.learningspring.dto.CreateTransactionDto;
import br.com.guilherme.learningspring.model.Transaction;

public interface TransactionService {

    Transaction createTransaction(final CreateTransactionDto transactionData);

    Transaction retrieveTransaction(final long id);

}
