
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.InformationManagement.model.PasswordGenerator;


public class PasswordCriteria {
    
    private String minimumLength;
    private String includeUpperCase;
    private int includeNumbers;
    private String specialCharsToInclude;
    private String charsToExclude;
    private String mustStartWithLetter;
    private int passwordUniquenessPeriod;
    private int passwordUniquenessCount;
    private String usePasswordFragments;

    public PasswordCriteria(String minimumLength, String includeUpperCase, int includeNumbers, String specialCharsToInclude, String charsToExclude, String mustStartWithLetter, int passwordUniquenessPeriod, int passwordUniquenessCount, String usePasswordFragments) {
        this.minimumLength = minimumLength;
        this.includeUpperCase = includeUpperCase;
        this.includeNumbers = includeNumbers;
        this.specialCharsToInclude = specialCharsToInclude;
        this.charsToExclude = charsToExclude;
        this.mustStartWithLetter = mustStartWithLetter;
        this.passwordUniquenessPeriod = passwordUniquenessPeriod;
        this.passwordUniquenessCount = passwordUniquenessCount;
        this.usePasswordFragments = usePasswordFragments;
    }

    
    
}
