package session;

public class session {
    
    static String username;
    static String level;
    
    public static void setUserLogin(String username){
    session.username = username;
    }
    
    public static String getUserLogin(){
    return username;
    }

    public static void setLevelLogin(String level) {
       session.level = level;    
    }
    
    public static String getLevelLogin(){
    return level;
    }

}
