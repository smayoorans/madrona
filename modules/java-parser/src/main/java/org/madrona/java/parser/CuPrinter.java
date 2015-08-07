package org.madrona.java.parser;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;

import java.io.FileInputStream;

public class CuPrinter {

    public static void main(String[] args) throws Exception {
        // creates an input stream for the file to be parsed

        FileInputStream in = new FileInputStream("/home/mayooran/developments/madrona/modules/java-prser/src/main/java/org/madrona/java/parser/TestClazz.java");


        CompilationUnit cu;
        try {
            // parse the file
            cu = JavaParser.parse(in);
        } finally {
            in.close();
        }

        // prints the resulting compilation unit to default system output
        System.out.println(cu.toString());
    }
}