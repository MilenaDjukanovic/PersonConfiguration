/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.md.project.view.components.validator.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import user.md.project.view.components.exception.ValidationException;
import user.md.project.view.components.validator.Validator;

/**
 *
 * @author mdjukanovic
 */
public class DateValidator implements Validator {

    List<Integer> thirtyDayMonths = Arrays.asList(4, 6, 9, 11);

    @Override
    public void validate(Object object) throws ValidationException {
        if (!(object instanceof Map)) {
            throw new ValidationException("Object is not date");
        }

        Map<String, Integer> dateValues = (HashMap<String, Integer>) object;
        int day = dateValues.get("day");
        int month = dateValues.get("month");
        int year = dateValues.get("year");

        if (!checkTheDate(day, month, year)) {
            throw new ValidationException("Date is not in valid format");
        }
    }

    private boolean checkTheDate(int day, int month, int year) {
        if (month == 2 && isLeapYear(year) && day > 29) {
            return false;
        }
        if (month == 2 && !isLeapYear(year) && day > 28) {
            return false;
        }
        if (thirtyDayMonths.contains(month) && day > 30) {
            return false;
        }
        return true;
    }

    private boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        if (year % 400 == 0 && year % 100 != 0) {
            return true;
        }
        return false;

    }

}
