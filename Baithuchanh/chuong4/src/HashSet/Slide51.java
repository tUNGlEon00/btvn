package HashSet;
import java.util.HashSet;
import java.util.TreeSet;

public class Slide51 {
    public static void main (String[] args) {
        // khai bao 1 hashset co ten la hashSetInt
        // co kieu Integer

        HashSet <Integer> hashSetInt = new HashSet<>();

        // khai bao 1 hashset co kich thuoc khoi tao = 32
        HashSet <Character> hashSetChar = new HashSet<>( 32 );

        // khai bao 1 hashset co kich thuoc khoi tao = 16
        // va yeu to tai = 0.75f
        HashSet <String> hashSetString = new HashSet<>( 16, 0.75f );

        // khai bao 1 hashset duoc tao thanh tu 1 collection khac
        HashSet <Float> hashSetFloat = new HashSet<>( new TreeSet<>() );
    }
    
}
