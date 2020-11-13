/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.md.project.view.components.validator.impl;

import user.md.project.view.components.exception.ValidationException;
import user.md.project.view.components.validator.Validator;


/*
 *
 * @author mdjukanovic
 */
public class RequiredStringValidator implements Validator{

    @Override
    public void validate(Object object) throws ValidationException {
         if(!(object instanceof String)){
            throw new ValidationException("Object is not type String!");
        }
        if(object.toString().isEmpty()){
            throw new ValidationException("String is empty!");
        }
    }

  
    
}
