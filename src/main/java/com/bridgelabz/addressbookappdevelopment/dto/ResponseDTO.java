package com.bridgelabz.addressbookappdevelopment.dto;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {
    private String message;
    private Object data;
}