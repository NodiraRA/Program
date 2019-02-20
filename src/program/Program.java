/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

/**
 *
 * @author nodira
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DeveloperFactory developerFactory=createDeveloperBySpecialty("c++");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }
    static DeveloperFactory createDeveloperBySpecialty(String specialty){
        if(specialty.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        }
        else if(specialty.equalsIgnoreCase("c++")){
            return new CppDeveloperFactory();
        }
        else if(specialty.equalsIgnoreCase("php")){
            return new PhpDeveloperFactory();
        }
        else{
            throw new RuntimeException(specialty + "is unknown specialty");
        }
    }
}
