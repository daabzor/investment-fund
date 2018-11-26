# investment-fund

Simple investment calculator that based on investment strategy divides amount between investment funds.

## Technologies
* Java 8
* Maven
* Spring boot (Not needed now. Used for possibility of app extension.)

## Design, Classes, Behaviour description
App was divided into 3 main parts:
* Model 
    * Contains static data needed for calculations of the investment fund.
    (Funds, Investments, Strategies)

* Calculator
    * Engine that using the static data calculates amounts and percentages for funds and funds groups.
    (GroupCalculator, InvestmentCalculator)

* Validator
    * To calculate values several conditions have to be met. Validators helps to avoid mistakes during calculations.
    
    
## How to create custom investment fund
To create custom investment fund calculation we need to perform following steps:
1. Create Investment with strategy type and amount that we want to invest.
2. Create list of investment fund. There has to be at least 1 polish, 1 foreign and 1 cash fund.
3. Create InvestmentCalculatorEngine with investment and list that we defined.
4. Through InvestmentCalculator using types of funds we can get informations about divided amounts and strategy percentages.
     
## Authors
* **Mateusz Staśkiewicz** 




