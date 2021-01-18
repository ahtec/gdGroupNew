/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdgroup;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author gerard
 */
public class test {
 public static void main(String args[]) {
     Path path = Paths.get(System.getProperty("user.home"),"Pictures", "ArtOfHendrik","test", "tt000000005.JPG");
   System.out.format("toString: %s%n", path.toString());
System.out.format("getFileName: %s%n", path.getFileName());
System.out.format("getName(0): %s%n", path.getName(0));
System.out.format("getNameCount: %d%n", path.getNameCount());
System.out.format("subpath(0,2): %s%n", path.subpath(0,2));
System.out.format("getParent: %s%n", path.getParent());
System.out.format("getRoot: %s%n", path.getRoot());  
     
     
     
 }}
