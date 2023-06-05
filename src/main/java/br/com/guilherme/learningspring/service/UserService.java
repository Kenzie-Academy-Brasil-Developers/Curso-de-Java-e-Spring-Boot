package br.com.guilherme.learningspring.service;

import br.com.guilherme.learningspring.dto.CreateDepositDto;
import br.com.guilherme.learningspring.dto.UserDto;
import br.com.guilherme.learningspring.model.User;

import java.util.List;

public interface UserService {

    User createUser(final UserDto userData);

    List<User> readUsers();

    User retrieveUser(final long id);

    User updateUser(final UserDto userData, final long id);

    void deleteUser(final long id);

    User createDeposit(final CreateDepositDto depositData, final long id);

}
