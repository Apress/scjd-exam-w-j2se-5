import java.util.*;

public class LockObjectNotMemberVariables{
    private Vector myVector = new Vector();

    public static void main(String args[]){
        LockObjectNotMemberVariables lonmv =
                new LockObjectNotMemberVariables();
        lonmv.lockTest();
    }

    public synchronized void lockTest(){
        System.out.println("Is the THIS object locked? " +
                            Thread.currentThread().holdsLock(this));

        System.out.println("Is the vector object locked? " +
                            Thread.currentThread().holdsLock(myVector));
    }
}
