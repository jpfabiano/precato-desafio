package com.example.userAPI.repositories;

import com.example.userAPI.models.SmsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SmsRepository extends JpaRepository<SmsModel, Long> {
    List<SmsModel> findByStatus (String status);
}
