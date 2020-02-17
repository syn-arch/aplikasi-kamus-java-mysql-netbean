package session;

public class session_level {
    private static String level;
    
    public static void setLevelLogin(String level){
        session.level = level;
        
    }
    
    public static String getLevelLogin(){
    return level;
    }
}
