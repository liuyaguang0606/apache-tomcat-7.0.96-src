package org.apache.catalina.yycext;

import org.apache.catalina.Lifecycle;
import org.apache.catalina.LifecycleEvent;
import org.apache.catalina.LifecycleListener;

/**
 * @author yaoyucai
 * @date 2021/12/27 14:59
 */
public class ServerStartListener implements LifecycleListener {

    @Override
    public void lifecycleEvent(LifecycleEvent event) {
        if (event.getType().equals(Lifecycle.CONFIGURE_START_EVENT)) {
            System.out.println("server starting!" + event.getLifecycle().getStateName());
        }
    }
}
