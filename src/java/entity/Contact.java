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
public class Contact {
public static final String ADMIN="ADMIN";
public static final String USER="USER";
    private int id;
    private String username;
    private String password;
    private int isSell;
    private int isAdmin;
    private String displayName;
    private String role;
}
