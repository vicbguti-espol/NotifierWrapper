/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notifiers.decorators;

import notifiers.Notifier;

/**
 *
 * @author vicbguti
 */
public class TelegramDecorator extends BaseDecorator {

    public TelegramDecorator(Notifier wrapeeNotifier) {
        super(wrapeeNotifier);
    }
    @Override
    public void sendNotification(){
       sendTelegramNotification(); 
       super.sendNotification();
    }

    private void sendTelegramNotification() {
        // Send WhatsApp Notification
    }
}
