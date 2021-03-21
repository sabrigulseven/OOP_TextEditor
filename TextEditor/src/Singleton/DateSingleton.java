/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author sabri
 */
//DateSingleton classından tek bir nesne oluşturulabilinir.
//Bu nesneyi kullanarak şuanki tarih ve zaman bilgisi yazdırılır.
public class DateSingleton {
    
    private static DateSingleton currentDate;
    
    private DateTimeFormatter date;
    private LocalDateTime dateObj;
    private String formattedDate;
    
    private DateSingleton(){}
    public static DateSingleton getInstance(){
        if(currentDate==null){
            currentDate=new DateSingleton();
        }
        return currentDate;
    }
    
    //Date bilgilerini geri gönderir.
    public String getDate(){
        //Date tüm verileriyle alınıyor.
        dateObj = LocalDateTime.now();
        //Date'in istediğimiz formatını belirlendi
        date=DateTimeFormatter.ofPattern(" dd-MM-yyyy HH:mm ");
        //Format düzenlendi.
        formattedDate = dateObj.format(date);
        
        return formattedDate;    
    }
}
