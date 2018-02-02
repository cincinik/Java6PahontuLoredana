/* package for xml user-password validation
 * Version 1.0
 * © 2018 Lori, Inc. All rights reserved.
 */
package xml;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;
import java.util.Scanner;

/**Class ValidateUsers - checks if name and passwords pairs are valid.
 * @author Lori
 * @version 1.0 January 2018
 */
public class ValidateUsers1 {

    /**
     * main method running the validation
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String inputUsername;
        String inputPassword;
        Boolean found=false;
        
        //Ask user to input username
        System.out.print("Insert username:");
        inputUsername = scanner.next();
        //Ask user to input password
        System.out.print("Insert password:");
        inputPassword = scanner.next();
        
        try {
         //Add xml file's path
         File inputFile = new File("C:/Users/VORTEX/Documents/NetBeansProjects1/Java6PahontuLoredana/MyTryouts/src/xml/Users.xml");
         //Create a factory instance to obtain a parser
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         //New document builder parser
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         //Parse the xml
         Document doc = dBuilder.parse(inputFile);
         //Put nodes in a tree
         doc.getDocumentElement().normalize();
         //Returns a NodeList of all the Elements 
         NodeList nList = doc.getElementsByTagName("user");
         //get number of elements
         int length = nList.getLength();
         
         for (int temp = 0; temp < length; temp++) {
            Node nNode = nList.item(temp);
            //Check if node is an element
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
               Element eElement = (Element) nNode;
               //Put all name values in an Array of Strings
               String[] names = (eElement.getElementsByTagName("name").item(0).getTextContent()).split(" ");
               //Put all passwords values in an Array of Strings
               String[] pass = (eElement.getElementsByTagName("password").item(0).getTextContent()).split(" ");
                
                for (int i=0; i<names.length; i++) {
                    // match userinput with names and passwords in the arrays
                    if (names[i].equals(inputUsername)&& pass[i].equals(inputPassword)){
                        System.out.println("Login succesful!");
                        found=true;
                    }                    
                }    
            }
        }
        if (!found){System.out.println("Wrong username or password");}
        } catch (ParserConfigurationException | SAXException | IOException | DOMException e) {
         e.printStackTrace();
        }
    }
}
