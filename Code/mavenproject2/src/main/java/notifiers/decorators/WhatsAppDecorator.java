/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notifiers.decorators;

/**
 *
 * @author vicbguti
 */
public class WhatsAppDecorator extends BaseDecorator {
    @Override
    public void sendNotification(){
       sendWhatsAppNotification(); 
       super.sendNotification();
    }

    private void sendWhatsAppNotification() {
        // Send WhatsApp Notification
    }
}
