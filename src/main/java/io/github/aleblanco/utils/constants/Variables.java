package io.github.aleblanco.utils.constants;

import net.thucydides.core.environment.SystemEnvironmentVariables;

public class Variables {
    private Variables(){
        throw new IllegalStateException("Variables error class");
    }
    private static final SystemEnvironmentVariables systemEnvironmentVariables = (SystemEnvironmentVariables) SystemEnvironmentVariables.createEnvironmentVariables();

    public static String getVariable(String nameVar){
        return systemEnvironmentVariables.getProperty(nameVar);
    }
}
