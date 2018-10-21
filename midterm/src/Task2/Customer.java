package Task2;

public class Customer{
    private String name;
    private boolean member=false;
    private String memberType;

    public Customer(){
        name = "";
        memberType = "";
    }
    public Customer(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public boolean isMember(){
        return member;
    }
    public void setMember(boolean member){
        this.member = member;
    }
    public void setMemberType(String s){
        if(member)
            memberType = s;
        else
            System.out.println("NOT A MEMBER!!!");

    }
    public String getMemberType(){
        if(member)
            return memberType;
        return "NOT A MEMBER";
    }
    public String toString(){
        if(member)
        return "Name: " + name + "\n" + "Member Type: " + memberType;
        return name + " not a member";
    }
}