package beans;

public class DataInfors {
    public MemberBean getDataWithMemberBean() { // get가져오고 새로 이름만들기
        MemberBean memberBean = new MemberBean(); // 생성자
        memberBean.setFirstName("Mark"); // 값지정하기
        memberBean.setSecoundName("Otto");
        memberBean.setHandleName("@mdo");
        return memberBean; // get안에 set값 넣음
    }
}
