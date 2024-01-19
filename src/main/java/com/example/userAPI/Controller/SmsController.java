package com.example.userAPI.Controller;

import com.example.userAPI.dtos.SmsRecordDTO;
import com.example.userAPI.models.SmsModel;
import com.example.userAPI.repositories.SmsRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@Transactional
@RestController
public class SmsController {
    @Autowired
    SmsRepository smsRepository;

    @GetMapping("/sms_messages/{status}")
    public ResponseEntity<List<SmsModel>> getAllSms(@PathVariable(value = "status") String status){
        return ResponseEntity.status(HttpStatus.OK).body(smsRepository.findByStatus(status));
    }
    @PutMapping("/sms_messages/{id}")
    public ResponseEntity<Object> updateSms(@PathVariable(value = "id") Long id ,@RequestBody @Valid SmsRecordDTO smsRecordDto){
        Optional<SmsModel> sms = smsRepository.findById(id);
        if (sms.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("id_sms not found.");
        }
        SmsModel smsModel = sms.get();
        BeanUtils.copyProperties(smsRecordDto, smsModel);
        return ResponseEntity.status(HttpStatus.OK).body(smsRepository.save(smsModel));
    }

}
