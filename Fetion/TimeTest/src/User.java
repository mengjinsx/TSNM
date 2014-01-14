
 import java.util.HashSet;  
  
public class User {  
    //�û�����  
    private String userName;  
    //�û�����  
    private String password;  
      
    public User(String userName, String password){  
        this.userName = userName;  
        this.password = password;  
    }  
      
    /** 
     * ����equals���� 
     */  
    public boolean equals(Object obj){  
        if(obj == null){  
            return false;  
        }  
        //�����ͬһ�����󷵻�true����֮����false  
        if(this == obj){  
            return true;  
        }  
        //�ж��Ƿ�������ͬ  
        if(this.getClass() != obj.getClass()){  
            return false;  
        }  
        User user = (User)obj;  
        return userName.equals(user.userName) && password.equals(user.password);  
    }  
      
    /** 
     * ��дtoString 
     */  
    public String toString(){  
        return userName + ":" + password;  
    }  
      
    /** 
     * ��дhashCode 
     */  
    public int hashCode(){  
        int result;  
        result = userName.hashCode()+password.hashCode();  
        
        return result;  
    }  
  
    public static void main(String[] args) {  
        HashSet<User> set = new HashSet<User>();  
        User user01 = new User("xiaom", "1");  
        User user02 = new User("xiaom", "1");  
        User user03 = new User("xiaoh", "2");  
        User user04 = new User("xiaoj", "3");  
          
        set.add(user01);  
        set.add(user02);  
        set.add(user03);  
        set.add(user04);  
        System.out.println("���������" + "\t\t" + "�����ɢ����");  
        for(User user : set){  
            System.out.println(user.toString() + "\t\t" + user.hashCode());  
        }  
    }  
} 