
@CreateState
Feature: Sistem, api  endpoint'i kullanarak yeni eyalet   oluşturmaya izin vermelidir


    Scenario Outline:
    Given    Kullanici api end point "https://www.gmibank.com/api/tp-states" den "<idJson>" ve "<nameJson>" kullanarak state olusturur


      Examples: create state
      | idJson | nameJson |
      | name   | galicya  |








