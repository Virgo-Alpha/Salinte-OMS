/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author User
 */
public interface stockLevelObserver {
    
    void updateStockLevel(String warehouseId, String productId, int newQuantity);
    
}
