/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projet2;

import com.mycompany.projet2.sql.Connectionsql;

/**
 *
 * @author dell
 */
public class Projet2 {

    public static void main(String[] args) {
       
        Connectionsql conn = new Connectionsql();
        conn.connexion();
     
    }
}
