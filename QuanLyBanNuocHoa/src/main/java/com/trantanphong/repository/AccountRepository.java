package com.trantanphong.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trantanphong.entity.Account;

public interface AccountRepository extends JpaRepository<Account, String>{

}
