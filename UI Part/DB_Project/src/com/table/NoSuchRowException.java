/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.table;

import java.util.NoSuchElementException;

/**
 *
 * @author Ibrahim
 */
public class NoSuchRowException extends NoSuchElementException {

    public NoSuchRowException(int index) {
        super("The row "+index+" was not found");
    }
    
}
