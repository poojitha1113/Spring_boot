package com.test.employee.serviceimp;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.test.employee.controller.EmployeeController;
import com.test.employee.dao.Employeedao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/*
@Service
public class KafkaService {

    @Autowired
    private EmployeeController employeeController;

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;
    @KafkaListener(topics = "topic1",groupId = "id")
    public void publish(String message) {

         Employeedao employeedao = new Employeedao();
         JsonElement jsonElement = JsonParser.parseString(message);
         JsonObject jsonObject = jsonElement.getAsJsonObject();
         employeedao.setEmpId(jsonObject.get("empId").getAsInt());
         employeedao.setFirstname(jsonObject.get("firstname").getAsString());
         employeedao.setLastname(jsonObject.get("lastname").getAsString());
         employeedao.setAddress(jsonObject.get("Address").getAsString());
         employeedao.setSalary(jsonObject.get("salary").getAsInt());

         Employeedao employeedao1 = employeeController.dynamicinsertEmployeeretun(employeedao);
         Gson gson = new Gson();
         String kafkamessage = gson.toJson(employeedao1);
         sendMessage(kafkamessage);


    }
    public void sendMessage(String msg){
        kafkaTemplate.send("HCM",msg);
    }
}
*/