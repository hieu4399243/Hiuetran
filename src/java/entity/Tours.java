/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class Tours {

    private int id;
    private String name;
    private int quantity;
    private double price;
    private String imageUrl;
    private String createdDate;
    private int categoryId;

}
