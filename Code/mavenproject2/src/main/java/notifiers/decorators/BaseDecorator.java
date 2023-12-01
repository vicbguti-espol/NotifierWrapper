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
public class BaseDecorator implements Notifier{
    Notifier wrapeeNotifier;

    public BaseDecorator(Notifier wrapeeNotifier){
        this.wrapeeNotifier = wrapeeNotifier;
    }
    
    @Override
    public void sendNotification() {
        wrapeeNotifier.sendNotification();
    }
}
