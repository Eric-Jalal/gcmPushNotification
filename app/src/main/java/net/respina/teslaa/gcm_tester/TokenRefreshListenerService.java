package net.respina.teslaa.gcm_tester;

import android.content.Intent;

import com.google.android.gms.iid.InstanceIDListenerService;

public class TokenRefreshListenerService extends InstanceIDListenerService {

    @Override
    public void onTokenRefresh() {
        Intent i = new Intent(this, RegistrationService.class);
        startService(i);
    }

}
