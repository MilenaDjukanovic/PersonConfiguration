/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.md.project.view.components.validator;

import user.md.project.view.components.exception.ValidationException;

/**
 *
 * @author mdjukanovic
 */
public interface Validator {
    void validate(Object object) throws ValidationException;
}
