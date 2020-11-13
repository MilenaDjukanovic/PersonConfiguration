/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.md.project.view.components.validator.impl;

import user.md.project.view.components.exception.ValidationException;
import user.md.project.view.components.validator.Validator;

/**
 *
 * @author mdjukanovic
 */
public class WordStringValidator implements Validator {

    @Override
    public void validate(Object object) throws ValidationException {
        if (!(object instanceof String)) {
            throw new ValidationException("Object is not string");
        }

        String word = object.toString();
        if (word.length() < 2 || !word.matches("[a-zA-Z]+")) {
            throw new ValidationException("String is not a word");
        }

    }

}
