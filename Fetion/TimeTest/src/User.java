
 import java.util.HashSet;  
  
public class User {  
    //用户名称  
    private String userName;  
    //用户密码  
    private String password;  
      
    public User(String userName, String password){  
        this.userName = userName;  
        this.password = password;  
    }  
      
    /** 
     * 覆盖equals方法 
     */  
    public boolean equals(Object obj){  
        if(obj == null){  
            return false;  
        }  
        //如果是同一个对象返回true，反之返回false  
        if(this == obj){  
            return true;  
        }  
        //判断是否类型相同  
        if(this.getClass() != obj.getClass()){  
            return false;  
        }  
        User user = (User)obj;  
        return userName.equals(user.userName) && password.equals(user.password);  
    }  
      
    /** 
     * 重写toString 
     */  
    public String toString(){  
        return userName + ":" + password;  
    }  
      
    /** 
     * 重写hashCode 
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
        System.out.println("对象的内容" + "\t\t" + "对象的散列码");  
        for(User user : set){  
            System.out.println(user.toString() + "\t\t" + user.hashCode());  
        }  
    }  
} 