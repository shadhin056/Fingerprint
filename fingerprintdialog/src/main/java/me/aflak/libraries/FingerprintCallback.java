package me.aflak.libraries;

/**
 * Created by Omar on 02/07/2017.
 */

public interface FingerprintCallback {
    void onFingerprintSuccess();
    void onFingerprintFailure();
    void onUserCanceled();
}
