public class SystemService {
    public static void main(String[] args) {
        UserInfo user = UserInfo.login();
        if (user != null) {
            user.processCommands();
        }
        // Simulated logout
        System.out.println("System: Logout.");
    }
}
