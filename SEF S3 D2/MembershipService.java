public class MembershipService {
    public static String checkMembershipStatus(MembershipDetails details) {
        // Simulated status check
        return details.getStatus();
    }

    public static boolean denyMembershipRefund() {
        // Simulated denial of refund
        return false;
    }

    public static boolean acceptMembershipRefund() {
        // Simulated acceptance of refund
        return true;
    }
}
