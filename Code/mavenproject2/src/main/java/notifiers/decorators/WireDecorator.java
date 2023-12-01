/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notifiers.decorators;

/**
 *
 * @author vicbguti
 */
public class WireDecorator extends BaseDecorator {
    @Override
    public void sendNotification(){
       sendWireNotification(); 
       super.sendNotification();
    }

    private void sendWireNotification() {
        // Send WhatsApp Notification
    }
}
