public class MembershipDetails {
    private String membershipId;
    private String status;

    // Constructor
    public MembershipDetails(String membershipId, String status) {
        this.membershipId = membershipId;
        this.status = status;
    }

    // Getters
    public String getMembershipId() {
        return membershipId;
    }

    public String getStatus() {
        return status;
    }

    // Setters
    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
