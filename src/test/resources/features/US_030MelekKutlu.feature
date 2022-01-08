@pdf
Feature: All users should be printed as a pdf file
@pdfgenerator
Scenario Outline:  bazi customer verisini oku
Given pdf kullanicisi db ile baglanti kurar  "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user", "Techpro_@126"
And pdf kullanicisi "<query>" sorgular
  Examples: datalri oku
    | query |
  |Select * from tp_customer|


