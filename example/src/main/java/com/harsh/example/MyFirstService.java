package com.harsh.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:custom.properties")
public class MyFirstService {
//    @Autowired
//    @Qualifier("mySecondBean") <<<<<<<<!!!!!!!!!Field injection
    private final MyFirstClass myfirstclass;




    //<<<<<<<<<<!!!!!!! !! CONSTRUCTOR INJECTION!!!!!!!!!!>>>>>>>>>>>>>>>>
    //@Autowired //no need to wrtie springboot injects automatically


    //<<<<<<<<<<<<!!!!!!!!!Method injection ////////////////////////////////
//    @Autowired
//    public void injectDependencies(@Qualifier("bean2") MyFirstClass myfirstclass){
//        this.myfirstclass=myfirstclass;
//    }
    //<<<<<<<<<<<<<<!!!!!!!!!!!!setter injection//////////
//    @Autowired
//    public void setMyfirstclass(@Qualifier("bean2") MyFirstClass myfirstclass){
//        this.myfirstclass=myfirstclass;
//    }


    ///////////ENVIROMENT//////////////////////////////


//private Environment environment;
//    public String getJavaVersion(){
//        return environment.getProperty("java.version");
//    }
//
//    @Autowired
//    public void setEnvironment(Environment environment) {
//        this.environment = environment;
//    }
//    public String getOsName(){
//        return environment.getProperty("os.name");
//    }
//    public String readProp(){
//        return environment.getProperty("my.custom.property");
//    }
//    public String readProp2(){
//        return environment.getProperty("welcomemsg");
//    }

    public MyFirstService(@Qualifier("bean1") MyFirstClass myfirstclass)
    {
        this.myfirstclass = myfirstclass;
    }
    public String tellAStory(){
        return "the dependecy is saying:"+myfirstclass.sayHello();
    }
    @Value("hello from custom property value")
    private String customProperty;

    @Value("${my.prop}")
    private String customPopertyFromAnotherFile;

    @Value("${my.custom.property}")
    private String appilcationProperty;

    public String getCustomPopertyFromAnotherFile() {
        return customPopertyFromAnotherFile;
    }

    public String getCustomProperty() {
        return customProperty;
    }

    public String getAppilcationProperty() {
        return appilcationProperty;
    }
    private Integer appllicationPropertyInt;


    public Integer getAppllicationPropertyInt() {
        return appllicationPropertyInt;
    }
}
