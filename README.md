# Secret

Application that determines if Secret is an additive function secret(x+y) = secret(x) + secret(y) for all combinations of prime numbers less than N where N is also a given.

Building the Application
------------------------

Requires: Java 1.6+

javac test/Secret.java

javac test/TestSecret.java

Running the Application
------------------------

java test/TestSecret <N>

Example: java test/TestSecret 64

Determining additive functionality
----------------------------------

The class Secret contains a calc function.  This function should be modified to test additive functionality.

Assumptions
-----------

If the test were to be performed repeatedly, the primes below N should be cached within the application or written out to file, depending on whether the application will stay alive.

The class Secret stands in as an API stub for now.  Secret could be abstracted to an interface, allowing the runner to control the instantiation of the Secret class.  This would be done once the Secret API was provided.


