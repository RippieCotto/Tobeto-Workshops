package com.example.a.spring.into.services.dtos.customer.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class UpdateCustomerRequest {
    @Positive
    private int id;

    @NotBlank(message = "isim boş bırakılamaz!")
    private String name;

    @NotBlank(message = "Soyisim boş bırakılamaz!")
    private String lastName;


    @Length(min = 11, message = "Telefon numarasını alan kodu ile birlikte giriniz!")
    private String phone;
    private String eMail;
}
