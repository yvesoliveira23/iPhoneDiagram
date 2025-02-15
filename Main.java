
public class Main {

    public static void main(String[] args) {
        System.out.println("Testing iPhone functionalities...\n");
        // Create an iPhone instance
        iPhone myPhone = new iPhone();

        // Test Music Player
        System.out.println("=== Testing Music Player ===");
        myPhone.playMusic();
        myPhone.pauseMusic();
        myPhone.stopMusic();
        System.out.println();

        // Test Phone
        System.out.println("=== Testing Phone ===");
        myPhone.makeCall("(123) 456-7890");
        myPhone.receiveCall("(987) 654-3210");
        myPhone.endCall();
        System.out.println();

        // Test Internet Browser
        System.out.println("=== Testing Internet Browser ===");
        myPhone.openWebsite("www.apple.com");
        myPhone.refreshPage();
        myPhone.closeBrowser();
    }
}
