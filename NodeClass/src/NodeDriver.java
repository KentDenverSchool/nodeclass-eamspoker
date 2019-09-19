/*
 * NodeDriver.java
 * This program tests the node class.
 * Date: 9/11/19
 * On my honor: EA
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
//pretty much everything looks good. Good job using Files too.
public class NodeDriver {
    public static void main(String[] args){
        //all constructors tested
        Node<String> n1 = new Node<String>("n1");
        Node<String> n3 = new Node<String>("n3", n1, true );
        Node<String> n2 = new Node<String>("n2",n1, n3);
        Node<String> n4 = new Node<String>();


            //test accessors and mutators, to string and .equals
            ArrayList<String> log = new ArrayList<>();
                log.add("Expected: Node n1 with data value \"n1\", front is null, behind is null");
                log.add("Node: " + n1 + " Data: " + n1.getData() + " Front: " + n1.getFront() + " Behind: " +
                        n1.getBehind());
                n1.setBehind(n2);
                log.add("Expected: behind will be n2");
                log.add("Node: " + n1 + " Data: " + n1.getData() + " Front: " + n1.getFront() + " Behind: " +
                        n1.getBehind());
                n1.setFront(n3);
                log.add("Expected: front will be n3");
                log.add("Node: " + n1 + " Data: " + n1.getData() + " Front: " + n1.getFront() + " Behind: " +
                        n1.getBehind());
                n1.setData("n3");
                log.add("Expected: data will be n3");
                log.add("Node: " + n1 + " Data: " + n1.getData() + " Front: " + n1.getFront() + " Behind: " +
                        n1.getBehind());

                log.add("Expected: data will be equal to n3 but not to n2");
                log.add("n1 and n3 equal? " + n1.equals(n3) + " n1 and n3 equal? " + n1.equals(n2));

                log.add("Expected: everything in n4 will be null because of empty constructor");
                log.add("Node: " + n4 + " Data: " + n4.getData() + " Front: " + n4.getFront() + " Behind: " +
                        n4.getBehind());



               
            Path filePath = Paths.get("log.txt");
            try {
                Files.createFile(filePath);
                Files.write(filePath, log, StandardCharsets.UTF_8);
            } catch(IOException ioe){
                ioe.printStackTrace();
            }
    }
}
