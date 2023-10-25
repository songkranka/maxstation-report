package report.api.models;

public class TokenModel {
    private String token;
    private String branches;
    private String positionRoles;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getBranches() {
        return branches;
    }

    public void setBranches(String branches) {
        this.branches = branches;
    }

    public String getPositionRoles() {
        return positionRoles;
    }

    public void setPositionRoles(String positionRoles) {
        this.positionRoles = positionRoles;
    }
}
