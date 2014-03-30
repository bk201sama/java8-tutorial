package com.winterbe.java8;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;

/**
 * Calling javascript functions from java with nashorn.
 *
 * @author Benjamin Winterberg
 */
public class Nashorn1 {

    public static void main(String[] args) throws Exception {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        engine.eval(new FileReader("res/nashorn1.js"));

        Invocable invocable = (Invocable) engine;
        Object result = invocable.invokeFunction("fun", "Peter Parker");
        System.out.println(result);
    }

}