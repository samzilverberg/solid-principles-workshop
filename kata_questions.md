# Kata for SOLID

https://github.com/emilybache/Racing-Car-Katas


### Questions valid for all the exercises

	⁃	What prevented you to write your first unit test?
	⁃	How did you overcome that obstable?
	⁃	Which unit-test did you write first?
	⁃	Which was your first smallest refactoring in order to make the class more unit-testable?
	⁃	How did you ensure that your refactoring didn’t add any bug?
	⁃	Have you spot any violation of SOLID principles in the initial code? Where? 


### TirePressureMonitoringSystem, class Alarm

   The external dependency here is the Sensor that return random values.
   SOLID violations
	⁃	The instantiation of Sensor in the constructor’s body violates the OCP and the DIP
	⁃	What about the hi/low pressure thresholds? Having them as constant is a violation of the OCP
	⁃	What about the expression that check if the pressure is inside the expected interval? It’s a violation of the OCP

   Look [1]



### UnicodeFileToHtmTextConverter, class UnicodeFileToHtmlTextConverter

   The external dependency here is the file from the file-system.
   SOLID violations 
	⁃	Access to the file system's Open method and to the file violate the OCP and DIP. That's a smell for OCP and eventually DIP violations.
	⁃	When you call ConvertToHtml() multiple times after the refactoring, does it still work or have you introduced a bug?

	Look [1]

  

### TurnTicketDispenser, class  TicketDispenser

  The external dependency here is the Turn Number sequence.
  SOLID violations 
	⁃	Access to the singleton TurnNumberSequence via the static method GetNextTurnNumber() violate the OCP and DIP. Note the use of static methods to access a singleton, is a smells for violation of encapsulation and for OCP and eventually DIP violations.
	⁃	How to access a singleton/static through an instance and keep the existing code working?
	⁃	How to break the dependency to the concrete type TurnTicket  and enable the instantiation of multiple objects?

	Look [1]



### TelemetrySystem, class TelemetryDiagnosticControls 

   The external dependency here is TelemetryClient with random connection failures.
   SOLID violations 
	⁃	Interesting, this time the most interesting violation is not in the class under test… :
           Faking with a mock object the TelemetryClient reveal a violation of SRP from TelemetryClient
	⁃	The instantiation in the constructor of the concrete class TelemetryClient that access an external system (the Telemetry server) is a violate the OCP and DIP.

   Look [1] and [2]


[1] Working Effectively With Legacy Code, Michael Feathers
     Relevant refactoring: Parametrize Constructor, Extract Interface, Adapt Parameter, Skin and Wrap the API, Introduce Instance Delegator 

[2] SRP: The Single Responsibility Principle - Object Mentor, example at pag 151/152 paragraph What is a Responsibility?
     http://www.objectmentor.com/resources/articles/srp.pdf