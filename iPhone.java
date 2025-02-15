public class iPhone implements MusicPlayer, Phone, InternetBrowser {

    // Implementation of the methods from the MusicPlayer interface
    @Override
    public void playMusic() {
        System.out.println("Playing music...");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Music paused");
    }

    @Override
    public void stopMusic() {
        System.out.println("Music stopped");
    }

    // Implementation of the methods from the Phone interface
    @Override
    public void makeCall(String phoneNumber) {
        System.out.println("Calling " + phoneNumber + "...");
    }

    @Override
    public void receiveCall(String phoneNumber) {
        System.out.println("Incoming call from " + phoneNumber);
    }

    @Override
    public void endCall() {
        System.out.println("Call ended");
    }

    // Implementation of the methods from the InternetBrowser interface
    @Override
    public void openWebsite(String url) {
        System.out.println("Opening website: " + url);
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing current page");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Browser closed");
    }
}
