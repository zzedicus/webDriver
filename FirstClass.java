import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.peer.SystemTrayPeer;
import java.sql.SQLOutput;

public class FirstClass {

    @Test
    public void test00001 () {
        System.out.println("Hello World!");

    }

    @Test
    public void test00002 () {

        String name1 = new String ("Good ");
        String name2 = "night";
        String name3 = name1 + name2;
        System.out.println (name3);

    }

    @Test
    public void test00003() {
        int i = 5;
        String s1 = ("I wanna " + i + " snikers");
        System.out.println(s1);
    }

    @Test
    public void test00004() {
        boolean toBe = false;
        boolean b = toBe || !toBe;
        if (b) {
            System.out.println(toBe);
        }


    }

    @Test
    public void test00005 () {
        int a = 4;

        if (a == 5) {
            System.out.println("Ohhh! So a is 4!");
        } else {
            System.out.println("A is not equal 4!");
        }
    }

    @Test
    public void test00006() {
        int a = 4;
        boolean b = a == 4;
        if (b) ;
        System.out.println(b);

    }

    @Test
    public void test00007() {
      for(int i = 100; i > 10; i--) {
          System.out.println(i);
      }
    }

    @Test
    public void test00008() {
        for(int i = 100; i > 10; i -=10) {
            System.out.println(i);
        }
    }

    @Test
    public void test00009() {
        boolean isTrue =true;
        int name = 0;
        while(name < 10) {
            name += 2;
            System.out.println(name);
            if (name > 10)
                break;
        }
    }

    @Test
    public void test00010() {
      int x = 13;
      do {
          x--;
          System.out.println(x);
      } while (x > 10);
      }

    @Test
    public void test00011() {
        int[] arr = {22, 10, 11, 33};
        for (int k : arr) {
            System.out.println(k);
        }
    }
}
