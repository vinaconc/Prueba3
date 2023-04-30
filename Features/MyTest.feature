#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Realización de casos ingresando Rut, nombre de usuario y contraseña
  

  @tag1
  Scenario: Verificación de ingreso de sesión
    Given Abrir Chrome
    
    When Ingresa Rut as "127163812", username as "admin" y password as "12345"
    
    Then Inicia Sesión
    
    
    @tag2
  Scenario: Verificación de ingreso de sesión
    Given Abrir Chrome
    
    When Ingresa Rut as "102212967", username as "user" y password as "12345"
    
    Then Inicia Sesión
    
      @tag3
  Scenario: Verificación de ingreso de sesión
    Given Abrir Chrome
    
    When Ingresa Rut as "127163812", username as "admin" y password as "11111"
    
    Then Inicia Sesión
    
      @tag4
  Scenario: Valida vacíos
    Given Abrir Chrome
    
    When Ingresa Rut as "", username as "" y password as ""
    
    Then Valida vacíos
  

