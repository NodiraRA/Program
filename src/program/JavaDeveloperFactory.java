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
public class JavaDeveloperFactory implements DeveloperFactory{

    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    
}
}
