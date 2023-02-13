package beans;

public class MemberBean {
    private String firstName;
    private String secoundName;
    private String handleName;

    public MemberBean(String firstName, String secoundName, String handleName) {
        this.firstName = firstName;
        this.secoundName = secoundName;
        this.handleName = handleName;
    }

    // 가져오는
    public String getFirstName() {
        return this.firstName;
    }

    public String getSecoundName() {
        return this.secoundName;
    }

    public String getHandleName() {
        return this.handleName;
    }

    // 변수를 직접 건드리지 않아도 값을 변화하지 못하게
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecoundName(String secoundName) {
        this.secoundName = secoundName;
    }

    public void setHandleName(String handleName) {
        this.handleName = handleName;
    }

}
