package adapters.delegates;

public interface DelegatesInspector extends LoadDelegatesInspector, ClickDelegatesInspector {
    void checkBannerDelegates() throws InterruptedException;

    void checkDisplayInterstitialDelegates() throws InterruptedException;

    void checkVideoInterstitialDelegates();

    void checkVideoRewardedDelegates();

    void checkVideoOutstreamDelegates();

    void checkNativeAdsDelegates(String prebidAd) throws InterruptedException;

}
