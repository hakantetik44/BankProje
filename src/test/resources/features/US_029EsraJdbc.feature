@us_29_jdbc
Feature:JDBC ile bilgilerin dogrulanmasi
Scenario: Tüm customers bilgileri alınmalıdır database göre ve verify edilmeli
  When gmibank.com adresinin databaseine baglanir
  Given customers bilgileri alinir ve kaydedilir
  And kaydedilen bilgiler ile requierementlarda verilen expected data karsilastirilip dogrulanir

  Scenario: Tüm ülkelerin bilgileri database tarafından alınmalı ve verify edilmeli.
    When gmibank.com adresinin databaseine baglanir
    Given country bilgileri alinir ve kaydedilir
    And kaydedilen country bilgileri ile requierementlarda verilen expected data karsilastirilip dogrulanir



    Scenario: ABD ile ilgili tüm eyaletler  database alınmalı ve  verify edilmeli.
      When gmibank.com adresinin databaseine baglanir
      Given eyalet bilgileri alinir ve kaydedilir
      And kaydedilen eyalet bilgileri ile requierementlarda verilen expected data karsilastirilip dogrulanir