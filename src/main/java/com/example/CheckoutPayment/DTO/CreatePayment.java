package com.example.CheckoutPayment.DTO;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatePayment {

    @SerializedName("items")
    Object[] items;


}
