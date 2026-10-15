Divine Forge Journal
Phase 1: The Divine Blueprint

What did I accomplish?
I created the Artifact class with a String field called material and a constructor that initializes the material when an object is created. I also added a temporary main method to instantiate an artifact using Silver as its material.

Why is it important to use a constructor?
Using a constructor allows the material field to be initialized as soon as the object is created. This makes sure that the artifact receives its material immediately instead of requiring me to assign it separately afterward. It also allows the forging message to be printed automatically when the object is instantiated.

Testing and challenges
I compiled the program and ran it to test the Artifact constructor. The expected output was:
A relic of Silver is being forged.
The output confirms that the constructor received the material argument, assigned it to the material field, and printed the correct forging message. One important part of this phase was understanding how constructors initialize objects automatically.