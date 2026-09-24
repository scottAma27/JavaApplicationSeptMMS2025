package hospital.model;

public class User {
    private int userId;
    private String username;
    private String role;
    private int staffId;
    private String fullName;
    private boolean isActive;

    // getters and setters
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    public int getStaffId() { return staffId; }
    public void setStaffId(int staffId) { this.staffId = staffId; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { isActive = active; }
}